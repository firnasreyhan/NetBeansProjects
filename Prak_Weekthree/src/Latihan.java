
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
        
        byte a;
        int b;
        float c;
        double d;
        char e;
        
        System.out.print("Masukkan nilai Byte : ");
        a = input.nextByte();
        System.out.print("Masukkan nilai Integer : ");
        b = input.nextInt();
        System.out.print("Masukkan nilai Float : ");
        c = input.nextFloat();
        System.out.print("Masukkan nilai Double : ");
        d = input.nextDouble();
        System.out.print("Masukkan nilai Character : ");
        e = input.next().charAt(0);
        
        System.out.println("");
        System.out.println("Nilai Byte : " + a);
        System.out.println("Nilai Integer : " + b);
        System.out.println("Nilai Float : " + c);
        System.out.println("Nilai Double : " + d);
        System.out.println("Nilai Character : " + e);
    }
}
