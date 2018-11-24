
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
public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        
        do{
            System.out.print("Masukkan nilai : ");
            nilai = sc.nextInt();
        }while(nilai < 0 || nilai > 100);
        System.out.println("Nilai anda : " + nilai);
    }
}
