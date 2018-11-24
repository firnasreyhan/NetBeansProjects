/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Bioskop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] judul = {"Deadpool 2","Dilan 1990", "Ananta", "INSIDIOUS", "AVENGERS : INFINITY WAR",
            "THE DEATH CURE", "SURAT CINTA UNTUK STARLA", "EVERYDAY",
            "TRUTH OR DARE", "THE SECRET - SUSTER NGESOT URBAN LEGEND"};
        String[] jadwal = {"10.00 - 12.30", "12.45 - 14.55", "15.00 - 17.30", "17.30 - 19.45", "20.00 - 22.30"};
        int pilih_menu, pilih_judul, plih_jadwal;
        
        System.out.println("========== Bioskop XXI ==========");
        System.out.println("1.\tJudul Film");
        System.out.println("2.\tJadwal");
        System.out.println("3.\tTransaksi");
        System.out.println("=================================");
        System.out.print("Pilih : ");
        
        pilih_menu = sc.nextInt();
        
        System.out.println("");
        switch(pilih_menu)
        {
            case 1:
                System.out.println("Theater | Judul Film");
                for(int x = 0; x < judul.length; x++)
                {
                    System.out.println((x+1) + "\t| " + judul[x]);
                }
                break;
            case 2:
                System.out.println("No. | Jadwal");
                for(int x = 0; x < jadwal.length; x++)
                {
                    System.out.println((x+1) + "   | " + jadwal[x]);
                }
                break;
            case 3:
                System.out.println("========== Transaksi ==========");
                System.out.println("No, | Judul Film");
                for(int x = 0; x < judul.length; x++)
                {
                    System.out.println((x+1) + "   | " + judul[x]);
                }
                System.out.println("===============================");
                System.out.print("Pilih : ");
                pilih_judul = sc.nextInt();
                
                break;
            default:
                System.out.println("Inputan salah!");
        }
    }
    
}
