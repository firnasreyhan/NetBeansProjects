package formview;

import javax.swing.JOptionPane;

public class BankATM extends javax.swing.JFrame {
    double hasil;
    String answer;
    double saldo;
    int masukan; 
     
    public BankATM() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(11,189,189));
    }
    
    public BankATM(int saldo) {
        this.saldo =saldo;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        transfer = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        ambil = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ceksaldo = new javax.swing.JButton();
        jtxtTampilan2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bantuan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selamat Datang di Bank Bitcoin ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 130, 40));

        simpan.setText("Simpan Uang");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 130, 40));

        ambil.setText("Ambil Uang");
        ambil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambilActionPerformed(evt);
            }
        });
        getContentPane().add(ambil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, 40));

        jButton4.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        jButton4.setText("SELESAI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 130, 40));

        ceksaldo.setText("Cek Saldo");
        ceksaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceksaldoActionPerformed(evt);
            }
        });
        getContentPane().add(ceksaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, 40));

        jtxtTampilan2.setEditable(false);
        jtxtTampilan2.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        jtxtTampilan2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtTampilan2.setText("0.00");
        getContentPane().add(jtxtTampilan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 40));

        jLabel2.setText("Saldo Anda Saat ini : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        jLabel7.setText("PT. BANK BITCOIN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 240, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btc-tameng.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        bantuan.setText("Bantuan");
        bantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bantuanActionPerformed(evt);
            }
        });
        getContentPane().add(bantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ceksaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceksaldoActionPerformed
        //simpanAwal();
        JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :"+ saldo);
        hasil = saldo;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer);
    }//GEN-LAST:event_ceksaldoActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if(masukan < 1){            
            JOptionPane.showMessageDialog(rootPane,"Nominal yang anda masukan salah.");
        }else{
            JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
            hasil = saldo + masukan;
            saldo=hasil;
            answer = String.format(" %,.2f ",saldo);
            jtxtTampilan2.setText(answer);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        // TODO add your handling code here:
        String nama3=JOptionPane.showInputDialog("Silahkan Masukan Nama ");
 
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if (masukan > 0 && saldo <= masukan) {
            JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda kurang !!!!!");
            JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
            JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo Rekening Anda Terlebih Dahulu");
//        System.exit(0);
        } else if (masukan > 0 && saldo >= masukan) {      
            hasil = saldo - masukan;
            saldo=hasil;
            answer = String.format(" %,.2f ", hasil);
            jtxtTampilan2.setText(answer);
            JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n"+ "Berhasil transfer kepada "+nama3+"sebesar :"+ masukan);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan.");
        }
    }//GEN-LAST:event_transferActionPerformed

    private void ambilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambilActionPerformed
        // TODO add your handling code here:
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if(masukan > 0 && saldo > masukan){
            hasil = saldo - masukan;
            saldo=hasil;
            answer = String.format(" %,.2f ", hasil);
            jtxtTampilan2.setText(answer);
            JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n");
        }else{
            JOptionPane.showMessageDialog(rootPane,"Transfer Gagal, Saldo anda kurang.");
        }
    }//GEN-LAST:event_ambilActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        new antrian().show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bantuanActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(rootPane,"Untuk bantuan silakan hubungi 077007 atau tanya satpam PT. Bank Bitcoin.");
    }//GEN-LAST:event_bantuanActionPerformed

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
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambil;
    private javax.swing.JButton bantuan;
    private javax.swing.JButton ceksaldo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtxtTampilan2;
    private javax.swing.JButton simpan;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
}
