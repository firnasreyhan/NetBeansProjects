
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
        String[] nrp = new String[5];
        int[] tugas = new int[5];
        int[] uts = new int[5];
        int[] uas = new int[5];
        double[] nilai_akhir = new double[5];
        char[] grade = new char[5];
        
        for(int x = 0; x<5; x++)
        {
            System.out.print("NRP\t: ");
            nrp[x] = sc.next();
            System.out.print("Tugas\t: ");
            tugas[x] = sc.nextInt();
            System.out.print("UTS\t: ");
            uts[x] = sc.nextInt();
            System.out.print("UAS\t: ");
            uas[x] = sc.nextInt();
            nilai_akhir[x] = (tugas[x]*0.1) + (uts[x]*0.3) + (uas[x]*0.6);
            
            if(nilai_akhir[x] > 43)
            {
                if(nilai_akhir[x] > 55)
                {
                    if(nilai_akhir[x] > 69)
                    {
                        if(nilai_akhir[x] > 79)
                        {
                            grade[x] = 'A';
                        }
                        else
                        {
                            grade[x] = 'B';
                        }
                    }
                    else
                    {
                        grade[x] = 'C';
                    }
                }
                else
                {
                    grade[x] = 'D';

                }
            }
            else
            {
                grade[x] = 'E';
            }
            System.out.println("");
        }
        
        for(int x = 0; x<5; x++)
        {
            System.out.println("| " + nrp[x] + " | "+ tugas[x] + " | "+ uts[x] + " | "+ uas[x] + " | "+ nilai_akhir[x] + " | "+ grade[x] + " |");
        }
    }
}
