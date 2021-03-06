package Vistas;

import Conexión.*;

import Conexión.ConnectAPI;
import Clases.Cuenta;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.google.gson.Gson;
/**
 *
 * @author Pixie
 */
public class MantenedorCuenta extends javax.swing.JFrame {

    /**
     * Creates new form Cuenta
     */
    public MantenedorCuenta() {
        initComponents();
 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboxSexo = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApp = new javax.swing.JTextField();
        txtApm = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cBoxRol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btm_Atras = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cboConsultar = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboActualizar = new javax.swing.JComboBox<>();
        bntBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaActualizar = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnListas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(422, 600));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(422, 600));
        jPanel1.setLayout(null);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 260, 37, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(76, 298, 63, 14);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 390, 73, 32);

        cboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        jPanel1.add(cboxSexo);
        cboxSexo.setBounds(210, 170, 33, 20);

        txtRut.setText(" ");
        jPanel1.add(txtRut);
        txtRut.setBounds(210, 50, 142, 20);

        txtNombre.setText(" ");
        jPanel1.add(txtNombre);
        txtNombre.setBounds(210, 80, 142, 20);

        txtApp.setText(" ");
        jPanel1.add(txtApp);
        txtApp.setBounds(210, 110, 142, 20);

        txtApm.setText(" ");
        jPanel1.add(txtApm);
        txtApm.setBounds(210, 140, 142, 20);

        txtMail.setText(" ");
        jPanel1.add(txtMail);
        txtMail.setBounds(210, 200, 142, 20);

        txtCelular.setText(" ");
        jPanel1.add(txtCelular);
        txtCelular.setBounds(210, 260, 142, 20);

        txtTelef.setText(" ");
        jPanel1.add(txtTelef);
        txtTelef.setBounds(210, 230, 142, 20);
        jPanel1.add(txtPass);
        txtPass.setBounds(210, 290, 142, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rol:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(76, 346, 19, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUT:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 50, 24, 14);

        cBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(cBoxRol);
        cBoxRol.setBounds(210, 340, 31, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 80, 41, 14);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("1: APD   2:EJC   3:REP   4:ADM  ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 340, 155, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Paterno:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 110, 82, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido Materno:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 140, 84, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 170, 28, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 200, 32, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 230, 46, 14);

        btm_Atras.setText("Atrás");
        btm_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btm_Atras);
        btm_Atras.setBounds(280, 390, 70, 32);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 650, 510);

        jTabbedPane1.addTab("Insertar", jPanel1);

        jPanel4.setLayout(null);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("RUT :");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(115, 84, 27, 14);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel4.add(cboConsultar);
        cboConsultar.setBounds(160, 81, 228, 20);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsultar);
        btnConsultar.setBounds(410, 70, 135, 40);

        tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaConsultar);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(60, 171, 481, 93);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel4.add(jLabel17);
        jLabel17.setBounds(0, 0, 650, 510);

        jTabbedPane1.addTab("Consultar", jPanel4);

        jPanel3.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RUT  :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(77, 106, 47, 14);

        cboActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboActualizarMouseClicked(evt);
            }
        });
        jPanel3.add(cboActualizar);
        cboActualizar.setBounds(134, 103, 201, 20);

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(bntBuscar);
        bntBuscar.setBounds(371, 102, 65, 23);

        tablaActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaActualizar);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 143, 631, 90);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar);
        btnActualizar.setBounds(324, 290, 112, 40);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel3.add(jLabel18);
        jLabel18.setBounds(0, 0, 650, 510);

        jTabbedPane1.addTab("Actualizar", jPanel3);

        jPanel5.setLayout(null);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LISTAR CUENTAS :");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(160, 20, 117, 50);

        btnListas.setText("Listar");
        btnListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListasActionPerformed(evt);
            }
        });
        jPanel5.add(btnListas);
        btnListas.setBounds(260, 30, 116, 30);

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
        jScrollPane4.setViewportView(tablaListar);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(10, 81, 631, 402);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel5.add(jLabel19);
        jLabel19.setBounds(0, 0, 650, 510);

        jTabbedPane1.addTab("Listar ", jPanel5);

        jPanel2.setLayout(null);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RUT");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(169, 102, 20, 14);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(181, 275, 119, 30);

        jComboBox1.setToolTipText("");
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(207, 99, 119, 20);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(344, 98, 65, 23);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(59, 156, 443, 66);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(0, 0, 650, 510);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         /*try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orc");

            //Inserción de datos a bd SIN PAQUETES
            PreparedStatement ps= conn.prepareStatement("INSERT INTO cuenta values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txtIdCuenta.getText());
            ps.setString(2, txtRut.getText());
            ps.setString(3, txtNombre.getText());
            ps.setString(4, txtApp.getText());
            ps.setString(5, txtApm.getText());
            ps.setString(6, cboxSexo.getSelectedItem().toString());
            ps.setString(7, txtMail.getText());
            ps.setString(8, txtTelef.getText());
            ps.setString(9, txtCelular.getText());
            ps.setString(10, txtPass.getText());
            ps.setString(11, cBoxRol.getSelectedItem().toString());

            ps.executeUpdate();
            //Confirmación de inserción de datos
            JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
            conn.close();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/
         String rut = txtRut.getText().trim();
         String nombre = txtNombre.getText().trim();
         String apellido_p = txtApp.getText().trim();
         String apellido_m = txtApm.getText().trim();
         String sexo = cboxSexo.getSelectedItem().toString().trim();
         String email = txtMail.getText().trim();
         String telefono = txtTelef.getText().trim();
         String celular = txtCelular.getText().trim();
         String pass = txtPass.getText().trim();
         String rol = cBoxRol.getSelectedItem().toString().trim();
         
         Cuenta c = null;
         ConnectAPI ca = new ConnectAPI();
         
         try{
             c = ca.RegistrarCuenta(rut, nombre, apellido_p, apellido_m, sexo, email, telefono, celular, pass, rol);
             JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
             JOptionPane.showMessageDialog(null,"ID Nuevo Usario:"+c.getCuenta_id());
             
         }catch(Exception e)
         {
             e.printStackTrace();
         }
         
         
                 
         
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btm_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_AtrasActionPerformed
      
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
    }//GEN-LAST:event_btm_AtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            DefaultTableModel modelo = new DefaultTableModel();
        try{
           String rut = jComboBox1.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("select cuenta_id,rut, nombre, apellido_p, apellido_m from cuenta where rut='"+rut+"'");
           modelo.setColumnIdentifiers(new Object[]{"cuenta_id","rut","nombre","apellido_p","apellido_m"});
           while(rs.next())
           {
               
               modelo.addRow(new Object[]{rs.getString("cuenta_id"),rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido_p"),rs.getString("apellido_m")});
           }
           tabla.setModel(modelo);
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       //DESDE LA API
        int i = 0;
        ConnectAPI c = new ConnectAPI();
        boolean exito = false;
        String cuenta_id = tabla.getValueAt(0,0).toString();
        
        try{
           exito = c.eliminar(cuenta_id);
            if(exito==true)
              {
                  System.out.println("Eliminado con exito");  
                  
              }else
              {
                System.out.println("error else");
              }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error try");
        }
        
        
        //DESDE LA BD
         /*try{
           String rut = jComboBox1.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("delete from cuenta where rut='"+rut+"'");
           JOptionPane.showMessageDialog(null, "Cuanta Eliminada existosamente");
           conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
              DefaultTableModel modelo = new DefaultTableModel();
        try{
           String rut = cboActualizar.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("select cuenta_id,rut,nombre,apellido_p,apellido_m,sexo,email,telefono,celular,rol_id from cuenta where rut='"+rut+"'");
           modelo.setColumnIdentifiers(new Object[]{"cuenta_id","rut","nombre","apellido_p","apellido_m","sexo","email","telefono","celular","rol_id"});
           while(rs.next())
           {
              
              // System.out.println(rs.getString("telefono"));
              // System.out.println(rs.getString("celular"));
               modelo.addRow(new Object[]{rs.getString("cuenta_id"),rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido_p"),rs.getString("apellido_m"),rs.getString("sexo"),rs.getString("email"),rs.getString("telefono"),rs.getString("celular"),rs.getString("rol_id")});
           }
           tablaActualizar.setModel(modelo);
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        int i = tablaActualizar.getSelectedRow();
        String cuenta_id = tablaActualizar.getValueAt(i,0).toString();
        String rut = tablaActualizar.getValueAt(i ,1).toString();
        String nombre = tablaActualizar.getValueAt(i ,2).toString();
        String apellido_p = tablaActualizar.getValueAt(i ,3).toString();
        String apellido_m = tablaActualizar.getValueAt(i ,4).toString();
        String sexo = tablaActualizar.getValueAt(i ,5).toString();
        String email = tablaActualizar.getValueAt(i ,6).toString();
        String telefono = tablaActualizar.getValueAt(i ,7).toString();
        String celular = tablaActualizar.getValueAt(i ,8).toString();
        String rol_id = tablaActualizar.getValueAt(i ,9).toString();
        boolean exito = false;
       
        ConnectAPI c = new ConnectAPI();
        try{
           exito = c.actualizar(cuenta_id, rut, nombre, apellido_p, apellido_m, sexo, email, telefono, celular, rol_id);
            if(exito==true)
              {
                  System.out.println("Actualizacion con Exito");  
                  
              }else
              {
                System.out.println("pichula2");
              }
            
            JOptionPane.showMessageDialog(null,"Actualizado con Exito");
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("pichula");
        }
           
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
          DefaultTableModel modelo = new DefaultTableModel();
        try{
           String rut = cboConsultar.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("select * from cuenta where rut='"+rut+"'");
           modelo.setColumnIdentifiers(new Object[]{"cuenta_id","rut","nombre","apellido_p","apellido_m","sexo","email","telefono","celular","password","rol_id"});
           while(rs.next())
           {
               modelo.addRow(new Object[]{rs.getString("cuenta_id"),rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido_p"),rs.getString("apellido_m"),rs.getString("sexo"),rs.getString("email"),rs.getString("telefono"),rs.getString("celular"),rs.getString("password"),rs.getString("rol_id")});
           }
           tablaConsultar.setModel(modelo);
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
           
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
          try{
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("Select rut from cuenta");
           while(rs.next())
           {
              this.cboConsultar.addItem(rs.getString("rut"));
           }
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
          try{
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("Select rut from cuenta");
           while(rs.next())
           {
              this.jComboBox1.addItem(rs.getString("rut"));
           }
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void cboActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboActualizarMouseClicked
          try{
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("Select rut from cuenta");
           while(rs.next())
           {
              this.cboActualizar.addItem(rs.getString("rut"));
           }
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboActualizarMouseClicked

    private void btnListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListasActionPerformed
       //DESDE LA API
        DefaultTableModel modelo = new DefaultTableModel();
        Cuenta[] cuenta = null;
        ConnectAPI c = new ConnectAPI();
        
        try
        {
            modelo.setColumnIdentifiers(new Object[]{"cuenta_id","rut","nombre","apellido_p","apellido_m","sexo","email","telefono","celular","rol_id"});
            cuenta = c.listarCuentas();
            for (int i = 0; i < cuenta.length; i++) {
                System.out.println(cuenta[i]);
                modelo.addRow(new Object[]{cuenta[i].getCuenta_id(),cuenta[i].getRut(),cuenta[i].getNombre(),cuenta[i].getApellido_p(),cuenta[i].getApellido_m()
                ,cuenta[i].getSexo(),cuenta[i].getEmail(),cuenta[i].getTelefono(),cuenta[i].getCelular(),cuenta[i].getRol_id()});
                
            }
            tablaListar.setModel(modelo);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //LO MISMO PERO DESDE LA BD
        /*try{
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("select * from cuenta");
           modelo.setColumnIdentifiers(new Object[]{"cuenta_id","rut","nombre","apellido_p","apellido_m","sexo","email","telefono","celular","password","rol_id"});
            while(rs.next())
           {
               modelo.addRow(new Object[]{rs.getString("cuenta_id"),rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido_p"),rs.getString("apellido_m"),rs.getString("sexo"),rs.getString("email"),rs.getString("telefono"),rs.getString("celular"),rs.getString("password"),rs.getString("rol_id")});
           }
          
           tablaListar.setModel(modelo);
           conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_btnListasActionPerformed
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
            java.util.logging.Logger.getLogger(MantenedorCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MantenedorCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btm_Atras;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListas;
    private javax.swing.JComboBox<String> cBoxRol;
    private javax.swing.JComboBox<String> cboActualizar;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboxSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaActualizar;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtApm;
    private javax.swing.JTextField txtApp;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
