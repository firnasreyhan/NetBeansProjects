
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
        double a, b;
        
        System.out.printf("%-30s %s","Masukkan operand pertama",": ");
        a = sc.nextDouble();
        System.out.printf("%-30s %s","Masukkan operand kedua",": ");
        b = sc.nextDouble();
        
        System.out.printf("%-30s %s %.0f\n","Hasil penjumlahan",":",(a+b));
        System.out.printf("%-30s %s %.0f\n","Hasil pengurangan",":",(a-b));
        System.out.printf("%-30s %s %.0f\n","Hasil perkalian",":",(a*b));
        System.out.printf("%-30s %s %.0f\n","Hasil pembagian",":",(a/b));
    }
}
