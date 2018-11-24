
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
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        
        System.out.print("Masukkan score\t: ");
        score = input.nextInt();
        
        if(score >= 56)
        {
            if(score == 100)
            {
                System.out.println("Excellent");
            }
            else
            {
                System.out.println("LULUS");
            }
        }
        else
        {
            if(score == 0)
            {
                System.out.println("NUEMENN");
            }
            else
            {
                System.out.println("GAGAL");
            }
        }
        
    }
}
