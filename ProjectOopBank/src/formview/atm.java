package formview;

import formview.menu;
import javax.swing.JOptionPane;


public class atm extends javax.swing.JFrame {
    double hasil;
    String answer;
    double saldo = 100000;
    int masukan;
    
    public atm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(247,247,247));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        transfer = new javax.swing.JButton();
        ceksaldo = new javax.swing.JButton();
        tariktunai = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtTampilan2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btc-bg-pojok-lg.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 480, 260));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bitcoin-text.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 240, 90);

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 1, 20)); // NOI18N
        jLabel7.setText("PT. BANK BITCOIN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 10, 380, 40);

        jLabel1.setFont(new java.awt.Font("SF Pro Text", 2, 12)); // NOI18N
        jLabel1.setText("melayani  dari  pagi  sampai  pagi");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(395, 50, 185, 16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 90));

        jPanel2.setLayout(null);

        transfer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        transfer.setText("TRANSFER");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        jPanel2.add(transfer);
        transfer.setBounds(340, 20, 90, 40);

        ceksaldo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ceksaldo.setText("CEK SALDO");
        ceksaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceksaldoActionPerformed(evt);
            }
        });
        jPanel2.add(ceksaldo);
        ceksaldo.setBounds(440, 20, 100, 40);

        tariktunai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tariktunai.setText("TARIK TUNAI");
        tariktunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tariktunaiActionPerformed(evt);
            }
        });
        jPanel2.add(tariktunai);
        tariktunai.setBounds(550, 20, 120, 40);

        keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel2.add(keluar);
        keluar.setBounds(680, 20, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 0, 50, 70);

        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel8.setText("Halo, Fatkul Nur Koirudin");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(90, 10, 200, 50);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 810, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Saldo Anda :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 30);

        jtxtTampilan2.setEditable(false);
        jtxtTampilan2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtTampilan2.setFont(new java.awt.Font("SF Pro Text", 1, 11)); // NOI18N
        jtxtTampilan2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtTampilan2.setText("100,000.00");
        jPanel3.add(jtxtTampilan2);
        jtxtTampilan2.setBounds(10, 40, 220, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 250, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ceksaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceksaldoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :"+ saldo);
        hasil = saldo;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer);
    }//GEN-LAST:event_ceksaldoActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new menu().show();
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void tariktunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tariktunaiActionPerformed
        // TODO add your handling code here:
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if(masukan % 50000 != 0 || masukan % 100 !=0){
            JOptionPane.showMessageDialog(rootPane,"Gagal, tarik tunai hanya kelipatan 50rb atau 100rb.");
        }else{
            if(saldo > masukan){
                hasil = saldo - masukan;
                saldo=hasil;
                answer = String.format(" %,.2f ", hasil);
                jtxtTampilan2.setText(answer);
                JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n");
            }else{
                JOptionPane.showMessageDialog(rootPane,"Gagal, Saldo Anda Kurang.");
            }
        }
    }//GEN-LAST:event_tariktunaiActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        // TODO add your handling code here:
        String nama3=JOptionPane.showInputDialog("Silahkan Masukan Nomor Rekening ");
 
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if (saldo <= masukan) {
            JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda kurang !!!!!");
            JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
            JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo Rekening Anda Terlebih Dahulu");
            System.exit(0);
        } else if (saldo >= masukan) {

        }
        hasil = saldo - masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ", hasil);
        jtxtTampilan2.setText(answer);
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n"+ "Berhasil transfer ke "+nama3+" sebesar :"+ masukan);
    }//GEN-LAST:event_transferActionPerformed

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
            java.util.logging.Logger.getLogger(atm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ceksaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtxtTampilan2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton tariktunai;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
}
