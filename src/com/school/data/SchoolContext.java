/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EliteBook
 */
public class SchoolContext {

    private SchoolContext() {
    }

    private static Connection cnx = null;

    public static Connection GetConnection() throws SQLException,
            ClassNotFoundException {
        if (cnx == null) {
            try {

                String server, dataBase, user, password, port = "";

                server = "localhost";
                dataBase = "school";
                user = "root";
                password = "$C3nt3ll4$";
                port = "3306";

                Class.forName("com.mysql.cj.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + dataBase + "?serverTimezone=UTC", user, password);
            } catch (Exception ex) {
                throw ex;
            }
        }

        return cnx;
    }

    public static void CloseConnection() throws SQLException {
        try {
            if (cnx != null) {
                cnx.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
}
