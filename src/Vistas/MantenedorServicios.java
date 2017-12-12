package Vistas;


import Conexión.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pixie
 */
public class MantenedorServicios extends javax.swing.JFrame {

    /**
     * Creates new form Servicios
     */
    public MantenedorServicios() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtIdServicio = new javax.swing.JTextField();
        txtNombreServicio = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        btnEliminarBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        cboConsultar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txtIdServicio.setText(" ");
        jPanel1.add(txtIdServicio);
        txtIdServicio.setBounds(160, 40, 200, 20);
        jPanel1.add(txtNombreServicio);
        txtNombreServicio.setBounds(160, 90, 200, 20);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(71, 178, 73, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(162, 178, 75, 23);
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(160, 140, 200, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 140, 33, 14);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Servicio:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 40, 55, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre servicio:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 90, 80, 14);

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras);
        btn_Atras.setBounds(255, 178, 59, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 230);

        jTabbedPane1.addTab("Ingresar", jPanel1);

        jPanel2.setLayout(null);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Servicio:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(46, 20, 55, 14);

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(cboEliminar);
        cboEliminar.setBounds(119, 17, 71, 20);

        btnEliminarBuscar.setText("Buscar");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarBuscar);
        btnEliminarBuscar.setBounds(208, 16, 65, 23);

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
        jScrollPane2.setViewportView(tablaEliminar);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 57, 375, 108);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(155, 179, 69, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 230);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setLayout(null);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Servicio:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(52, 27, 55, 14);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar);
        btnConsultar.setBounds(264, 23, 79, 23);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel3.add(cboConsultar);
        cboConsultar.setBounds(134, 24, 88, 20);

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
        jScrollPane3.setViewportView(tablaConsultar);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 57, 375, 99);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 400, 230);

        jTabbedPane1.addTab("Consultar", jPanel3);

        jPanel4.setLayout(null);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel4.add(btnListar);
        btnListar.setBounds(194, 27, 59, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LISTAR SERVICIOS");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(63, 31, 92, 14);

        tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListar);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 68, 375, 148);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 400, 230);

        jTabbedPane1.addTab("Listar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
       
            try {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orc");
    //Inserción de datos a bd SIN PAQUETES           
        PreparedStatement ps= conn.prepareStatement("INSERT INTO servicio values(?,?,?)");

        ps.setString(1,txtIdServicio.getText());
        ps.setString(2,txtNombreServicio.getText());
        ps.setString(3,txtPrecio.getText());        
        ps.executeUpdate();
        //Confirmación de inserción de datos
        JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
        conn.close();
        ps.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void cboEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEliminarMouseClicked
         try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select servicio_id from servicio");
            while(rs.next())
            {
                
                this.cboEliminar.addItem(rs.getString("servicio_id"));
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
            ResultSet rs = sent.executeQuery("Select servicio_id from servicio");
            while(rs.next())
            {
                
                this.cboConsultar.addItem(rs.getString("servicio_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
           String servicio_id = cboEliminar.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("delete from servicio where servicio_id='"+servicio_id+"'");
           JOptionPane.showMessageDialog(null, "Servicio Eliminado existosamente");
           conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();

        String servicio_id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"servicio_id","descriocion","precio"});
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select * from servicio where servicio_id='"+servicio_id+"'");
            while(rs.next())
            {
               modelo.addRow(new Object[]{rs.getString("servicio_id"),rs.getString("descricion"),rs.getString("precio")});
            }
            tablaEliminar.setModel(modelo);
            conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnEliminarBuscarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();

        String servicio_id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"servicio_id","descripcion","precio"});
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select * from servicio where servicio_id='"+servicio_id+"'");
            while(rs.next())
            {
               modelo.addRow(new Object[]{rs.getString("servicio_id"),rs.getString("descripcion"),rs.getString("precio")});
            }
            tablaConsultar.setModel(modelo);
            conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel modelo = new DefaultTableModel();
        try{
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("Select * from servicio");
           modelo.setColumnIdentifiers(new Object[]{"servicio_id","descripcion","precio"});
            while(rs.next())
           {
              modelo.addRow(new Object[]{rs.getString("servicio_id"),rs.getString("descripcion"),rs.getString("precio")});
           }
          
           tablaListar.setModel(modelo);
           conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

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
            java.util.logging.Logger.getLogger(MantenedorServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorServicios().setVisible(true);
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
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtIdServicio;
    private javax.swing.JTextField txtNombreServicio;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}