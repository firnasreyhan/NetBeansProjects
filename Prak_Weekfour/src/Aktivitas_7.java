
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
public class Aktivitas_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, hasil;
        hasil = 1;
        
        System.out.print("Masukkan angka\t\t: ");
        x = input.nextInt();
        System.out.print("Masukkan pangkat\t: ");
        y = input.nextInt();
        
        for(int i = 1; i <= y; i++)
        {
            hasil= hasil * x;
        }
        System.out.println("Hasil\t\t\t: " + hasil);
    }
}
