/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.views;

/**
 *
 * @author EliteBook
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmStudents = new javax.swing.JMenu();
        jmStudentsManagement = new javax.swing.JMenuItem();
        jmCourses = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmEnrollments = new javax.swing.JMenu();
        jmEnrollmentsManagement = new javax.swing.JMenuItem();
        jmNotes = new javax.swing.JMenu();
        jmOthers = new javax.swing.JMenu();
        jmClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/resources/slide.jpg"))); // NOI18N

        jmStudents.setText("Estudiantes");

        jmStudentsManagement.setText("Administrar");
        jmStudentsManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmStudentsManagementActionPerformed(evt);
            }
        });
        jmStudents.add(jmStudentsManagement);

        jMenuBar1.add(jmStudents);

        jmCourses.setText("Cursos");

        jMenuItem1.setText("Administrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmCourses.add(jMenuItem1);

        jMenuBar1.add(jmCourses);

        jmEnrollments.setText("Matriculas");

        jmEnrollmentsManagement.setText("Administrar");
        jmEnrollmentsManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEnrollmentsManagementActionPerformed(evt);
            }
        });
        jmEnrollments.add(jmEnrollmentsManagement);

        jMenuBar1.add(jmEnrollments);

        jmNotes.setText("Notas");
        jMenuBar1.add(jmNotes);

        jmOthers.setText("Otros");

        jmClose.setText("Salir");
        jmClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCloseActionPerformed(evt);
            }
        });
        jmOthers.add(jmClose);

        jMenuBar1.add(jmOthers);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmStudentsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmStudentsManagementActionPerformed
        Students students = new Students();
        students.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmStudentsManagementActionPerformed

    private void jmEnrollmentsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEnrollmentsManagementActionPerformed
        Enrollments enrollments = new Enrollments();
        enrollments.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmEnrollmentsManagementActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Courses courses = new Courses();
        courses.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCloseActionPerformed
        dispose();
    }//GEN-LAST:event_jmCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmClose;
    private javax.swing.JMenu jmCourses;
    private javax.swing.JMenu jmEnrollments;
    private javax.swing.JMenuItem jmEnrollmentsManagement;
    private javax.swing.JMenu jmNotes;
    private javax.swing.JMenu jmOthers;
    private javax.swing.JMenu jmStudents;
    private javax.swing.JMenuItem jmStudentsManagement;
    // End of variables declaration//GEN-END:variables
}