/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class LuasSegitiga {
    static int alas;
    static int tinggi;
    static int luas;
    static double hasil;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Alas : ");
        alas = s.nextInt();

        System.out.print("Masukkan Tinggi : ");
        tinggi = s.nextInt();
        luas = (alas * tinggi) / 2;

        System.out.println("(" + alas + " * " + tinggi + ") / 2 = " + luas);
    }
}