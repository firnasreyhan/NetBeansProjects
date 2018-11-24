/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class PacManMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan pm = new PacMan();
        
        int pilih;
        
        System.out.print("Panjang area : ");
        pm.width = sc.nextInt();
        
        System.out.print("Lebar area : ");
        pm.height = sc.nextInt();
        
        System.out.println("====================");
        
        System.out.print("Koordinat x : ");
        pm.x = sc.nextInt();
        
        System.out.print("Koordinat y : ");
        pm.y = sc.nextInt();
        
        if(!(pm.x>0 && pm.x<=pm.width && pm.y>0 && pm.y<=pm.height))
        {
            System.out.println("Koordinat salah");
        }
        else
        {
            System.out.println("==========GAME START==========");

            pm.printPosition();

            System.out.print("Menu :\n1. Naik\n2. Turun\n3. Kanan\n4. Kiri\nPilihan : ");
            pilih = sc.nextInt();

            switch(pilih)
            {
                case 1:
                    pm.moveUp();
                    break;
                case 2:
                    pm.moveDown();
                    break;
                case 3:
                    pm.moveRight();
                    break;
                case 4:
                    pm.moveLeft();
                    break;
                default:
                    System.out.println("Pilihan Error");
            }
        }
    }
}