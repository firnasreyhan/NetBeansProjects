/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume_cylinder;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Volume_Cylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        double lebar, kedalaman, phi, volume;
        
        phi = 3.14;
        
        System.out.print("Masukkan Lebar\t\t: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan Kedalaman\t: ");
        kedalaman = input.nextDouble();
        
        volume = (phi/4) * Math.pow(lebar, 2) * kedalaman;
        
        System.out.println("");
        System.out.println("Jumlah beton\t\t: " + volume + "/lubang");
    }
    
}
