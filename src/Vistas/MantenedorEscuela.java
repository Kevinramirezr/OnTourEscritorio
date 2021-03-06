package Vistas;



import Conexión.*;
import Clases.Actividad;
import Conexión.ConnectAPI;
import Clases.Escuela;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Clases.Regiones;
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
public class MantenedorEscuela extends javax.swing.JFrame {

    /**
     * Creates new form Escuela
     */
    public MantenedorEscuela() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNombreEscuela = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        cboxRegion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        btnEliminarBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        cboConsultar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ciudad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 160, 37, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Región:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 110, 37, 14);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(130, 270, 73, 23);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 270, 75, 23);

        txtNombreEscuela.setText(" ");
        jPanel1.add(txtNombreEscuela);
        txtNombreEscuela.setBounds(169, 63, 118, 20);
        jPanel1.add(txtCiudad);
        txtCiudad.setBounds(170, 160, 139, 20);

        cboxRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxRegionMouseClicked(evt);
            }
        });
        jPanel1.add(cboxRegion);
        cboxRegion.setBounds(170, 110, 78, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre escuela:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 80, 14);

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras);
        btn_Atras.setBounds(330, 270, 70, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 350);

        jTabbedPane1.addTab("Insertar", jPanel1);

        jPanel2.setLayout(null);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Escuela:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(53, 49, 54, 14);

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(cboEliminar);
        cboEliminar.setBounds(136, 46, 102, 20);

        btnEliminarBuscar.setText("BUSCAR");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarBuscar);
        btnEliminarBuscar.setBounds(256, 45, 73, 23);

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
        jScrollPane3.setBounds(10, 123, 405, 114);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(289, 281, 81, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 430, 350);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setLayout(null);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Escuela:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(44, 64, 54, 14);

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar);
        btnConsultar.setBounds(252, 60, 93, 23);

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
        jScrollPane2.setViewportView(tablaConsultar);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 118, 395, 88);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel3.add(cboConsultar);
        cboConsultar.setBounds(128, 61, 106, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 430, 350);

        jTabbedPane1.addTab("Consultar", jPanel3);

        jPanel4.setLayout(null);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LISTAR ESCUELAS");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(126, 21, 88, 14);

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel4.add(btnListar);
        btnListar.setBounds(250, 11, 86, 34);

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
        jScrollPane1.setViewportView(tablaListar);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(30, 63, 385, 285);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 430, 350);

        jTabbedPane1.addTab("Listar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        ConnectAPI c = new ConnectAPI();
        Escuela es = null;
        
        String nombre = txtNombreEscuela.getText().trim();
        String ciudad = txtCiudad.getText().trim();
        String region_id = cboxRegion.getSelectedItem().toString().trim();
        
        try{
            es = c.agregarEscuela(nombre, ciudad, region_id);
             JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
            JOptionPane.showMessageDialog(null,"ID Nueva Escuela:"+es.getEscuela_id());
        }catch(Exception e)
        {
            String msj = ExceptionUtils.getStackTrace(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, msj);
        } 
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboxRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxRegionMouseClicked
          try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select region_id from region");
            while(rs.next())
            {

                this.cboxRegion.addItem(rs.getString("region_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxRegionMouseClicked

    private void cboEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEliminarMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select escuela_id from escuela");
            while(rs.next())
            {

                this.cboEliminar.addItem(rs.getString("escuela_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboEliminarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        ConnectAPI c = new ConnectAPI();
        boolean exito = false;
        String escuela_id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            exito = c.eliminarEscuela(escuela_id);
            if(exito==true)
            {
                System.out.println("Eliminado con exito");
                JOptionPane.showMessageDialog(null, "Escuela Eliminado con Exito");

            }else
            {
                System.out.println("error else");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        Escuela escuela = null;
         ConnectAPI cap = new ConnectAPI();
         String escuela_id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"escuela_id","nombre","ciudad","region_id","nombre"});
             escuela = cap.consultarEscuela(escuela_id);
             modelo.addRow(new Object[]{escuela.getEscuela_id().toString(),escuela.getNombre().toString(),escuela.getCiudad().toString(),escuela.getRegion().getRegion_id(),escuela.getRegion().getNombre()});
             tablaEliminar.setModel(modelo);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
    }//GEN-LAST:event_btnEliminarBuscarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
         DefaultTableModel modelo = new DefaultTableModel();
         Escuela escuelas = null;
         ConnectAPI cap = new ConnectAPI();
         String escuela_id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"escuela_id","nombre","ciudad","region_id","nombre"});
             escuelas = cap.consultarEscuela(escuela_id);
             modelo.addRow(new Object[]{escuelas.getEscuela_id().toString(),escuelas.getNombre().toString(),escuelas.getCiudad().toString(),escuelas.getRegion().getRegion_id(),escuelas.getRegion().getNombre()});
             tablaConsultar.setModel(modelo);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
         try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select escuela_id from escuela");
            while(rs.next())
            {

                this.cboConsultar.addItem(rs.getString("escuela_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       DefaultTableModel modelo = new DefaultTableModel();
        Escuela[] escuelas = null;
        ConnectAPI c = new ConnectAPI();
        
        try
        {
            modelo.setColumnIdentifiers(new Object[]{"escuela_id","escuela_nombre","ciudad","region_id","nombre region"});
            escuelas = c.listarEscuelas();
            for (int i = 0; i < escuelas.length; i++) {
                System.out.println(escuelas[i]);
               
                modelo.addRow(new Object[]{escuelas[i].getEscuela_id(),escuelas[i].getNombre(),escuelas[i].getCiudad(),escuelas[i].getRegion().getRegion_id(),escuelas[i].getRegion().getNombre()});
                
            }
            tablaListar.setModel(modelo);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(MantenedorEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorEscuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JComboBox<String> cboxRegion;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtNombreEscuela;
    // End of variables declaration//GEN-END:variables
}
