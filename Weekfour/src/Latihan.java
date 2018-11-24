
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
public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, hasil;
        
        System.out.print("Masukkan a = ");
        a = input.nextInt();
        System.out.print("Masukkan b = ");
        b = input.nextInt();
        
        hasil = a - b;
        System.out.println("\nHasil = " + hasil);
        
    }
}
