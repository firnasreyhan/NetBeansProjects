/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan_1 {
    public static void main(String[] args) {
        int angka;
        
        for(int x = 5; x > 0; x--)
        {
            angka = 10;
            for(int y = 1; y <= x; y++)
            {
                System.out.print(angka + " ");
                angka = angka + 10;
            }
            System.out.println("");
        }
    }
}
