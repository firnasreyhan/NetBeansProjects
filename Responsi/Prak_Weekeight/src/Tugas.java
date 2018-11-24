
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
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka, pangkat, hasil;
        
        System.out.print("Masukkan angka\t\t: ");
        angka = sc.nextInt();
        System.out.print("Masukkan pangkat\t: ");
        pangkat = sc.nextInt();
        
        hasil = pemangkatan(angka, pangkat);
        System.out.println("Hasil\t\t\t: " + hasil);
    }
    
    public static int pemangkatan(int a, int p)
    {
        if(p == 0)
        {
            return 1;
        }
        else
        {
            return a * pemangkatan(a,p-1);
        }
    }
}
