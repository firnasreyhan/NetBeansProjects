/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_mahsa;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Old_Mahsa {

    public static void menuUtama(String pegawai[][], int gaji[], int gol[][], String status[]) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        char ulang = 0, kembali = 0;
        do {
            System.out.println("=======================");
            System.out.println("\tMENU");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Data Golongan");
            System.out.println("3. Data Status");
            System.out.println("4. Transaksi Penggajian");
            System.out.println("5. Kelola Akun");
            System.out.println("6. Keluar");
            System.out.println("=======================");

            do {
                System.out.print("Masukkan Pilihan    : ");
                pilihan = sc.nextInt();
                System.out.println("");
            } while (pilihan < 1 || pilihan > 6);

            if (pilihan == 1) {
                datakaryawan(pegawai, gaji);
            } else if (pilihan == 2) {
                System.out.println(" DATA GOLONGAN");
                System.out.println("================");
                System.out.println("Golongan\tGaji Pokok\t\tTransport\t  Makan");
                for (int i = 0; i < gol.length; i++) {
                    for (int j = 0; j < gol[0].length; j++) {
                        System.out.print("  " + gol[i][j] + "\t\t");
                    }
                    System.out.println("");
                }

            } else if (pilihan == 3) {
                System.out.println(" DATA STATUS");
                System.out.println("==============");
                for (int i = 0; i < status.length; i++) {
                    System.out.println(status[i] + " ");
                }

            } else if (pilihan == 4) {
                datagaji(pegawai, gaji);
            } else if (pilihan == 5) {
                do {
                    kelolaAkun(pegawai);
                    System.out.print("• Kembali? y/t: ");
                    kembali = sc.next().charAt(0);
                    System.out.println("");
                } while (kembali == 'y' || kembali == 'Y');
            } else if (pilihan == 6) {
                System.exit(0);
            } else {
                System.out.println("Maaf Salah Input");
            }
            do {
                System.out.print("Kembali ke Menu Awal? (y/t) : ");
                ulang = sc.next().charAt(0);
            } while ((ulang != 'Y' && ulang != 'y') && (ulang != 'T' && ulang != 't'));
            System.out.println("");
            System.out.println("");
        } while (ulang == 'Y' || ulang == 'y');
    }

    public static void datakaryawan(String pegawai[][], int gaji[]) {
        Scanner sc = new Scanner(System.in);
        char ulang = 0;
        System.out.println(" DAFTAR NAMA KARYAWAN");
        System.out.println("=======================");
        System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
        for (int i = 0; i < pegawai.length; i++) {
            if ((pegawai[i][0] != null) && (pegawai[i][1] != null) && (pegawai[i][2] != null) && (pegawai[i][3] != null) && (pegawai[i][4] != null)) {
                System.out.println((i + 1) + ".   " + pegawai[i][0] + "\t\t  " + pegawai[i][1] + "\t\t" + pegawai[i][2] + "\t\t"
                        + pegawai[i][3] + "\t\t" + pegawai[i][4]);
            }
        }
    }

    public static void datagaji(String pegawai[][], int gaji[]) {
        Scanner sc = new Scanner(System.in);
        String pilihkode;
        int karyawan, kehadiran, total, lembur, hasilembur, hasil, golongan = 0, gajibersih;
        int uanglembur = 10000;
        char ulang = 0;

        System.out.println("  TRANSAKSI GAJI KARYAWAN");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Masukkan ID Karyawan\t: ");
        pilihkode = sc.next();
//        for (int i = 0; i < pegawai.length; i++) {
//            if ((pegawai[i][0] != null) && (pegawai[i][1] != null) && (pegawai[i][2] != null) && (pegawai[i][3] != null) && (pegawai[i][4] != null)) {
//
//                System.out.println(" MASUKKAN ID KARYAWAN");
//                System.out.println("=======================");
//                System.out.println("ID Pegawai\t: ");
//                System.out.println("Nama Pegawai\t: " + pegawai[i][1]);
//                System.out.println("Jenis Kelamin\t: " + pegawai[i][2]);
//                System.out.println("Golongan\t: " + pegawai[i][3]);
//                System.out.println("Status Karyawan\t: " + pegawai[i][4]);
//
//                do {
//                    System.out.print("Masukkan Jumlah Kehadiran\t: ");
//                    kehadiran = sc.nextInt();
//                    if (kehadiran == 0) {
//                        System.out.print("GAJI BERSIH\t\t\t: ");
//                        System.out.println(gajibersih = 0);
//                    } else if (kehadiran > 31) {
//                        System.out.println("SILAHKAN INPUT KEMBALI");
//                    } else {
//                        System.out.println("Gaji Pokok Karyawan\t\t: " + gajipokok);
//                        total = uangmakan * kehadiran;
//                        System.out.println("Uang Makan\t\t\t: " + uangmakan + " x " + kehadiran + " = " + total);
//                        hasil = uangtransport * kehadiran;
//                        System.out.println("Uang Transport\t\t\t: " + uangtransport + " x " + kehadiran + " = " + hasil);
//
//                        do {
//                            System.out.print("Masukkan Jumlah Jam Lembur\t: ");
//                            lembur = sc.nextInt();
//                            if (lembur > 12) {
//                                System.out.println("SILAHKAN INPUT KEMBALI");
//                            } else {
//                                hasilembur = lembur * uanglembur;
//                                System.out.println("Uang Lembur\t\t\t: " + uanglembur + " x " + lembur + " = " + hasilembur);
//
//                                if (pegawai[i][3] == "1") {
//                                    golongan = 500000;
//                                } else if (pegawai[i][3] == "2") {
//                                    golongan = 1000000;
//                                } else if (pegawai[i][3] == "3") {
//                                    golongan = 1500000;
//                                }
//                                System.out.println("Tunjangan Jabatan\t\t: " + golongan);
//                                gajibersih = gajipokok + total + hasil + golongan + hasilembur;
//                                System.out.println("GAJI BERSIH\t\t\t: " + gajibersih);
//                                gaji[i] = gajibersih;
//                                System.out.println("");
//                            }
//                        } while (lembur > 12);
//                    }
//                } while (kehadiran > 31);
//            }
//        }
//        System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan\tGaji Bersih");
//        for (int i = 0; i < pegawai.length; i++) {
//            if ((pegawai[i][0] != null) && (pegawai[i][1] != null) && (pegawai[i][2] != null) && (pegawai[i][3] != null) && (pegawai[i][4] != null)) {
//                System.out.println((i + 1) + ".   " + pegawai[i][0] + "\t\t  " + pegawai[i][1] + "\t\t" + pegawai[i][2] + "\t\t"
//                        + pegawai[i][3] + "\t\t" + pegawai[i][4] + "\t\t\t" + gaji[i]);
//            }
//        }
//        System.out.println("");
    }

    public static void kelolaAkun(String pegawai[][]) {
        Scanner sc = new Scanner(System.in);
        int menu, tambah = 0;
        char ulang = 0, kembali = 0, balik = 0;

        System.out.println("======KELOLA AKUN======");
        System.out.println("1. Tambah Karyawan");
        System.out.println("2. Update Data Karyawan");
        System.out.println("3. Delete Karyawan");
        System.out.println("4. Keluar");
        System.out.println("=======================");

        do {
            System.out.print("Masukkan Pilihan Menu : ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.println(" DAFTAR NAMA KARYAWAN");
                System.out.println("=======================");
                System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                for (int i = 0; i < pegawai.length; i++) {
                    if ((pegawai[i][0] != null) && (pegawai[i][1] != null) && (pegawai[i][2] != null) && (pegawai[i][3] != null) && (pegawai[i][4] != null)) {
                        System.out.println((i + 1) + ".   " + pegawai[i][0] + "\t\t  " + pegawai[i][1] + "\t\t" + pegawai[i][2] + "\t\t"
                                + pegawai[i][3] + "\t\t" + pegawai[i][4]);
                    }
                }
                System.out.println("Tambah Karyawan");
                System.out.println("==============");

                for (int i = 0; i < pegawai.length; i++) {
                    for (int j = 0; j < pegawai[i].length; j++) {
                        if (pegawai[i][j] == null) {
                            tambah = i;
                        }
                    }
                }
                do {
                    System.out.println("Masukkan Id Karyawan: ");
                    pegawai[tambah][0] = sc.next();
                    System.out.println("Masukkan Nama Karyawan : ");
                    pegawai[tambah][1] = sc.next();
                    System.out.println("Masukkan Jenis Kelamin : ");
                    pegawai[tambah][2] = sc.next();
                    System.out.println("Masukkan Golongan : ");
                    pegawai[tambah][3] = sc.next();
                    System.out.println("Masukkan Status Perkawinan : ");
                    pegawai[tambah][4] = sc.next();
                    System.out.println("");
                    System.out.println("Apakah Ingin Tambah karyawan? (y/t) : ");
                    balik = sc.next().charAt(0);
                    System.out.println("");
                } while (balik == 'y' || balik == 'Y');

                System.out.println("No   ID Karyawan\tNama Karyawan\t\tJenis Kelamin\t\tGolongan\tStatus Perkawinan");
                for (int i = 0; i < pegawai.length; i++) {
                    if ((pegawai[i][0] != null) && (pegawai[i][1] != null) && (pegawai[i][2] != null) && (pegawai[i][3] != null) && (pegawai[i][4] != null)) {
                        System.out.println((i + 1) + ".   " + pegawai[i][0] + "\t\t  " + pegawai[i][1] + "\t\t" + pegawai[i][2] + "\t\t"
                                + pegawai[i][3] + "\t\t" + pegawai[i][4]);
                    }
                }
            } else if (menu == 2) {
                System.out.println("UPDATE DATA KARYAWAN");
            } else if (menu == 3) {
                System.out.println("DELETE KARYAWAN");
            } else {
                System.out.println("Maaf Salah Input, Silahkan Input Kembali");
            }
        } while (menu > 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan, karyawan, nama, absen, total, transport, hasil, menu, lembur, hasilembur, gajibersih, golongan = 0;
        char ulang = 'y';

        String[][] pegawai = new String[50][5];
        String[][] namapegawai = {
            {"YTR0011", "Aditya", "Laki-Laki", "2", "Kawin"},
            {"YTR0012", "Devit ", "Laki-Laki", "1", "Single"},
            {"YTR0013", "Dwiki ", "Laki-Laki", "3", "Single"},
            {"YTR0014", "Putri ", "Perempuan", "2", "Kawin"},
            {"YTR0015", "Nisar ", "Perempuan", "1", "Kawin"}};
        int[] gaji = new int[50];
        int[][] gol = {
            {1, 2800000, 10000, 25000},
            {2, 3000000, 13000, 28000},
            {3, 3200000, 16000, 32000},
            {4, 3500000, 20000, 35000}};
        String[] status = {"Belum Menikah", "Menikah", "Duda", "Janda"};
        int[] statusharga = {750000, 1500000, 900000, 900000};
        for (int i = 0; i < namapegawai.length; i++) {
            for (int j = 0; j < namapegawai[0].length; j++) {
                pegawai[i][j] = namapegawai[i][j];
            }
        }
        menuUtama(pegawai, gaji, gol, status);
    }

}
