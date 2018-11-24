/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan {
    public static void main(String[] args) {
        // deklarasi variabel 
        double panjang = 25;
        double lebar = 10;
        double jumlah;
        double kurang;
        double kali;
        double bagi;
        double modulus;
        
        //proses operasi
        jumlah = panjang + lebar; // operasi Penjumlahan
        kurang = panjang - lebar; // operasi Pengurangan
        kali = panjang * lebar; // operasi Perkalian
        bagi = panjang / lebar; // Operasi Pembagian
        modulus = panjang % lebar; //operasi Modulus
        
        //mencetak hasil
        System.out.println("Hasil Penjumlahan\t: " + jumlah);
        System.out.println("Hasil Pengurangan\t: " + kurang);
        System.out.println("Hasil Perkalian\t\t: " + kali);
        System.out.println("Hasil Pembagian\t\t: " + bagi);
        System.out.println("Hasil Modulus\t\t: " + modulus);
    }
}
