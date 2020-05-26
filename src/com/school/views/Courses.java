/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.views;

import com.school.models.Course;
import com.school.services.CourseService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EliteBook
 */
public class Courses extends javax.swing.JFrame {

    /**
     * Creates new form Courses
     */
    public Courses() {
        initComponents();
        tbData.setModel(new DefaultTableModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleCourses = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblCredits = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleCourses.setText("Cursos");
        lblTitleCourses.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblId.setText("Id:");

        lblTitle.setText("Titulo:");

        lblCredits.setText("Creditos:");

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        btnSearch.setText("Consultar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCreate.setText("Crear");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Modificar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleCourses)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblId)
                            .addComponent(lblCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCredits, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleCourses)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredits)
                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(btnCreate)
                            .addComponent(btnUpdate)
                            .addComponent(btnBack)
                            .addComponent(btnClean))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {

            List<Course> courses = new ArrayList<>();
            CourseService courseService = new CourseService();

            if (txtId.getText().isEmpty()) {
                courses = courseService.GetAll();
            } else {
                int id = Integer.parseInt(txtId.getText());

                Course course = new Course();
                course = courseService.GetById(id);

                if (course.getCourseId() != 0) {
                    courses.add(courseService.GetById(id));
                }
            }

            String[] columns = {"Id", "Titulo", "Creditos"};
            DefaultTableModel model = new DefaultTableModel(null, columns);

            String[] rows = new String[3];

            for (Course item : courses) {
                rows[0] = String.valueOf(item.getCourseId());
                rows[1] = item.getTitle();
                rows[2] = String.valueOf(item.getCredits());

                model.addRow(rows);
            }

            if (courses.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No se encontraron registros.");
                tbData.setModel(new DefaultTableModel());
            } else {
                tbData.setModel(model);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       
        try {

            String message = "";

            if (txtId.getText().isEmpty()) {
                message += "Ingrese el código, ";
            }
            if (txtTitle.getText().isEmpty()) {
                message += "Ingrese el titulo, ";
            }            
            if (txtCredits.getText().isEmpty()) {
                message += "Ingrese los creditos, ";
            }            

            if (!message.isEmpty()) {
                throw new Exception(message.substring(0, message.length() - 2));
            }

            CourseService courseService = new CourseService();
            int id = Integer.valueOf(txtId.getText());
            int credits = Integer.valueOf(txtCredits.getText());

            courseService.Create(id,
                    txtTitle.getText(),
                    credits);

            btnSearchActionPerformed(evt);
            JOptionPane.showMessageDialog(rootPane, "Se realizo proceso con exito.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        try {
            if (evt.getButton() == 1) {
                int row = tbData.getSelectedRow();

                Course course = new Course();
                CourseService courseService = new CourseService();

                course = courseService.GetById(Integer.valueOf(tbData.getValueAt(row, 0).toString()));

                txtId.setText(String.valueOf(course.getCourseId()));
                txtTitle.setText(course.getTitle());
                txtCredits.setText(String.valueOf(course.getCredits()));                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {

            String mensaje = "";

            if (txtId.getText().isEmpty()) {
                mensaje += "Ingrese el código, ";
            }
            if (txtTitle.getText().isEmpty()) {
                mensaje += "Ingrese el titulo, ";
            }
            if (txtCredits.getText().isEmpty()) {
                mensaje += "Ingrese los creditos, ";
            }            

            if (!mensaje.equals("")) {
                throw new Exception(mensaje.substring(0, mensaje.length() - 2));
            }

            CourseService courseService = new CourseService();

            int id = Integer.valueOf(txtId.getText());
            int credits = Integer.valueOf(txtCredits.getText());

            courseService.Update(id,
                    txtTitle.getText(),
                    credits);

            btnSearchActionPerformed(evt);
            JOptionPane.showMessageDialog(rootPane, "Se realizo proceso con exito.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtId.setText(null);
        txtTitle.setText(null);
        txtCredits.setText(null);
    }//GEN-LAST:event_btnCleanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleCourses;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
