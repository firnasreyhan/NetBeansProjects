
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
public class Aktivitas7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        System.out.println("Faktorial : " + faktorial(angka));
    }
    
    public static int faktorial(int n)
    {
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * faktorial(n-1);  
        }
    }
}
