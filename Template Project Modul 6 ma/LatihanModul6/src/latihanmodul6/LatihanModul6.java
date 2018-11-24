/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul6;

import java.util.Scanner;





/**
 *
 * @author albert
 */
public class LatihanModul6 {
    /* Bagian ini TIDAK PERLU diubah. Untuk mendeklarasikan class Mhs yang
    berisi NRP dan 3 nilai (Tugas, UTS, dan UAS) */
    private static class Mhs{
        int NRP;
        int Tugas;
        int UTS;
        int UAS;
        double NA;
        char GRADE;
    }
    public static void main(String[] args) {
        /* Bagian ini TIDAK PERLU diubah. Untuk mendeklarasikan array mhs 
        yang bertipe Mhs */
        Scanner input = new Scanner(System.in);
        Mhs[] mhs = new Mhs[5];
        /* Menginstansiasi class Mhs untuk setiap elemen array mhs */
        for (int i=0; i<mhs.length; i++){
            mhs[i] = new Mhs();
        }
        for (int i=0; i<mhs.length; i++){
            /* Lakukan input untuk NRP, nilai tugas, UTS dan UAS, dan hitung
            nilai akhir plus grade-nya dengan ketentuan yang telah ada, lalu
            ditampilkan */
            System.out.print("NRP\t: ");
            mhs[i].NRP = input.nextInt();
            System.out.print("Tugas\t: ");
            mhs[i].Tugas = input.nextInt();
            System.out.print("UTS\t: ");
            mhs[i].UTS = input.nextInt();
            System.out.print("UAS\t: ");
            mhs[i].UAS = input.nextInt();
            
            mhs[i].NA = (mhs[i].Tugas*0.1) + (mhs[i].UTS*0.3) + (mhs[i].UAS*0.6);
            
            if(mhs[i].NA > 43)
            {
                if(mhs[i].NA > 55)
                {
                    if(mhs[i].NA > 69)
                    {
                        if(mhs[i].NA > 79)
                        {
                            mhs[i].GRADE = 'A';
                        }
                        else
                        {
                            mhs[i].GRADE = 'B';
                        }
                    }
                    else
                    {
                        mhs[i].GRADE = 'C';
                    }
                }
                else
                {
                    mhs[i].GRADE = 'D';

                }
            }
            else
            {
                mhs[i].GRADE = 'E';
            }
            System.out.println("");
        }
        
        for(int i = 0; i<mhs.length; i++)
        {
            System.out.println("| " + mhs[i].NRP+ " | "+ mhs[i].Tugas + " | "+ mhs[i].UTS + " | "+ mhs[i].UAS + " | "+ mhs[i].NA + " | "+ mhs[i].GRADE + " |");
        }
    }
    
}
