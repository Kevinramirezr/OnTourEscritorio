
import Clases.ConnectAPI;
import Clases.Destinos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.exception.ExceptionUtils;




public class MantenedorDestinos extends javax.swing.JFrame {

    /**
     * Creates new form Destinos
     */
    public MantenedorDestinos() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombredestino = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminarBuscar = new javax.swing.JButton();
        cboEliminar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboConsultar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de destino:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(47, 62, 94, 14);
        jPanel1.add(txtNombredestino);
        txtNombredestino.setBounds(184, 59, 141, 20);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(93, 159, 73, 23);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir);
        btn_Salir.setBounds(184, 159, 53, 23);

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras);
        btn_Atras.setBounds(255, 159, 59, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 230);

        jTabbedPane1.addTab("Ingresar", jPanel1);

        jPanel2.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destino ID:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(35, 27, 54, 14);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(142, 173, 69, 23);

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
        jScrollPane2.setBounds(47, 76, 244, 79);

        btnEliminarBuscar.setText("Buscar");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarBuscar);
        btnEliminarBuscar.setBounds(277, 23, 65, 23);

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(cboEliminar);
        cboEliminar.setBounds(99, 24, 160, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 390, 230);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setLayout(null);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar);
        btnConsultar.setBounds(205, 11, 79, 23);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino ID:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(27, 15, 54, 14);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });
        jPanel3.add(cboConsultar);
        cboConsultar.setBounds(91, 12, 104, 20);

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
        jScrollPane3.setBounds(42, 52, 232, 143);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 390, 230);

        jTabbedPane1.addTab("Consultar", jPanel3);

        jPanel4.setLayout(null);

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel4.add(btnListar);
        btnListar.setBounds(161, 23, 67, 23);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Listar Destinos :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(57, 27, 77, 14);

        tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListar);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(57, 57, 227, 142);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mmmm.png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(0, 0, 390, 230);

        jTabbedPane1.addTab("Listar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Destinos des = null;
        ConnectAPI c = new ConnectAPI();
        String nombre = txtNombredestino.getText().trim();
        
        try
        {
            des = c.agregarDestino(nombre);
            System.out.println(des);
             JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
             JOptionPane.showMessageDialog(null,"ID Nuevo Destino:"+des.getId());
        }catch(Exception e)
        {
            String msj = ExceptionUtils.getStackTrace(e);
             JOptionPane.showMessageDialog(null, msj);
            e.printStackTrace();
        }     
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
 
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
        
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void cboEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEliminarMouseClicked

        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select destino_id from destino");
            while(rs.next())
            {

                this.cboEliminar.addItem(rs.getString("destino_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_cboEliminarMouseClicked

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
    
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        Destinos destino = null;
         ConnectAPI cap = new ConnectAPI();
         String id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"Destino_ID","NOMBRE"});
             destino = cap.consultarDestino(id);
             modelo.addRow(new Object[]{destino.getId().toString(),destino.getNombre().toString()});
             tablaEliminar.setModel(modelo);
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
            exito = c.eliminarDestino(id);
            if(exito==true)
            {
                System.out.println("Eliminado con exito");
                JOptionPane.showMessageDialog(null, "Destino Eliminada con Exito");

            }else
            {
                //Test de Ingreso al IF
                System.out.println("error else");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            String msj = ExceptionUtils.getStackTrace(e);
            JOptionPane.showMessageDialog(null, msj);
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
       try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select destino_id from destino");
            while(rs.next())
            {

                this.cboConsultar.addItem(rs.getString("destino_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
         Destinos destino = null;
         ConnectAPI cap = new ConnectAPI();
         String id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"Destino_id","nombre","ciudad"});
             destino = cap.consultarDestino(id);
             modelo.addRow(new Object[]{destino.getId().toString(),destino.getNombre().toString()});
             tablaConsultar.setModel(modelo);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        Destinos[] des = null;
        ConnectAPI c = new ConnectAPI();
        
        try
        {
            modelo.setColumnIdentifiers(new Object[]{"Destino_id","nombre"});
            des = c.listarDestinos();
            for (int i = 0; i < des.length; i++) {
                System.out.println(des[i]);
                modelo.addRow(new Object[]{des[i].getId().toString(),des[i].getNombre().toString()});
                
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
            java.util.logging.Logger.getLogger(MantenedorDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorDestinos().setVisible(true);
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
    private javax.swing.JButton btn_Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboEliminar;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtNombredestino;
    // End of variables declaration//GEN-END:variables
}
