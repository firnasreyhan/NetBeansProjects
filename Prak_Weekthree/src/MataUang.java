
import java.text.DecimalFormat;
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
public class MataUang {
    public static void main(String[] args) {
        DecimalFormat df;
        Scanner input;
        double uang, hasil_konversi;
        int pilihan;
        
        input = new Scanner(System.in);
        df = new DecimalFormat("#.##");
        
        System.out.println("---(Konversi Mata Uang)---");
        System.out.println("1. Rupiah -> Dolar");
        System.out.println("2. Dolar -> Rupiah");
        System.out.print("Pilih : ");
        
        pilihan = input.nextInt();
        System.out.println("");
        switch(pilihan)
        {
            case 1:
                System.out.print("Masukkan nilai rupiah\t: ");
                uang = input.nextDouble();
                
                hasil_konversi = uang / 14000;
                
                System.out.println("Hasil Konversi\t\t: " + df.format(hasil_konversi) + " Dolar");
                break;
            case 2:
                System.out.print("Masukkan nilai dolar\t: ");
                uang = input.nextDouble();
                
                hasil_konversi = uang * 14000;
                
                System.out.println("Hasil Konversi\t\t: " + df.format(hasil_konversi) + " Rupiah");
                break;
        }
    }
}
