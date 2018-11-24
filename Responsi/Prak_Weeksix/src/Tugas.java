
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
        String[] kode_pegawai = new String[5];
        int[] lama_bekerja = new int[5];
        int[] jumlah_anak = new int[5];
        int[] insentif = new int[5];
        int[] gaji_pokok = new int[5];
        int[] total_gaji = new int[5];
        int tunjangan_anak;
        
        for(int x = 0; x<5; x++)
        {
            System.out.print("Kode pegawai\t: ");
            kode_pegawai[x] = sc.next();
            System.out.print("Lama bekerja\t: ");
            lama_bekerja[x] = sc.nextInt();
            System.out.print("Jumlah anak\t: ");
            jumlah_anak[x] = sc.nextInt();
            
            if(lama_bekerja[x] > 5)
            {
                if(lama_bekerja[x] > 10)
                {
                    gaji_pokok[x] = 5000000;
                }
                else
                {
                    gaji_pokok[x] = 2000000;
                }
            }
            else
            {
                gaji_pokok[x] = 1000000;
            }
            
            if(jumlah_anak[x] <= 2)
            {
                tunjangan_anak = jumlah_anak[x] * 200000;
            }
            else
            {
                tunjangan_anak = 0;
            }
            
            if(jumlah_anak[x] >= 2 && lama_bekerja[x] > 2)
            {
                insentif[x] = jumlah_anak[x] * 200000;
            }
            else
            {
                insentif[x] = 0;
            }
            
            total_gaji[x] = gaji_pokok[x] + tunjangan_anak + insentif[x];
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("| Kode Karyawan |  Lama Bekerja |  Jumlah Anak  |    Insentif   |   Gaji Pokok  |   Total Gaji  |");
        for(int x = 0; x<5; x++)
        {
            System.out.println("|\t" + kode_pegawai[x] + "\t|\t"+ lama_bekerja[x] + "\t|\t"+ jumlah_anak[x] + "\t|\t"+ insentif[x] + "\t|\t"+ gaji_pokok[x] + "\t|\t"+ total_gaji[x] + "\t|");
        }
    }
}
