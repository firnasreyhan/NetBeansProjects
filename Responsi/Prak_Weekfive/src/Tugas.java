
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
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        
        do
        {
            System.out.print("Masukkan nilai : ");
            nilai = sc.nextInt();
            
            if(nilai >= 56)
            {
                if(nilai == 100)
                {
                    System.out.println("SEMPURNA");
                }
                else if(nilai > 100)
                {
                    System.out.println("Inputan nilai salah!");
                }
                else
                {
                    System.out.println("LULUS");
                }
            }
            else
            {
                if(nilai == 0)
                {
                    System.out.println("PARAH");
                }
                else if(nilai < 0)
                {
                    System.out.println("Inputan nilai salah!");
                }
                else
                {
                    System.out.println("GAGAL");
                }
            }
        }while(nilai != 1000);
    }
}