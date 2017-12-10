/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramirez
 */
import Clases.ConnectAPI;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import com.cloudinary.*;

import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;


public class Contrato extends javax.swing.JFrame {

    /**
     * Creates new form Contrato
     */
    DateFormat dt = DateFormat.getDateInstance();
    public Contrato() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnContrato = new javax.swing.JButton();
        txtTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dtfecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEjecutivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbonombreCurso = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtEscuela = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUbicado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRepCursoN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMont = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnFill = new javax.swing.JButton();
        txtRepCursoAP = new javax.swing.JTextField();
        txtRepCursoAM = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtrutRep = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtRutEjec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnContrato.setText("Generar Contrato");
        btnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoActionPerformed(evt);
            }
        });

        txtTitle.setText("CONTRATO DE PRESTACIÓN DE SERVICIOS ONTOUR");

        jLabel1.setText("En");

        jLabel3.setText("con fecha ");

        jLabel4.setText("entre la Agencia de Viajes \"On Tour\", representada por ");

        jLabel5.setText("y el Curso ");

        cbonombreCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbonombreCursoMouseClicked(evt);
            }
        });

        jLabel7.setText("del Colegio");

        jLabel8.setText("ubicado en ");

        jLabel9.setText("Representado por ");

        jLabel10.setText("se ha convenido el siguiente contrato de prestación de servicios de viajes.");

        jLabel11.setText("1.La empresa establece su servicio que contará con la inclusión de destino a ");

        jLabel13.setText("con fecha");

        jLabel14.setText(",donde se realizaran una serie de");

        jLabel15.setText("actividades para recaudar dinero por parte del curso,");

        jLabel16.setText("que a su vez contempla servicios tales como el seguro incluido.");

        jLabel17.setText("2. Las prestaciones de estos servicios se llevarán a cabo una vez cumplida");

        jLabel18.setText(" la meta establecida por la Empresa de viajes OnTour y el cliente que será de un monto final de ");

        jLabel19.setText("3.Para llevar a cabo los servicios previamente mencionados se debe contar con al menos ");

        jLabel20.setText("15 alumnos por curso.");

        jLabel21.setText("4.El presente contrato se pacta por tiempo indefinido y su terminación se regirá ");

        jLabel22.setText("por las normas legales correspondientes.");

        jLabel23.setText("________________");

        jLabel24.setText("________________");

        jLabel25.setText("Firma Ejecutivo");

        jLabel26.setText("Firma Representante");

        jLabel27.setText("Seleccione Curso :");

        btnFill.setText("Fill");
        btnFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillActionPerformed(evt);
            }
        });

        jLabel28.setText("con rut");

        jLabel29.setText("con rut");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(txtTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(cbonombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFill))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtMont, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnContrato)
                                                .addGap(65, 65, 65)
                                                .addComponent(btnAtras))
                                            .addComponent(jLabel25)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUbicado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRepCursoN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRepCursoAP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRepCursoAM, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtRutEjec, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel2)
                                .addGap(17, 17, 17)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(txtrutRep, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel6)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbonombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFill)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(txtTitle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addComponent(dtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtRutEjec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtUbicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtRepCursoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepCursoAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepCursoAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtrutRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnContrato)
                            .addComponent(btnAtras))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
            this.setVisible(false);
            new LoginEjec().setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        String fecha_viaje = dt.format(dtfecha.getDate());
        ConnectAPI cap = new ConnectAPI();
        String id = cbonombreCurso.getSelectedItem().toString().toLowerCase();
        try{
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("Contrato"+id+".pdf"));
            doc.open();
            doc.add(new Paragraph("              "+txtTitle.getText().toString()));
            doc.add(new Paragraph("\n"));
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel1.getText().toString()+" "+txtCiudad.getText().toString()+" "+jLabel3.getText().toString()+" "+fecha_viaje));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel4.getText().toString()+" "+txtNombreEjecutivo.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel29.getText().toString()+" "+txtRutEjec.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel5.getText().toString()+" "+txtCurso.getText().toString()+" "+jLabel7.getText().toString()+" "+txtEscuela.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel8.getText().toString()+" "+txtUbicado.getText().toString()+" "+jLabel9.getText().toString()+" "+txtRepCursoN.getText().toString()
            +" "+txtRepCursoAP.getText().toString()+" "+txtRepCursoAM.getText().toString()+jLabel28.getText().toString()+" "+txtrutRep.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel10.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel11.getText().toString()));
            doc.add(new Paragraph(txtDestino.getText().toString()+" "+jLabel13.getText().toString()+" "+txtFecha.getText().toString()+" "+jLabel14.getText().toString()));
            doc.add(new Paragraph(jLabel15.getText().toString()));
            doc.add(new Paragraph(jLabel16.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel17.getText().toString()));
            doc.add(new Paragraph(jLabel18.getText().toString()+" "+txtMont.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel19.getText().toString()+" "+jLabel20.getText().toString()));
            doc.add(new Paragraph());
            doc.add(new Paragraph());
            doc.add(new Paragraph(jLabel21.getText().toString()));
            doc.add(new Paragraph(jLabel22.getText().toString()));
            doc.add(new Paragraph("\n"));
            doc.add(new Paragraph(jLabel23.getText().toString()+"                                  "+jLabel24.getText().toString()));
            doc.add(new Paragraph(jLabel25.getText().toString()+"                                      "+jLabel26.getText().toString()));

            doc.close();
         //PRUEBA CLODINARY   
          JOptionPane.showMessageDialog(null, "CONTRATO GENERADO");
          Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
             "cloud_name", "dcjlyyzyj",
             "api_key", "773555693615963",
             "api_secret", "Spm9vtyl8l_5yhC5cFkxpAyelxA"));
          
          String contratoUpload = "Contrato1b8kkcqghh.pdf";
          Map uploadResult = cloudinary.uploader().upload(contratoUpload, ObjectUtils.emptyMap());
          String url = "";
          System.out.println(uploadResult.toString());
          //Rescatar String de la Url qe envia Clodinary
          String[] pares = uploadResult.toString().split(",");
           for(int i = 0; i < pares.length; i++){
           if(pares[i].trim().startsWith("url=") == true){
           url = pares[i].trim().split("=")[1];
           System.out.println(url);
           }
         }
            System.out.println("url:"+url);
          //Guardar URL GENERADA EN LA BD

          boolean exito = false;
           try{
                exito = cap.RegistrarContrato(id,url);
                if(exito==true)
                    {
                         System.out.println("guardado Correcto en la BD");
                      }else {
                            System.out.println("error else");
                     }
           }catch(Exception e){
               e.printStackTrace();
           }
          //MOSTRAR EL DOCUMENTO GENERADO DE FORMA LOCAL TEST MI PC
         /* try{
              Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Ramirez\\Desktop\\Git\\OnTourEscritorio\\Contrato"+id+".pdf");
          }catch(Exception e)
          {
              e.printStackTrace();
          }*/
          
          //MOSTRAR EL DOCUMENTO GENERADO DESDE LA URL RESCATADA
           
          
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnContratoActionPerformed

    private void cbonombreCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbonombreCursoMouseClicked
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select curso_id from curso");
            while(rs.next())
            {

                this.cbonombreCurso.addItem(rs.getString("curso_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cbonombreCursoMouseClicked

    private void btnFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillActionPerformed
              
            try{
            String curso_id = cbonombreCurso.getSelectedItem().toString().toLowerCase();
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs1 = sent.executeQuery("Select nivel from curso where curso_id='"+curso_id+"'");
            while(rs1.next()){this.txtCurso.setText(rs1.getString("nivel"));}
            ResultSet rs2 = sent.executeQuery("Select e.nombre from escuela e join curso cu on e.escuela_id = cu.escuela_id where cu.curso_id ='"+curso_id+"'");
            while(rs2.next()){this.txtEscuela.setText(rs2.getString("nombre"));}
            ResultSet rs3 = sent.executeQuery("Select e.ciudad from escuela e join curso cu on e.escuela_id = cu.escuela_id where cu.curso_id='"+curso_id+"'");
            while(rs3.next()){this.txtUbicado.setText(rs3.getString("ciudad"));}
             ResultSet rs4 = sent.executeQuery("Select cue.nombre from cuenta cue join curso cu on cue.cuenta_id= cu.cuenta_id  where cu.curso_id='"+curso_id+"'");
            while(rs4.next()){this.txtRepCursoN.setText(rs4.getString("nombre"));}
            ResultSet rs5 = sent.executeQuery("Select de.nombre from destino de join curso cu on de.destino_id = cu.destino_id where cu.curso_id='"+curso_id+"'");
            while(rs5.next()){this.txtDestino.setText(rs5.getString("nombre"));}
            ResultSet rs6 = sent.executeQuery("Select fecha_viaje from curso where curso_id='"+curso_id+"'");
            while(rs6.next()){this.txtFecha.setText(rs6.getString("fecha_viaje"));}
            ResultSet rs7 = sent.executeQuery("Select cue.rut from cuenta cue join curso cu on cue.cuenta_id= cu.cuenta_id  where cu.curso_id='"+curso_id+"'");
            while(rs7.next()){this.txtrutRep.setText(rs7.getString("rut"));}
            ResultSet rs8 = sent.executeQuery("Select cue.apellido_p from cuenta cue join curso cu on cue.cuenta_id= cu.cuenta_id  where cu.curso_id='"+curso_id+"'");
            while(rs8.next()){this.txtRepCursoAP.setText(rs8.getString("apellido_p"));}
            ResultSet rs9 = sent.executeQuery("Select cue.apellido_m from cuenta cue join curso cu on cue.cuenta_id= cu.cuenta_id  where cu.curso_id='"+curso_id+"'");
            while(rs9.next()){this.txtRepCursoAM.setText(rs9.getString("apellido_m"));}
             ResultSet rs10 = sent.executeQuery("select monto_meta from curso where curso_id ='"+curso_id+"'");
            while(rs10.next()){this.txtMont.setText(rs10.getString("monto_meta"));}
            

            conn.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnFillActionPerformed

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
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnFill;
    private javax.swing.JComboBox<String> cbonombreCurso;
    private com.toedter.calendar.JDateChooser dtfecha;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEscuela;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMont;
    private javax.swing.JTextField txtNombreEjecutivo;
    private javax.swing.JTextField txtRepCursoAM;
    private javax.swing.JTextField txtRepCursoAP;
    private javax.swing.JTextField txtRepCursoN;
    private javax.swing.JTextField txtRutEjec;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JTextField txtUbicado;
    private javax.swing.JTextField txtrutRep;
    // End of variables declaration//GEN-END:variables
}
