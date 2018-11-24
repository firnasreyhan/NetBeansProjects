
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
public class Aktivitas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        double p;
        
        System.out.print("a : ");
        a = sc.nextInt();
        System.out.print("n : ");
        n = sc.nextInt();
        
        p = Math.pow(a, n);
        System.out.println("p : " + p);
    }
}
