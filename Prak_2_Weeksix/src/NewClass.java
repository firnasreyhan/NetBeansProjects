
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
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        if (faktor(angka) > 2) {
            System.out.println("Bukan prima");
        } else {
            System.out.println("Prima");
        }
        System.out.println("Bilangan prima 1-100");
        for (int i = 1; i <= 100; i++) {
            if (faktor(i) == 2) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static int faktor(int angka){
        int faktor = 0;
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                faktor++;
            }
        }
        return faktor;
    }
}