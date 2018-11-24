
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
public class Aktivitas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] angka = new int[3][4];
        
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                System.out.print("Matrik [" + (x+1) + "][" + (y+1) + "] = ");
                angka[x][y] = sc.nextInt();
            }
        }
        
        System.out.println("");
        
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                System.out.print(angka[x][y] + "\t");
            }
            System.out.println("");
        }
    }
}
