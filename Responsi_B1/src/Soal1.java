
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
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil, kuadrat1, kuadrat2, n;
        
        kuadrat1 = 0;
        kuadrat2 = 0;
        
        System.out.print("Masukkan angka : ");
        n = sc.nextInt();
        
        for(int x = 1; x <= n; x++)
        {
            kuadrat1 = kuadrat1 + (x*x);
            kuadrat2 = kuadrat2 + x;
        }
        kuadrat2 = (int) Math.pow(kuadrat2, 2);
        
        System.out.println("Jumlah kuadrat : " + kuadrat1);
        System.out.println("Kuadrat jumlah : " + kuadrat2);
        
        hasil = kuadrat2 - kuadrat1;
        
        System.out.println("Hasil : " + hasil);
    }
}
