package Vistas;



import Conexión.*;
import Conexión.ConnectAPI;
import Clases.Cuenta;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.exception.ExceptionUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pixie
 */
public class Login extends javax.swing.JFrame {

    
    
    LoginAdmin admin = null; // rol_id 4
    LoginEjec ejecutivo = null; // rol_id 2
    LoginDue dueño = null; // rol_id 1
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        admin = new LoginAdmin();
        ejecutivo = new LoginEjec();
        dueño = new LoginDue();
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_nombre = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        textData = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5383640212_7a7ed84e27_b.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 342));
        setMinimumSize(new java.awt.Dimension(500, 342));
        getContentPane().setLayout(null);

        bt_aceptar.setText("Aceptar");
        bt_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_aceptar);
        bt_aceptar.setBounds(130, 210, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agorasu.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 60, 70);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 210, 120, 30);

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Ingrese nombre de usuario:");
        getContentPane().add(lbl_nombre);
        lbl_nombre.setBounds(100, 90, 170, 20);

        lbl_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pass.setText("Ingrese contraseña:");
        getContentPane().add(lbl_pass);
        lbl_pass.setBounds(100, 140, 140, 20);

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombre);
        txt_Nombre.setBounds(280, 80, 180, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(280, 130, 180, 30);

        textData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        getContentPane().add(textData);
        textData.setBounds(0, 0, 500, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aceptarActionPerformed
        String user = txt_Nombre.getText();
        String pass = String.valueOf(jPasswordField1.getPassword());
        
        Cuenta u = null;
        
        ConnectAPI c = new ConnectAPI();
        
        try {
            
            u = c.Iniciar(user, pass);
            

            if(u != null){
                JOptionPane.showMessageDialog(null, "Bienvenido "+user);
                int rol = Integer.parseInt(u.getRol_id());
                
                if(rol == 1){
                    this.setVisible(false);
                    dueño.setVisible(true);
                }else if(rol == 2){
                    this.setVisible(false);
                    ejecutivo.setVisible(true);
                }else{
                    this.setVisible(false);
                    admin.setVisible(true);
                }
                
            }else{
                textData.setText("Usuario no encontrado");
                JOptionPane.showMessageDialog(null,"Ingresa Correctamente");
            }
            
         }catch(Exception ex) {
           JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_bt_aceptarActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed

    }//GEN-LAST:event_txt_NombreActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
      
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_aceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel textData;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables

    
}
