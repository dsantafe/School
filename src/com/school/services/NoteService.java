/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.services;

import com.school.data.SchoolContext;
import com.school.models.Note;
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
public class NoteService {

    public void Create(int enrollmentId,
            int note) throws SQLException, ClassNotFoundException {
        try {

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_create_note(?,?) }");

            //parameters
            ps.setInt(1, enrollmentId);
            ps.setInt(2, note);

            //execute
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public List<Note> GetNotes(int studentId) throws SQLException, ClassNotFoundException {
        try {
            List<Note> notes = new ArrayList<>();

            Connection cnx = SchoolContext.GetConnection();
            PreparedStatement ps = cnx.prepareStatement("{ call sp_get_notes_by_student(?) }");

            //parameters
            ps.setInt(1, studentId);

            //execute
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Note note = new Note();
                note.setFinal(rs.getInt("final"));

                notes.add(note);
            }

            return notes;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
