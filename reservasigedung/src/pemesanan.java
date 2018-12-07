
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rey
 */
public class pemesanan extends javax.swing.JFrame {

    /**
     * Creates new form pemesanan
     */
    ArrayList<gedung_helper> gdg = new ArrayList<gedung_helper>();

    public pemesanan() {
        initComponents();
        load_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tb_idpesan = new javax.swing.JTextField();
        cb_gedung = new javax.swing.JComboBox<>();
        tb_nama = new javax.swing.JTextField();
        tb_alamat = new javax.swing.JTextField();
        tb_telepon = new javax.swing.JTextField();
        tb_pinjam = new javax.swing.JTextField();
        tb_kembali = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_hari = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_harga = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pesan = new javax.swing.JTable();
        bt_pesan = new javax.swing.JButton();
        bt_ubah = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();
        bt_hitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pemesanan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("ID Pemesanan");

        jLabel3.setText("Gedung");

        jLabel4.setText("Nama");

        jLabel5.setText("Alamat");

        jLabel6.setText("Telepon");

        jLabel7.setText("Tanggal Pinjam");

        jLabel8.setText("Tanggal Kembali");

        cb_gedung.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_gedungItemStateChanged(evt);
            }
        });

        jLabel9.setText("Jumlah Hari");

        jLabel10.setText("Bayar");

        lb_hari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lb_total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setText("Harga");

        lb_harga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb_idpesan)
                            .addComponent(cb_gedung, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_nama)
                            .addComponent(tb_alamat)
                            .addComponent(tb_telepon)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb_pinjam)
                            .addComponent(tb_kembali)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_harga)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lb_hari)
                                        .addComponent(lb_total)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tb_idpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_gedung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tb_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tb_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tb_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tb_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tb_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lb_harga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lb_hari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lb_total))
                .addContainerGap())
        );

        tbl_pesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Gedung", "Nama", "Alamat", "Telepon", "Pinjam", "Kembali", "Hari", "Bayar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pesanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pesan);

        bt_pesan.setText("Pesan");
        bt_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesanActionPerformed(evt);
            }
        });

        bt_ubah.setText("Ubah");
        bt_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ubahActionPerformed(evt);
            }
        });

        bt_clear.setText("Clear");

        bt_hitung.setText("Hitung");
        bt_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_hitung)
                            .addComponent(bt_pesan)
                            .addComponent(bt_ubah)
                            .addComponent(bt_clear))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hitungActionPerformed
        // TODO add your handling code here:
        String pinjam = tb_pinjam.getText();
        String kembali = tb_kembali.getText();
        int hari = Integer.parseInt(kembali.substring(8)) - Integer.parseInt(pinjam.substring(8)) + 1;
        lb_hari.setText(String.valueOf(hari));
        int bayar = hari * gdg.get(cb_gedung.getSelectedIndex()).harga;
        lb_total.setText(String.valueOf(bayar));
    }//GEN-LAST:event_bt_hitungActionPerformed

    private void bt_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesanActionPerformed
        // TODO add your handling code here:
        if (!lb_hari.getText().equalsIgnoreCase("")) {
            try {
                String sql = "INSERT INTO reservasi VALUES ('"
                        + tb_idpesan.getText() + "','"
                        + gdg.get(cb_gedung.getSelectedIndex()).id
                        + "','" + tb_nama.getText()
                        + "','" + tb_telepon.getText()
                        + "','" + tb_alamat.getText()
                        + "','" + tb_pinjam.getText()
                        + "','" + tb_kembali.getText()
                        + "','" + lb_hari.getText()
                        + "','" + lb_total.getText()
                        + "')";
                java.sql.Connection conn = (Connection) config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan data berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            load_table();
            kosong();
        } else {
            JOptionPane.showMessageDialog(null, "Hitung dahulu!");
        }
    }//GEN-LAST:event_bt_pesanActionPerformed

    private void tbl_pesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pesanMouseClicked
        // TODO add your handling code here:
        int baris = tbl_pesan.rowAtPoint(evt.getPoint());
        tb_idpesan.setText(tbl_pesan.getValueAt(baris, 0).toString());
        cb_gedung.setSelectedIndex(0);
        tb_nama.setText(tbl_pesan.getValueAt(baris, 2).toString());
        tb_alamat.setText(tbl_pesan.getValueAt(baris, 3).toString());
        tb_telepon.setText(tbl_pesan.getValueAt(baris, 4).toString());
        tb_pinjam.setText(tbl_pesan.getValueAt(baris, 5).toString());
        tb_kembali.setText(tbl_pesan.getValueAt(baris, 6).toString());
        //lb_hari.setText(tbl_pesan.getValueAt(baris, 7).toString());
        //lb_total.setText(tbl_pesan.getValueAt(baris, 8).toString());
        lb_hari.setText("");
        lb_total.setText("");
        tb_idpesan.setEditable(false);
    }//GEN-LAST:event_tbl_pesanMouseClicked

    private void bt_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ubahActionPerformed
        // TODO add your handling code here:
        if (!lb_hari.getText().equalsIgnoreCase("")) {
            try {
                String sql = "UPDATE reservasi SET \n"
                        + "ID_GEDUNG='" + gdg.get(cb_gedung.getSelectedIndex()).id + "',\n"
                        + "NAMA='" + tb_nama.getText() + "',\n"
                        + "TELP='" + tb_telepon.getText() + "',\n"
                        + "ALAMAT='" + tb_alamat.getText() + "',\n"
                        + "TGL_PINJAM='" + tb_pinjam.getText() + "',\n"
                        + "TGL_KEMBALI='" + tb_kembali.getText() + "',\n"
                        + "JUMLAH_HARI='" + lb_hari.getText() + "',\n"
                        + "BIAYA='" + lb_total.getText() + "'\n"
                        + "WHERE ID_RESERVASI = '" + tb_idpesan.getText() + "'";
                java.sql.Connection conn = (Connection) config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Perubahan data gagal" + e.getMessage());
            }
            load_table();
            kosong();
        } else {
            JOptionPane.showMessageDialog(null, "Hitung dahulu!");
        }
    }//GEN-LAST:event_bt_ubahActionPerformed

    private void cb_gedungItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_gedungItemStateChanged
        // TODO add your handling code here:
        lb_harga.setText(String.valueOf(gdg.get(cb_gedung.getSelectedIndex()).harga) + "/Hari");
    }//GEN-LAST:event_cb_gedungItemStateChanged

    private void kosong() {
        tb_idpesan.setText("");
        cb_gedung.setSelectedIndex(0);
        tb_nama.setText("");
        tb_alamat.setText("");
        tb_telepon.setText("");
        tb_pinjam.setText("");
        tb_kembali.setText("");
        lb_hari.setText("");
        lb_total.setText("");
        tb_idpesan.setEnabled(true);
    }

    private void load_table() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Gedung");
        model.addColumn("Nama");
        model.addColumn("Telepon");
        model.addColumn("Alamat");
        model.addColumn("Pinjam");
        model.addColumn("Kembali");
        model.addColumn("Hari");
        model.addColumn("Bayar");

        //menampilkan data database kedalam tabel
        try {
            String sql_pemesanan = "SELECT * FROM reservasi";
            String sql_gedung = "SELECT * FROM gedung";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql_gedung);
            while (res.next()) {
                gdg.add(new gedung_helper(res.getString(1), res.getString(2), res.getString(3), res.getInt(4)));
            }
            for (gedung_helper item : gdg) {
                cb_gedung.addItem(item.nama);
            }
            res = stm.executeQuery(sql_pemesanan);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3),
                    res.getString(4), res.getString(5), res.getString(6),
                    res.getString(7), res.getString(8), res.getString(9)});
            }
            tbl_pesan.setModel(model);
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_hitung;
    private javax.swing.JButton bt_pesan;
    private javax.swing.JButton bt_ubah;
    private javax.swing.JComboBox<String> cb_gedung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_harga;
    private javax.swing.JLabel lb_hari;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTextField tb_alamat;
    private javax.swing.JTextField tb_idpesan;
    private javax.swing.JTextField tb_kembali;
    private javax.swing.JTextField tb_nama;
    private javax.swing.JTextField tb_pinjam;
    private javax.swing.JTextField tb_telepon;
    private javax.swing.JTable tbl_pesan;
    // End of variables declaration//GEN-END:variables
}
