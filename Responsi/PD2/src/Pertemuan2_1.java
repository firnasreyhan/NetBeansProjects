
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
public class Pertemuan2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int[] a, b, c;

        System.out.print("Masukkan panjang baris : ");
        x = sc.nextInt();
        a = new int[x];
        b = new int[x];
        c = new int[x];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0) {
                    a[j] = sc.nextInt();
                } else if (i == 1) {
                    b[j] = sc.nextInt();
                    c[j] = a[j] * b[j];
                } else {
                    System.out.println(c[j]);
                }
            }
        }
        
        sc.close();
    }
}
