/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursmatauang;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class KursMataUang {

    /**
     * @param args the command line arguments
     */
    public static Scanner er = new Scanner(System.in);
    public static DecimalFormat df = new DecimalFormat("#.##");
    
    public static double sejumlah;
    public static String nama, kewarganegaraan, namamatauang;
    public static double jumlahakhir;
    public static double uang;
    public static double u;
        
    public static int kurs[]= {13400, 120, 3600, 3000, 10000};  
    public static String mata_uang[] = {"Usd", "Yen", "Real", "Ringgit", "Dolar Singapore"};
    
    static double konversi(double Rp,double kurs)
    {
	double H = Rp/kurs;
	return H;
    }
    
    public static void sys_konversi(int param)
    {
        double kursi=kurs[param];
	System.out.print("\nMasukkan Rupiah yang ingin anda tukar : ");
	uang = er.nextDouble();
            if(uang>=kurs[param])
            {
                System.out.println("Anda memilih "+mata_uang[param]+" sebagai nilai tukar");
                u=konversi(uang,kursi);
                System.out.println("Jumlah "+mata_uang[param]+" sebesar : "+ df.format(u));
            }
            else
            {
                System.out.println("Mohon Maaf uang anda kurang untuk proses tukar");
            }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=============================================================");
	System.out.println("|--------- Selamat Datang di Program Penukaran Uang --------|");
	System.out.println("| Program ini adalah solusi mudah untuk penukaran Uang anda |");
	System.out.println("|   Dibuat secara terpercaya dan efiesien, mudah dan aman   |");
	System.out.println("=============================================================");
	System.out.println("                                                             ");
	System.out.println("=============================================================");
	System.out.println("|    Daftar kurs nilai rupiah yang bisa ditukarkan :        |");
        System.out.println("=============================================================");
        for(int x = 0; x < 5; x++)
        {
            System.out.println("| "+(x+1)+". 1 "+mata_uang[x]+" : "+kurs[x]+" Rupiah");
        }
        System.out.println("|                                                           |");
        System.out.println("=============================================================");
        
        System.out.print("Masukan Nama Anda :  ");
	nama = er.nextLine();
	System.out.print("Masukkan Kewarganegaraan Anda : ");
	kewarganegaraan = er.nextLine();
	System.out.print("Masukkan pilihan anda : ");
	namamatauang = er.nextLine();
        
        if(namamatauang.equals("1"))
        {
            sys_konversi(0);
        }
        else if(namamatauang.equals("2"))
        {
            sys_konversi(1);
        }
        else if(namamatauang.equals("3"))
        {
            sys_konversi(2);
        }
        else if(namamatauang.equals("4"))
        {
            sys_konversi(3);
        }
        else if(namamatauang.equals("5"))
        {
            sys_konversi(4);
        }
        else
        {
            System.out.println("\nPilihan anda salah!");
        }
    }
    
}