package formview;

import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class transaksiambil extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private String id, status;

    protected void datatable() {
        Object[] Baris = {"ID_TRANSAKSI", "NAMAPEL", "ALAMAT", "NO_TELP", "ID_LAYANAN", "BERAT", "TOTAL_HARGA", "TANGGAL", "STATUS"};
        tabmode = new DefaultTableModel(null, Baris);
        laundry.setModel(tabmode);
        try {
            java.sql.Statement stat = conn.createStatement();
            String sql = "select * from transaksi";
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String ID_T = hasil.getString("ID_TRANSAKSI");
                String NAMA = hasil.getString("NAMAPEL");
                String ALAMAT = hasil.getString("ALAMAT");
                String NO_HP = hasil.getString("NO_TELP");
                String ID_LAYANAN = hasil.getString("ID_LAYANAN");
                String HARGA = hasil.getString("BERAT");
                String BERAT = hasil.getString("TOTAL_HARGA");
                String TOTAL_BAYAR = hasil.getString("TANGGAL");
                String STATUS = hasil.getString("STATUS");
                String[] data = {ID_T, NAMA, ALAMAT, NO_HP, ID_LAYANAN, HARGA, BERAT, TOTAL_BAYAR, STATUS};
                tabmode.addRow(data);
                id = "";
                status = "";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Gagal Menampilkan Data");
        }
    }

    public transaksiambil() {
        initComponents();
        datatable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        laundry = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ambil = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        laundry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        laundry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laundryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(laundry);

        jButton1.setText("TRANSAKSI SELESAI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        ambil.setText("DI AMBIL");
        ambil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(ambil)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ambil))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laundryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laundryMouseClicked
        int baris = laundry.rowAtPoint(evt.getPoint());
        id = laundry.getValueAt(baris, 0).toString();
        status = laundry.getValueAt(baris, 8).toString();
    }//GEN-LAST:event_laundryMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        new menulayanann().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!id.equalsIgnoreCase("")) {
            try {
                Statement st = conn.createStatement();
                String sql = "UPDATE transaksi SET STATUS ='Selesai' WHERE ID_TRANSAKSI ='" + id + "'";
                st.execute(sql);
                datatable();
                JOptionPane.showMessageDialog(null, "Transaksi selesai :)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Data gagal diedit");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ambilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambilActionPerformed
        // TODO add your handling code here:
        if (!status.equalsIgnoreCase("Proses")) {
            try {
                Statement st = conn.createStatement();
                String sql = "DELETE FROM transaksi WHERE ID_TRANSAKSI = '" + id + "'";
                st.execute(sql);
                datatable();
                JOptionPane.showMessageDialog(null, "Barang sudah diambil :)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Data gagal diedit");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Barang masih dalam proses pengerjaan");
        }
    }//GEN-LAST:event_ambilActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksiambil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable laundry;
    // End of variables declaration//GEN-END:variables
}
