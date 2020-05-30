/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.services;

import com.school.data.SchoolContext;
import com.school.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EliteBook
 */
public class UserService {
    
     public User GetUser(String userName) throws SQLException, ClassNotFoundException {
        try {
            User user = new User();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_user(?) }");
            //parameters
            ps.setString(1, userName);            
            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {                
                user.setUserName(rs.getString("username"));
                user.setRoleId(rs.getInt("roleid"));
                user.setPassword(rs.getString("password"));
            }

            return user;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    public User Login(String userName,
            String password) throws SQLException, ClassNotFoundException {
        try {
            User user = new User();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_login(?,?) }");
            //parameters
            ps.setString(1, userName);
            ps.setString(2, password);
            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                user.setUserName(rs.getString("username"));
                user.setRoleId(rs.getInt("roleid"));
                user.setPassword(rs.getString("password"));
            }

            return user;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    public void Register(String userName,
            String password,
            int roleId) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_register(?,?,?) }");

            //parameters
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setInt(3, roleId);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
