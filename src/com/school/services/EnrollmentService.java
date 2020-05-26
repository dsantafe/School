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
public class EnrollmentService {
    public List<Course> GetCoursesByStudent(int id) throws SQLException, ClassNotFoundException {
        try {
            List<Course> courses = new ArrayList<>();
            
            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_courses_by_student(?) }");
            
            //parameters
            ps.setInt(1, id);
            
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
    
    public void Create(int courseId,
            int studentId) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_create_enrollment(?,?) }");

            //parameters
            ps.setInt(1, courseId);
            ps.setInt(2, studentId);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    public void Delete(int courseId,
            int studentId) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_delete_enrollment(?,?) }");

            //parameters
            ps.setInt(1, courseId);
            ps.setInt(2, studentId);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
