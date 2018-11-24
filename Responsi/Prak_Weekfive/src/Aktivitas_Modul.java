/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Aktivitas_Modul {
    public static void main(String[] args) {
        int angka;
        angka = 0;
        
        for(int x = 1; x<=5; x++)
        {
            if(x%2 == 1)
            {
                for(int i = 1; i<=10; i++)
                {
                    angka++;
                    System.out.print(angka + " \t");
                }
                angka = angka +10;
            }
            else
            {
                for(int i = 1; i<=10; i++)
                {
                    System.out.print(angka + " \t");
                    angka--;
                }
                angka = angka +10;
            }
            System.out.println("");
        }
    }
}
