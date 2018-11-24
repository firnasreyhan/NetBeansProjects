
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rey
 */
public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] kereta_api = {
            {"Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5%", "Ada", "Tidak Ada"},
            {"Eksekutif ", "200000", "7%", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };
        String[][] pesanan = new String[100][6];
        int pilih, jumlah_tiket, pilih_jenis, pesan;
        float total_diskon, diskon, total;
        String nama, jenis;

        pesan = 0;
        do {
            total = 0;
            diskon = 0;
            jenis = "";
            System.out.println("-------------------- Menu --------------------");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            System.out.println("----------------------------------------------");
            switch (pilih) {
                case 1:
                    System.out.println("\n------------------------------ Daftar  Kereta ------------------------------");
                    System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println("----------------------------------------------------------------------------");
                    for (int i = 0; i < kereta_api.length; i++) {
                        System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %n", kereta_api[i][0], kereta_api[i][1], kereta_api[i][2], kereta_api[i][3], kereta_api[i][4]);
                    }
                    System.out.println("----------------------------------------------------------------------------\n");
                    break;
                case 2:
                    System.out.println("\n------------------------------ Daftar  Kereta ------------------------------");
                    System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println("----------------------------------------------------------------------------");
                    for (int i = 0; i < kereta_api.length; i++) {
                        if (kereta_api[i][3].equalsIgnoreCase("Ada")) {
                            System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %n", kereta_api[i][0], kereta_api[i][1], kereta_api[i][2], kereta_api[i][3], kereta_api[i][4]);
                        }
                    }
                    System.out.println("----------------------------------------------------------------------------\n");
                    break;
                case 3:
                    System.out.println("\n------------------------------ Daftar  Kereta ------------------------------");
                    System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println("----------------------------------------------------------------------------");
                    for (int i = 0; i < kereta_api.length; i++) {
                        if (kereta_api[i][4].equalsIgnoreCase("Ada")) {
                            System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %n", kereta_api[i][0], kereta_api[i][1], kereta_api[i][2], kereta_api[i][3], kereta_api[i][4]);
                        }
                    }
                    System.out.println("----------------------------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.println("\n----- Pemesanan -----");
                    System.out.print("Nama : ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.println("---------------------");
                    for (int i = 0; i < kereta_api.length; i++) {
                        System.out.println((i + 1) + ". " + kereta_api[i][0]);
                    }
                    System.out.print("Pilih : ");
                    pilih_jenis = sc.nextInt();
                    System.out.print("Jumlah : ");
                    jumlah_tiket = sc.nextInt();
                    if (pilih_jenis == 1) {
                        jenis = "Ekonomi";
                        total = jumlah_tiket * 50000;
                        diskon = total * 0.02f;
                    } else if (pilih_jenis == 2) {
                        jenis = "Bisnis";
                        total = jumlah_tiket * 100000;
                        diskon = total * 0.05f;
                    } else if (pilih_jenis == 3) {
                        jenis = "Eksekutif";
                        total = jumlah_tiket * 200000;
                        diskon = total * 0.07f;
                    } else if (pilih_jenis == 4) {
                        jenis = "Pariwisata";
                        total = jumlah_tiket * 300000;
                        diskon = total * 0.1f;
                    }
                    total_diskon = total - diskon;
                    pesanan[pesan][0] = nama;
                    pesanan[pesan][1] = jenis;
                    pesanan[pesan][2] = String.valueOf(jumlah_tiket);
                    pesanan[pesan][3] = String.valueOf(total);
                    pesanan[pesan][4] = String.valueOf(diskon);
                    pesanan[pesan][5] = String.valueOf(total_diskon);
                    pesan++;
                    break;
                case 5:
                    System.out.println("\n------------------------------------------ Pesanan ------------------------------------------");
                    System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %-15s| %n", "Nama", "Jenis", "Jumlah", "Total", "Diskon", "Bayar");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    for (int i = 0; i < pesanan.length; i++) {
                        if (pesanan[i][0] != null) {
                            System.out.printf("| %-15s| %-10s| %-10s| %-15s| %-15s| %-15s| %n", pesanan[i][0], pesanan[i][1], pesanan[i][2], pesanan[i][3], pesanan[i][4], pesanan[i][5]);
                        }
                    }
                    System.out.println("---------------------------------------------------------------------------------------------\n");
                    break;
                default:
                    System.out.println("Keluar Program!");
                    break;
            }
        } while (pilih >= 1 && pilih <= 5);
    }
}
