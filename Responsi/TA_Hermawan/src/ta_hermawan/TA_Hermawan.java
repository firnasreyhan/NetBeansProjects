/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_hermawan;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class TA_Hermawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama_bbm = new String[10];
        int[] harga_bbm = new int[10];
        int[] stok_bbm = new int[10];
        String[][] karyawan = new String[10][2];
        String[][] temp_karyawan = {
            {"Q1", "Adi Putra"},
            {"Q2", "Budi Cahyono"},
            {"Q3", "Bayu Moektito"},
            {"Q4", "Bayu Moektito"}};

        String pilih_karyawan, nama_karyawan, i_nama_karyawan;
        int pilih_menu, pilih_sub_menu, n;
        boolean param;
        char ulang_menu, ulang_sub_menu;

        for (int i = 0; i < temp_karyawan.length; i++) {
            for (int j = 0; j < temp_karyawan[0].length; j++) {
                karyawan[i][j] = temp_karyawan[i][j];
            }
        }

        nama_bbm[0] = "Premium";
        nama_bbm[1] = "Pertalite";
        nama_bbm[2] = "Pertamax";
        nama_bbm[3] = "Pertamax+";

        harga_bbm[0] = 6550;
        harga_bbm[1] = 7500;
        harga_bbm[2] = 8600;
        harga_bbm[3] = 9600;

        stok_bbm[0] = 1000;
        stok_bbm[1] = 1000;
        stok_bbm[2] = 1000;
        stok_bbm[3] = 1000;

        param = false;

        System.out.println("------ List Operator --------");
        for (int i = 0; i < karyawan.length; i++) {
            if (karyawan[i][0] != null) {
                System.out.println(karyawan[i][0] + ". " + karyawan[i][1]);
            }
        }
        System.out.println("-----------------------------");
        do {
            System.out.print("Pilih : ");
            pilih_karyawan = sc.next();
            for (int i = 0; i < karyawan.length; i++) {
                if (karyawan[i][0] != null) {
                    if (karyawan[i][0].equalsIgnoreCase(pilih_karyawan)) {
                        nama_karyawan = karyawan[i][1];
                        param = false;
                        break;
                    } else {
                        param = true;
                    }
                }
            }
            if (param == true) {
                System.out.println("Mohon maaf, karyawan tersebut tidak ada");
            }
        } while (param);

        System.out.println("=============== PERTAMINA ===============");
        System.out.println("--------------- Main Menu ---------------");
        System.out.println("1. Menu Operator");
        System.out.println("2. Menu BBM");
        System.out.println("3. Transaksi");
        System.out.println("4. Keluar");
        System.out.println("=========================================");
        do {
            System.out.print("Pilih : ");
            pilih_menu = sc.nextInt();
        } while (pilih_menu < 1 || pilih_menu > 4);

        switch (pilih_menu) {
            case 1:
                do {
                    ulang_sub_menu = 't';
                    System.out.println("--------------- Menu Operator ---------------");
                    System.out.println("1. List Operator");
                    System.out.println("2. Insert Operator");
                    System.out.println("3. Update Operator");
                    System.out.println("4. Delete Operator");
                    System.out.println("5. Kembali");
                    System.out.println("---------------------------------------------");
                    do {
                        System.out.print("Pilih : ");
                        pilih_sub_menu = sc.nextInt();
                    } while (pilih_sub_menu < 1 || pilih_sub_menu > 5);
                    switch (pilih_sub_menu) {
                        case 1:
                            System.out.println("--------------- List Operator ---------------");
                            for (int i = 0; i < karyawan.length; i++) {
                                if (karyawan[i][0] != null) {
                                    System.out.println(karyawan[i][0] + ". " + karyawan[i][1]);
                                }
                            }
                            System.out.println("---------------------------------------------");
                            do {
                                System.out.print("Kembali ke menu awal? (Y/T)");
                                ulang_sub_menu = sc.next().charAt(0);
                            } while (ulang_sub_menu != 'y' && ulang_sub_menu != 'Y' && ulang_sub_menu != 't' && ulang_sub_menu != 'T');
                            break;
                        case 2:
                            for (int i = 0; i < karyawan.length; i++) {
                                if (karyawan[i][0] == null) {
                                    n = i;
                                }
                            }
                            do {
                                
                            } while (param);
                            
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                } while (ulang_sub_menu == 'y' || ulang_sub_menu == 'Y');
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

}
