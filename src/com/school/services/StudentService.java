/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.services;

import com.school.models.Student;
import com.school.data.SchoolContext;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author EliteBook
 */
public class StudentService {

    public Student GetById(int id) throws SQLException, ClassNotFoundException {
        try {
            Student student = new Student();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_student_by_id(?) }");
            //parameters
            ps.setInt(1, id);
            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setLastName(rs.getString("lastname"));
                student.setFirstMidName(rs.getString("firstmidname"));
                student.setEnrollmentDate(rs.getDate("enrollmentdate"));
                student.setCode(rs.getInt("code"));
            }

            return student;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public List<Student> GetAll() throws SQLException, ClassNotFoundException {
        try {
            List<Student> students = new ArrayList<>();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_students }");

            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setLastName(rs.getString("lastname"));
                student.setFirstMidName(rs.getString("firstmidname"));
                student.setEnrollmentDate(rs.getDate("enrollmentdate"));
                student.setCode(rs.getInt("code"));

                students.add(student);
            }

            return students;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public void Create(String lastName,
            String firstMidName,
            String enrollmentDate,
            int code) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_create_student(?,?,?,?) }");

            //parameters
            ps.setString(1, lastName);
            ps.setString(2, firstMidName);
            ps.setDate(3, Date.valueOf(enrollmentDate));
            ps.setInt(4, code);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public void Update(int id,
            String lastName,
            String firstMidName,
            String enrollmentDate,
            int code) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_update_student(?,?,?,?,?) }");

            //parameters
            ps.setInt(1, id);
            ps.setString(2, lastName);
            ps.setString(3, firstMidName);
            ps.setDate(4, Date.valueOf(enrollmentDate));
            ps.setInt(5, code);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
