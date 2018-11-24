
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
public class Aktivitas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, jumlah, nilai;
        
        max = 0;
        jumlah = 0;
        
        for(int x = 1; x<=15; x++)
        {
            System.out.print("Masukkan data : ");
            nilai = sc.nextInt();
            
            if(nilai > max)
            {
                max = nilai;
                jumlah = 0;
            }
            
            if(nilai == max)
            {
                jumlah++;
            }
        }
        System.out.println("Nilai terbesar : " + max);
        System.out.println("Jumlah mahasiswa : " + jumlah);
    }
}
