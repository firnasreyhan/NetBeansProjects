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
public class Pesawat_Weni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] pesawat = new String[30][9];
        String[] rute = {"Jakarta-Surabaya", "Surabaya-Jakarta", "Jakarta-Bali", "Jakarta-Yogyakarta", "Bali-Jakarta", "Jakarta-Medan",
            "Yogyakarta-Jakarta", "Medan-Jakarta", "Jakarta-Makassar"};
        String[][] pes_rut = {{"AI01", "Air Asia", "rute[0]"},
        {"AI02", "Air Asia", "rute[1]"},
        {"AI03", "Air Asia", "rute[2]"},
        {"BA01", "Batik Air", "rute[3]"},
        {"BA02", "Batik Air", "rute[4]"},
        {"CI01", "Citilink", "rute[5]"},
        {"CI02", "Citilink", "rute[6]"},
        {"CI03", "Citilink", "rute[7]"},
        {"GI01", "Garuda Indo", "rute[8]"},
        {"GI02", "Garuda Indo", "rute[0]"},
        {"LI01", "Lion Air", "rute[1]"},
        {"LI02", "Lion Air", "rute[2]"},
        {"LI03", "Lion Air", "rute[3]"},
        {"MA01", "Malindo Air", "rute[4]"},
        {"MA02", "Malindo Air", "rute[5]"},
        {"SR01", "Sriwijaya Air", "rute[6]"},
        {"SR02", "Sriwijaya Air", "rute[7]"},
        {"SR03", "Sriwijaya Air", "rute[8]"},
        {"TA01", "Trigana Air", "rute[0]"},
        {"TA02", "Trigana Air", "rute[1]"},
        {"WA01", "Wings Air", "rute[2]"},
        {"WA02", "Wings Air", "rute[3]"},
        {"WA03", "Wings Air", "rute[4]"},
        {"XA01", "Xpress Air", "rute[5]"},
        {"XA02", "Xpress Air", "rute[6]"},
        {"XA03", "Xpress Air", "rute[7]"},
        {"XA04", "Xpress Air", "rute[8]"}};

        int[] harga = new int[30];
        int[] temp_harga = {150000, 175000, 200000, 225000, 250000, 275000, 300000, 325000, 350000,
            375000, 400000, 425000, 450000, 475000, 500000, 525000, 550000, 575000,
            600000, 300000, 325000, 350000, 375000, 400000, 425000, 450000, 475000};
        int[][] pesan = new int[30][3];
        char ulang = 0;
        int pilih_maskapai, pilih_penerbangan, kursi, total = 0, pilih_menu, n = 0;
        String kode_maskapai;
        pilih_penerbangan = 0;

        for (int i = 0; i < pes_rut.length; i++) {
            for (int j = 0; j < pes_rut[0].length; j++) {
                pesawat[i][j] = pes_rut[i][j];
            }
        }
        for (int i = 0; i < temp_harga.length; i++) {
            harga[i] = temp_harga[i];
        }

        do {
            ulang = 't';
            System.out.println("");
            System.out.println("\t  ----------------WeWik.com-------------------");
            System.out.println("===============================================================");
            System.out.println("Pilihan Menu");
            System.out.println("1. Daftar Maskapai");
            System.out.println("2. Rute Penerbangan");
            System.out.println("3. Pesan");
            System.out.println("===============================================================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih_menu = sc.nextInt();

            switch (pilih_menu) {
                case 1:
                    System.out.println("Daftar Maskapai: ");
                    System.out.println("----------------------------------");
                    System.out.println("             MASKAPAI             ");
                    System.out.println("----------------------------------");
                    for (int i = 0; i < pesawat.length; i++) {
                        if (pesawat[i][0] != null) {
                            System.out.println(pesawat[i][0] + "\t" + pesawat[i][1] + "\t");
                        }
                    }
                    System.out.println("==================================");
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("Rute Penerbangan: ");
                    System.out.println("--------------------------------");
                    System.out.println("            RUTE                ");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < rute.length; i++) {
                        System.out.println((i + 1) + ". " + rute[i]);
                    }
                    System.out.println("--------------------------------");
                    System.out.print("Pilih : ");
                    pilih_maskapai = sc.nextInt();

                    System.out.println("");
                    kode_maskapai = pesawat[pilih_maskapai - 1][2];
                    System.out.println("========== MASKAPAI ==========");
                    for (int i = 0; i < pes_rut.length; i++) {
                        if (pes_rut[i][2] == kode_maskapai) {
                            for (int j = 0; j < pes_rut[0].length; j++) {
                            }
                            System.out.println(pes_rut[i][0] + "\t" + pes_rut[i][1] + "\t" + harga[i] + "\t");
                        }
                    }
                    System.out.println("==============================");
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 3:
                    System.out.println("Rute Penerbangan: ");
                    System.out.println("--------------------------------");
                    System.out.println("            RUTE                ");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < rute.length; i++) {
                        System.out.println((i + 1) + ". " + rute[i]);
                    }
                    System.out.println("--------------------------------");
                    System.out.print("Pilih : ");
                    pilih_maskapai = sc.nextInt();

                    System.out.println("");
                    kode_maskapai = pesawat[pilih_maskapai - 1][2];
                    System.out.println("========== MASKAPAI ==========");
                    for (int i = 0; i < pes_rut.length; i++) {
                        if (pes_rut[i][2] == kode_maskapai) {
                            for (int j = 0; j < pes_rut[0].length; j++) {
                            }
                            System.out.println(pes_rut[i][0] + "\t" + pes_rut[i][1] + "\t" + harga[i] + "\t");
                        }
                    }
                    System.out.println("==============================");

                    System.out.print("Masukkan kode\t: ");
                    kode_maskapai = sc.next();
                    System.out.print("jumlah kursi\t: ");
                    kursi = sc.nextInt();

                    for (int i = 0; i < pesawat.length; i++) {
                        if (pesawat[i][0] != null) {
                            if (pesawat[i][0].equalsIgnoreCase(kode_maskapai)) {
                                pilih_penerbangan = i;
                            }
                        }
                    }

                    pesan[n][0] = pilih_penerbangan;
                    pesan[n][1] = kursi;
                    pesan[n][2] = harga[pilih_penerbangan] * kursi;
                    n++;

                    System.out.println(" ");
                    System.out.println("                 TOTAL                  ");
                    System.out.println("========================================");
                    for (int i = 0; i < pesan.length; i++) {
                        if (pesan[i][1] != 0) {
                            System.out.println((i + 1) + ". " + pesawat[pesan[i][0]][1] + "\t" + pesan[i][1] + "\t" + pesan[i][2]);
                            total = total + pesan[i][2];
                        }
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("Total:\t\t\t" + total);
                    break;
            }

        } while (ulang == 'y' || ulang == 'Y');
    }

}
