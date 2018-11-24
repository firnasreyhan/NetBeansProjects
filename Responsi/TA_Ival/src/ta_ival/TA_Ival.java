/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_ival;
//JUMLAH CUCIAN TIDAK BERKURANG SAAT SUDAH DIAMBIL
//ADA ROW YANG DUPLICATE DI LAPORAN DAN PENGEMBALIAN
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Rey
 */
public class TA_Ival {

    static void menu(String arraypegawai[], String layanan[][], double harga[][],
            String satuan[], String laporan[][], double angka_laporan[][], double max_laundry) throws ParseException {
        Scanner input = new Scanner(System.in);
        int pilih_menu, pilih_database;
        int nota = 0;
        int convert = (int) max_laundry;
        do {
            nota++;
            System.out.println("=======================");
            System.out.println("   Semesta Laundry :) ");
            System.out.println("=======================");
            System.out.println("1. Transaksi");
            System.out.println("2. Pengambilan");
            System.out.println("3. Database");
            System.out.println("4. << Keluar");
            System.out.println("=======================");
            System.out.println("Jumlah Cucian " + convert + " kg");
            System.out.println("Buka dari Jam 08.00 - 16.00");
            System.out.println("Dengan 4 Mesin Cuci");
            System.out.println("-----------------------");
            System.out.print("Masukkan Pilihan : ");
            pilih_menu = input.nextInt();
            switch (pilih_menu) {
                case 1:
                    if (max_laundry <= 96) {
                        menu_pilihpegawai(arraypegawai, layanan, harga, satuan, nota, laporan, angka_laporan, max_laundry);
                    } else {
                        System.out.println("Maaf, Cucian Kami Sedang Full");
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    menu_pengambilan(laporan, angka_laporan, max_laundry);
                    break;
                case 3:
                    do {
                        menu_pegawai();
                        pilih_database = input.nextInt();
                        switch (pilih_database) {
                            case 1:
                                data_pegawai(arraypegawai);
                                break;
                            case 2:
                                data_jasa(layanan, harga, satuan);
                                break;
                            case 3:
                                laporan_trk(laporan, angka_laporan);
                                break;
                            case 4:
                                System.out.println(" ");
                                break;
                            default:
                                System.out.println("Maaf, Salah Input");
                                System.out.println("");
                        }
                    } while (pilih_database != 4);
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf, Salah Input");
                    System.out.println("");
            }
        } while (pilih_menu != 1 || pilih_menu != 2 || pilih_menu != 3);
    }

    static void menu_pilihpegawai(String arraypegawai[], String layanan[][], double harga[][],
            String satuan[], int nota, String laporan[][], double angka_laporan[][], double max_laundry) throws ParseException {
        Scanner input = new Scanner(System.in);
        int pilih_pegawai, panjangisi = 0;
        String pegawai = "";
        System.out.println("\n-----------------");
        System.out.println("Pegawai yang Aktif");
        System.out.println("-----------------");
        for (int i = 0; i < arraypegawai.length; i++) {
            if (arraypegawai[i] != null) {
                System.out.println((i + 1) + ". " + arraypegawai[i]);
                panjangisi++;
            }
        }
        do {
            System.out.print("Masukkan Pilihan : ");
            pilih_pegawai = input.nextInt();
            if (pilih_pegawai > panjangisi || pilih_pegawai <= 0) {
                System.out.println("Maaf, Salah Input");
                System.out.println("");
            }
        } while (pilih_pegawai > panjangisi || pilih_pegawai <= 0);

        for (int i = 0; i < arraypegawai.length; i++) {
            pegawai = arraypegawai[pilih_pegawai - 1];
        }
        menu_transaksi(pegawai, layanan, harga, satuan, arraypegawai, nota, laporan, angka_laporan, max_laundry);
    }

    static void menu_transaksi(String pegawai, String layanan[][], double harga[][], String satuan[],
            String arraypegawai[], int nota, String laporan[][], double angka_laporan[][], double max_laundry) throws ParseException {
        Scanner input = new Scanner(System.in);
        int pilih_transaksi;
        String pilih_layanan = "";
        System.out.println("\nAnda Memilih Transaksi");
        System.out.println("------------------------");
        System.out.println("1. Paket Reguler   3 hari");
        System.out.println("2. Paket Bisnis    2 hari");
        System.out.println("3. Paket Express   1 hari");
        System.out.println("------------------------");
        do {
            System.out.print("Masukkan Pilihan : ");
            pilih_transaksi = input.nextInt();
            if (pilih_transaksi < 1 || pilih_transaksi > 3) {
                System.out.println("Maaf, Salah Input");
                System.out.println("");
            }
        } while (pilih_transaksi < 1 || pilih_transaksi > 3);
        if (pilih_transaksi == 1) {
            pilih_layanan = "Paket Reguler";
        } else if (pilih_transaksi == 2) {
            pilih_layanan = "Paket Bisnis";
        } else if (pilih_transaksi == 3) {
            pilih_layanan = "Paket Express";
        }
        transaksi(pilih_transaksi, pilih_layanan, layanan, harga, satuan, arraypegawai,
                pegawai, nota, laporan, angka_laporan, max_laundry);

    }

    static void transaksi(int pilih_transaksi, String pilih_layanan, String layanan[][], double harga[][],
            String satuan[], String arraypegawai[], String pegawai, int nota, String laporan[][],
            double angka_laporan[][], double max_laundry) throws ParseException {
        int pilih_paket_layanan = 0, pilih_layanan_lain = 0, berat, index = 0, max_berat = 0;
        int arraypaket[][] = new int[10][10];
        char tambah;
        Scanner input = new Scanner(System.in);
        do {
            if (max_berat < 24) {
                System.out.println("\nAnda Memilih " + pilih_layanan);
                System.out.println("------------------------");
                for (int i = 0; i < 4; i++) {
                    System.out.println((i + 1) + ". " + layanan[pilih_transaksi - 1][i] + " \tRp."
                            + harga[pilih_transaksi - 1][i] + " / " + satuan[i]);
                }
                System.out.println("5. Lain - Lain");
                System.out.println("6. < Kembali");
                System.out.println("------------------------");
                System.out.print("Masukkan Pilihan : ");
                pilih_paket_layanan = input.nextInt();
                if (pilih_paket_layanan != 6) {
                    arraypaket[index][0] = pilih_paket_layanan;
                }
                switch (pilih_paket_layanan) {
                    case 1:
                        System.out.println("\nAnda Memilih Jasa Cuci");
                        System.out.println("Jumlah Berat " + max_berat + " kg");
                        System.out.println("Maksimal 24 kg");
                        System.out.println("------------------------");
                        do {
                            System.out.print("Masukkan Jumlah Berat / kg : ");
                            berat = input.nextInt();
                            if (berat > 24) {
                                System.out.println("Maaf, Maksimal Order 24 kg");
                            } else if (berat <= 0) {
                                System.out.println("Maaf, Salah Input");
                            }
                        } while (berat > 24 || berat <= 0);
                        if (max_berat + berat > 24) {
                            System.out.println("Maaf, Berat Melebihi Kapasitas");
                            pilih_paket_layanan = 5;
                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                    harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                        } else {
                            arraypaket[index][1] = berat;
                            max_berat = max_berat + berat;
                            System.out.print("Apakah ada tambahan [y]/[t] ? ");
                            tambah = input.next().charAt(0);
                            if (tambah == 'y' || tambah == 'Y') {
                                index++;
                            } else {
                                pilih_paket_layanan = 5;
                                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                        harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("\nAnda Memilih Jasa Cuci Kering");
                        System.out.println("Jumlah Berat " + max_berat + " kg");
                        System.out.println("Maksimal 24 kg");
                        System.out.println("------------------------");
                        do {
                            System.out.print("Masukkan Jumlah Berat / kg : ");
                            berat = input.nextInt();
                            if (berat > 24) {
                                System.out.println("Maaf, Maksimal Order 24 kg");
                            } else if (berat <= 0) {
                                System.out.println("Maaf, Salah Input");
                            }
                        } while (berat > 24 || berat <= 0);
                        if (max_berat + berat > 24) {
                            System.out.println("Maaf, Berat Melebihi Kapasitas");
                            pilih_paket_layanan = 5;
                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                    harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                        } else {
                            arraypaket[index][1] = berat;
                            max_berat = max_berat + berat;
                            System.out.print("Apakah ada tambahan [y]/[t] ? ");
                            tambah = input.next().charAt(0);
                            if (tambah == 'y' || tambah == 'Y') {
                                index++;
                            } else {
                                pilih_paket_layanan = 5;
                                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                        arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\nAnda Memilih Jasa Cuci Setrika");
                        System.out.println("Jumlah Berat " + max_berat + " kg");
                        System.out.println("Maksimal 24 kg");
                        System.out.println("------------------------");
                        do {
                            System.out.print("Masukkan Jumlah Berat / kg : ");
                            berat = input.nextInt();
                            if (berat > 24) {
                                System.out.println("Maaf, Maksimal Order 24 kg");
                            } else if (berat <= 0) {
                                System.out.println("Maaf, Salah Input");
                            }
                        } while (berat > 24 || berat <= 0);
                        if (max_berat + berat > 24) {
                            System.out.println("Maaf, Berat Melebihi Kapasitas");
                            pilih_paket_layanan = 5;
                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                    harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                        } else {
                            arraypaket[index][1] = berat;
                            max_berat = max_berat + berat;
                            System.out.print("Apakah ada tambahan [y]/[t] ? ");
                            tambah = input.next().charAt(0);
                            if (tambah == 'y' || tambah == 'Y') {
                                index++;
                            } else {
                                pilih_paket_layanan = 5;
                                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                        arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\nAnda Memilih Jasa Setrika");
                        System.out.println("Jumlah Berat " + max_berat + " kg");
                        System.out.println("Maksimal 24 kg");
                        System.out.println("------------------------");
                        do {
                            System.out.print("Masukkan Jumlah Berat / kg : ");
                            berat = input.nextInt();
                            if (berat > 24) {
                                System.out.println("Maaf, Maksimal Order 24 kg");
                            } else if (berat <= 0) {
                                System.out.println("Maaf, Salah Input");
                            }
                        } while (berat > 24 || berat <= 0);
                        if (max_berat + berat > 24) {
                            System.out.println("Maaf, Berat Melebihi Kapasitas");
                            pilih_paket_layanan = 5;
                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                    harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                        } else {
                            arraypaket[index][1] = berat;
                            max_berat = max_berat + berat;
                            System.out.print("Apakah ada tambahan [y]/[t] ? ");
                            tambah = input.next().charAt(0);
                            if (tambah == 'y' || tambah == 'Y') {
                                index++;
                            } else {
                                pilih_paket_layanan = 5;
                                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                        arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                            }
                        }
                        break;

                    case 5:
                        do {
                            System.out.println("\nAnda Memilih Lain - Lain");
                            for (int i = 4, urut = 1; i < layanan[pilih_transaksi - 1].length; i++) {
                                if (layanan[pilih_transaksi - 1][i] != null) {
                                    System.out.println(urut + ". " + layanan[pilih_transaksi - 1][i]
                                            + " \tRp." + harga[pilih_transaksi - 1][i] + " / " + satuan[pilih_transaksi - 1]);
                                    urut++;
                                }
                            }
                            System.out.println("0 . < Kembali");
                            System.out.print("Masukkan Pilihan : ");
                            pilih_layanan_lain = input.nextInt();
                            switch (pilih_layanan_lain) {
                                case 1:
                                    arraypaket[index][0] = pilih_layanan_lain + 4;
                                    System.out.println("\nAnda Memilih Order Boneka");
                                    System.out.println("Jumlah Berat " + max_berat + " kg");
                                    System.out.println("Maksimal 24 kg");
                                    System.out.println("------------------------");
                                    do {
                                        System.out.print("Masukkan Jumlah Berat / kg : ");
                                        berat = input.nextInt();
                                        if (berat > 24) {
                                            System.out.println("Maaf, Maksimal Order 24 kg");
                                        } else if (berat <= 0) {
                                            System.out.println("Maaf, Salah Input");
                                        }
                                    } while (berat > 24 || berat <= 0);
                                    if (max_berat + berat > 24) {
                                        System.out.println("Maaf, Berat Melebihi Kapasitas");
                                        pilih_paket_layanan = 5;
                                        lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                                harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                    } else {
                                        arraypaket[index][1] = berat;
                                        max_berat = max_berat + berat;
                                        System.out.print("Apakah ada tambahan [y]/[t] ? ");
                                        tambah = input.next().charAt(0);
                                        if (tambah == 'y' || tambah == 'Y') {
                                            index++;
                                        } else {
                                            pilih_paket_layanan = 5;
                                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                                    arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                        }
                                    }
                                    break;
                                case 2:
                                    arraypaket[index][0] = pilih_layanan_lain + 4;
                                    System.out.println("\nAnda Memilih Order Selimut");
                                    System.out.println("Jumlah Berat " + max_berat + " kg");
                                    System.out.println("Maksimal 24 kg");
                                    System.out.println("------------------------");
                                    do {
                                        System.out.print("Masukkan Jumlah Berat / kg : ");
                                        berat = input.nextInt();
                                        if (berat > 24) {
                                            System.out.println("Maaf, Maksimal Order 24 kg");
                                        } else if (berat <= 0) {
                                            System.out.println("Maaf, Salah Input");
                                        }
                                    } while (berat > 24 || berat <= 0);
                                    if (max_berat + berat > 24) {
                                        System.out.println("Maaf, Berat Melebihi Kapasitas");
                                        pilih_paket_layanan = 5;
                                        lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                                harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                    } else {
                                        arraypaket[index][1] = berat;
                                        max_berat = max_berat + berat;
                                        System.out.print("Apakah ada tambahan [y]/[t] ? ");
                                        tambah = input.next().charAt(0);
                                        if (tambah == 'y' || tambah == 'Y') {
                                            index++;
                                        } else {
                                            pilih_paket_layanan = 5;
                                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                                    arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                        }
                                    }
                                    break;
                                case 3:
                                    if (layanan[0][6] != null) {
                                        arraypaket[index][0] = pilih_layanan_lain + 4;
                                        System.out.println("Anda Memilih Order " + layanan[pilih_transaksi - 1][6]);
                                        System.out.println("Jumlah Berat " + max_berat + " kg");
                                        System.out.println("Maksimal 24 kg");
                                        System.out.println("------------------------");
                                        do {
                                            System.out.print("Masukkan Jumlah Berat / kg : ");
                                            berat = input.nextInt();
                                            if (berat > 24) {
                                                System.out.println("Maaf, Maksimal Order 24 kg");
                                            } else if (berat <= 0) {
                                                System.out.println("Maaf, Salah Input");
                                            }
                                        } while (berat > 24 || berat <= 0);
                                        if (max_berat + berat > 24) {
                                            System.out.println("Maaf, Berat Melebihi Kapasitas");
                                            pilih_paket_layanan = 5;
                                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                                    harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                        } else {
                                            arraypaket[index][1] = berat;
                                            max_berat = max_berat + berat;
                                            System.out.print("Apakah ada tambahan [y]/[t] ? ");
                                            tambah = input.next().charAt(0);
                                            if (tambah == 'y' || tambah == 'Y') {
                                                index++;
                                            } else {
                                                pilih_paket_layanan = 5;
                                                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                                        arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                            }
                                        }
                                    } else {
                                        System.out.println("Maaf, Salah Input");
                                        break;
                                    }
                                    break;
                                case 4:
                                    if (layanan[0][7] != null) {
                                        arraypaket[index][0] = pilih_layanan_lain + 4;
                                        System.out.println("Anda Memilih Order " + layanan[pilih_transaksi - 1][7]);
                                        System.out.println("Jumlah Berat " + max_berat + " kg");
                                        System.out.println("Maksimal 24 kg");
                                        System.out.println("------------------------");
                                        do {
                                            System.out.print("Masukkan Jumlah Berat / kg : ");
                                            berat = input.nextInt();
                                            if (berat > 24) {
                                                System.out.println("Maaf, Maksimal Order 24 kg");
                                            } else if (berat <= 0) {
                                                System.out.println("Maaf, Salah Input");
                                            }
                                        } while (berat > 24 || berat <= 0);
                                        if (max_berat + berat > 24) {
                                            System.out.println("Maaf, Berat Melebihi Kapasitas");
                                            pilih_paket_layanan = 5;
                                            lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                                                    harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                        } else {
                                            arraypaket[index][1] = berat;
                                            max_berat = max_berat + berat;
                                            System.out.print("Apakah ada tambahan [y]/[t] ? ");
                                            tambah = input.next().charAt(0);
                                            if (tambah == 'y' || tambah == 'Y') {
                                                index++;
                                            } else {
                                                pilih_paket_layanan = 5;
                                                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan, harga,
                                                        arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                                            }
                                        }
                                    } else {
                                        System.out.println("Maaf, Salah Input");
                                        break;
                                    }
                                    break;
                                case 0:
                                    System.out.println(" ");
                                    break;
                                default:
                                    System.out.println("Maaf, Salah Input");
                            }
                            break;
                        } while (pilih_layanan_lain != 0);
                    case 6:
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("Maaf, Salah Input");
                }
            } else {
                pilih_paket_layanan = 5;
                lanjut_transaksi(pilih_transaksi, arraypaket, pilih_layanan, layanan,
                        harga, arraypegawai, satuan, pegawai, nota, laporan, angka_laporan, max_laundry);
                pilih_paket_layanan = 6;
            }
        } while (pilih_paket_layanan != 6);
    }

    static void lanjut_transaksi(int pilih_transaksi, int arraypaket[][], String pilih_layanan, String layanan[][],
            double harga[][], String arraypegawai[], String satuan[], String pegawai, int nota, String laporan[][],
            double angka_laporan[][], double max_laundry) throws ParseException {
        Scanner input = new Scanner(System.in);
        String nama, alamat, telepon, dt, dt_end, paketmu = "";
        double totalkiloan[] = new double[10];
        double harga_ongkir, subtotal = 0, total, bayar, kembalian;
        char ongkir, alert;
        int paket, get_index, index_terakhir, kolom_kosong = 0;;
        Date Dnow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        dt = sdf.format(Dnow);
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dt));

        do {
            if (pilih_layanan.equals("Paket Reguler")) {
                paket = 3;
            } else if (pilih_layanan.equals("Paket Bisnis")) {
                paket = 2;
            } else {
                paket = 1;
            }

            System.out.print("\nMasukkan Nama\t\t: ");
            nama = input.nextLine();
            System.out.print("Masukkan Alamat\t\t: ");
            alamat = input.nextLine();
            System.out.print("Masukkan Nomor Telepon\t: ");
            telepon = input.next();
            System.out.print("Apakah Perlu Jasa Kirim (Rp. 3000) [y]/[t] ? ");
            ongkir = input.next().charAt(0);
            if (ongkir == 'y' || ongkir == 'Y') {
                harga_ongkir = 3000;
            } else {
                harga_ongkir = 0;
            }
            System.out.println("\n\n--------------------------------------------------------");
            System.out.println("\t\t\tNota");
            System.out.println("--------------------------------------------------------");
            System.out.println("No\t\t: TR00" + nota);
            System.out.println("Pegawai\t\t: " + pegawai);
            System.out.println("Tanggal Masuk\t: " + dt);
            c.add(Calendar.DATE, paket);
            dt_end = sdf.format(c.getTime());
            System.out.println("Tanggal Selesai\t: " + dt_end);
            System.out.println("Nama\t\t: " + nama);
            System.out.println("Alamat\t\t: " + alamat);
            System.out.println("Telepon\t\t: " + telepon);
            System.out.println("\n    ----------------- " + pilih_layanan + " -----------------");
            System.out.println("Layanan\t\tBerat\t  Harga \t\tSubTotal");
            for (int i = 0; i < arraypaket.length; i++) {
                for (int j = 0; j < arraypaket[i].length; j++) {
                    if (arraypaket[i][0] == 1) {
                        paketmu = "C u c i  ";
                    } else if (arraypaket[i][0] == 2) {
                        paketmu = "C-Kering ";
                    } else if (arraypaket[i][0] == 3) {
                        paketmu = "C-Setrika";
                    } else if (arraypaket[i][0] == 4) {
                        paketmu = "Setrika  ";
                    } else if (arraypaket[i][0] == 5) {
                        paketmu = "Boneka   ";
                    } else if (arraypaket[i][0] == 6) {
                        paketmu = "Selimut  ";
                    } else if (arraypaket[i][0] == 7) {
                        paketmu = layanan[pilih_transaksi - 1][6];
                    } else if (arraypaket[i][0] == 8) {
                        paketmu = layanan[pilih_transaksi - 1][7];
                    }
                }

                if (arraypaket[i][0] != 0 && arraypaket[i][1] != 0) {
                    totalkiloan[i] = arraypaket[i][1] * harga[pilih_transaksi - 1][i];
                    System.out.println(paketmu + "\t" + arraypaket[i][1] + " kg\tRp. " + harga[pilih_transaksi - 1][i] + "\t  Rp. " + totalkiloan[i]);
                }
            }
            for (int i = 0; i < harga[0].length; i++) {
                subtotal = subtotal + (harga[pilih_transaksi - 1][i] * arraypaket[i][1]);
            }
            System.out.println("Ongkir\t\t\t\t\t: Rp. " + harga_ongkir);
            total = subtotal + harga_ongkir;
            System.out.println("--------------------------------------------------------");
            System.out.println("Total\t\t\t\t\t: Rp. " + total);
            System.out.println("");
            get_index = 0;
            for (int i = 0; i < laporan.length; i++) {
                if (laporan[i][0] == null) {
                    get_index = i;
                    break;
                }
            }
            //Memasukkan Ke Laporan
            laporan[get_index][0] = nama;
            laporan[get_index][1] = alamat;
            laporan[get_index][2] = telepon;
            laporan[get_index][3] = dt;
            laporan[get_index][4] = dt_end;
            for (int i = 0; i < arraypaket.length; i++) {
                if (arraypaket[i][0] == 1) {
                    paketmu = "C u c i  ";
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 2) {
                    paketmu = "C-Kering ";
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 3) {
                    paketmu = "C-Setrika";
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 4) {
                    paketmu = "Setrika  ";
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 5) {
                    paketmu = "Boneka   ";
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 6) {
                    paketmu = "Selimut  ";
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 7) {
                    paketmu = layanan[pilih_transaksi - 1][6];
                    laporan[get_index][i + 5] = paketmu;
                } else if (arraypaket[i][0] == 8) {
                    paketmu = layanan[pilih_transaksi - 1][7];
                    laporan[get_index][i + 5] = paketmu;
                }
            }

            for (int i = 0; i < berat_laporan[0].length; i++) {
                if (berat_laporan[0][i] == 0) {
                    kolom_kosong = i;
                    break;
                }
            }
            for (int i = 0; i < arraypaket.length; i++) {
                //angka_laporan[get_index][0] = arraypaket[i][1];
                //angka_laporan[get_index][1] = harga[pilih_transaksi - 1][i];
                if (arraypaket[i][0] != 0 && arraypaket[i][1] != 0) {
                    berat_laporan[i][kolom_kosong] = arraypaket[i][1];
                    harga_laporan[i][kolom_kosong] = harga[pilih_transaksi - 1][i];
                    subtotal_laporan[i][kolom_kosong] = totalkiloan[i];
                }
            }

            angka_laporan[get_index][0] = subtotal;
            angka_laporan[get_index][1] = harga_ongkir;
            angka_laporan[get_index][2] = total;
            //PENUTUP
            for (int i = 0; i < arraypaket.length; i++) {
                max_laundry = max_laundry + berat_laporan[i][kolom_kosong];
            }
            //
            do {
                System.out.print("Jumlah Bayar\t\t\t\t: Rp. ");
                bayar = input.nextDouble();
                if (bayar < total) {
                    System.out.println("Maaf, Jumlah Bayar kurang dari Total");
                    System.out.println("Silahkan ulangi lagi");
                }
            } while (bayar < total);
            kembalian = bayar - total;
            System.out.print("Kembalian\t\t\t\t: Rp. " + kembalian);
            System.out.println("\nTerima Kasih :) ");
            System.out.print("Apakah Ada Transaksi Baru [y]/[t] ? ");
            alert = input.next().charAt(0);
            if (alert == 't' || alert == 'T') {
                System.out.print("Apakah Anda Ingin Keluar [y]/[t] ? ");
                alert = input.next().charAt(0);
                if (alert == 'y' || alert == 'Y') {
                    System.exit(0);
                } else {
                    menu(arraypegawai, layanan, harga, satuan, laporan, angka_laporan, max_laundry);
                }
            } else {
                if (alert == 'y' || alert == 'Y') {
                    menu(arraypegawai, layanan, harga, satuan, laporan, angka_laporan, max_laundry);
                } else {
                    System.exit(0);
                }
            }
            System.out.println("\n");
        } while (alert == 'a');
    }

    static void menu_pengambilan(String laporan[][], double angka_laporan[][], double max_laundry) {
        Scanner input = new Scanner(System.in);
        int pilihan, index_terakhir, last_index;
        double jumlah_berat = 0;
        char alert = 0;
        System.out.println("\n------------------------");
        System.out.println("Menu Pengambilan");
        System.out.println("------------------------");
        last_index = 0;
        if (laporan[0][0] == null) {
            System.out.println("Data Masih Kosong\n\n");
        } else {
            for (int i = 0; i < laporan.length; i++) {
                if (laporan[i][0] != null) {
                    last_index++;
                    System.out.println("Data ke " + (i + 1));
                    System.out.println("Nama \t\t: " + laporan[i][0]);
                    System.out.println("Alamat \t\t: " + laporan[i][1]);
                    System.out.println("Telepon \t: " + laporan[i][2]);
                    System.out.println("Tanggal Masuk \t: " + laporan[i][3]);
                    System.out.println("Tanggal Selesai : " + laporan[i][4]);
                    System.out.println("Layanan\t\tBerat\t  Harga \t  SubTotal");
                    for (int j = 5; j < laporan[i].length; j++) {
                        if (laporan[i][j] != null) {
                            for (int l = 0; l < berat_laporan[i].length; l++) {
                                if (berat_laporan[l][i] != 0) {
                                    System.out.println(laporan[i][j] + "\t" + berat_laporan[l][i] + "kg\t"
                                            + harga_laporan[l][i] + "\t\t" + subtotal_laporan[l][i]);
                                }
                            }
                        }
                    }
                    if (angka_laporan[i][0] != 0) {
                        System.out.println("Subtotal \t: " + angka_laporan[i][0]);
                        System.out.println("Harga Ongkir \t: " + angka_laporan[i][1]);
                        System.out.println("Total \t\t: " + angka_laporan[i][2]);
                    }
                }
                if (angka_laporan[i][0] != 0) {
                    System.out.println("");
                }
            }
            do {
                System.out.print("Masukkan Pilihan : ");
                pilihan = input.nextInt();
                if (pilihan <= 0 || pilihan > last_index) {
                    System.out.println("Maaf, Salah Input");
                }
            } while (pilihan <= 0 || pilihan > last_index);
            System.out.print("Apakah Transaksi Atas Nama " + laporan[pilihan - 1][0] + " sudah diambil [y]/[t] ? ");
            alert = input.next().charAt(0);
            if (alert == 'y' || alert == 'Y') {
                for (int j = 0; j < laporan[0].length; j++) {
                    laporan[pilihan - 1][j] = null;
                }
                for (int j = 0; j < angka_laporan[0].length; j++) {
                    angka_laporan[pilihan - 1][j] = 0;
                }
                index_terakhir = 0;
                for (int i = 0; i < laporan.length; i++) {
                    if (laporan[i][0] != null) {
                        index_terakhir++;
                    }
                }
                for (int j = 0; j < laporan[0].length; j++) {
                    laporan[pilihan - 1][j] = laporan[index_terakhir][j];
                    laporan[index_terakhir][j] = null;
                }
                for (int j = 0; j < angka_laporan[0].length; j++) {
                    angka_laporan[pilihan - 1][j] = angka_laporan[index_terakhir][j];
                    angka_laporan[index_terakhir][j] = 0;
                }
                //Mengembalikkan berat
                for (int i = 0; i < berat_laporan.length; i++) {
                    jumlah_berat = jumlah_berat + berat_laporan[pilihan - 1][i];
                }
                System.out.println(jumlah_berat);
                System.out.println("SEBELUM");
                System.out.println(max_laundry);
                max_laundry = max_laundry - jumlah_berat;
                System.out.println("SESUDAH");
                System.out.println(max_laundry);

                System.out.println("\n-----------------");
                System.out.println("Pesanan Berhasil Diambil");
                System.out.println("-----------------\n");
            } else {
                System.out.println("\n-----------------");
                System.out.println("Pesanan Gagal Diambil");
                System.out.println("-----------------\n");
            }
        }
    }

    static void laporan_trk(String laporan[][], double angka_laporan[][]) {
        System.out.println("\n------------------------");
        System.out.println("Laporan Transaksi");
        System.out.println("------------------------");
        if (laporan[0][0] == null) {
            System.out.println("Data Masih Kosong\n");
        } else {
            for (int i = 0; i < laporan.length; i++) {
                if (laporan[i][0] != null) {
                    System.out.println("Data ke " + (i + 1));
                    System.out.println("Nama \t\t: " + laporan[i][0]);
                    System.out.println("Alamat \t\t: " + laporan[i][1]);
                    System.out.println("Telepon \t: " + laporan[i][2]);
                    System.out.println("Tanggal Masuk \t: " + laporan[i][3]);
                    System.out.println("Tanggal Selesai : " + laporan[i][4]);
                    System.out.println("Layanan\t\tBerat\t  Harga \t  SubTotal");
                    for (int j = 5; j < laporan[i].length; j++) {
                        if (laporan[i][j] != null) {
                            for (int l = 0; l < berat_laporan[i].length; l++) {
                                if (berat_laporan[l][i] != 0) {
                                    System.out.println(laporan[i][j] + "\t" + berat_laporan[l][i] + "kg\t"
                                            + harga_laporan[l][i] + "\t\t" + subtotal_laporan[l][i]);
                                }
                            }
                        }
                    }
                    if (angka_laporan[i][0] != 0) {
                        System.out.println("Subtotal \t: " + angka_laporan[i][0]);
                        System.out.println("Harga Ongkir \t: " + angka_laporan[i][1]);
                        System.out.println("Total \t\t: " + angka_laporan[i][2]);
                    }
                }
                if (angka_laporan[i][0] != 0) {
                    System.out.println("");
                }
            }
        }
    }

    static void menu_pegawai() {
        System.out.println("\nAnda Memilih Database");
        System.out.println("------------------------");
        System.out.println("1. Data Pegawai");
        System.out.println("2. Data Jasa Laundry");
        System.out.println("3. Laporan Transaksi");
        System.out.println("4. < Kembali");
        System.out.println("------------------------");
        System.out.print("Masukkan Pilihan : ");
    }

    static void data_pegawai(String arraypegawai[]) {
        Scanner input = new Scanner(System.in);
        int pilih_pegawai, hapus_pegawai, index_terakhir, edit_pegawai, index_baru = 0;
        String edit_baru_pegawai, tambah_pegawai;
        char alert;
        System.out.println("\nAnda Memilih Data Pegawai");
        do {
            for (int i = 0; i < arraypegawai.length; i++) {
                if (arraypegawai[i] != null) {
                    System.out.println((i + 1) + ". " + arraypegawai[i]);
                }
            }
            System.out.println("\n-------------------------");
            System.out.println("MENU DATA PEGAWAI LAUNDRY");
            System.out.println("-------------------------");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Edit Pegawai");
            System.out.println("3. Hapus Pegawai");
            System.out.println("4. < Kembali");
            System.out.print("Masukkan Pilihan : ");
            pilih_pegawai = input.nextInt();
            switch (pilih_pegawai) {
                case 1:
                    System.out.println("\n-----------------");
                    System.out.println("Tambah Pegawai");
                    System.out.println("-----------------");
                    for (int i = 0; i < arraypegawai.length; i++) {
                        if (arraypegawai[i] != null) {
                            System.out.println((i + 1) + ". " + arraypegawai[i]);
                        }
                    }
                    System.out.print("Masukkan Nama Baru : ");
                    input.nextLine();
                    tambah_pegawai = input.nextLine();
                    System.out.print("Apakah Anda Yakin Ingin Menambah Nama " + tambah_pegawai + " [y]/[t] ? ");
                    alert = input.next().charAt(0);
                    if (alert == 'Y' || alert == 'y') {
                        for (int i = 0; i < arraypegawai.length; i++) {
                            if (arraypegawai[i] == null) {
                                index_baru = i;
                                break;
                            }
                        }
                        arraypegawai[index_baru] = tambah_pegawai;
                        System.out.println("\n-----------------");
                        System.out.println("Data Berhasil Ditambah");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("Data Gagal Ditambah");
                        System.out.println("-----------------");
                    }
                    break;
                case 2:
                    System.out.println("\n-----------------");
                    System.out.println("Edit Pegawai");
                    System.out.println("-----------------");
                    for (int i = 0; i < arraypegawai.length; i++) {
                        if (arraypegawai[i] != null) {
                            System.out.println((i + 1) + ". " + arraypegawai[i]);
                        }
                    }
                    System.out.print("Masukkan Pilihan : ");
                    edit_pegawai = input.nextInt();
                    System.out.println("Nama : " + arraypegawai[edit_pegawai - 1]);
                    input.nextLine();
                    System.out.print("Masukkan Nama Baru : ");
                    edit_baru_pegawai = input.nextLine();
                    System.out.print("Apakah Anda Yakin Ingin Mengganti Nama " + arraypegawai[edit_pegawai - 1]
                            + " menjadi Nama " + edit_baru_pegawai + " [y]/[t] ? ");
                    alert = input.next().charAt(0);
                    if (alert == 'Y' || alert == 'y') {
                        arraypegawai[edit_pegawai - 1] = edit_baru_pegawai;
                        System.out.println("\n-----------------");
                        System.out.println("Data Berhasil Diperbarui");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("Data Gagal Diperbarui");
                        System.out.println("-----------------");
                    }
                    break;
                case 3:
                    System.out.println("\n-----------------");
                    System.out.println("Hapus Pegawai");
                    System.out.println("-----------------");
                    for (int i = 0; i < arraypegawai.length; i++) {
                        if (arraypegawai[i] != null) {
                            System.out.println((i + 1) + ". " + arraypegawai[i]);
                        }
                    }
                    System.out.print("Masukkan Pilihan : ");
                    hapus_pegawai = input.nextInt();
                    System.out.print("Apakah Anda Yakin Ingin Menghapus " + arraypegawai[hapus_pegawai - 1] + " [y]/[t] ? ");
                    alert = input.next().charAt(0);
                    index_terakhir = 0;
                    if (alert == 'Y' || alert == 'y') {
                        arraypegawai[hapus_pegawai - 1] = null;
                        index_terakhir = 0;
                        for (int i = 0; i < arraypegawai.length; i++) {
                            if (arraypegawai[i] != null) {
                                index_terakhir++;
                            }
                        }
                        arraypegawai[hapus_pegawai - 1] = arraypegawai[index_terakhir];
                        arraypegawai[index_terakhir] = null;

                        System.out.println("\n-----------------");
                        System.out.println("Data Berhasil Diperbarui");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("Data Gagal Diperbarui");
                        System.out.println("-----------------");
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Maaf, Salah Input");
            }
        } while (pilih_pegawai != 4);
    }

    static void data_jasa(String layanan[][], double harga[][], String satuan[]) {
        Scanner input = new Scanner(System.in);
        String tambah_jasa, baru_edit_jasa;
        int pilih_jasa, pilih_edit_harga, edit_pilih, pilih_layanan = 0, get_index = 0,
                pilihan_edit, pilih_hapus, pilih_hapus_jasa;
        double baru_edit_harga, tambah_reg_jasa, tambah_bis_jasa, tambah_exp_jasa;
        char alert;
        System.out.println("\nAnda Memilih Data Jasa Laundry");
        do {
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    System.out.println("\nLayanan Reguler");
                    System.out.println("-----------------");
                    for (int j = 0; j < layanan[0].length; j++) {
                        if (layanan[0][j] != null) {
                            System.out.println((j + 1) + ". " + layanan[0][j] + " \tRp. "
                                    + harga[0][j] + " / " + satuan[0]);
                        }
                    }
                } else if (i == 1) {
                    System.out.println("\nLayanan Bisnis");
                    System.out.println("-----------------");
                    for (int j = 0; j < layanan[0].length; j++) {
                        if (layanan[1][j] != null) {
                            System.out.println((j + 1) + ". " + layanan[1][j] + " \tRp. "
                                    + harga[1][j] + " / " + satuan[1]);
                        }
                    }
                } else {
                    System.out.println("\nLayanan Express");
                    System.out.println("-----------------");
                    for (int j = 0; j < layanan[0].length; j++) {
                        if (layanan[2][j] != null) {
                            System.out.println((j + 1) + ". " + layanan[2][j] + " \tRp. "
                                    + harga[2][j] + " / " + satuan[2]);
                        }
                    }
                }
            }
            System.out.println("\n-------------------------");
            System.out.println("MENU DATA JASA LAUNDRY");
            System.out.println("-------------------------");
            System.out.println("1. Tambah Jasa");
            System.out.println("2. Edit Jasa");
            System.out.println("3. Hapus Jasa");
            System.out.println("4. < Kembali");
            System.out.print("Masukkan Pilihan : ");
            pilih_jasa = input.nextInt();
            switch (pilih_jasa) {
                case 1:
                    System.out.println("\n-----------------");
                    System.out.println("Tambah Jasa");
                    System.out.println("-----------------");
                    for (int i = 0; i < layanan[0].length; i++) {
                        if (layanan[0][i] != null) {
                            System.out.println((i + 1) + ". " + layanan[0][i]);
                        }
                    }
                    System.out.print("Masukkan Nama Jasa Baru \t\t: ");
                    input.nextLine();
                    tambah_jasa = input.nextLine();
                    System.out.print("Masukkan Harga Untuk Paket Reguler \t: ");
                    tambah_reg_jasa = input.nextDouble();
                    System.out.print("Masukkan Harga Untuk Paket Bisnis \t: ");
                    tambah_bis_jasa = input.nextDouble();
                    System.out.print("Masukkan Harga Untuk Paket Express \t: ");
                    tambah_exp_jasa = input.nextDouble();
                    System.out.println("\nLayanan " + tambah_jasa);
                    System.out.println("Paket Reguler \t: " + tambah_reg_jasa);
                    System.out.println("Paket Bisnis \t: " + tambah_bis_jasa);
                    System.out.println("Paket Express \t: " + tambah_exp_jasa);
                    System.out.print("Apakah Anda Yakin Ingin Menambah Layanan Ini [y]/[t] ? ");
                    alert = input.next().charAt(0);
                    if (alert == 'Y' || alert == 'y') {
                        //Mencari index yang kosong
                        for (int i = 0; i < layanan[0].length; i++) {
                            if (layanan[0][i] == null) {
                                get_index = i;
                                break;
                            }
                        }
                        //Mengisi layanan nya di index tersebut
                        for (int i = 0; i < layanan.length; i++) {
                            layanan[i][get_index] = tambah_jasa;
                            if (i == 0) {
                                harga[i][get_index] = tambah_reg_jasa;
                            } else if (i == 1) {
                                harga[i][get_index] = tambah_bis_jasa;
                            } else if (i == 2) {
                                harga[i][get_index] = tambah_exp_jasa;
                            }
                        }
                        satuan[get_index] = "kg";
                        System.out.println("\n-----------------");
                        System.out.println("Layanan Berhasil Ditambah");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("Layanan Gagal Ditambah");
                        System.out.println("-----------------");
                    }
                    break;
                case 2:
                    do {
                        System.out.println("\n-----------------");
                        System.out.println("Edit Jasa");
                        System.out.println("-----------------");
                        System.out.println("1. Layanan Reguler");
                        System.out.println("2. Layanan Bisnis");
                        System.out.println("3. Layanan Express");
                        System.out.println("4. < Kembali");
                        System.out.print("Masukkan Pilihan : ");
                        pilih_layanan = input.nextInt();
                        System.out.println("");
                        if (pilih_layanan != 4) {
                            for (int i = 0; i < harga[pilih_layanan - 1].length; i++) {
                                if (harga[0][i] != 0) {
                                    System.out.println((i + 1) + ". " + layanan[pilih_layanan - 1][i] + " \tRp. "
                                            + harga[pilih_layanan - 1][i] + " / " + satuan[i]);
                                }
                            }
                        }
                        System.out.print("Masukkan Pilihan : ");
                        edit_pilih = input.nextInt();
                        do {
                            System.out.println("\n1. Edit Nama Jasa");
                            System.out.println("2. Edit Harga Jasa");
                            System.out.println("3. < Kembali");
                            System.out.print("Masukkan Pilihan : ");
                            pilihan_edit = input.nextInt();
                            if (pilihan_edit == 1) {
                                System.out.println("Anda Memilih Jasa " + layanan[pilih_layanan - 1][edit_pilih - 1]);
                                System.out.print("Masukkan Layanan Baru : ");
                                input.nextLine();
                                baru_edit_jasa = input.nextLine();
                                System.out.print("Apakah Anda Yakin Ingin Mengganti Jasa " + layanan[pilih_layanan - 1][edit_pilih - 1]
                                        + " menjadi Jasa " + baru_edit_jasa + " [y]/[t] ? ");
                                alert = input.next().charAt(0);
                                if (alert == 'y' || alert == 'Y') {
                                    layanan[pilih_layanan - 1][edit_pilih - 1] = baru_edit_jasa;
                                    System.out.println("\n-----------------");
                                    System.out.println("Jasa Berhasil Diperbarui");
                                    System.out.println("-----------------");
                                    pilihan_edit = 4;
                                    pilih_layanan = 4;
                                } else {
                                    System.out.println("\n-----------------");
                                    System.out.println("Jasa Gagal Diperbarui");
                                    System.out.println("-----------------");
                                    pilihan_edit = 4;
                                    pilih_layanan = 4;
                                }
                            } else if (pilihan_edit == 2) {
                                System.out.println(layanan[pilih_layanan - 1][edit_pilih - 1] + " "
                                        + harga[pilih_layanan - 1][edit_pilih - 1] + " / " + satuan[edit_pilih - 1]);
                                System.out.print("Masukkan Harga Baru : Rp. ");
                                baru_edit_harga = input.nextDouble();
                                System.out.print("Apakah Anda Yakin Ingin Mengganti Harga " + harga[pilih_layanan - 1][edit_pilih - 1]
                                        + " menjadi Harga " + baru_edit_harga + " [y]/[t] ? ");
                                alert = input.next().charAt(0);
                                if (alert == 'Y' || alert == 'y') {
                                    harga[pilih_layanan - 1][edit_pilih - 1] = baru_edit_harga;
                                    System.out.println("\n-----------------");
                                    System.out.println("Jasa Berhasil Diperbarui");
                                    System.out.println("-----------------");
                                    pilihan_edit = 4;
                                    pilih_layanan = 4;
                                } else {
                                    System.out.println("\n-----------------");
                                    System.out.println("Jasa Gagal Diperbarui");
                                    System.out.println("-----------------");
                                    pilihan_edit = 4;
                                    pilih_layanan = 4;
                                }
                            } else if (pilihan_edit == 3) {
                                System.out.println("");
                            } else {
                                System.out.println("Maaf, Salah Input");
                                System.out.println("");
                            }
                        } while (pilihan_edit != 3);
                        break;
                    } while (pilih_layanan != 4);
                    break;

                case 3:
                    do {
                        System.out.println("\n-----------------");
                        System.out.println("Hapus Jasa");
                        System.out.println("-----------------");
                        System.out.println("1. Layanan Reguler");
                        System.out.println("2. Layanan Bisnis");
                        System.out.println("3. Layanan Express");
                        System.out.println("4. < Kembali");
                        System.out.println("Masukkan Pilihan : ");
                        pilih_hapus = input.nextInt();
                        System.out.println("");
                        do {
                            for (int i = 0; i < layanan[pilih_hapus - 1].length; i++) {
                                if (layanan[0][i] != null) {
                                    System.out.println((i + 1) + ". " + layanan[pilih_hapus - 1][i] + " \tRp. "
                                            + harga[pilih_hapus - 1][i] + " / " + satuan[i]);
                                }
                            }
                            System.out.println("Masukkan Pilihan : ");
                            pilih_hapus_jasa = input.nextInt();
                        } while (pilih_hapus_jasa < 0 || pilih_hapus_jasa > layanan[0].length);
                        System.out.println("Apakah Anda Yakin Ingin Menghapus Jasa "
                                + layanan[pilih_hapus - 1][pilih_hapus_jasa - 1] + " [y]/[t] ? ");
                        alert = input.next().charAt(0);
                        if (alert == 'Y' || alert == 'y') {
                            layanan[pilih_hapus - 1][pilih_hapus_jasa - 1] = null;
                            harga[pilih_hapus - 1][pilih_hapus_jasa - 1] = 0;
                            satuan[pilih_hapus_jasa - 1] = null;

                            //Mencari index terakhir
                            get_index = 0;
                            for (int i = 0; i < layanan.length; i++) {
                                if (layanan[i][0] != null) {
                                    get_index++;
                                }
                            }
                            //index yang telah dihapus diisi dengan index terakhir
                            layanan[pilih_hapus - 1][pilih_hapus_jasa - 1] = layanan[pilih_hapus - 1][get_index];
                            harga[pilih_hapus - 1][pilih_hapus_jasa - 1] = harga[pilih_hapus - 1][get_index];
                            satuan[pilih_hapus_jasa - 1] = satuan[get_index];
                            //Index yang terakhir diisi menjadi null / dikosongkan
                            layanan[pilih_hapus - 1][get_index] = null;
                            harga[pilih_hapus - 1][get_index] = 0;
                            satuan[get_index] = null;
                            System.out.println("\n-----------------");
                            System.out.println("Jasa Berhasil Diperbarui");
                            System.out.println("-----------------");
                        } else {
                            System.out.println("\n-----------------");
                            System.out.println("Jasa Gagal Dihapus");
                            System.out.println("-----------------");
                        }
                    } while (pilih_hapus != 4);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Maaf, Salah Input");
                    System.out.println("");
            }
        } while (pilih_jasa != 4);
    }

    public static void main(String[] args) throws ParseException {
        String[] arraypegawai = new String[10];
        String[] datapegawai = {"Ronald Jr", "Indra", "Fajar Amirudin",
            "Lili", "Andi"};
        for (int i = 0; i < datapegawai.length; i++) {
            arraypegawai[i] = datapegawai[i];
        }

        String[] satuan = new String[8];
        String[] arraysatuan = {"kg", "kg", "kg", "kg", "kg", "kg"};
        for (int i = 0; i < arraysatuan.length; i++) {
            satuan[i] = arraysatuan[i];
        }

        String[][] layanan = new String[3][8];
        String[][] arraylayanan = {
            {"Cuci", "C-Kering", "C-Setrika", "Setrika", "Boneka", "Selimut"},
            {"Cuci", "C-Kering", "C-Setrika", "Setrika", "Boneka", "Selimut"},
            {"Cuci", "C-Kering", "C-Setrika", "Setrika", "Boneka", "Selimut"}
        };
        double[][] harga = new double[3][8];
        double[][] arrayharga = {
            {4000, 5000, 7000, 5000, 8000, 10000},
            {5000, 7000, 9000, 7000, 10000, 12000},
            {6000, 9000, 11000, 9000, 12000, 14000}
        };
        for (int i = 0; i < arraylayanan.length; i++) {
            for (int j = 0; j < arraylayanan[i].length; j++) {
                layanan[i][j] = arraylayanan[i][j];
                harga[i][j] = arrayharga[i][j];
            }
        }
        String[][] laporan = new String[10][15];
        double[][] angka_laporan = new double[10][10];
        double max_laundry = 0;
        menu(arraypegawai, layanan, harga, satuan, laporan, angka_laporan, max_laundry);
    }

    static double[][] harga_laporan = new double[10][10];
    static double[][] berat_laporan = new double[10][10];
    static double[][] subtotal_laporan = new double[10][10];
}
