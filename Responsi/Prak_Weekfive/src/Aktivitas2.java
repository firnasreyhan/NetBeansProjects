
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
public class Aktivitas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka, x;
        double hasil;
        
        x = 0;
        hasil = 0;
        
        do
        {
            System.out.print("Masukkan data : ");
            angka = sc.nextInt();
            
            if(angka != 999)
            {
                hasil = hasil + angka;
                x++;
            }
        }while(angka != 999);
        
        hasil = hasil / x;
        System.out.println("Rata-rata : " + hasil);
    }
}
