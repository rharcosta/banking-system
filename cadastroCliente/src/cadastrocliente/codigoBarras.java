package cadastrocliente;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class codigoBarras extends javax.swing.JFrame {

    private int valor;
    private double valor2;

    public codigoBarras() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOk1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnFechar1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnOk2 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnFechar2 = new javax.swing.JButton();
        btnLimpar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn8Digitos = new javax.swing.JButton();
        btn13Digitos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnOk1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk1.setText("OK");
        btnOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Digite: ");

        btnFechar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFechar1.setText("Fechar");
        btnFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar1ActionPerformed(evt);
            }
        });

        btnLimpar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        btnOk2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk2.setText("OK");
        btnOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Digite: ");

        btnFechar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFechar2.setText("Fechar");
        btnFechar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar2ActionPerformed(evt);
            }
        });

        btnLimpar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar2.setText("Limpar");
        btnLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFechar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar2)
                    .addComponent(btnLimpar2))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFechar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk1)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar1)
                    .addComponent(btnLimpar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Selecione o tipo de código de barras");

        btn8Digitos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn8Digitos.setText("8 Dígitos");
        btn8Digitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8DigitosActionPerformed(evt);
            }
        });

        btn13Digitos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn13Digitos.setText("13 Dígitos");
        btn13Digitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13DigitosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn8Digitos)
                        .addGap(18, 18, 18)
                        .addComponent(btn13Digitos)
                        .addGap(15, 15, 15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8Digitos)
                    .addComponent(btn13Digitos))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk1ActionPerformed
        valor = Integer.parseInt(txt1.getText());
        if (("11111111".equals(valor)) || (valor == 22222222) || (valor == 33333333) || (valor == 44444444) || (valor == 55555555) || (valor == 66666666) || (valor == 77777777) || (valor == 88888888) || (valor == 99999999)) {
            JOptionPane.showMessageDialog(null, "Código de barras inválido!");
            txt1.setText(null);
            txt1.grabFocus();
        } else {
            System.out.println("Código de barras criado!");
            //Criando um objeto da classe Document
            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            try {
                // Aqui começamos a utilizar as classes do iText: o documento
                //Criado acima será: 
                //Direcionado para um arquivo PDF. 
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\rubia\\sistema-bancario\\cadastroCliente\\CodBarras8.pdf"));
                //Abrindo o documento. 
                document.open();
                //Adicionando um novo parágrafo. 
                document.add(new Paragraph("Geração de código de barras"));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                //Começando a configurar o cod de barras
                PdfContentByte cb = writer.getDirectContent();
                BarcodeEAN codeEAN = new BarcodeEAN();
                // O iText suporta os principais tipos de código de barras, como Barcode39,
                // Barcode128 (128, 128_UCC, 128_RAW), BarcodeEAN (EAN13, EAN8, UPCA, UPCE), EANSUP, etc. 
                codeEAN.setCodeType(codeEAN.EAN8);
                codeEAN.setCode("7898363332493");
                Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
                document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
            } catch (Exception de) {
                de.printStackTrace();
            }
            document.close();
        }
    }//GEN-LAST:event_btnOk1ActionPerformed

    private void btnFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnFechar1ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        txt1.setText(null);
        txt1.grabFocus();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btn8DigitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8DigitosActionPerformed
        jPanel1.setVisible(true);
    }//GEN-LAST:event_btn8DigitosActionPerformed

    private void btn13DigitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13DigitosActionPerformed
        jPanel2.setVisible(true);
    }//GEN-LAST:event_btn13DigitosActionPerformed

    private void btnOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk2ActionPerformed
        valor2 = Double.parseDouble(txt2.getText());
        if (("1111".equals(valor)) || (valor == 2222222) || (valor == 333333333) || (valor == 44444444) || (valor == 55555555) || (valor == 6666666) || (valor == 77777777) || (valor == 8888) || (valor == 9999999)) {
            JOptionPane.showMessageDialog(null, "Código de barras inválido");
            txt2.setText(null);
            txt2.grabFocus();
        } else {
            System.out.println("Código de barras criado...");
            //Criando um objeto da classe Document
            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            try {
                // Aqui começamos a utilizar as classes do iText: o documento
                //Criado acima será: 
                //Direcionado para um arquivo PDF. 
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\rubia\\sistema-bancario\\cadastroCliente\\CodBarras13.pdf"));
                //Abrindo o documento. 
                document.open();
                //Adicionando um novo parágrafo. 
                document.add(new Paragraph("Geração de código de barras"));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                //Começando a configurar o cod de barras
                PdfContentByte cb = writer.getDirectContent();
                BarcodeEAN codeEAN = new BarcodeEAN();
                // O iText suporta os principais tipos de código de barras, como Barcode39,
                // Barcode128 (128, 128_UCC, 128_RAW), BarcodeEAN (EAN13, EAN8, UPCA, UPCE), EANSUP, etc. 
                codeEAN.setCodeType(codeEAN.EAN13);
                codeEAN.setCode("7898363332493");
                Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
                document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
            } catch (Exception de) {
                de.printStackTrace();
            }
            document.close();
        }
    }//GEN-LAST:event_btnOk2ActionPerformed

    private void btnFechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnFechar2ActionPerformed

    private void btnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar2ActionPerformed
        txt2.setText(null);
        txt2.grabFocus();
    }//GEN-LAST:event_btnLimpar2ActionPerformed

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
            java.util.logging.Logger.getLogger(codigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(codigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(codigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(codigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new codigoBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn13Digitos;
    private javax.swing.JButton btn8Digitos;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnFechar2;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnOk1;
    private javax.swing.JButton btnOk2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
