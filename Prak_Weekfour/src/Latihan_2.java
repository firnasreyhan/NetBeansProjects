/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan_2 {
    public static void main(String[] args) {
        int angka;
        angka = 10;
        
        for(int x = 1; x <= 5; x++)
        {
            for(int y = 1; y <= x; y++)
            {
                System.out.print(angka + " ");
            }
            System.out.println("");
            angka = angka + (10 * x);
        }
    }
}
