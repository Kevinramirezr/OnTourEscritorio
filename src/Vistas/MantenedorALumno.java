package Vistas;


import Conexión.*;
import Clases.Alumno;
import Conexión.ConnectAPI;
import Clases.Curso;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class MantenedorALumno extends javax.swing.JFrame {


    public MantenedorALumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApel = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cboxCurso = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        cboxCuenta = new javax.swing.JComboBox<>();
        lblApel = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        cboxSexo = new javax.swing.JComboBox<>();
        lblCurso = new javax.swing.JLabel();
        lblCta = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminarBuscar = new javax.swing.JButton();
        cboEliminar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        cboConsultar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txtNombre.setText(" ");
        jPanel1.add(txtNombre);
        txtNombre.setBounds(190, 30, 123, 20);

        txtApel.setText(" ");
        jPanel1.add(txtApel);
        txtApel.setBounds(190, 70, 123, 20);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(67, 205, 73, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(158, 205, 75, 23);

        cboxCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxCursoMouseClicked(evt);
            }
        });
        jPanel1.add(cboxCurso);
        cboxCurso.setBounds(190, 130, 40, 20);

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre alumno: ");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(67, 30, 81, 14);

        cboxCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxCuentaMouseClicked(evt);
            }
        });
        cboxCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(cboxCuenta);
        cboxCuenta.setBounds(190, 170, 40, 20);

        lblApel.setForeground(new java.awt.Color(255, 255, 255));
        lblApel.setText("Apellido:");
        jPanel1.add(lblApel);
        lblApel.setBounds(81, 68, 41, 14);

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");
        jPanel1.add(lblSexo);
        lblSexo.setBounds(94, 106, 40, 14);

        cboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        jPanel1.add(cboxSexo);
        cboxSexo.setBounds(190, 100, 50, 20);

        lblCurso.setForeground(new java.awt.Color(255, 255, 255));
        lblCurso.setText("Curso:");
        jPanel1.add(lblCurso);
        lblCurso.setBounds(94, 132, 40, 14);

        lblCta.setForeground(new java.awt.Color(255, 255, 255));
        lblCta.setText("Cuenta:");
        jPanel1.add(lblCta);
        lblCta.setBounds(87, 170, 50, 14);

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras);
        btn_Atras.setBounds(251, 205, 59, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 420, 270);

        jTabbedPane1.addTab("Insertar", jPanel1);

        jPanel2.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALUMNO ID:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(57, 21, 60, 14);

        btnEliminarBuscar.setText("BUSCAR");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarBuscar);
        btnEliminarBuscar.setBounds(262, 17, 73, 23);

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(cboEliminar);
        cboEliminar.setBounds(127, 18, 107, 20);

        tablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaEliminar);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 58, 398, 75);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(167, 190, 81, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 420, 270);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ALUMNO ID:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(44, 40, 60, 14);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar);
        btnConsultar.setBounds(294, 36, 79, 23);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel3.add(cboConsultar);
        cboConsultar.setBounds(122, 37, 144, 20);

        tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConsultar);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 398, 109);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 420, 270);

        jTabbedPane1.addTab("Consultar", jPanel3);

        jPanel5.setLayout(null);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LISTAR ALUMNOS");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(42, 34, 86, 14);

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel5.add(btnListar);
        btnListar.setBounds(220, 30, 67, 23);

        tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaListar);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 59, 398, 189);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(0, 0, 420, 270);

        jTabbedPane1.addTab("Listar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
      
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApel.getText().trim();
        String sexo = cboxSexo.getSelectedItem().toString().trim();
        String curso = cboxCurso.getSelectedItem().toString().trim();
        String cuenta_id = cboxCuenta.getSelectedItem().toString().trim();
        
        
        Alumno alum = null;
        ConnectAPI cap = new ConnectAPI();
        
        try
        {
            alum = cap.agregarAlumno(cuenta_id, nombre, apellido, sexo, curso);
            JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
        }catch(Exception e)
        { 
            String msj = ExceptionUtils.getStackTrace(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, msj);
           
        }
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cboxCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxCursoMouseClicked
            try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select curso_id from curso");
            while(rs.next())
            {
                
                this.cboxCurso.addItem(rs.getString("curso_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxCursoMouseClicked

    private void cboxCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxCuentaMouseClicked
            try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select cuenta_id from cuenta");
            while(rs.next())
            {
               
                this.cboxCuenta.addItem(rs.getString("cuenta_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxCuentaMouseClicked

    private void cboEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEliminarMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select alumno_id from alumno");
            while(rs.next())
            {
                
                this.cboEliminar.addItem(rs.getString("alumno_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboEliminarMouseClicked

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
            try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select alumno_id from alumno");
            while(rs.next())
            {
             
                this.cboConsultar.addItem(rs.getString("alumno_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
         DefaultTableModel modelo = new DefaultTableModel();

        Alumno alum = null;
        String id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"alumno_id","nombre","apellido","sexo","curso_id"});
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select alumno_id,nombre,apellido,sexo,curso_id from alumno where alumno_id='"+id+"'");
            while(rs.next())
            {
               modelo.addRow(new Object[]{rs.getString("alumno_id"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("sexo"),rs.getString("curso_id")});
            }
            tablaEliminar.setModel(modelo);
            conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ConnectAPI c = new ConnectAPI();
        boolean exito = false;
        String id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            exito = c.eliminarAlumno(id);
            if(exito==true)
            {
                System.out.println("Eliminado con exito");
                JOptionPane.showMessageDialog(null, "Alumno Eliminado con Exito");

            }else
            {
                System.out.println("error else");
            }
        }catch(Exception e)
        {
          
            e.printStackTrace();
            String msj = ExceptionUtils.getStackTrace(e);
          
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       DefaultTableModel modelo = new DefaultTableModel();

        String id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"alumno_id","nombre","apellido","sexo","curso_id"});
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select alumno_id,nombre,apellido,sexo,curso_id from alumno where alumno_id='"+id+"'");
            while(rs.next())
            {
               modelo.addRow(new Object[]{rs.getString("alumno_id"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("sexo"),rs.getString("curso_id")});
            }
            tablaConsultar.setModel(modelo);
            conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        try{
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("Select alumno_id,nombre,apellido,sexo,curso_id from alumno");
           modelo.setColumnIdentifiers(new Object[]{"alumno_id","nombre","apellido","sexo","curso_id"});
            while(rs.next())
           {
               modelo.addRow(new Object[]{rs.getString("alumno_id"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("sexo"),rs.getString("curso_id")});
           }
          
           tablaListar.setModel(modelo);
           conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void cboxCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCuentaActionPerformed
       
    }//GEN-LAST:event_cboxCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(MantenedorALumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorALumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorALumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorALumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorALumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btn_Atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JComboBox<String> cboxCuenta;
    private javax.swing.JComboBox<String> cboxCurso;
    private javax.swing.JComboBox<String> cboxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApel;
    private javax.swing.JLabel lblCta;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtApel;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
