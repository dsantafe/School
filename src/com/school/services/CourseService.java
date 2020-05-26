/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.services;

import com.school.data.SchoolContext;
import com.school.models.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EliteBook
 */
public class CourseService {

    public Course GetById(int id) throws SQLException, ClassNotFoundException {
        try {
            Course course = new Course();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_course_by_id(?) }");
            //parameters
            ps.setInt(1, id);
            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                course.setCourseId(rs.getInt("courseid"));
                course.setTitle(rs.getString("title"));
                course.setCredits(rs.getInt("credits"));
            }

            return course;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public List<Course> GetAll() throws SQLException, ClassNotFoundException {
        try {
            List<Course> courses = new ArrayList<>();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_courses }");

            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Course course = new Course();
                course.setCourseId(rs.getInt("courseid"));
                course.setTitle(rs.getString("title"));
                course.setCredits(rs.getInt("credits"));

                courses.add(course);
            }

            return courses;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    public void Create(int id,
            String title,
            int credits) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_create_course(?,?,?) }");

            //parameters
            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setInt(3, credits);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public void Update(int id,
            String title,            
            int credits) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_update_course(?,?,?) }");

            //parameters
            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setInt(3, credits);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
