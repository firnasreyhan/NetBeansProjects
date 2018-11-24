/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesawat_weni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SHELBI
 */
public class CarsRent {

    static int[] id_Staff = new int[10];
    static String[] nama_Staff = new String[10];
    static String[] jk_Staff = new String[10];
    static int[] salary_Staff = new int[10];

    static int[] id_Mobil = new int[10];
    static String[] merk_Mobil = new String[10];
    static String[] nama_Mobil = new String[10];
    static int[] harga_Mobil = new int[10];

    static int menu;
    static Scanner input = new Scanner(System.in);

    // Mobil Section    
    public static void v_mobil() {
        System.out.println("");
        System.out.println(" \t\tDATA LAPORAN MOBIL ");
        System.out.println(" =================================================== ");
        System.out.println("|ID \t | Merk \t | Nama \t | Price |");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < id_Mobil.length; i++) {
            if (id_Mobil[i] != 0) {
                System.out.println("|" + id_Mobil[i] + "\t | " + merk_Mobil[i] + "\t | " + nama_Mobil[i] + "\t | " + harga_Mobil[i] + "\t |");
            }
        }

        System.out.println("");
        System.out.println("##### MENU MOBIL #####");
        System.out.println("----------------------");
        System.out.println(" 1. Entry Data ");
        System.out.println(" 2. Update Data ");
        System.out.println(" 3. Hapus Data ");
        System.out.println(" 4. Kembali Ke Menu Utama ");
        System.out.println("");
        System.out.print(" Pilih : ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                e_mobil();
                break;
            case 2:
                u_mobil();
                break;
            case 3:
                d_mobil();
                break;
            case 4:
                cls();
                home();
        }
    }

    public static void e_mobil() {
        System.out.println("");
        System.out.println(" ENTRY DATA MOBIL ");
        System.out.println(" ---------------- ");
        System.out.println("");

        System.out.print("Masukkan ID Mobil = ");
        id_Mobil[6] = input.nextInt();
        System.out.print("Masukkan Merk Mobil = ");
        merk_Mobil[6] = input.nextLine();
        System.out.print("Masukkan Nama Mobil = ");
        nama_Mobil[6] = input.nextLine();
        System.out.print("Masukkan Harga Sewa = ");
        harga_Mobil[6] = input.nextInt();

        System.out.println("Data Berhasil Diinputkan!");
        v_mobil();
    }

    public static void u_mobil() {
        System.out.println("");
        System.out.println(" UPDATE DATA MOBIL ");
        System.out.println(" ----------------- ");
    }

    public static void d_mobil() {
        System.out.println("");
        System.out.println(" DELETE DATA MOBIL ");
        System.out.println(" ----------------- ");
    }

    // Staff Section    
    public static void e_staff() {
        System.out.println("");
        System.out.println(" ENTRY DATA STAFF ");
        System.out.println(" ---------------- ");
    }

    public static void u_staff() {
        System.out.println("");
        System.out.println(" UPDATE DATA STAFF ");
        System.out.println(" ----------------- ");
    }

    public static void d_staff() {
        System.out.println("");
        System.out.println(" DELETE DATA STAFF ");
        System.out.println(" ----------------- ");
    }

    public static void v_staff() {
        System.out.println("");
        System.out.println(" \t\tDATA LAPORAN STAFF ");
        System.out.println(" =================================================== ");
        System.out.println("|ID \t | Nama \t | JK \t | Salary |");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < id_Staff.length; i++) {
            if (id_Staff[i] != 0) {
                System.out.println("|" + id_Staff[i] + "\t | " + nama_Staff[i] + "\t | " + jk_Staff[i] + "\t | " + salary_Staff[i] + "\t |");
            }
        }

        System.out.println("");
        System.out.println("##### MENU STAFF #####");
        System.out.println("----------------------");
        System.out.println(" 1. Entry Data ");
        System.out.println(" 2. Update Data ");
        System.out.println(" 3. Hapus Data ");
        System.out.println(" 4. Kembali Ke Menu Utama ");
        System.out.println("");
        System.out.print(" Pilih : ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                e_staff();
                break;
            case 2:
                u_staff();
                break;
            case 3:
                d_staff();
                break;
            case 4:
                cls();
                home();
        }
    }

    // Trans Section
    public static void trans() {
        int menu;
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("##### MENU TRANSAKSI #####");
        System.out.println("--------------------------");
        System.out.println(" 1. Entry Data ");
        System.out.println(" 2. Update Data ");
        System.out.println(" 3. Hapus Data ");
        System.out.println(" 4. Data Laporan ");
        System.out.println(" 5. Kembali Ke Menu Utama ");
        System.out.println("");
        System.out.print(" Pilih : ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                e_trans();
                break;
            case 2:
                u_trans();
                break;
            case 3:
                d_trans();
                break;
            case 4:
                v_trans();
                break;
            case 5:
                cls();
                home();

        }
    }

    public static void e_trans() {
        System.out.println("");
        System.out.println(" ENTRY DATA TRANSAKSI ");
        System.out.println(" -------------------- ");
    }

    public static void u_trans() {
        System.out.println("");
        System.out.println(" UPDATE DATA TRANSAKSI ");
        System.out.println(" --------------------- ");
    }

    public static void d_trans() {
        System.out.println("");
        System.out.println(" DELETE DATA TRANSAKSI ");
        System.out.println(" --------------------- ");
    }

    public static void v_trans() {
        System.out.println("");
        System.out.println(" DATA LAPORAN TRANSAKSI ");
        System.out.println(" ---------------------- ");
    }

    // Home Section
    public static void home() {
        System.out.println("=======================================");
        System.out.println("|------   SAISHOKU CARS RENT   -------|");
        System.out.println("=======================================");
        System.out.println("");

        System.out.println(" Menu Utama : ");
        System.out.println(" 1. Data Mobil ");
        System.out.println(" 2. Data Staff ");
        System.out.println(" 3. Transaksi ");
        System.out.println(" 4. Keluar ");

        System.out.print(" Pilih (1-4): ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                v_mobil();
                break;
            case 2:
                v_staff();
                break;
            case 3:
                trans();
                break;
            default:
                break;
        }
        System.out.println("");
    }

    public static void cls() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
        }
        System.out.println("\t ------- end -------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        id_Staff[0] = 1;
        id_Staff[1] = 2;
        id_Staff[2] = 3;
        id_Staff[3] = 4;
        id_Staff[4] = 5;

        nama_Staff[0] = "Shella";
        nama_Staff[1] = "Anisa";
        nama_Staff[2] = "Fadwa";
        nama_Staff[3] = "Nanda";
        nama_Staff[4] = "Mahendra";

        jk_Staff[0] = "P";
        jk_Staff[1] = "P";
        jk_Staff[2] = "P";
        jk_Staff[3] = "L";
        jk_Staff[4] = "L";

        salary_Staff[0] = 2000;
        salary_Staff[1] = 3000;
        salary_Staff[2] = 2500;
        salary_Staff[3] = 3200;
        salary_Staff[4] = 1800;

        id_Mobil[0] = 1;
        id_Mobil[1] = 2;
        id_Mobil[2] = 3;
        id_Mobil[3] = 4;
        id_Mobil[4] = 5;

        merk_Mobil[0] = "Toyota";
        merk_Mobil[1] = "Suzuki";
        merk_Mobil[2] = "Kijang";
        merk_Mobil[3] = "Daihatsu";
        merk_Mobil[4] = "Honda";

        nama_Mobil[0] = "Avanza";
        nama_Mobil[1] = "Expander";
        nama_Mobil[2] = "Innova";
        nama_Mobil[3] = "Terios";
        nama_Mobil[4] = "Civic";

        harga_Mobil[0] = 170000;
        harga_Mobil[1] = 200000;
        harga_Mobil[2] = 180000;
        harga_Mobil[3] = 220000;
        harga_Mobil[4] = 250000;

        home();
    }

}
