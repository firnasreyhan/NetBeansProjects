/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

import java.util.Scanner;

/**
 * Nama     :   Muhammad Reyhan Firnas Adani
 * NRP      :   171111079
 * Kelas    :   TI-B
 * Soal     :   1
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Menghitung Luas dan Volume Tabung ===");
        double phi, jari_jari, tinggi, volume, luas;
        
        phi = 3.14;
        
        System.out.print("Jari-jari = ");
        jari_jari = sc.nextDouble();
        System.out.print("Tinggi = ");
        tinggi = sc.nextDouble();
        
        volume = phi * Math.pow(jari_jari, 2) * tinggi;
        System.out.println("\nVolume = " + volume);
        
        luas = (2 * phi * Math.pow(jari_jari, 2)) + ((2 * phi * jari_jari) * tinggi);
        System.out.println("Luas = " + luas);
    }
    
}
