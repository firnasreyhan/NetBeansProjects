package formview;

import model.NasabahInitAkun;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class menu extends javax.swing.JFrame {
    
    int pin;
    NasabahInitAkun bank = new NasabahInitAkun();
    NasabahInitAkun nasabahInitAkun;
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        this.nasabahInitAkun = nasabahInitAkun;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        atm = new javax.swing.JButton();
        teller = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setText("Bitcoin P2P money");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 38));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bitcoin-text.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 10, 200, 50);

        atm.setBackground(new java.awt.Color(26, 35, 126));
        atm.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        atm.setForeground(new java.awt.Color(255, 255, 255));
        atm.setText("ATM");
        atm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmActionPerformed(evt);
            }
        });
        jPanel2.add(atm);
        atm.setBounds(690, 10, 123, 47);

        teller.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        teller.setText("TELLER");
        teller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tellerActionPerformed(evt);
            }
        });
        jPanel2.add(teller);
        teller.setBounds(560, 10, 123, 47);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Tidak Ingin menggunakan Bitcoin?");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(120, 20, 380, 40);

        keluar.setBackground(new java.awt.Color(236, 236, 234));
        keluar.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        keluar.setForeground(new java.awt.Color(51, 102, 255));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel3.add(keluar);
        keluar.setBounds(490, 20, 145, 47);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 820, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("untuk alat pembayaran yang aman dan nyaman.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 410, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setText("Sebuah Cryptocurrency yang digunakan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 430, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("semua transaksi anda di enkripsi dan tidak dikenakan fee sedikitpun.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 440, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hero-bg.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void tellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tellerActionPerformed
        // TODO add your handling code here:
        new loginTeller().show();
        this.dispose(); 
    }//GEN-LAST:event_tellerActionPerformed

    private void atmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmActionPerformed
        // TODO add your handling code here:
        new loginAtm(nasabahInitAkun).show();
//        JLabel jPassword = new JLabel("Masukkan PIN :");
//        JTextField password = new JPasswordField();
//        Object[] ob = {jPassword, password};
//        int result = JOptionPane.showConfirmDialog(null, ob, "Masukkan PIN", JOptionPane.OK_CANCEL_OPTION);
// 
//        if (result == JOptionPane.OK_OPTION) {
//            String passwordValue = password.getText();
//            if ("1234".equals(passwordValue)) {
//                new atm().show();
//                this.dispose();
//            }
//        }
    }//GEN-LAST:event_atmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        // ini exception
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton keluar;
    private javax.swing.JButton teller;
    // End of variables declaration//GEN-END:variables
}
