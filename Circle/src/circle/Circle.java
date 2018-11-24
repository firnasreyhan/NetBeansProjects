/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input;
        DecimalFormat df;
        double A, r, D, C, phi;
        
        input = new Scanner(System.in);
        df = new DecimalFormat("#.##");
        phi = 3.14;
        
        System.out.println("---( Luas lingkaran dengan Jari-jari )---");
        System.out.print("Masukkan Jari-jari : ");
        r = input.nextDouble();
        
        A = phi * Math.pow(r, 2);
        
        System.out.println("Luas lingkaran : " + df.format(A));
        
        System.out.println("");
        System.out.println("---( Luas lingkaran dengan Diameter )---");
        System.out.print("Masukkan Diameter : ");
        D = input.nextDouble();
        
        A = (phi/4) * Math.pow(D, 2);
        
        System.out.println("Luas lingkaran : " + df.format(A));
        
        System.out.println("");
        System.out.println("---( Luas lingkaran dengan Circumreference )---");
        System.out.print("Masukkan Circumreference : ");
        C = input.nextDouble();
        
        A = Math.pow(C, 2) / (4*phi);
        
        System.out.println("Luas lingkaran : " + df.format(A));
    }
    
}
