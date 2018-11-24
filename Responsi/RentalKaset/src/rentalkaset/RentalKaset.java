/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalkaset;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class RentalKaset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kategori = {"Drama", "Film", "Game"};
        String[][] kaset = {
            {"FL01", "The Battleship Island", "Action", kategori[1]},
            {"FL02", "Twilight Bracking Down", "Fantasy", kategori[1]},
            {"FL03", "Spider-man Homecoming", "Laga", kategori[1]},
            {"FL04", "Train to Busan", "Fantasy", kategori[1]},
            {"FL05", "Pitch Perfect", "Music", kategori[1]},
            {"FL06", "Beauty and the Beast", "Romance", kategori[1]},
            {"FL07", "Star Wars", "Action", kategori[1]},
            {"FL08", "Black Panther", "Action", kategori[1]},
            {"FL09", "Maddah Danur 2", "Horror", kategori[1]},
            {"FL10", "Insidius 3", "Horror", kategori[1]},
            {"FL11", "Avengers Invinity War", "Action", kategori[1]},
            {"DR01", "Two Cops", "Fantasy", kategori[0]},
            {"DR02", "Descendant of the Sun", "Romance", kategori[0]},
            {"DR03", "Let's Fight Ghosh", "Mistery", kategori[0]},
            {"DR04", "Itakiss 2 in Okinawa", "Romance", kategori[0]},
            {"DR05", "Goblin", "Fantasy", kategori[0]},
            {"GM01", "God of War", "Action", kategori[2]},
            {"GM02", "Resident Evil 5", "Horror", kategori[2]},
            {"GM03", "FIFA Soccer", "Sport", kategori[2]},
            {"GM04", "DiRT", "Race", kategori[2]},
            {"GM05", "Assassin’s", "Action", kategori[2]},
            {"GM06", "Need for Speed", "Race", kategori[2]},
            {"GM07", "Call of Duty", "Shooting", kategori[2]},
            {"GM08", "Grand Theft Auto", "Action", kategori[2]},
            {"GM09", "Burnout", "Horror", kategori[2]},
            {"GM10", "Resistance", "Strategy", kategori[2]},
            {"GM11", "Red Faction", "Strategy", kategori[2]},
            {"GM12", "BlazBlue", "Arcade", kategori[2]},
            {"GM13", "Street Fighter", "Arcade", kategori[2]},
            {"GM14", "Battlefield", "Shooting", kategori[2]},
            {"GM15", "Guitar Hero 5", "Music", kategori[2]}
        };

        int[][] temp_transaksi = new int[3][2];

        int pilih_menu, pilih_sub_menu, n, indeks, total, bayar, indeks_transaksi;
        String pilih_kode;
        char tambah, ulang;

        tambah = 't';
        indeks = 0;
        indeks_transaksi = 0;
        n = 0;
        total = 0;
        do {
            System.out.println("\t  ----------------EAGLE ZONE RENTAL-------------------");
            System.out.println("PENYEWAAN DVD FILM , SERIAL DRAMA ASIA (KOREA, JEPANG DAN THAILAND) DAN GAME");
            System.out.println("============================================================================");
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("Pilih layanan : ");
            System.out.println("1. Peminjaman");
            System.out.println("2. Pengembalian");
            System.out.print("Masukkan jenis layanan : ");
            pilih_menu = sc.nextInt();
            switch (pilih_menu) {
                case 1: {
                    do {
                        System.out.println("===========================================");
                        System.out.println("Pilihan jenis DVD Peminjaman :");
                        System.out.println("\t1. Daftar DVD Game");
                        System.out.println("\t2. Daftar DVD Film");
                        System.out.println("\t3. Daftar DVD Drama");
                        System.out.println("===========================================");
                        System.out.print("Masukkan Pilihan Anda : ");
                        pilih_sub_menu = sc.nextInt();
                        switch (pilih_sub_menu) {
                            case 1:
                                tampil(kaset, "Game");
                                pilih_kode = sc.next();
                                for (int i = 0; i < kaset.length; i++) {
                                    if (kaset[i][0].equalsIgnoreCase(pilih_kode)) {
                                        indeks = i;
                                        break;
                                    }
                                }
                                temp_transaksi[n][0] = indeks;
                                temp_transaksi[n][1] = 16000;
                                n++;
                                if (n < 3) {
                                    System.out.print("Apakah anda ingin meminjam lagi? (Y/T) ");
                                    tambah = sc.next().charAt(0);
                                }
                                break;
                            case 2:
                                tampil(kaset, "Film");
                                pilih_kode = sc.next();
                                for (int i = 0; i < kaset.length; i++) {
                                    if (kaset[i][0].equalsIgnoreCase(pilih_kode)) {
                                        indeks = i;
                                        break;
                                    }
                                }
                                temp_transaksi[n][0] = indeks;
                                temp_transaksi[n][1] = 12000;
                                n++;
                                if (n < 3) {
                                    System.out.print("Apakah anda ingin meminjam lagi? (Y/T) ");
                                    tambah = sc.next().charAt(0);
                                }
                                break;
                            case 3:
                                tampil(kaset, "Drama");
                                pilih_kode = sc.next();
                                for (int i = 0; i < kaset.length; i++) {
                                    if (kaset[i][0].equalsIgnoreCase(pilih_kode)) {
                                        indeks = i;
                                        break;
                                    }
                                }
                                temp_transaksi[n][0] = indeks;
                                temp_transaksi[n][1] = 15000;
                                n++;
                                if (n < 3) {
                                    System.out.print("Apakah anda ingin meminjam lagi? (Y/T) ");
                                    tambah = sc.next().charAt(0);
                                }
                                break;
                        }
                    } while (n < 3 && (tambah == 'y' || tambah == 'Y'));
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nota");
                    System.out.println("--------------------------------------------------");
                    for (int i = 0; i < temp_transaksi.length; i++) {
                        if (temp_transaksi[i][1] != 0) {
                            System.out.println(kaset[temp_transaksi[i][0]][1] + " | " + temp_transaksi[i][1]);
                        }
                        total = total + temp_transaksi[i][1];
                    }
                    System.out.println("--------------------------------------------------");
                    System.out.println("Total : " + total);
                    System.out.println("--------------------------------------------------");
                    System.out.print("Bayar : ");
                    bayar = sc.nextInt();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Kembalian : " + (bayar - total));
                    System.out.println("--------------------------------------------------");
                }
                break;
                case 2:

                    break;
            }
            System.out.print("Kembali ke menu awal? (Y/T) ");
            ulang = sc.next().charAt(0);
            System.out.println("");
        } while (ulang == 'y' || ulang == 'Y');
    }

    public static void tampil(String[][] array , String teks) {
        System.out.println("Daftar DVD " + teks + " : ");
        System.out.println("\t+-----------------------------------------------+");
        System.out.println("\tNo.\t|\tJudul "+ teks + "\t|\tGenre\t|");
        System.out.println("\t+-----------------------------------------------+");
        for (int i = 0; i < array.length; i++) {
            if (array[i][3].equalsIgnoreCase(teks)) {
                for (int j = 0; j < array[0].length - 1; j++) {
                    System.out.print("\t" + array[i][j] + "\t|");
                }
                System.out.println("");
            }
        }
        System.out.println("\t+-----------------------------------------------+");
        System.out.print("Pilih : ");
    }
}
