
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
        char grade;
        double nilai_akhir;
        int tugas, uts, uas, nrp;
        
        do
        {
            System.out.print("NRP\t: ");
            nrp = sc.nextInt();
            
            if(nrp != 0)
            {
                do
                {
                    System.out.print("Tugas\t: ");
                    tugas = sc.nextInt();
                }while(tugas < 0 || tugas > 100);
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

                nilai_akhir = (tugas*0.3) + (uts*0.3) + (uas*0.4);

                if(nilai_akhir >= 44)
                {
                    if(nilai_akhir >= 56)
                    {
                        if(nilai_akhir >= 70)
                        {
                            if(nilai_akhir >= 80)
                            {
                                grade = 'A';
                            }
                            else
                            {
                                grade = 'B';
                            }
                        }
                        else
                        {
                            grade = 'C';
                        }
                    }
                    else
                    {
                        grade = 'D';
                    }
                }
                else
                {
                    grade = 'E';
                }
                
                System.out.println("");
                System.out.println("| Tugas | UTS | UAS | Nilai Akhir | Grade |");
                System.out.println("|  "+ tugas +"  | "+ uts +" | "+ uas +" |    "+ nilai_akhir +"    |   "+ grade +"   |");
            }
            System.out.println("");
        }while(nrp != 0);
    }
}
