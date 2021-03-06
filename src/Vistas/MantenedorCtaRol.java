package Vistas;

import Conexión.*;

import Clases.Alumno;
import Conexión.ConnectAPI;
import Clases.CtaRol;
import Clases.Curso;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.exception.ExceptionUtils;
/**
 *
 * @author Pixie
 */
public class MantenedorCtaRol extends javax.swing.JFrame {

    /**
     * Creates new form CtaRol
     */
    public MantenedorCtaRol() {
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
        lblNombreCta = new javax.swing.JLabel();
        txtIdCta = new javax.swing.JTextField();
        txtNombreCta = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIdCta = new javax.swing.JLabel();
        btn_Atras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        cboEliminar = new javax.swing.JComboBox<>();
        btnElimnarBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        cboConsultar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lblNombreCta.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCta.setText("Nombre ROL:");
        jPanel1.add(lblNombreCta);
        lblNombreCta.setBounds(31, 69, 64, 14);

        txtIdCta.setText(" ");
        jPanel1.add(txtIdCta);
        txtIdCta.setBounds(124, 28, 100, 20);

        txtNombreCta.setText(" ");
        jPanel1.add(txtNombreCta);
        txtNombreCta.setBounds(124, 66, 100, 20);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(31, 130, 73, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(122, 130, 75, 23);

        lblIdCta.setForeground(new java.awt.Color(255, 255, 255));
        lblIdCta.setText("ROL ID:");
        jPanel1.add(lblIdCta);
        lblIdCta.setBounds(57, 31, 38, 14);

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras);
        btn_Atras.setBounds(215, 130, 59, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 330, 230);

        jTabbedPane1.addTab("Insertar", jPanel1);

        jPanel2.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROL ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(62, 29, 34, 14);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(141, 148, 69, 23);

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(cboEliminar);
        cboEliminar.setBounds(106, 26, 96, 20);

        btnElimnarBuscar.setText("BUSCAR");
        btnElimnarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimnarBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnElimnarBuscar);
        btnElimnarBuscar.setBounds(220, 25, 73, 23);

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
        jScrollPane2.setBounds(53, 54, 240, 64);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 330, 230);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ROL ID:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(56, 19, 38, 14);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar);
        btnConsultar.setBounds(204, 15, 79, 23);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel3.add(cboConsultar);
        cboConsultar.setBounds(112, 16, 86, 20);

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
        jScrollPane3.setBounds(20, 50, 273, 102);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 330, 230);

        jTabbedPane1.addTab("Consultar", jPanel3);

        jPanel4.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTAR ROL:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(81, 38, 62, 14);

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel4.add(btnListar);
        btnListar.setBounds(176, 34, 67, 23);

        tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListar);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(58, 75, 216, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 330, 230);

        jTabbedPane1.addTab("Listar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
     try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
             PreparedStatement ps= conn.prepareStatement("INSERT INTO cuenta_rol values(?,?)");
             ps.setString(1, txtIdCta.getText().trim());
             ps.setString(2, txtNombreCta.getText().trim());
             
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
              conn.close();
              ps.close();
             
     }catch(Exception e)
     {
         String msj = ExceptionUtils.getStackTrace(e);
         JOptionPane.showMessageDialog(null, msj);
         e.printStackTrace();
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
            ResultSet rs = sent.executeQuery("Select rol_id from cuenta_rol");
            while(rs.next())
            {
                
                this.cboEliminar.addItem(rs.getString("rol_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboEliminarMouseClicked

    private void btnElimnarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimnarBuscarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();

        String id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"rol_id","rol_nombre"});
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select * from cuenta_rol where rol_id='"+id+"'");
            while(rs.next())
            {
               modelo.addRow(new Object[]{rs.getString("rol_id"),rs.getString("rol_nombre")});
            }
            tablaEliminar.setModel(modelo);
            conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnElimnarBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
           String rol_id = cboEliminar.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("delete from cuenta_rol where rol_id='"+rol_id+"'");
           JOptionPane.showMessageDialog(null, "ROL Eliminado existosamente");
           conn.close();
        }catch(Exception e)
        {
            String msj = ExceptionUtils.getStackTrace(e);
            JOptionPane.showMessageDialog(null, msj);
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
         try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select rol_id from cuenta_rol");
            while(rs.next())
            {
                
                this.cboConsultar.addItem(rs.getString("rol_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       DefaultTableModel modelo = new DefaultTableModel();

        String id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"rol_id","rol_nombre"});
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select * from cuenta_rol where rol_id='"+id+"'");
            while(rs.next())
            {
               modelo.addRow(new Object[]{rs.getString("rol_id"),rs.getString("rol_nombre")});
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
           ResultSet rs = sent.executeQuery("Select * from cuenta_rol");
           modelo.setColumnIdentifiers(new Object[]{"rol_id","rol_nombre"});
            while(rs.next())
           {
               modelo.addRow(new Object[]{rs.getString("rol_id"),rs.getString("rol_nombre")});
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
            java.util.logging.Logger.getLogger(MantenedorCtaRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorCtaRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorCtaRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorCtaRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorCtaRol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnElimnarBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIdCta;
    private javax.swing.JLabel lblNombreCta;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtIdCta;
    private javax.swing.JTextField txtNombreCta;
    // End of variables declaration//GEN-END:variables
}
