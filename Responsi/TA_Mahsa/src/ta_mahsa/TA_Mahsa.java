/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_mahsa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class TA_Mahsa {

    public static Scanner sc = new Scanner(System.in);

    public static int pilih_menu, absen, gaji_pokok, uang_makan, uang_transport, total, n, index_gaji = 0, lembur, uanglembur, menu,
            tambah, pilihstatus, index_kasbon = 0, kasbon_transaksi, bulan, tahun, tambah_karyawan, index_terakhir, tambah_owner,
            pilih_golongan, pilih_gaji_pokok, pilih_status;
    //Tipe data untuk karyawan
    public static int update_karyawan = 0, update_karyawan_golongan, update_karyawan_status,
            hapus_karyawan, hapus_owner, update_golongan, update_gaji_pokok, update_uang_makan, update_uang_transport,
            update_uang_lembur, update_tunjangan_status, update_tunjangan;
    public static String update_karyawan_jk, update_karyawan_nama, pilih_tunjangan;

    public static char ulang, balik, jk;
    public static boolean kondisi_pilih_karyawan, kondisi_pilih_owner, kondisi_pilih_status;
    public static String pilih_karyawan, owner, pilih_owner;

    public static String[][] karyawan = new String[50][5];
    public static String[][] gaji = new String[50][8];
    public static String[][] kasbon = new String[50][2];
    public static String[][] hrd = new String[5][2];

    static void menu_kelola(String status[][], int golongan[][], int status_tunjangan[]) {
        do {
            ulang = 't';

            System.out.println("  Kelola Akun");
            System.out.println("================");
            System.out.println("1. KARYAWAN");
            System.out.println("2. OWNER");
            System.out.println("3. GOLONGAN");
            System.out.println("4. STATUS");
            System.out.println("5. Kembali");
            System.out.println("");
            do {
                System.out.print("Masukkan Pilihan Menu : ");
                menu = sc.nextInt();
                if (menu < 1 || menu > 5) {
                    System.out.println("Maaf, pilihan hanya 1 s/d 5 , silahkan input kembali");
                }
            } while (menu < 1 || menu > 5);
            switch (menu) {
                case 1:
                    System.out.println("   KARYAWAN");
                    System.out.println("===============");
                    System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                    for (int i = 0; i < karyawan.length; i++) {
                        if (karyawan[i][0] != null) {
                            System.out.println((i + 1) + ".   " + karyawan[i][0] + "\t\t  " + karyawan[i][1] + "\t\t    " + karyawan[i][2] + "\t\t          "
                                    + karyawan[i][3] + "\t\t   " + karyawan[i][4]);
                        }
                    }

                    System.out.println("");
                    System.out.println("\n1. Tambah Karyawan");
                    System.out.println("2. Edit Karyawan");
                    System.out.println("3. Hapus Karyawan");
                    System.out.println("4. Kembali\n");
                    do {
                        System.out.print("Pilih: ");
                        tambah_karyawan = sc.nextInt();
                        if (tambah_karyawan < 1 || tambah_karyawan > 4) {
                            System.out.println("Maaf, pilihan hanya 1 s/d 4 , silahkan input kembali");
                        }
                    } while (tambah_karyawan < 1 || tambah_karyawan > 4);
                    switch (tambah_karyawan) {
                        case 1:
                            System.out.println("   TAMBAH KARYAWAN");
                            System.out.println("======================");
                            System.out.println(" DAFTAR NAMA KARYAWAN");
                            System.out.println("=======================");
                            System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                            for (int i = 0; i < karyawan.length; i++) {
                                if (karyawan[i][0] != null) {
                                    System.out.println((i + 1) + ".   " + karyawan[i][0] + "\t\t  " + karyawan[i][1] + "\t\t    " + karyawan[i][2] + "\t\t          "
                                            + karyawan[i][3] + "\t\t   " + karyawan[i][4]);
                                }
                            }
                            do {
                                System.out.println("  Tambah Karyawan");
                                System.out.println("===================");
                                for (int i = 0; i < karyawan.length; i++) {
                                    if (karyawan[i][0] == null) {
                                        tambah = i;
                                        break;
                                    }
                                }
                                do {
                                    kondisi_pilih_karyawan = false;
                                    System.out.print("Masukkan Id Karyawan\t: ");
                                    pilih_karyawan = sc.next();
                                    for (int i = 0; i < karyawan.length; i++) {
                                        if (karyawan[i][0] != null) {
                                            if (karyawan[i][0].equalsIgnoreCase(pilih_karyawan)) {
                                                kondisi_pilih_karyawan = true;
                                                break;
                                            } else {
                                                kondisi_pilih_karyawan = false;
                                            }
                                        }
                                    }
                                } while (kondisi_pilih_karyawan);
                                karyawan[tambah][0] = pilih_karyawan;

                                System.out.print("Masukkan Nama Karyawan\t: ");
                                karyawan[tambah][1] = sc.next();
                                do {
                                    System.out.print("Masukkan Jenis Kelamin\t: ");
                                    jk = sc.next().charAt(0);
                                    if ((jk != 'P' && jk != 'p') && (jk != 'L' && jk != 'l')) {
                                        System.out.println("Maaf , jenis kelamin hanya P dan L saja");
                                    }
                                } while ((jk != 'P' && jk != 'p') && (jk != 'L' && jk != 'l'));
                                karyawan[tambah][2] = String.valueOf(jk);

                                do {
                                    System.out.print("Masukkan Golongan\t: ");
                                    karyawan[tambah][3] = sc.next();
                                    if (Integer.parseInt(karyawan[tambah][3]) < 1 || Integer.parseInt(karyawan[tambah][3]) > 4) {
                                        System.out.println("Maaf, golongan hanya 1 s/d 4");
                                    }
                                } while (Integer.parseInt(karyawan[tambah][3]) < 1 || Integer.parseInt(karyawan[tambah][3]) > 4);
                                System.out.println("1. Belum Menikah");
                                System.out.println("2. Menikah");
                                System.out.println("3. Duda");
                                System.out.println("4. Janda");
                                do {
                                    System.out.print("Masukkan Status Perkawinan\t: ");
                                    pilihstatus = sc.nextInt();
                                    if (pilihstatus < 1 || pilihstatus > 4) {
                                        System.out.println("Maaf, Status Perkawinan hanya 1 s/d 4");
                                    }
                                } while (pilihstatus < 1 || pilihstatus > 4);
                                karyawan[tambah][4] = status[pilihstatus - 1][1];

                                System.out.println("");
                                System.out.print("Apakah Ingin Tambah karyawan? (y/t) : ");
                                balik = sc.next().charAt(0);
                                System.out.println("");
                            } while ((balik != 'Y' && balik != 'y') && (balik != 'T' && balik != 't'));
                            break;

                        case 2:
                            System.out.println("    EDIT KARYAWAN");
                            System.out.println("=======================");
                            System.out.println(" DAFTAR NAMA KARYAWAN");
                            System.out.println("=======================");
                            System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                            for (int i = 0; i < karyawan.length; i++) {
                                if (karyawan[i][0] != null) {
                                    System.out.println((i + 1) + ".   " + karyawan[i][0] + "\t\t  " + karyawan[i][1] + "\t\t    " + karyawan[i][2] + "\t\t          "
                                            + karyawan[i][3] + "\t\t   " + karyawan[i][4]);
                                }
                            }

                            do {
                                kondisi_pilih_karyawan = false;
                                System.out.print("Masukkan Id Karyawan\t: ");
                                pilih_karyawan = sc.next();
                                for (int i = 0; i < karyawan.length; i++) {
                                    if (pilih_karyawan.equalsIgnoreCase(karyawan[i][0])) {
                                        update_karyawan = i;
                                        kondisi_pilih_karyawan = false;
                                        break;
                                    } else {
                                        kondisi_pilih_karyawan = true;
                                    }
                                }
                            } while (kondisi_pilih_karyawan);
                            System.out.println("\nID \t\t\t\t\t: " + karyawan[update_karyawan][0]);
                            System.out.println("Nama \t\t\t\t\t: " + karyawan[update_karyawan][1]);
                            System.out.print("Masukkan Nama Baru \t\t\t: ");
                            sc.nextLine();
                            update_karyawan_nama = sc.nextLine();
                            System.out.println("Jenis Kelamin \t\t\t\t: " + karyawan[update_karyawan][2]);
                            do {
                                System.out.print("Masukkan Jenis Kelamin [L]/[P] \t\t: ");
                                update_karyawan_jk = sc.next();
                                if (!(update_karyawan_jk.equalsIgnoreCase("l")) && !(update_karyawan_jk.equalsIgnoreCase("p"))) {
                                    System.out.println("Maaf, Jenis kelamin hanya P atau L saja");
                                }
                            } while (!(update_karyawan_jk.equalsIgnoreCase("l")) && !(update_karyawan_jk.equalsIgnoreCase("p")));
                            System.out.println("Golongan \t\t\t\t: " + karyawan[update_karyawan][3]);
                            do {
                                System.out.print("Masukkan Golongan Yang Baru (1-4) \t: ");
                                update_karyawan_golongan = sc.nextInt();
                                if (update_karyawan_golongan < 1 || update_karyawan_golongan > 4) {
                                    System.out.println("Maaf, golongan hanya 1 s/d 4");
                                }
                            } while (update_karyawan_golongan < 1 || update_karyawan_golongan > 4);
                            System.out.println("Status Perkawinan \t\t\t: " + karyawan[update_karyawan][4]);
                            for (int i = 0; i < status.length; i++) {
                                System.out.println((i + 1) + ". " + status[i][1]);
                            }
                            do {
                                System.out.print("Masukkan Status Perkawinan \t\t: ");
                                pilihstatus = sc.nextInt();
                                if (pilihstatus < 1 || pilihstatus > 4) {
                                    System.out.println("Maaf, Status Perkawinan hanya 1 s/d 4");
                                }
                            } while (pilihstatus < 1 || pilihstatus > 4);
                            do {
                                System.out.print("Apakah Anda Yakin Ingin Mengupdate Data Dengan ID " + pilih_karyawan + " [y]/[t] ? ");
                                ulang = sc.next().charAt(0);
                            } while ((ulang != 'T' && ulang != 't') && (ulang != 'Y' && ulang != 'y'));
                            if (ulang == 'Y' || ulang == 'y') {
                                //Untuk update nya. Kita ganti index yang kita dapatkan tadi diganti dengan variabel yang kita isi tadi
                                karyawan[update_karyawan][1] = update_karyawan_nama;
                                karyawan[update_karyawan][2] = update_karyawan_jk + "";
                                karyawan[update_karyawan][3] = update_karyawan_golongan + "";
                                karyawan[update_karyawan][4] = status[pilihstatus - 1][1];
                                System.out.println("Data Berhasil Diperbarui\n");
                            } else {
                                System.out.println("Data Gagal Diperbarui\n");
                            }
                            break;

                        case 3:
                            System.out.println("   HAPUS KARYAWAN");
                            System.out.println("=====================");
                            System.out.println(" DAFTAR NAMA KARYAWAN");
                            System.out.println("=======================");
                            System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                            for (int i = 0; i < karyawan.length; i++) {
                                if (karyawan[i][0] != null) {
                                    System.out.println((i + 1) + ".   " + karyawan[i][0] + "\t\t  " + karyawan[i][1] + "\t\t    " + karyawan[i][2] + "\t\t          "
                                            + karyawan[i][3] + "\t\t   " + karyawan[i][4]);
                                }
                            }

                            do {
                                kondisi_pilih_karyawan = false;
                                System.out.print("Masukkan Id Karyawan\t: ");
                                pilih_karyawan = sc.next();
                                for (int i = 0; i < karyawan.length; i++) {
                                    if (pilih_karyawan.equalsIgnoreCase(karyawan[i][0])) {
                                        hapus_karyawan = i;
                                        kondisi_pilih_karyawan = false;
                                        break;
                                    } else {
                                        kondisi_pilih_karyawan = true;
                                    }
                                }
                            } while (kondisi_pilih_karyawan);
                            System.out.println("  Data Karyawan");
                            System.out.println("-----------------");
                            System.out.println("ID \t\t\t : " + karyawan[hapus_karyawan][0]);
                            System.out.println("Nama \t\t\t : " + karyawan[hapus_karyawan][1]);
                            System.out.println("Jenis Kelamin \t\t : " + karyawan[hapus_karyawan][2]);
                            System.out.println("Golongan \t\t : " + karyawan[hapus_karyawan][3]);
                            System.out.println("Status Perkawinan \t : " + karyawan[hapus_karyawan][4]);
                            do {
                                System.out.print("Apakah Anda Yakin Ingin Menghapus Data Dengan ID " + karyawan[hapus_karyawan][0] + " [y]/[t] ? ");
                                ulang = sc.next().charAt(0);
                            } while ((ulang != 'T' && ulang != 't') && (ulang != 'Y' && ulang != 'y'));
                            if (ulang == 'Y' || ulang == 'y') {
                                //Menghapus index
                                for (int i = 0; i < karyawan[0].length; i++) {
                                    karyawan[hapus_karyawan][i] = null;
                                }
                                System.out.println("Data Berhasil Dihapus\n");
                            } else {
                                System.out.println("Data Gagal Dihapus\n");
                            }
                            break;
                        case 4:
                            ulang = 'y';
                            System.out.println("");
                            break;
                    }

                    if (tambah_karyawan != 4) {
                        System.out.println(" KARYAWAN");
                        System.out.println("============");
                        System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                        for (int i = 0; i < karyawan.length; i++) {
                            if (karyawan[i][0] != null) {
                                System.out.println((i + 1) + ".   " + karyawan[i][0] + "\t\t  " + karyawan[i][1] + "\t\t    " + karyawan[i][2] + "\t\t          "
                                        + karyawan[i][3] + "\t\t   " + karyawan[i][4]);
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("  OWNER");
                    System.out.println("=========");
                    System.out.println("\n1. Tambah Owner");
                    System.out.println("2. Hapus Owner");
                    System.out.println("3. Kembali\n");
                    do {
                        System.out.print("Pilih: ");
                        tambah_owner = sc.nextInt();
                        if (tambah_owner < 1 || tambah_owner > 4) {
                            System.out.println("Maaf pilihan hanya 1 s/d 3");
                        }
                    } while (tambah_owner < 1 || tambah_owner > 4);
                    switch (tambah_owner) {
                        case 1:
                            System.out.println("   TAMBAH OWNER");
                            System.out.println("===================");
                            System.out.println("");
                            System.out.println(" DATA OWNER");
                            System.out.println("=============");
                            System.out.println("ID Owner\tNama Owner");
                            for (int i = 0; i < hrd.length; i++) {
                                if (hrd[i][0] != null) {
                                    System.out.println(hrd[i][0] + "\t\t" + hrd[i][1]);
                                }
                            }
                            System.out.println("");
                            do {
                                System.out.println("  Tambah Owner");
                                System.out.println("=================");
                                for (int i = 0; i < hrd.length; i++) {
                                    if (hrd[i][0] == null) {
                                        tambah = i;
                                        break;
                                    }
                                }
                                do {
                                    kondisi_pilih_owner = false;
                                    System.out.print("Masukkan Id Owner\t: ");
                                    pilih_owner = sc.next();
                                    for (int i = 0; i < hrd.length; i++) {
                                        if (hrd[i][0] != null) {
                                            if (hrd[i][0].equalsIgnoreCase(pilih_owner)) {
                                                kondisi_pilih_owner = true;
                                                break;
                                            } else {
                                                kondisi_pilih_owner = false;
                                            }
                                        }
                                    }
                                } while (kondisi_pilih_owner);
                                hrd[tambah][0] = pilih_owner;

                                System.out.print("Masukkan Nama Owner\t: ");
                                hrd[tambah][1] = sc.next();

                                System.out.println("");
                                System.out.println("ID Owner\tNama Owner");
                                for (int i = 0; i < hrd.length; i++) {
                                    if (hrd[i][0] != null) {
                                        System.out.println(hrd[i][0] + "\t\t" + hrd[i][1]);
                                    }
                                }
                                System.out.print("Apakah Ingin Tambah Owner? (y/t) : ");
                                balik = sc.next().charAt(0);
                                System.out.println("");
                            } while ((balik != 'Y' && balik != 'y') && (balik != 'T' && balik != 't'));
                            break;

                        case 2:
                            System.out.println("  HAPUS OWNER");
                            System.out.println("==============");
                            System.out.println(" DATA OWNER");
                            System.out.println("=============");
                            System.out.println("ID Owner\tNama Owner");
                            for (int i = 0; i < hrd.length; i++) {
                                if (hrd[i][0] != null) {
                                    System.out.println(hrd[i][0] + "\t\t" + hrd[i][1]);
                                }
                            }

                            do {
                                kondisi_pilih_owner = false;
                                System.out.print("Masukkan Id Owner\t: ");
                                pilih_owner = sc.next();
                                for (int i = 0; i < hrd.length; i++) {
                                    if (pilih_owner.equalsIgnoreCase(hrd[i][0])) {
                                        hapus_owner = i;
                                        kondisi_pilih_owner = false;
                                        break;
                                    } else {
                                        kondisi_pilih_owner = true;
                                    }
                                }
                            } while (kondisi_pilih_owner);
                            System.out.println(" Data Owner");
                            System.out.println("--------------");
                            System.out.println("ID \t\t\t : " + hrd[hapus_owner][0]);
                            System.out.println("Nama \t\t\t : " + hrd[hapus_owner][1]);
                            do {
                                System.out.print("Apakah Anda Yakin Ingin Menghapus Data Dengan ID " + hrd[hapus_owner][0] + " [y]/[t] ? ");
                                ulang = sc.next().charAt(0);
                            } while ((ulang != 'T' && ulang != 't') && (ulang != 'Y' && ulang != 'y'));
                            if (ulang == 'Y' || ulang == 'y') {
                                //Menghapus index
                                for (int i = 0; i < hrd[0].length; i++) {
                                    hrd[hapus_owner][i] = null;
                                }
                                System.out.println("Data Berhasil Dihapus\n");
                            } else {
                                System.out.println("Data Gagal Dihapus\n");
                            }
                            break;
                        case 3:
                            ulang = 'y';
                            System.out.println("");
                            break;
                    }
                case 3:
                    System.out.println(" GOLONGAN");
                    System.out.println("===========");
                    System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan\t\tLembur/Jam");
                    for (int i = 0; i < golongan.length; i++) {
                        for (int j = 0; j < golongan[0].length; j++) {
                            System.out.print("  " + golongan[i][j] + "\t\t");
                        }
                        System.out.println("");
                    }
                    System.out.println(" Pilihan");
                    System.out.println("-----------");
                    System.out.println("1. Update Gaji Pokok");
                    System.out.println("2. Update Uang Transport");
                    System.out.println("3. Update Uang Makan");
                    System.out.println("4. Update Uang Lembur");
                    System.out.println("5. Kembali");
                    do {
                        System.out.println("Pilih : ");
                        pilih_golongan = sc.nextInt();
                        if (pilih_golongan < 1 || pilih_golongan > 5) {
                            System.out.println("Maaf, pilihan hanya 1 s/d 5");
                        }
                    } while (pilih_golongan < 1 || pilih_golongan > 5);
                    switch (pilih_golongan) {
                        case 1:
                            System.out.println(" Update Gaji Pokok");
                            System.out.println("====================");
                            System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan\t\tLembur/Jam");
                            for (int i = 0; i < golongan.length; i++) {
                                for (int j = 0; j < golongan[0].length; j++) {
                                    System.out.print("  " + golongan[i][j] + "\t\t");
                                }
                                System.out.println("");
                            }
                            do {
                                System.out.print("Pilih golongan: ");
                                pilih_golongan = sc.nextInt();
                                if (pilih_golongan < 1 || pilih_golongan > 4) {
                                    System.out.println("Maaf Golongan hanya 1 sampai 4");
                                }
                            } while (pilih_golongan < 1 || pilih_golongan > 4);
                            do {
                                System.out.print("Masukkan Gaji Pokok Baru  \t\t: ");
                                update_gaji_pokok = sc.nextInt();
                            } while (update_gaji_pokok < 1);
                            golongan[pilih_golongan - 1][1] = update_gaji_pokok;
                            break;

                        case 2:
                            System.out.println(" Update Uang Transport");
                            System.out.println("========================");
                            System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan\t\tLembur/Jam");
                            for (int i = 0; i < golongan.length; i++) {
                                for (int j = 0; j < golongan[0].length; j++) {
                                    System.out.print("  " + golongan[i][j] + "\t\t");
                                }
                                System.out.println("");
                            }
                            do {
                                System.out.print("Pilih golongan: ");
                                pilih_golongan = sc.nextInt();
                                if (pilih_golongan < 1 || pilih_golongan > 4) {
                                    System.out.println("Maaf Golongan hanya 1 sampai 4");
                                }
                            } while (pilih_golongan < 1 || pilih_golongan > 4);
                            do {
                                System.out.print("Masukkan Uang Transport Baru  \t\t: ");
                                update_uang_transport = sc.nextInt();
                            } while (update_uang_transport < 1);
                            golongan[pilih_golongan - 1][2] = update_uang_transport;
                            break;

                        case 3:
                            System.out.println(" Update Uang Makan");
                            System.out.println("===================");
                            System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan\t\tLembur/Jam");
                            for (int i = 0; i < golongan.length; i++) {
                                for (int j = 0; j < golongan[0].length; j++) {
                                    System.out.print("  " + golongan[i][j] + "\t\t");
                                }
                                System.out.println("");
                            }
                            do {
                                System.out.print("Pilih golongan: ");
                                pilih_golongan = sc.nextInt();
                                if (pilih_golongan < 1 || pilih_golongan > 4) {
                                    System.out.println("Maaf Golongan hanya 1 sampai 4");
                                }
                            } while (pilih_golongan < 1 || pilih_golongan > 4);
                            do {
                                System.out.print("Masukkan Uang Makan Baru  \t\t: ");
                                update_uang_makan = sc.nextInt();
                            } while (update_uang_makan < 1);
                            golongan[pilih_golongan - 1][3] = update_uang_makan;
                            break;

                        case 4:
                            System.out.println(" Update Uang Lembur");
                            System.out.println("====================");
                            System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan\t\tLembur/Jam");
                            for (int i = 0; i < golongan.length; i++) {
                                for (int j = 0; j < golongan[0].length; j++) {
                                    System.out.print("  " + golongan[i][j] + "\t\t");
                                }
                                System.out.println("");
                            }
                            do {
                                System.out.print("Pilih golongan: ");
                                pilih_golongan = sc.nextInt();
                                if (pilih_golongan < 1 || pilih_golongan > 4) {
                                    System.out.println("Maaf Golongan hanya 1 sampai 4");
                                }
                            } while (pilih_golongan < 1 || pilih_golongan > 4);
                            do {
                                System.out.print("Masukkan Uang Lembur Baru  \t\t: ");
                                update_uang_lembur = sc.nextInt();
                            } while (update_uang_lembur < 1);
                            golongan[pilih_golongan - 1][4] = update_uang_lembur;
                            break;

                        case 5:
                            ulang = 'y';
                            System.out.println("");
                            break;
                    }

                case 4:
                    System.out.println(" STATUS");
                    System.out.println("=========");
                    System.out.println("Kode Status\tTunjangan\tStatus Perkawinan");
                    for (int i = 0; i < status.length; i++) {
                        System.out.println(status[i][0] + "\t\t" + status_tunjangan[i] + "\t\t" + status[i][1]);
                    }
                    System.out.println("");
                    System.out.println("1. Update Tunjangan Status");
                    System.out.println("2. Kembali");
                    do {
                        System.out.print("Pilih:");
                        pilih_status = sc.nextInt();
                        if (pilih_status < 1 || pilih_status > 4) {
                            System.out.println("Maaf salah input, silahkan input kembali");
                        }
                    } while (pilih_status < 1 || pilih_status > 4);
                    switch (pilih_status) {
                        case 1:
                            System.out.println(" Update Status Tunjangan");
                            System.out.println("===========================");
                            do {
                                kondisi_pilih_status = false;
                                System.out.print("Masukkan Id Status\t: ");
                                pilih_tunjangan = sc.next();
                                for (int i = 0; i < status.length; i++) {
                                    if (pilih_tunjangan.equalsIgnoreCase(status[i][0])) {
                                        update_tunjangan_status = i;
                                        kondisi_pilih_status = false;
                                        break;
                                    } else {
                                        kondisi_pilih_status = true;
                                    }
                                }
                            } while (kondisi_pilih_status);
                            System.out.println("\nID \t\t\t\t\t: " + status[update_tunjangan_status][0]);
                            System.out.println("Nama \t\t\t\t\t: " + status[update_tunjangan_status][1]);
                            do {
                                System.out.print("Masukkan Tunjangan Baru \t\t\t: ");
                                update_tunjangan = sc.nextInt();
                            } while (update_tunjangan < 1);
                            for (int i = 0; i < status_tunjangan.length; i++) {
                                status_tunjangan[update_tunjangan_status] = update_tunjangan;
                            }
                            break;

                        case 2:
                            ulang = 'y';
                            System.out.println("");
                            break;
                    }
            }
        } while (ulang == 'y');
    }

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMMMMM - YYYY");
        String dt = sdf.format(now);
        int[][] golongan = {
            {1, 2700000, 10000, 25000, 8000},
            {2, 3000000, 13000, 28000, 10000},
            {3, 3200000, 16000, 32000, 12000},
            {4, 3500000, 20000, 35000, 15000}};
        String[][] status = {
            {"ST01", "Belum Menikah"},
            {"ST02", "Menikah"},
            {"ST03", "Duda"},
            {"ST04", "Janda"}};
        int[] status_tunjangan = {750000, 1500000, 900000, 900000};
        String[][] temp_hrd = {
            {"H01", "Nida"},
            {"H02", "Didi"},
            {"H03", "Nada"}};
        String[][] temp_karyawan = {
            {"YTR0011", "Aditya", "L", "2", status[0][1]},
            {"YTR0012", "Devit ", "L", "1", status[1][1]},
            {"YTR0013", "Dwiki ", "L", "3", status[0][1]},
            {"YTR0014", "Putri ", "P", "2", status[1][1]},
            {"YTR0015", "Nisar ", "P", "1", status[1][1]}};

        for (int i = 0; i < temp_karyawan.length; i++) {
            for (int j = 0; j < temp_karyawan[0].length; j++) {
                karyawan[i][j] = temp_karyawan[i][j];
            }
        }

        for (int i = 0; i < temp_hrd.length; i++) {
            for (int j = 0; j < temp_hrd[0].length; j++) {
                hrd[i][j] = temp_hrd[i][j];
            }

        }

        do {
            kasbon_transaksi = 0;
            ulang = 0;
            balik = 0;
            jk = 0;
            gaji_pokok = 0;
            uang_makan = 0;
            uang_transport = 0;
            uanglembur = 0;
            total = 0;
            tambah = 0;

            System.out.println("=======================");
            System.out.println("\tMENU");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Data Golongan");
            System.out.println("3. Data Status");
            System.out.println("4. Data Owner");
            System.out.println("5. Transaksi Penggajian");
            System.out.println("6. Kasbon");
            System.out.println("7. Laporan");
            System.out.println("8. Kelola Akun");
            System.out.println("9. Keluar");
            System.out.println("=======================");
            do {
                System.out.print("Pilih : ");
                pilih_menu = sc.nextInt();
                if (pilih_menu < 1 || pilih_menu > 9) {
                    System.out.println("Maaf, pilihan hanya 1 s/d 9");
                }
            } while (pilih_menu < 1 || pilih_menu > 9);

            System.out.println("");
            switch (pilih_menu) {
                case 1:
                    System.out.println(" DAFTAR NAMA KARYAWAN");
                    System.out.println("=======================");
                    System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                    for (int i = 0; i < karyawan.length; i++) {
                        if (karyawan[i][0] != null) {
                            System.out.println((i + 1) + ".   " + karyawan[i][0] + "\t\t  " + karyawan[i][1] + "\t\t    " + karyawan[i][2] + "\t\t          "
                                    + karyawan[i][3] + "\t\t   " + karyawan[i][4]);
                        }
                    }
                    break;
                case 2:
                    System.out.println(" DATA GOLONGAN");
                    System.out.println("================");
                    System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan\t\tLembur/Jam");
                    for (int i = 0; i < golongan.length; i++) {
                        for (int j = 0; j < golongan[0].length; j++) {
                            System.out.print("  " + golongan[i][j] + "\t\t");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(" DATA STATUS");
                    System.out.println("==============");
                    System.out.println("Kode Status\tTunjangan\tStatus Perkawinan");
                    for (int i = 0; i < status.length; i++) {
                        System.out.println(status[i][0] + "\t\t" + status_tunjangan[i] + "\t\t" + status[i][1]);
                    }
                    break;
                case 4:
                    System.out.println(" DATA OWNER");
                    System.out.println("============");
                    System.out.println("ID Owner\tNama Owner");
                    for (int i = 0; i < hrd.length; i++) {
                        if (hrd[i][0] != null) {
                            System.out.println(hrd[i][0] + "\t\t" + hrd[i][1]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("  TRANSAKSI GAJI KARYAWAN");
                    System.out.println("=============================");
                    System.out.println("");
                    do {
                        kondisi_pilih_karyawan = false;
                        System.out.print("Masukkan ID Ownner\t: ");
                        owner = sc.next();
                        for (int i = 0; i < hrd.length; i++) {
                            if (hrd[i][0] != null) {
                                if (hrd[i][0].equalsIgnoreCase(owner)) {
                                    kondisi_pilih_karyawan = false;
                                    break;
                                } else {
                                    kondisi_pilih_karyawan = true;
                                }

                            }
                        }
                        if (kondisi_pilih_karyawan == true) {
                            System.out.println("Mohon maaf, id owner salah");
                        }
                    } while (kondisi_pilih_karyawan);
                    for (int i = 0; i < hrd.length; i++) {
                        if (hrd[i][0] != null) {
                            if (hrd[i][0].equalsIgnoreCase(owner)) {
                                System.out.println("Nama Owner\t\t: " + hrd[i][1]);
                                System.out.println("");
                                kondisi_pilih_karyawan = false;
                            }
                        }
                    }

                    do {
                        kondisi_pilih_karyawan = false;
                        do {
                            System.out.print("Masukkan ID Karyawan\t: ");
                            pilih_karyawan = sc.next();
                            for (int i = 0; i < gaji.length; i++) {
                                if (gaji[i][0] != null) {
                                    if (gaji[i][0].equalsIgnoreCase(pilih_karyawan)) {
                                        kondisi_pilih_karyawan = true;
                                        System.out.println("Mohon maaf, karyawan dengan kode tersebut telah digaji");
                                        break;
                                    } else {
                                        kondisi_pilih_karyawan = false;
                                    }
                                }
                            }
                        } while (kondisi_pilih_karyawan);

                        for (int i = 0; i < karyawan.length; i++) {
                            if (karyawan[i][0] != null) {
                                if (karyawan[i][0].equalsIgnoreCase(pilih_karyawan)) {
                                    System.out.println("Nama\t\t\t: " + karyawan[i][1]);
                                    System.out.println("Jenis Kelamin\t\t: " + karyawan[i][2]);
                                    System.out.println("Golongan\t\t: " + karyawan[i][3]);
                                    System.out.println("Status\t\t\t: " + karyawan[i][4]);
                                    System.out.println("");
                                    for (int j = 0; j < kasbon.length; j++) {
                                        if (kasbon[j][0] != null) {
                                            if (kasbon[j][0].equalsIgnoreCase(pilih_karyawan)) {
                                                kasbon_transaksi = Integer.parseInt(kasbon[j][1]);
                                                break;
                                            }
                                        }
                                    }
                                    n = Integer.parseInt(karyawan[i][3]) - 1;
                                    gaji_pokok = golongan[n][1];

                                    do {
                                        System.out.print("Absen\t\t\t: ");
                                        absen = sc.nextInt();
                                        absen = 31 - absen;
                                        do {
                                            System.out.print("Lembur\t\t\t: ");
                                            lembur = sc.nextInt();
                                            if (lembur < 0 || lembur > 12) {
                                                System.out.println("Maaf, maksimal hanya 12 Jam");
                                            }
                                        } while (lembur > 12);
                                        if (absen == 0) {
                                            total = gaji_pokok - kasbon_transaksi;
                                        } else if (absen > 0 && absen < 32) {
                                            uang_makan = absen * golongan[n][3];
                                            uang_transport = absen * golongan[n][2];
                                            uanglembur = lembur * golongan[n][4];
                                            total = gaji_pokok + uang_makan + uang_transport + uanglembur - kasbon_transaksi;
                                        } else {
                                            System.out.println("Jumlah kehadiran yang anda masukkan salah");
                                        }
                                    } while (absen < 0 || absen > 31);

                                    System.out.println("Gaji Pokok\t\t: " + gaji_pokok);
                                    System.out.println("Uang Makan\t\t: " + uang_makan);
                                    System.out.println("Uang Transport\t\t: " + uang_transport);
                                    System.out.println("Lembur\t\t\t: " + uanglembur);
                                    System.out.println("Kasbon\t\t\t: " + kasbon_transaksi);
                                    System.out.println("Total Pembayaran Bersih\t: " + total);

                                    if (index_gaji < gaji.length) {
                                        gaji[index_gaji][0] = karyawan[i][0];
                                        gaji[index_gaji][1] = karyawan[i][1];
                                        gaji[index_gaji][2] = String.valueOf(absen);
                                        gaji[index_gaji][3] = String.valueOf(gaji_pokok);
                                        gaji[index_gaji][4] = String.valueOf(uang_transport);
                                        gaji[index_gaji][5] = String.valueOf(uang_makan);
                                        gaji[index_gaji][6] = String.valueOf(uanglembur);
                                        gaji[index_gaji][7] = String.valueOf(total);
                                    } else {
                                        System.out.println("Mohon maaf, array laporan sudah penuh!");
                                    }
                                    kondisi_pilih_karyawan = false;
                                    break;
                                } else {
                                    kondisi_pilih_karyawan = true;
                                }
                            }
                        }
                    } while (kondisi_pilih_karyawan);

                    index_gaji++;
                    System.out.println("");

                    break;
                case 6:
                    System.out.println("  KASBON  ");
                    System.out.println("==========");
                    do {
                        kondisi_pilih_karyawan = false;
                        do {
                            System.out.print("Masukkan ID Karyawan\t: ");
                            pilih_karyawan = sc.next();
                            for (int i = 0; i < kasbon.length; i++) {
                                if (kasbon[i][0] != null) {
                                    if (kasbon[i][0].equalsIgnoreCase(pilih_karyawan)) {
                                        kondisi_pilih_karyawan = true;

                                        break;
                                    } else {
                                        kondisi_pilih_karyawan = false;
                                    }
                                }
                            }
                        } while (kondisi_pilih_karyawan);

                        for (int i = 0; i < karyawan.length; i++) {
                            if (karyawan[i][0] != null) {
                                if (karyawan[i][0].equalsIgnoreCase(pilih_karyawan)) {
                                    System.out.println("Nama\t\t\t: " + karyawan[i][1]);
                                    System.out.println("Jenis Kelamin\t\t: " + karyawan[i][2]);
                                    System.out.println("Golongan\t\t: " + karyawan[i][3]);
                                    System.out.println("Status\t\t\t: " + karyawan[i][4]);
                                    n = Integer.parseInt(karyawan[i][3]) - 1;
                                    gaji_pokok = golongan[n][1];
                                    System.out.println("Gaji Pokok\t\t: " + gaji_pokok);
                                    System.out.println("");
                                    kasbon[index_kasbon][0] = pilih_karyawan;
                                    do {
                                        System.out.print("Kasbon\t\t: ");
                                        kasbon[index_kasbon][1] = sc.next();
                                    } while (Integer.parseInt(kasbon[index_kasbon][1]) > (gaji_pokok / 2));
                                    kondisi_pilih_karyawan = false;
                                    break;
                                } else {
                                    kondisi_pilih_karyawan = true;
                                }
                            }
                        }
                    } while (kondisi_pilih_karyawan);
                    index_kasbon++;
                    break;
                case 7:
                    System.out.println("  LAPORAN  ");
                    System.out.println("===========");
                    System.out.println("");
                    System.out.println("Periode Penggajian\t: " + dt);
                    System.out.println("");
                    System.out.println("Kode\t| Nama\t |   Absen    | Gaji Pokok     | Uang Tranasport |   Uang Makan   |      Lembur       |     Gaji Bersih      |");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                    for (int i = 0; i < gaji.length; i++) {
                        if (gaji[i][0] != null) {
                            System.out.println(gaji[i][0] + "\t|" + gaji[i][1] + "   |     " + gaji[i][2] + "      |    " + gaji[i][3] + "     |   " + gaji[i][4] + "        |   " + gaji[i][5] + "       |     " + gaji[i][6] + "        |     " + gaji[i][7] + "          |");
                        }
                    }
                    break;

                case 8:
                    menu_kelola(status, golongan, status_tunjangan);
                    break;

                case 9:
                    System.exit(0);
                    break;
            }

            do {
                System.out.print("Kembali ke Menu? (y/t) : ");
                ulang = sc.next().charAt(0);
            } while ((ulang != 'Y' && ulang != 'y') && (ulang != 'T' && ulang != 't'));
            System.out.println("");
            System.out.println("");
        } while (ulang == 'y' || ulang == 'Y');
    }
}
