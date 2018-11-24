
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
public class Aktivitas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desimal;
        String biner;
        
        System.out.print("Masukkan bilangan desimal : ");
        desimal = sc.nextInt();
        
        biner = Integer.toBinaryString(desimal);
        System.out.println("Bilangan biner : " + biner);
    }
}
