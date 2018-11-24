/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepare_uts_2;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Prepare_UTS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ulang;
        double nilai_akhir;
        int tugas_t, tugas1, tugas2, uts, uas;
        
        do
        {
            do
            {
                System.out.print("Tugas 1\t: ");
                tugas1 = sc.nextInt();
            }while(tugas1 < 0 || tugas1 > 100);
            do
            {
                System.out.print("Tugas 2\t: ");
                tugas2 = sc.nextInt();
            }while(tugas2 < 0 || tugas2 > 100);
            do
            {
                System.out.print("UTS\t: ");
                uts = sc.nextInt();
            }while(uts < 0 || uts > 100);
            do
            {
                System.out.print("UAS\t: ");
                uas = sc.nextInt();
            }while(uas < 0 || uas > 100);
            
            if(tugas1 > tugas2)
            {
                tugas_t = tugas1;
            }
            else
            {
                tugas_t = tugas2;
            }
            
            nilai_akhir = (tugas_t*0.3) + (uts*0.3) + (uas*0.4);
            System.out.println("Nilai Akhir\t: " + nilai_akhir);
            
            if(nilai_akhir >= 44)
            {
                if(nilai_akhir >= 56)
                {
                    if(nilai_akhir >= 70)
                    {
                        if(nilai_akhir >= 80)
                        {
                            System.out.println("Grade : A");
                            System.out.println("Keterangan : Memuaskan");
                        }
                        else
                        {
                            System.out.println("Grade : B");
                            System.out.println("Keterangan : Baik");
                        }
                    }
                    else
                    {
                        System.out.println("Grade : C");
                        System.out.println("Keterangan : Cukup");
                    }
                }
                else
                {
                    System.out.println("Grade : D");
                    System.out.println("Keterangan : Kurang");
                }
            }
            else
            {
                System.out.println("Grade : E");
                System.out.println("Keterangan : Gagal");
            }
            
            System.out.print("Apakah ingin mengulang? ");
            ulang = sc.next().charAt(0);
            
        }while(ulang == 'y');
    }
}
