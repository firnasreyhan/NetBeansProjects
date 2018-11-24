/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code0401;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Code0401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        byte a;
        float b;
        int c;
        double d;
        boolean e;
        char f;
        
        System.out.print("Masukkan nilai Byte : ");
        a = input.nextByte();
        System.out.print("Masukkan nilai Float : ");
        b = input.nextFloat();
        System.out.print("Masukkan nilai Integer : ");
        c = input.nextInt();
        System.out.print("Masukkan nilai Double : ");
        d = input.nextDouble();
        System.out.print("Masukkan nilai Boolean : ");
        e = input.nextBoolean();
        System.out.print("Masukkan nilai Char : ");
        f = input.next().charAt(0);
        
        System.out.println("");
        System.out.println("Nilai Byte : " + a);
        System.out.println("Nilai Float : " + b);
        System.out.println("Nilai Integer : " + c);
        System.out.println("Nilai Double : " + d);
        System.out.println("Nilai Boolean : " + e);
        System.out.println("Nilai Char : " + f);
    }
    
}
