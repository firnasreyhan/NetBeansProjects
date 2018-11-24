/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifikasimatrik;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class IdentifikasiMatrik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        int param = 0;
        boolean ident = false;
        boolean simet = false;
        
        System.out.print("Masukkan panjang baris matrik = ");
        baris = sc.nextInt();
        System.out.print("Masukkan panjang kolom matrik = ");
        kolom = sc.nextInt();
        
        if(cekMatrik(baris, kolom) == false)
        {
            System.out.println("Bukan Matriks");
        }
        else
        {
            System.out.println("");
            int[][] matrik = new int[baris][kolom];
            for(int x = 0;x < baris;x++)
            {
		for(int y = 0;y < kolom;y++)
		{
                    System.out.print("Nilai matriks [" + (x+1) + "] [" + (y+1) + "] = ");
                    matrik[x][y] = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("Bentuk Matriks");
            for(int x = 0;x < baris;x++)
            {
		for(int y = 0;y < kolom;y++)
		{
                    System.out.print(matrik[x][y] + " ");
		}
                System.out.println("");
            }
            System.out.println("");
            System.out.println("Jenis Matriks");
            if(baris == kolom)
            {
                System.out.println("Matriks Bujursangkar");
                jump:
                for(int x = 0;x < baris;x++)
                {
                    for(int y = 0;y < kolom;y++)
                    {
                        if(param == 0)
                        {
                            if(x == y && matrik[x][y] == 1 || x != y && matrik[x][y] == 0)
                            {
                                ident = true;
                            }
                            else
                            {
                                ident = false;
                                param = 1;
                                continue jump;
                            }
                        }
                        else if(param == 1)
                        {
                            if(x != y)
                            {
                                if(matrik[x][y] == matrik[y][x])
                                {
                                    simet = true;
                                }
                                else
                                {
                                    simet = false;
                                }
                            }
                        }
                    }
                }
            }
            else if(baris == 1)
            {
                System.out.println("Matriks Baris");
            }
            else if(kolom == 1)
            {
                System.out.println("Matriks Kolom");
            }
            else
            {
                System.out.println("Matriks tak terdifinisi/tak berjenis");
            }
		
            if(simet == true)
            {
                System.out.println("Matriks Simetris");
            }
            else if(ident == true)
            {
                System.out.println("Matriks Identitas");
            }
        }
    }
    
    public static boolean cekMatrik(int b, int k) {
        boolean cek;
        
        if(b <= 1 && k <= 1)
        {
            cek = false;
        }
        else
        {
            cek = true;
        }
        
        return cek;
    }
    
}