/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

import java.util.Scanner;

/**
 * Nama     :   Muhammad Reyhan Firnas Adani
 * NRP      :   171111079
 * Kelas    :   TI-B
 * Soal     :   3
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ulang;
        double nilai_akhir, tugas, uts, uas;
        
        System.out.println("=== Grade Mahasiswa ===");
        do
        {
            System.out.println("");
            do
            {
                System.out.print("Tugas (0-100)\t: ");
                tugas = sc.nextDouble();
            }while(tugas < 0 || tugas > 100);
            do
            {
                System.out.print("UTS (0-100)\t: ");
                uts = sc.nextDouble();
            }while(uts < 0 || uts > 100);
            do
            {
                System.out.print("UAS (0-100)\t: ");
                uas = sc.nextDouble();
            }while(uas < 0 || uas > 100);
            
            nilai_akhir = (tugas*0.3) + (uts*0.3) + (uas*0.4);
            System.out.println("");
            System.out.println("Nilai Akhir\t: " + nilai_akhir);
            System.out.println("Nilai Tugas\t: " + tugas);
            System.out.println("Nilai UTS\t: " + uts);
            System.out.println("Nilai UAS\t: " + uas);
            
            if(nilai_akhir >= 50)
            {
                if(nilai_akhir >= 60)
                {
                    if(nilai_akhir >= 75)
                    {
                        if(nilai_akhir >= 90)
                        {
                            System.out.println("Grade\t\t: A");
                        }
                        else
                        {
                            System.out.println("Grade\t\t: B");
                        }
                    }
                    else
                    {
                        System.out.println("Grade\t\t: C");
                    }
                }
                else
                {
                    System.out.println("Grade\t\t: D");
                }
            }
            else
            {
                System.out.println("Grade\t\t: E");
            }
            
            System.out.print("\nLagi?(T/Y) ");
            ulang = sc.next().charAt(0);
            
        }while(!(ulang == 'T' || ulang == 't'));
    }
    
}
