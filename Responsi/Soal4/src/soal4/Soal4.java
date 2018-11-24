/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;

/**
 * Nama     :   Muhammad Reyhan Firnas Adani
 * NRP      :   171111079
 * Kelas    :   TI-B
 * Soal     :   4
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int x = 1; x <= 13; x++)
        {
            System.out.print("*");
            if(x == 1 || x == 7 || x == 13)
            {
                for(int y = 1; y <= 7; y++)
                {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
    
}
