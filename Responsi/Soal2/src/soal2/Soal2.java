/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Nama     :   Muhammad Reyhan Firnas Adani
 * NRP      :   171111079
 * Kelas    :   TI-B
 * Soal     :   2
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df;
        Scanner input;
        double uang, hasil_konversi;
        int pilihan;
        
        input = new Scanner(System.in);
        df = new DecimalFormat("#.##");
        
        System.out.println("---(Konversi Mata Uang)---");
        System.out.println("Kurs : 1 Yen = 129 Rupiah");
        System.out.println("1. Rupiah -> Yen");
        System.out.println("2. Yen -> Rupiah");
        System.out.print("Pilih : ");
        
        pilihan = input.nextInt();
        System.out.println("");
        switch(pilihan)
        {
            case 1:
                System.out.print("Masukkan nilai Rupiah\t: ");
                uang = input.nextDouble();
                
                hasil_konversi = uang / 129;
                
                System.out.println("Hasil Konversi\t\t: " + df.format(hasil_konversi) + " Yen");
                break;
            case 2:
                System.out.print("Masukkan nilai Yen\t: ");
                uang = input.nextDouble();
                
                hasil_konversi = uang * 129;
                
                System.out.println("Hasil Konversi\t\t: " + df.format(hasil_konversi) + " Rupiah");
                break;
        }
    
    }
}
