
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
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n, x;
        System.out.println("Masukkan nilai a : ");
        a = sc.nextInt();
        System.out.println("Masukkan nilai n : ");
        n = sc.nextInt();
        System.out.println("Masukkan nilai x : ");
        x = sc.nextInt();
        
        System.out.println(proses(a,n,x));
    }
    
    public static double proses(int a, int n, int x)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return a*n*Math.pow(x, n) + proses(a,n-1,x);
        }
    }
}
