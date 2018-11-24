
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
public class Latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hasil, angka;
        
        System.out.print("Masukkan angka : ");
        angka = sc.nextDouble();
        
        hasil = angka/faktorial(angka);
        System.out.println("Hasil : " + hasil);
    }
    
    public static double faktorial(double n)
    {
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * faktorial(n-1);  
        }
    }
}
