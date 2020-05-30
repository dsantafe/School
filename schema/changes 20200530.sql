--===== TABLES =====--
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `roleid` int DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roleid_idx` (`roleid`),
  CONSTRAINT `fk_user_role` FOREIGN KEY (`roleid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--===== INSERT =====--
SET SQL_SAFE_UPDATES = 0;
ALTER TABLE role AUTO_INCREMENT = 0;
INSERT INTO role(name) VALUES ('student');
INSERT INTO role(name) VALUES ('instructor');

--===== PROCEDURE =====--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_create_course`(IN p_id INT,
IN p_title VARCHAR(50),
IN p_credits INT)
BEGIN
	INSERT INTO `school`.`course`
	(`courseid`,
	`title`,
	`credits`)
	VALUES
	(p_id,
	p_title,
	p_credits);
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_get_notes_by_student`(IN p_enrollment_id INT)
BEGIN
	SELECT noteid,
    enrollmentid,
    final
	FROM school.note  
    WHERE enrollmentid = p_enrollment_id; 
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_get_user`(IN p_user VARCHAR(50))
BEGIN
	SELECT id
    username,
    roleid,
    password
    FROM user
    WHERE username = p_user;
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_login`(IN p_username VARCHAR(50),
IN p_password VARCHAR(50))
BEGIN
	SELECT `user`.`id`,
    `user`.`username`,
    `user`.`roleid`,
    `user`.`password`
	FROM `school`.`user`
    WHERE username = p_username
    AND password = p_password;
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_register`(IN p_username VARCHAR(50),
IN p_password VARCHAR(50),
IN p_role_id INT)
BEGIN
	INSERT INTO user(username,roleid,password)
    VALUES(p_username,p_role_id,p_password);
END