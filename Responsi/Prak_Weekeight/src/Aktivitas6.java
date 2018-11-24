
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
public class Aktivitas6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        System.out.println("Faktorial : " + faktorial(angka));
    }
    
    public static int faktorial(int n)
    {
        int hasil;
        hasil = 1;
        
        for(int x = n; x > 0; x--)
        {
            hasil = hasil * x;
        }
        
        return hasil;
    }
}
