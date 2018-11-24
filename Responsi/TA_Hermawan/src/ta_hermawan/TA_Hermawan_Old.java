/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_hermawan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class TA_Hermawan_Old {

    static DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    static Date dateobj = new Date();
    static Scanner input = new Scanner(System.in);
    static char ulang, menu_utama;
    static int mainmenu, pilih_pompa, pilih_bbm, pilih_tipe, pilih_sub_menu, pilih_kelola, indeks = 0;
    static String pilih_operator, i_bbm, i_kode_operator, i_nama_operator, pilih, nama_operator = null;
    static int menu1, menu2, terakhir = 0, indeks_laporan = 0, pilih_stock;
    static double liter = 0, harga = 0, rupiah = 0, stock = 0;
    static String[] operator = new String[10];
    static String[] bbm = new String[10];
    static String[] kode_operator = new String[10];
    static String[][] laporan = new String[10][10];
    static int[] harga_bbm = new int[10];
    static double[] stock_bbm = new double[10];
    static boolean kondisi;

    public static void menu_operator() {
        do {
            kondisi = false;
            System.out.println("------ List Operator --------");
            for (int i = 0; i < operator.length; i++) {
                if (operator[i] != null) {
                    System.out.println(kode_operator[i] + ". " + operator[i]);
                }
            }
            System.out.println("-----------------------------");
            System.out.print("Pilih : ");
            pilih_operator = input.next();
            for (int i = 0; i < kode_operator.length; i++) {
                if (kode_operator[i] != null) {
                    if (kode_operator[i].equalsIgnoreCase(pilih_operator)) {
                        nama_operator = operator[i];

                        kondisi = false;
                        break;
                    } else {
                        kondisi = true;

                    }
                }
            }
        } while (kondisi);
    }

    public static void operator() {
        switch (menu1) {
            case 1:
                System.out.println("--------------- List Operator ---------------");
                for (int i = 0; i < operator.length; i++) {
                    if (operator[i] != null) {
                        System.out.println(kode_operator[i] + ". " + operator[i]);
                    }
                }
                do {
                    System.out.println("Kembali Ke Menu ? (Y/T)");
                    ulang = input.next().charAt(0);
                } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                break;
            case 2:

                System.out.println("--------------- Insert Operator ---------------");

                for (int i = 0; i < 10; i++) {
                    if (operator[i] == null && kode_operator[i] == null) {
                        input.nextLine();
                        do {
                            kondisi = false;
                            System.out.print("Masukkan Kode Operator : ");
                            i_kode_operator = input.nextLine();
                            for (int j = 0; j < kode_operator.length; j++) {
                                if (kode_operator[j] != null) {
                                    if (kode_operator[j].equalsIgnoreCase(i_kode_operator)) {
                                        kondisi = true;
                                        break;
                                    }
                                }
                            }
                        } while (kondisi);
                        kode_operator[i] = i_kode_operator;
                        do {
                            kondisi = false;
                            System.out.print("Masukkan Nama Operator : ");
                            i_nama_operator = input.nextLine();
                            for (int j = 0; j < operator.length; j++) {
                                if (operator[j] != null) {
                                    if (operator[j].equalsIgnoreCase(i_nama_operator)) {
                                        kondisi = true;
                                        break;
                                    }
                                }
                            }
                        } while (kondisi);
                        operator[i] = i_nama_operator;
                        break;
                    }
                }
                do {
                    System.out.println("Kembali Ke Menu Sebelumnya? (Y/T)");
                    ulang = input.next().charAt(0);
                } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                break;
            case 3:
                System.out.println("--------------- Update Operator ---------------");
                for (int i = 0; i < operator.length; i++) {
                    if (operator[i] != null) {
                        System.out.println(kode_operator[i] + ". " + operator[i]);
                    }
                }
                System.out.println("-------------------------");
                do {
                    System.out.print("Pilih Operator yang dirubah : ");
                    pilih = input.next();
                    for (int i = 0; i < kode_operator.length; i++) {
                        if (kode_operator[i] != null) {
                            if (kode_operator[i].equalsIgnoreCase(pilih)) {
                                kondisi = false;
                                indeks = i;
                                break;
                            } else {
                                kondisi = true;
                            }
                        }
                    }
                } while (kondisi);
                input.nextLine();
                do {
                    kondisi = false;
                    System.out.print("Masukkan Nama Operator : ");
                    i_nama_operator = input.nextLine();
                    for (int j = 0; j < operator.length; j++) {
                        if (operator[j] != null) {
                            if (operator[j].equalsIgnoreCase(i_nama_operator)) {
                                kondisi = true;
                                break;
                            }
                        }
                    }
                } while (kondisi);
                operator[indeks] = i_nama_operator;
                System.out.println("Berhasil diubah");
                do {
                    System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                    ulang = input.next().charAt(0);
                } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                break;
            case 4:
                System.out.println("--------------- Delete Operator ---------------");
                for (int i = 0; i < operator.length; i++) {
                    if (operator[i] != null) {
                        System.out.println(kode_operator[i] + ". " + operator[i]);
                    }
                }
                System.out.println("-------------------------");
                do {
                    System.out.print("Pilih Operator yang dihapus : ");
                    pilih = input.next();
                    for (int i = 0; i < kode_operator.length; i++) {
                        if (kode_operator[i] != null) {
                            if (kode_operator[i].equalsIgnoreCase(pilih)) {
                                kondisi = false;
                                indeks = i;
                                break;
                            } else {
                                kondisi = true;
                            }
                        }
                    }
                } while (kondisi);
                operator[indeks] = null;
                kode_operator[indeks] = null;

                for (int i = indeks; i < operator.length - 1; i++) {
                    operator[i] = operator[i + 1];
                    kode_operator[i] = kode_operator[i + 1];
                }
                do {
                    System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                    ulang = input.next().charAt(0);
                } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                break;
            case 5:
                break;
        }

    }

    public static void menu_bbm1() {
        do {
            System.out.println("--------------- Jenis dan Harga BBM ---------------");
            System.out.println("1. List BBM");
            System.out.println("2. Insert BBM");
            System.out.println("3. Update Harga BBM");
            System.out.println("4. Delete BBM");
            System.out.println("5. Kembali");
            System.out.println("---------------------------------------------------");
            do {
                System.out.print("Pilih Menu : ");
                menu2 = input.nextInt();
            } while (menu2 < 1 || menu2 > 5);
            switch (menu2) {
                case 1:
                    System.out.println("------------  List Jenis dan Harga BBM ------------");
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i] != null) {
                            System.out.println("> " + bbm[i] + "\t| " + harga_bbm[i] + "/Liter");
                        }
                    }
                    System.out.println("---------------------------------------------------");
                    do {
                        System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                        ulang = input.next().charAt(0);
                    } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                    break;
                case 2:
                    System.out.println("--------------- Insert BBM ---------------");
                    for (int i = 0; i < 10; i++) {
                        if (bbm[i] == null) {
                            input.nextLine();
                            do {
                                kondisi = false;
                                System.out.print("Masukkan Nama BBM baru : ");
                                i_bbm = input.nextLine();
                                for (int j = 0; j < bbm.length; j++) {
                                    if (bbm[j] != null) {
                                        if (bbm[j].equalsIgnoreCase(i_bbm)) {
                                            kondisi = true;
                                            break;
                                        }
                                    }
                                }
                            } while (kondisi);
                            bbm[i] = i_bbm;
                            do {
                                System.out.print("Masukkan Harga : ");
                                harga_bbm[i] = input.nextInt();
                                System.out.print("Masukkan Stock : ");
                                stock_bbm[i] = input.nextDouble();
                            } while (harga_bbm[i] <= 0 && stock_bbm[i] < 0);
                            break;
                        }
                    }
                    do {
                        System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                        ulang = input.next().charAt(0);
                    } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                    break;
                case 3:
                    System.out.println("--------------- Update BBM ---------------");
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i] != null) {
                            System.out.println((i + 1) + ". " + bbm[i] + "\t| " + harga_bbm[i] + "/Liter");
                        }
                    }
                    System.out.println("------------------------------------------");
                    System.out.print("Pilih : ");
                    indeks = input.nextInt();
                    do {
                        System.out.print("Masukkan harga : ");
                        harga_bbm[indeks - 1] = input.nextInt();
                    } while (harga_bbm[indeks - 1] <= 1);
                    do {
                        System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                        ulang = input.next().charAt(0);
                    } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                    break;
                case 4:
                    System.out.println("--------------- Delete BBM ---------------");
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i] != null) {
                            System.out.println((i + 1) + ". " + bbm[i] + "\t| " + harga_bbm[i] + "/Liter" + stock_bbm[i] + "Liter");
                        }
                    }
                    System.out.println("----------------------------------");
                    System.out.print("Pilih BBM yang dihapus : ");
                    indeks = input.nextInt();
                    bbm[indeks - 1] = null;
                    harga_bbm[indeks - 1] = 0;

                    for (int i = indeks - 1; i < bbm.length - 1; i++) {
                        bbm[i] = bbm[i + 1];
                        harga_bbm[i] = harga_bbm[i + 1];
                    }
                    do {
                        System.out.print("Kembali Ke Menu Sebelumnya? (Y/T)");
                        ulang = input.next().charAt(0);
                    } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                    break;
                case 5:
                    break;
            }
        } while (ulang == 'y' || ulang == 'Y');
    }

    public static void menu_bbm2() {
        do {
            System.out.println("--------------- Stock BBM ---------------");
            System.out.println("1. List Stock BBM");
            System.out.println("2. Insert Stock BBM");
            System.out.println("3. Update Stock BBM");
            System.out.println("4. Kembali");
            System.out.println("---------------------------------------------------");
            do {
                System.out.print("Pilih Menu : ");
                menu2 = input.nextInt();
            } while (menu2 < 1 || menu2 > 4);
            switch (menu2) {
                case 1:
                    System.out.println("--------------- Stock BBM ---------------");
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i] != null) {
                            System.out.println((i + 1) + " | " + bbm[i] + "\t| " + stock_bbm[i] + " Liter");
                        }
                    }
                    do {
                        System.out.println("Kembali Ke Menu ? (Y/T)");
                        ulang = input.next().charAt(0);
                    } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                    break;
                case 2:
                    System.out.println("--------------- Insert Stock BBM ---------------");
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i] != null) {
                            System.out.println((i + 1) + " | " + bbm[i] + "\t| " + stock_bbm[i] + " Liter");
                        }
                    }
                    System.out.println("------------------------------------------------");
                    System.out.print("Pilih BBM : ");
                    pilih_stock = input.nextInt();
                    do {
                        System.out.print("Masukkan Stock BBM : ");
                        stock = input.nextDouble();
                        stock_bbm[pilih_stock - 1] = stock_bbm[pilih_stock - 1] + stock;
                    } while (stock < 1);
                    break;
                case 3:
                    System.out.println("--------------- Update Stock BBM ---------------");
                    for (int i = 0; i < bbm.length; i++) {
                        if (bbm[i] != null) {
                            System.out.println((i + 1) + "." + bbm[i] + "\t| " + stock_bbm[i] + " Liter");
                        }
                    }
                    System.out.println("------------------------------------------------");
                    System.out.print("Pilih : ");
                    indeks = input.nextInt();
                    do {
                        System.out.print("Masukkan Stock BBM : ");
                        stock_bbm[indeks - 1] = input.nextDouble();
                    } while (stock_bbm[indeks] < 0);
                    do {
                        System.out.println("Kembali Ke Menu ? (Y/T)");
                        ulang = input.next().charAt(0);
                    } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
                    break;
                case 4:
                    break;
            }
        } while (ulang == 'y' || ulang == 'Y');
    }

    public static void transaksi() {
        do {
            System.out.println("-------------- Transaksi --------------");
            for (int i = 0; i < bbm.length; i++) {
                if (bbm[i] != null) {
                    System.out.println((i + 1) + "." + bbm[i] + "\t| " + harga_bbm[i] + "/Liter");
                }
            }
            System.out.println("---------------------------------------");
            for (int i = 0; i < bbm.length; i++) {
                if (bbm[i] != null) {
                    terakhir++;
                }
            }
            do {
                System.out.print("Pilih : ");
                pilih_pompa = input.nextInt();
            } while (pilih_pompa <= 0 || pilih_pompa > terakhir);

            harga = harga_bbm[pilih_pompa - 1];

            System.out.println("1. Satuan Rupiah");
            System.out.println("2. Satuan Liter");
            System.out.println("-----------------------------");
            do {
                System.out.print("Pilih : ");
                pilih_tipe = input.nextInt();
            } while (pilih_tipe <= 0 || pilih_tipe > 2);

            switch (pilih_tipe) {
                case 1:
                    do {
                        System.out.print("Masukkan uang : ");
                        rupiah = input.nextDouble();
                    } while (rupiah <= 1);
                    liter = rupiah / harga;
                    break;
                case 2:
                    do {
                        System.out.print("Masukkan liter : ");
                        liter = input.nextDouble();
                    } while (liter <= 0);
                    rupiah = liter * harga;
                    break;
            }
            if (stock_bbm[pilih_pompa - 1] > 0) {
//                for (int i = 0; i < laporan.length; i++) {
//                    if (laporan[i][0] == null) {
//                        indeks_laporan = i;
//                        break;
//                    }
//                }
//                laporan[indeks_laporan][0] = df.format(dateobj);
//                laporan[indeks_laporan][1] = pilih_pompa + "";
//                laporan[indeks_laporan][2] = bbm[pilih_pompa - 1];
//                laporan[indeks_laporan][3] = liter + "";
//                laporan[indeks_laporan][4] = rupiah + "";
//                laporan[indeks_laporan][5] = nama_operator;

                stock_bbm[pilih_pompa - 1] = stock_bbm[pilih_pompa - 1] - liter;
                System.out.println("Rupiah : " + rupiah);
                System.out.println("Liter : " + liter);
                System.out.println();
                System.out.println("PERTAMINA");
                System.out.println("SPBU 24.301.03");
                System.out.println("Jl. Raya Langsep, Sukun - Kota Malang");
                System.out.println("Telp. 021-500000");
                System.out.println(df.format(dateobj));
                System.out.println("-----------------------------------------");
                System.out.println("Nomor Pompa : " + pilih_pompa);
                System.out.println("Jenis BBM   : " + bbm[pilih_pompa - 1]);
                System.out.println("Liter       : " + liter);
                System.out.println("Harga/Liter : Rp. " + harga);
                System.out.println("Total       : Rp. " + rupiah);
                System.out.println("-----------------------------------------");
                System.out.println("Operator : " + nama_operator);
                System.out.println("Terima Kasih dan Selamat Jalan");
            } else {
                System.out.println("Mohon maaf, stok sedang habis/tidak cukup");
            }
            do {
                System.out.print("Apakah Anda Ingin Melakukan Transaksi Lagi? (Y/T)");
                ulang = input.next().charAt(0);
            } while (ulang != 'y' && ulang != 'Y' && ulang != 't' && ulang != 'T');
        } while (ulang == 'Y' || ulang == 'y');
    }

    public static void main(String[] args) {
        operator[0] = "Adi Putra";
        operator[1] = "Budi Cahyono";
        operator[2] = "Bayu Moektito";
        operator[3] = "Eko Wijaya";

        kode_operator[0] = "Q1";
        kode_operator[1] = "Q2";
        kode_operator[2] = "Q3";
        kode_operator[3] = "Q4";

        bbm[0] = "Premium";
        bbm[1] = "Pertalite";
        bbm[2] = "Pertamax";
        bbm[3] = "Pertamax+";

        harga_bbm[0] = 6550;
        harga_bbm[1] = 7500;
        harga_bbm[2] = 8600;
        harga_bbm[3] = 9600;

        stock_bbm[0] = 1000;
        stock_bbm[1] = 1000;
        stock_bbm[2] = 1000;
        stock_bbm[3] = 1000;

        menu_operator();

        do {
            System.out.println("=============== PERTAMINA ===============");
            System.out.println("--------------- Main Menu ---------------");
            System.out.println("1. Menu Operator");
            System.out.println("2. Menu BBM");
            System.out.println("3. Transaksi");
            System.out.println("4. Keluar");
            System.out.println("=========================================");
            do {
                System.out.print("Pilih  Menu : ");
                mainmenu = input.nextInt();
            } while (mainmenu < 1 || mainmenu > 4);

            switch (mainmenu) {
                case 1:
                    do {
                        System.out.println("--------------- Menu Operator ---------------");
                        System.out.println("1. List Operator");
                        System.out.println("2. Insert Operator");
                        System.out.println("3. Update Operator");
                        System.out.println("4. Delete Operator");
                        System.out.println("5. Kembali");
                        System.out.println("---------------------------------------------");
                        do {
                            System.out.print("Pilih Menu : ");
                            menu1 = input.nextInt();
                        } while (menu1 < 1 || menu1 > 6);
                        operator();
                    } while (ulang == 'y' || ulang == 'Y');
                    break;
                case 2:
                    do {
                        System.out.println("------------------ Menu BBM -----------------");
                        System.out.println("1. Jenis dan Harga BBM");
                        System.out.println("2. Stock BBM");
                        System.out.println("3. Kembali");
                        System.out.println("---------------------------------------------");
                        do {
                            System.out.print("Pilih Menu : ");
                            menu1 = input.nextInt();
                        } while (menu1 < 1 || menu1 > 3);
                        switch (menu1) {
                            case 1:
                                menu_bbm1();
                                break;
                            case 2:
                                menu_bbm2();
                                break;
                            case 3:
                                break;
                        }
                    } while (ulang == 'y' || ulang == 'Y');
                    break;
                case 3:
                    transaksi();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (ulang == 'y' || ulang == 'Y');

    }
}
