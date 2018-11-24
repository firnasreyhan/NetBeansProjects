
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
public class Aktivitas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        do
        {
            System.out.print("Masukkan nilai (0-100) : ");
            angka = sc.nextInt();
            
            if(angka < 0 || angka > 100)
            {
                System.out.println("Data salah. Ulangi Memasukkan Data");
            }
        }while(angka < 0 || angka > 100);
        
        if(angka >= 60)
        {
            System.out.println("LULUS");
        }
        else
        {
            System.out.println("GAGAL");
        }
    }
}
