/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesawat_weni;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Toko_Weni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kategori = {"Makanan", "Minuman", "Paket"};
        String[][] menu = new String[50][3];
        String[][] temp_menu = {{"MK01", "Chocolate", kategori[0]},
        {"MK02", "Mathchoo", kategori[0]},
        {"MK03", "Tiramisu", kategori[0]},
        {"MK04", "Keju Susu", kategori[0]},
        {"MK05", "Barley Mint", kategori[0]},
        {"MK06", "Nuwtella", kategori[0]},
        {"MI01", "Green Tea", kategori[1]},
        {"MI02", "Milk Tea", kategori[1]},
        {"MI03", "Bubble Gum", kategori[1]},
        {"MI04", "Vanilla Late", kategori[1]},
        {"MI05", "Cappucino", kategori[1]},
        {"MI06", "Strawbery", kategori[1]},
        {"MI07", "Taro Ice", kategori[1]},
        {"MI08", "Choco Oreo", kategori[1]},
        {"MI09", "Es Manggo", kategori[1]},
        {"MI10", "Teh Manis", kategori[1]},
        {"PA01", "Choco+Manggo", kategori[2]},
        {"PA02", "Keju+Taro", kategori[2]},
        {"PA03", "Matcho+Milk", kategori[2]}};
        int[] harga = new int[50];
        int[] temp_harga = {15000, 15000, 15000, 15000, 15000, 17000,
            9000, 9000, 8000, 8000, 8000, 8000, 8000, 9000, 8000, 2000,
            20000, 21000, 22000};
        int[][] transaksi = new int[50][3];

        String pilih_kode;
        char ulang, ulang_pesan;
        int pilih_menu, pilih_sub_menu, jumlah, total, n, index_pilih;
        int index = 0;

        for (int i = 0; i < temp_menu.length; i++) {
            for (int j = 0; j < temp_menu[0].length; j++) {
                menu[i][j] = temp_menu[i][j];
            }
        }
        for (int i = 0; i < temp_harga.length; i++) {
            harga[i] = temp_harga[i];
        }
        do {
            ulang = 't';
            total = 0;
            index_pilih = 0;
            n = 0;
            System.out.println("                        BANANA CAFE                            ");
            System.out.println("===============================================================");
            System.out.println("Pilihan Menu");
            System.out.println("1. Daftar Menu Pisang");
            System.out.println("2. Daftar Minuman");
            System.out.println("3. Paket Promo");
            System.out.println("4. Transaksi");
            System.out.println("5. Kelola Menu");
            System.out.println("===============================================================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih_menu = sc.nextInt();

            switch (pilih_menu) {
                case 1:
                    System.out.println("Daftar Menu Pisang: ");
                    System.out.println("--------------------------------");
                    System.out.println("            PISANG              ");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i][0] != null && menu[i][2].equalsIgnoreCase("Makanan")) {
                            System.out.println(menu[i][0] + "\t" + menu[i][1] + "\t" + harga[i]);
                        }
                    }
                    System.out.println("--------------------------------");
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("Daftar Minuman:");
                    System.out.println("-------------------------------");
                    System.out.println("            MINUMAN            ");
                    System.out.println("-------------------------------");
                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i][0] != null && menu[i][2].equalsIgnoreCase("Minuman")) {
                            System.out.println(menu[i][0] + "\t" + menu[i][1] + "\t" + harga[i]);
                        }
                    }
                    System.out.println("--------------------------------");
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 3:
                    System.out.println("Paket Promo: ");
                    System.out.println("-----------------------------------------");
                    System.out.println("             PISANG dan MINUMAN          ");
                    System.out.println("-----------------------------------------");
                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i][0] != null && menu[i][2].equalsIgnoreCase("Paket")) {
                            System.out.println(menu[i][0] + "\t" + menu[i][1] + "\t" + harga[i]);
                        }
                    }
                    System.out.println("-----------------------------------------");
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 4:
                    do {
                        ulang_pesan = 't';
                        System.out.println("Transaksi: ");
                        System.out.println("------------------------------------");
                        System.out.println("              TRANSAKSI             ");
                        System.out.println("------------------------------------");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("3. Paket Promo");
                        System.out.println("4. Selesai");
                        System.out.println("------------------------------------");
                        System.out.print("Masukkan menu pilihan : ");
                        pilih_sub_menu = sc.nextInt();

                        switch (pilih_sub_menu) {
                            case 1:
                                System.out.println("Daftar Menu Pisang: ");
                                System.out.println("--------------------------------");
                                System.out.println("            PISANG              ");
                                System.out.println("--------------------------------");
                                for (int i = 0; i < menu.length; i++) {
                                    if (menu[i][0] != null && menu[i][2].equalsIgnoreCase("Makanan")) {
                                        System.out.println(menu[i][0] + "\t" + menu[i][1] + "\t" + harga[i]);
                                    }
                                }
                                do {
                                    System.out.println("--------------------------------");
                                    System.out.print("Masukkan kode\t: ");
                                    pilih_kode = sc.next();
                                    System.out.println("--------------------------------");
                                    System.out.print("Masukkan jumlah\t: ");
                                    jumlah = sc.nextInt();
                                    for (int i = 0; i < menu.length; i++) {
                                        if (menu[i][0] != null) {
                                            if (menu[i][0].equalsIgnoreCase(pilih_kode)) {
                                                index_pilih = i;
                                            }
                                        }
                                    }
                                    transaksi[n][0] = index_pilih;
                                    transaksi[n][1] = jumlah;
                                    transaksi[n][2] = harga[index_pilih] * jumlah;
                                    n++;
                                    System.out.print("Tambah makanan lagi? (Y/N) ");
                                    ulang_pesan = sc.next().charAt(0);
                                } while (ulang_pesan == 'Y' || ulang_pesan == 'y');
                                break;
                            case 2:
                                System.out.println("Daftar Menu Pisang: ");
                                System.out.println("--------------------------------");
                                System.out.println("            MINUMAN            ");
                                System.out.println("--------------------------------");
                                for (int i = 0; i < menu.length; i++) {
                                    if (menu[i][0] != null && menu[i][2].equalsIgnoreCase("Minuman")) {
                                        System.out.println(menu[i][0] + "\t" + menu[i][1] + "\t" + harga[i]);
                                    }
                                }
                                do {
                                    System.out.println("--------------------------------");
                                    System.out.print("Masukkan kode\t: ");
                                    pilih_kode = sc.next();
                                    System.out.println("--------------------------------");
                                    System.out.print("Masukkan jumlah\t: ");
                                    jumlah = sc.nextInt();
                                    for (int i = 0; i < menu.length; i++) {
                                        if (menu[i][0] != null) {
                                            if (menu[i][0].equalsIgnoreCase(pilih_kode)) {
                                                index_pilih = i;
                                            }
                                        }
                                    }
                                    transaksi[n][0] = index_pilih;
                                    transaksi[n][1] = jumlah;
                                    transaksi[n][2] = harga[index_pilih] * jumlah;
                                    n++;
                                    System.out.print("Tambah minuman lagi? (Y/N) ");
                                    ulang_pesan = sc.next().charAt(0);
                                } while (ulang_pesan == 'Y' || ulang_pesan == 'y');
                                break;
                            case 3:
                                System.out.println("Daftar Menu Pisang: ");
                                System.out.println("--------------------------------");
                                System.out.println("        PISANG dan MINUMAN      ");
                                System.out.println("--------------------------------");
                                for (int i = 0; i < menu.length; i++) {
                                    if (menu[i][0] != null && menu[i][2].equalsIgnoreCase("Paket")) {
                                        System.out.println(menu[i][0] + "\t" + menu[i][1] + "\t" + harga[i]);
                                    }
                                }
                                do {
                                    System.out.println("--------------------------------");
                                    System.out.print("Masukkan kode\t: ");
                                    pilih_kode = sc.next();
                                    System.out.println("--------------------------------");
                                    System.out.print("Masukkan jumlah\t: ");
                                    jumlah = sc.nextInt();
                                    for (int i = 0; i < menu.length; i++) {
                                        if (menu[i][0] != null) {
                                            if (menu[i][0].equalsIgnoreCase(pilih_kode)) {
                                                index_pilih = i;
                                            }
                                        }
                                    }
                                    transaksi[n][0] = index_pilih;
                                    transaksi[n][1] = jumlah;
                                    transaksi[n][2] = harga[index_pilih] * jumlah;
                                    n++;
                                    System.out.print("Tambah paket lagi? (Y/N) ");
                                    ulang_pesan = sc.next().charAt(0);
                                } while (ulang_pesan == 'Y' || ulang_pesan == 'y');
                                break;
                            case 4:
                                System.out.println("=========================================");
                                System.out.println("                 NOTA                    ");
                                System.out.println("=========================================");
                                for (int i = 0; i < transaksi.length; i++) {
                                    if (transaksi[i][1] != 0) {
                                        System.out.println((i + 1) + ". " + menu[transaksi[i][0]][1] + "\t" + transaksi[i][1] + "\t" + transaksi[i][2]);
                                        total = total + transaksi[i][2];
                                    }
                                }
                                System.out.println("=========================================");
                                System.out.println("Total:\t\t " + total);
                                break;
                        }
                    } while (ulang_pesan == 'N' || ulang_pesan == 'n');
                    break;
                case 5:
                    System.out.println("Kelola Menu: ");
                    System.out.println("-------------------------------------");
                    System.out.println("            KELOLA MENU              ");
                    System.out.println("-------------------------------------");
                    System.out.println("1. Insert");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("-------------------------------------");

                    System.out.print("Masukkan menu pilihan : ");
                    pilih_sub_menu = sc.nextInt();

                    switch (pilih_sub_menu) {
                        case 1:
                            System.out.println("1. Makanan");
                            System.out.println("2. Minuman");
                            System.out.println("3. Paket Promo");
                            System.out.print("Masukkan menu pilihan : ");
                            pilih_sub_menu = sc.nextInt();
                            switch (pilih_sub_menu) {
                                case 1:
                                    if (index - 1 < menu.length) {
                                        for (int i = 0; i < menu.length; i++) {
                                            if (menu[i][0] == null) {
                                                index = i;
                                                break;
                                            }
                                        }
                                        sc.nextLine();
                                        System.out.print("Masukkan Kode : ");
                                        menu[index][0] = sc.nextLine();
                                        System.out.print("Masukkan Nama : ");
                                        menu[index][1] = sc.nextLine();
                                        menu[index][2] = kategori[0];
                                        System.out.print("Masukkan Harga : ");
                                        harga[index] = sc.nextInt();
                                        System.out.println("================");

                                    } else {
                                        System.out.println("Array sudah penuh!");
                                    }
                                    System.out.print("Kembali ke menu awal? (Y/T) ");
                                    ulang = sc.next().charAt(0);
                                    break;
                                case 2:
                                    if (index - 1 < menu.length) {
                                        for (int i = 0; i < menu.length; i++) {
                                            if (menu[i][0] == null) {
                                                index = i;
                                                break;
                                            }
                                        }
                                        sc.nextLine();
                                        System.out.print("Masukkan Kode : ");
                                        menu[index][0] = sc.nextLine();
                                        System.out.print("Masukkan Nama : ");
                                        menu[index][1] = sc.nextLine();
                                        menu[index][2] = kategori[1];
                                        System.out.print("Masukkan Harga : ");
                                        harga[index] = sc.nextInt();
                                        System.out.println("================");

                                    } else {
                                        System.out.println("Array sudah penuh!");
                                    }
                                    System.out.print("Kembali ke menu awal? (Y/T) ");
                                    ulang = sc.next().charAt(0);
                                    break;
                                case 3:
                                    if (index - 1 < menu.length) {
                                        for (int i = 0; i < menu.length; i++) {
                                            if (menu[i][0] == null) {
                                                index = i;
                                                break;
                                            }
                                        }
                                        sc.nextLine();
                                        System.out.print("Masukkan Kode : ");
                                        menu[index][0] = sc.nextLine();
                                        System.out.print("Masukkan Nama : ");
                                        menu[index][1] = sc.nextLine();
                                        menu[index][2] = kategori[2];
                                        System.out.print("Masukkan Harga : ");
                                        harga[index] = sc.nextInt();
                                        System.out.println("================");

                                    } else {
                                        System.out.println("Array sudah penuh!");
                                    }
                                    System.out.print("Kembali ke menu awal? (Y/T) ");
                                    ulang = sc.next().charAt(0);
                                    break;
                            }
                    }
            }
            System.out.println("");
        } while (ulang == 'y' || ulang == 'Y');
    }
}
