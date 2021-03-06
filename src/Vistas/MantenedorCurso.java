package Vistas;



import Conexión.*;
import Conexión.ConnectAPI;
import Clases.Curso;
import Clases.Destinos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
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
public class MantenedorCurso extends javax.swing.JFrame {

    /**
     * Creates new form Curso
     */
    DateFormat dt = DateFormat.getDateInstance();
    
    public MantenedorCurso() {
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

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cboxDestinoID = new javax.swing.JComboBox<>();
        cboxCtaID = new javax.swing.JComboBox<>();
        cboxEscuelaID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtMontoMeta = new javax.swing.JTextField();
        btn_Atras = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jdtFechaViaje = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        btnEliminarBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        cboConsultar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        cboxDestinoID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxDestinoIDMouseClicked(evt);
            }
        });
        jPanel1.add(cboxDestinoID);
        cboxDestinoID.setBounds(143, 266, 116, 20);

        cboxCtaID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxCtaIDMouseClicked(evt);
            }
        });
        jPanel1.add(cboxCtaID);
        cboxCtaID.setBounds(143, 190, 116, 20);

        cboxEscuelaID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxEscuelaIDMouseClicked(evt);
            }
        });
        jPanel1.add(cboxEscuelaID);
        cboxEscuelaID.setBounds(143, 228, 116, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Monto meta:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(64, 22, 61, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destino ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(71, 266, 54, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuenta ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(72, 193, 53, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escuela ID:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(71, 231, 54, 14);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(71, 310, 73, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(171, 310, 75, 23);
        jPanel1.add(txtMontoMeta);
        txtMontoMeta.setBounds(150, 20, 90, 20);

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras);
        btn_Atras.setBounds(264, 310, 70, 23);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de Viaje:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 150, 74, 14);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Año:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(98, 60, 23, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nivel:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 100, 27, 14);
        jPanel1.add(txtNivel);
        txtNivel.setBounds(150, 100, 91, 20);
        jPanel1.add(txtAnio);
        txtAnio.setBounds(150, 60, 90, 20);
        jPanel1.add(jdtFechaViaje);
        jdtFechaViaje.setBounds(150, 150, 87, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 460, 370);

        jTabbedPane1.addTab("Insertar", jPanel1);

        jPanel2.setLayout(null);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Curso ID:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(55, 44, 46, 14);

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(cboEliminar);
        cboEliminar.setBounds(132, 41, 84, 20);

        btnEliminarBuscar.setText("BUSCAR");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarBuscar);
        btnEliminarBuscar.setBounds(264, 40, 73, 23);

        tablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEliminar);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(39, 95, 356, 90);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(184, 222, 81, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 0, 460, 370);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel4.setLayout(null);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LISTAR CURSOS");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(76, 19, 79, 14);

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel4.add(btnListar);
        btnListar.setBounds(213, 15, 67, 23);

        tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListar);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(19, 49, 394, 300);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel4.add(jLabel13);
        jLabel13.setBounds(0, 0, 460, 370);

        jTabbedPane1.addTab("Listar", jPanel4);

        jPanel3.setLayout(null);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Curso ID:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(37, 44, 46, 12);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar);
        btnConsultar.setBounds(276, 39, 79, 23);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel3.add(cboConsultar);
        cboConsultar.setBounds(101, 40, 165, 20);

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
        jScrollPane3.setBounds(10, 93, 440, 250);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(0, 0, 460, 370);

        jTabbedPane1.addTab("Consultar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelo = new DefaultTableModel();

        Curso curso = null;
        ConnectAPI cap = new ConnectAPI();
        String id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            modelo.setColumnIdentifiers(new Object[]{"Curso_ID","NIVEL","AÑO","ESCUELA"});
            curso = cap.consultarCurso(id);
            modelo.addRow(new Object[]{curso.getCurso_id().toString(),curso.getNivel().toString(),curso.getAnio().toString(),curso.getEscuela_id().toString()});
            tablaEliminar.setModel(modelo);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarBuscarActionPerformed

    private void cboEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEliminarMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select curso_id from curso");
            while(rs.next())
            {
                //this.jComboBox1.addItem(rs.getString("cuenta_id"));
                //this.cboActualizar.addItem(rs.getString("cuenta_id"));
                this.cboEliminar.addItem(rs.getString("curso_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboEliminarMouseClicked

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String nivel = txtNivel.getText().trim();
        String cuenta_id = cboxCtaID.getSelectedItem().toString().trim();
        String escuela_id = cboxEscuelaID.getSelectedItem().toString().trim();
        String destino_id = cboxDestinoID.getSelectedItem().toString().trim();
        String anio = txtAnio.getText().trim();
        String monto_meta = txtMontoMeta.getText().trim();
        String fecha_viaje= dt.format(jdtFechaViaje.getDate());
        System.out.println(fecha_viaje.toString());
        
        

        Curso c = null;
        ConnectAPI ca = new ConnectAPI();
        try
        {
            c = ca.agregarCurso(cuenta_id, escuela_id, destino_id, monto_meta,nivel,anio,fecha_viaje);
            JOptionPane.showMessageDialog(null, "Datos Ingresado Exitosamente");
        }catch(Exception e)
        {
            String msj = ExceptionUtils.getStackTrace(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, msj);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cboxEscuelaIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxEscuelaIDMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select escuela_id from escuela");
            while(rs.next())
            {
                //this.jComboBox1.addItem(rs.getString("cuenta_id"));
                //this.cboActualizar.addItem(rs.getString("cuenta_id"));
                this.cboxEscuelaID.addItem(rs.getString("escuela_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxEscuelaIDMouseClicked

    private void cboxCtaIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxCtaIDMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select cuenta_id from cuenta");
            while(rs.next())
            {
                //this.jComboBox1.addItem(rs.getString("cuenta_id"));
                //this.cboActualizar.addItem(rs.getString("cuenta_id"));
                this.cboxCtaID.addItem(rs.getString("cuenta_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxCtaIDMouseClicked

    private void cboxDestinoIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDestinoIDMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select destino_id from destino");
            while(rs.next())
            {
                //this.jComboBox1.addItem(rs.getString("cuenta_id"));
                //this.cboActualizar.addItem(rs.getString("cuenta_id"));
                this.cboxDestinoID.addItem(rs.getString("destino_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxDestinoIDMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ConnectAPI c = new ConnectAPI();
        boolean exito = false;
        String id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
        try{
            exito = c.eliminarCurso(id);
            if(exito==true)
            {
                System.out.println("Eliminado con exito");
                JOptionPane.showMessageDialog(null, "Curso Eliminado con Exito");

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

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select curso_id from curso");
            while(rs.next())
            {
                //this.jComboBox1.addItem(rs.getString("cuenta_id"));
                //this.cboActualizar.addItem(rs.getString("cuenta_id"));
                this.cboConsultar.addItem(rs.getString("curso_id"));
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
         Curso curso = null;
         ConnectAPI cap = new ConnectAPI();
         String id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"CURSO_ID","NIVEL","CUENTA_ID","ESCUELA_ID","DESTINO_ID","AÑO","MONTO META","FECHA VIAJE"});
             curso = cap.consultarCurso(id);
             modelo.addRow(new Object[]{curso.getCurso_id().toString(),curso.getNivel().toString(),curso.getCuenta_id().toString(),curso.getEscuela_id().toString(),
             curso.getDestino_id().toString(),curso.getMonto_meta(),curso.getFecha_viaje()});
             tablaConsultar.setModel(modelo);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        Curso[] curso = null;
        ConnectAPI c = new ConnectAPI();
        
        try
        {
            modelo.setColumnIdentifiers(new Object[]{"CURSO_ID","NIVEL","CUENTA_ID","ESCUELA_ID","DESTINO_ID","AÑO","MONTO META","FECHA VIAJE"});
            curso = c.listarCursos();
            for (int i = 0; i < curso.length; i++) {
                System.out.println(curso[i]);
                modelo.addRow(new Object[]{curso[i].getCurso_id().toString(),curso[i].getNivel().toString(),curso[i].getCuenta_id().toString(),curso[i].getCuenta_id().toString(),curso[i].getEscuela_id().toString(),
                curso[i].getDestino_id().toString(),curso[i].getAnio().toString(),curso[i].getMonto_meta(),curso[i].getFecha_viaje().toString()});
                
            }
            tablaListar.setModel(modelo);
        }catch(Exception e){
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
            java.util.logging.Logger.getLogger(MantenedorCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorCurso().setVisible(true);
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
    private javax.swing.JComboBox<String> cboxCtaID;
    private javax.swing.JComboBox<String> cboxDestinoID;
    private javax.swing.JComboBox<String> cboxEscuelaID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdtFechaViaje;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtMontoMeta;
    private javax.swing.JTextField txtNivel;
    // End of variables declaration//GEN-END:variables

    private void Number(String px) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
