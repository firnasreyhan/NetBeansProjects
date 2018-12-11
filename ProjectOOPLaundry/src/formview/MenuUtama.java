package formview;

import java.sql.Connection;
import Koneksi.koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class MenuUtama extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    ArrayList<layanan_helper> lyn = new ArrayList<layanan_helper>();
    private DefaultTableModel tabmode;
    String simpan_id;

    protected void aktif() {
        Pl_JenisCucian.setEnabled(true);
        txtnama.setEnabled(true);
        txtalamat.setEnabled(true);
        txthp.requestFocus();
    }

    protected void kosong() {
        Pl_JenisCucian.setSelectedItem("");
        txtnama.setText("");
        txtalamat.setText("");
        txtharga.setText("");
        txtbrt.setText("");
        txthp.setText("");
        txttotl.setText("");
        txtbyar.setText("");
    }

    public void ambil_layanan() {
        try {
            Statement st = conn.createStatement();
            String sql = "select * from layanan";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lyn.add(new layanan_helper(rs.getInt("ID_LAYANAN"), rs.getString("NAMA_LAYANAN"), rs.getInt("HARGA")));
            }
            Pl_JenisCucian.addItem("");
            for (layanan_helper item : lyn) {
                Pl_JenisCucian.addItem(item.nama);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void tanggal() {
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //To change body of generated methods, choose Tools | Templates.
                Date tgl = new Date();
                SimpleDateFormat tglan = new SimpleDateFormat("HH:mm:ss / dd-MM-yyyy");
                tgll.setText(tglan.format(tgl));
            }
        };
        new Timer(100, task).start();
    }

    public void proses() {
        String cek = (String) Pl_JenisCucian.getSelectedItem();
        try {
            Statement stt = conn.createStatement();
            String sql = "select * from layanan where NAMA_LAYANAN = '" + cek + "'";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                simpan_id = rs.getString("ID_LAYANAN");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if (txtnama.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Harap isi data dahulu");
        } else {
            Float brt = Float.parseFloat(txtbrt.getText());
            try {
                Statement st = conn.createStatement();
                String sql = "INSERT INTO transaksi (NAMAPEL,ALAMAT,NO_TELP,ID_LAYANAN,BERAT,TOTAL_HARGA) values ('" + txtnama.getText() + "','" + txtalamat.getText() + "','" + txthp.getText() + "',"
                        + "'" + simpan_id + "','" + Float.toString(brt) + "','" + txttotl.getText() + "')";
                st.execute(sql);
                kosong();
                bersih();
                datatable();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "ss");
            }
        }
    }

    public void edit() {
        String cek = (String) Pl_JenisCucian.getSelectedItem();
        try {
            Statement stt = conn.createStatement();
            String sql = "select * from layanan where NAMA_LAYANAN = '" + cek + "'";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                simpan_id = rs.getString("ID_LAYANAN");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int i = tbl_laundry.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Pilih Data yang ingin diedit");
        } else {
            Float brt = Float.parseFloat(txtbrt.getText());
            DefaultTableModel tm = (DefaultTableModel) tbl_laundry.getModel();
            String kd = tm.getValueAt(i, 0).toString();
            try {
                Statement st = conn.createStatement();
                String sql = "Update transaksi set NAMAPEL = '" + txtnama.getText() + "', ALAMAT = '" + txtalamat.getText() + "', NO_TELP = '" + txthp.getText() + "',"
                        + "ID_LAYANAN = '" + simpan_id + "', BERAT = '" + Float.toString(brt) + "', TOTAL_HARGA = '" + txttotl.getText() + "' where ID_TRANSAKSI ='" + kd + "'";
                st.execute(sql);
                kosong();
                bersih();
                datatable();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Data gagal diedit");
            }
        }
    }

    public void hapus() {
        int i = tbl_laundry.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Pilih Data yang ingin dihapus");
        } else {
            DefaultTableModel tm = (DefaultTableModel) tbl_laundry.getModel();
            String kd = tm.getValueAt(i, 0).toString();
            try {
                Statement st = conn.createStatement();
                String sql = "Delete from transaksi where ID_TRANSAKSI ='" + kd + "'";
                st.execute(sql);
                kosong();
                bersih();
                datatable();
                JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Data gagal dihapus");
            }
        }
    }

    protected void datatable() {
        Object[] Baris = {"ID_TRANSAKSI", "NAMAPEL", "ALAMAT", "NO_TELP", "ID_LAYANAN", "BERAT", "TOTAL_HARGA", "TANGGAL", "STATUS"};
        tabmode = new DefaultTableModel(null, Baris);
        tbl_laundry.setModel(tabmode);
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
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Gagal Menampilkan Data");
        }
    }

    public void bersih() {
        DefaultTableModel tb = (DefaultTableModel) tbl_laundry.getModel();
        while (tb.getRowCount() > 0) {
            for (int i = 0; i < tb.getRowCount(); ++i) {
                tb.removeRow(i);
            }
        }
    }

    public MenuUtama() {
        initComponents();
        datatable();
        ambil_layanan();
        //combo();
        tanggal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        Pl_JenisCucian = new javax.swing.JComboBox<>();
        breset = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtbrt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_laundry = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txthp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttotl = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtbyar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtkembali = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tgll = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Luck Laundry");
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM LAYANAN LAUNDRY");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Pelanggan");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Cucian");

        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        Pl_JenisCucian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pl_JenisCucianActionPerformed(evt);
            }
        });

        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bkeluar.setText("KELUAR");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Berat");

        txtbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrtActionPerformed(evt);
            }
        });
        txtbrt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbrtKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        jLabel6.setText("DATA LAUNDRY");

        tbl_laundry.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_laundry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_laundryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_laundry);
        if (tbl_laundry.getColumnModel().getColumnCount() > 0) {
            tbl_laundry.getColumnModel().getColumn(0).setResizable(false);
            tbl_laundry.getColumnModel().getColumn(1).setResizable(false);
            tbl_laundry.getColumnModel().getColumn(2).setResizable(false);
            tbl_laundry.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No HP ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total bayar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon1.jpg"))); // NOI18N
        jLabel9.setText("LuckLaundry");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("HAPUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bayar");

        txtbyar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbyarKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("KEMBALIAN");

        txtkembali.setEnabled(false);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        jLabel14.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel14AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        tgll.setText("tanggal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tgll)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pl_JenisCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtkembali)
                                    .addComponent(txttotl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtbrt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtbyar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bsimpan)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bkeluar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel1)
                    .addComponent(tgll, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtbrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txttotl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Pl_JenisCucian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtbyar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbyarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbyarKeyReleased
        Double bayar = Double.parseDouble(txtbyar.getText());
        Double tot_byr = Double.parseDouble(txttotl.getText());
        Double kembali = bayar - tot_byr;
        if (bayar >= tot_byr) {
            txtkembali.setText(String.valueOf(kembali));
        } else {
            txtkembali.setText("");
        }
    }//GEN-LAST:event_txtbyarKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hapus();
        kosong();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void tbl_laundryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_laundryMouseClicked
        // TODO add your handling code here:
        int pilih = tbl_laundry.getSelectedRow();
        txtnama.setText((String) tbl_laundry.getValueAt(pilih, 1));
        txtalamat.setText((String) tbl_laundry.getValueAt(pilih, 2));
        txthp.setText((String) tbl_laundry.getValueAt(pilih, 3));
        txtbrt.setText((String) tbl_laundry.getValueAt(pilih, 5));
        txttotl.setText((String) tbl_laundry.getValueAt(pilih, 6));
    }//GEN-LAST:event_tbl_laundryMouseClicked

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void txtbrtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbrtKeyReleased
        // TODO add your handling code here:
        Double tot = Double.parseDouble(txtharga.getText()) * Double.parseDouble(txtbrt.getText());
        txttotl.setText(Double.toString(tot));
    }//GEN-LAST:event_txtbrtKeyReleased

    private void txtbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrtActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        kosong();
    }//GEN-LAST:event_bresetActionPerformed

    private void Pl_JenisCucianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pl_JenisCucianActionPerformed
        // TODO add your handling code here:
        if (Pl_JenisCucian.getSelectedIndex() != 0) {
            txtharga.setText(String.valueOf(lyn.get(Pl_JenisCucian.getSelectedIndex() - 1).harga));
        } else {
            txtharga.setText("0");
        }
    }//GEN-LAST:event_Pl_JenisCucianActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        proses();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void jLabel14AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel14AncestorAdded

    }//GEN-LAST:event_jLabel14AncestorAdded

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setVisible(false);
        new menulayanann().setVisible(true);

    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Pl_JenisCucian;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_laundry;
    private javax.swing.JLabel tgll;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtbrt;
    private javax.swing.JTextField txtbyar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtkembali;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttotl;
    // End of variables declaration//GEN-END:variables
}
