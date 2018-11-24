/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasimatriks;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class OperasiMatriks {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int[][] matriks_a = new int[3][3];
    public static int[][] matriks_b = new int[3][3];
    public static int[][] matriks_h = new int[3][3];
    public static float[][] matriks_hid = new float[3][3];
    public static float[][] matriks_det = new float[3][3];
    
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih, pilih_id, b1, k1, b2, k2;
        float det;
        boolean cek_mtrk, cek_mtrk_jp, cek_mtrk_kl;
        System.out.println("Menu Matriks :\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Invers\n5. Determinan\n");
        System.out.print("Masukkan pilihan : ");
        pilih = sc.nextInt();
        
        if(pilih == 1 || pilih == 2 || pilih == 3)
        {
            if(pilih == 1)
            {
                System.out.println("\n(=Penjumlahan Matriks=)\n");
            }
            else if(pilih == 2)
            {
                System.out.println("\n(=Pengurangan Matriks=)\n");
            }
            else if(pilih == 3)
            {
                System.out.println("\n(=Perkalian Matriks=)\n");
            }
            System.out.print("\nMasukkan panjang baris matriks A = ");
            b1 = sc.nextInt();
            System.out.print("\nMasukkan panjang kolom matriks A = ");
            k1 = sc.nextInt();

            cek_mtrk = cek_matriks(b1, k1);

            if(cek_mtrk == true)
            {
                System.out.print("\nMasukkan panjang baris matriks B = ");
                b2 = sc.nextInt();
                System.out.print("\nMasukkan panjang kolom matriks B = ");
                k2 = sc.nextInt();

                cek_mtrk = cek_matriks(b2, k2);
                cek_mtrk_jp = cek_matriks_jp(b1, k1, b2, k2);
                cek_mtrk_kl = cek_matriks_kl(k1, b2);

                if(cek_mtrk == true && cek_mtrk_jp == true && (pilih == 1 || pilih == 2))
                {
                    input_matriks(b1, k1, b2, k2, 1);
                    if(pilih == 1)
                    {
                        proses_matriks_jp(b1, k2, 1);
                    }
                    else if(pilih == 2)
                    {
                        proses_matriks_jp(b1, k2, 2);
                    }
                    System.out.println("\nHasilnya :");
                    output_matriks(b1, k2, 3);
                }
                else if(cek_mtrk == true && cek_mtrk_kl == true && pilih == 3)
                {
                    input_matriks(b1, k1, b2, k2, 1);
                    proses_matriks_jp(b2, k1, 3);
                    System.out.println("\nHasilnya :");
                    output_matriks(b1, k2, 3);
                }
                else
                {
                    System.out.println("\nBukan matriks/tidak bisa dioprasikan");
                }
            }
            else
            {
                System.out.println("\nBukan matriks");
            }
        }
        else if(pilih == 4)
        {
            System.out.println("\n(=Invers Matriks=)\n");;
            System.out.println("\nPilihan Matriks\n1. Matriks (2x2)\n2. Matriks (3x3)\n");
            System.out.print("Masukkan pilihan : ");
            pilih_id = sc.nextInt();
            if(pilih_id == 1)
            {
                input_matriks(2, 2, 0, 0, 0);
                proses_invers(2);
                System.out.println("\nHasilnya :");
                output_matriks(2, 2, 4);

            }
            else if(pilih_id == 2)
            {
                input_matriks(3, 3, 0, 0, 0);
                proses_invers(3);
                System.out.println("\nHasilnya :");
                output_matriks(3, 3, 4);
            }
            else
            {
                System.out.println("Inputan salah/error");
            }
        }
        else if(pilih == 5)
        {
            System.out.println("\n(=Determinan Matriks=)\n");
            System.out.println("\nPilihan Matriks\n1. Matriks (2x2)\n2. Matriks (3x3)\n");
            System.out.print("Masukkan pilihan : ");
            pilih_id = sc.nextInt();
            if(pilih_id == 1)
            {
                input_matriks(2, 2, 0, 0, 0);
                det = proses_determinan(2);
                System.out.println("\nNilai Determinan = " + det);
            }
            else if(pilih_id == 2)
            {
                input_matriks(3, 3, 0, 0, 0);
                det = proses_determinan(3);
                System.out.println("\nNilai Determinan = " + det);
            }
            else
            {
                System.out.println("Inputan salah/error");
            }
        }
        else
        {
            System.out.println("Inputan salah/error");
        }
    }
    
    public static boolean cek_matriks(int b, int k)
    {
        boolean param_m;
        if(b <= 1 && k <= 1)
        {
            param_m = false;
        }
        else
        {
            param_m = true;
        }

        return param_m;
    }
    
    public static boolean cek_matriks_jp(int b1, int k1, int b2, int k2)
    {
        boolean param_jml;
        if(b1 == b2 && k1 == k2)
        {
            param_jml = true;
        }
        else
        {
            param_jml = false;
        }

        return param_jml;
    }
    
    public static boolean cek_matriks_kl(int k, int b)
    {
        boolean param_kl;
        if(k == b)
        {
            param_kl = true;
        }
        else
        {
            param_kl = false;
        }

        return param_kl;
    }
    
    public static void input_matriks(int b1, int k1, int b2, int k2, int opr)
    {
        System.out.println("");
        for(int x = 0; x < b1; x++)
        {
            for(int y = 0; y < k1; y++)
            {
                System.out.print("Nilai matriks A [" + (x+1) + "] [" + (y+1) + "] = ");
                matriks_a[x][y] = sc.nextInt();
            }
        }
        output_matriks(b1, k1, 1);
        if(opr == 1)
        {
            System.out.println("");
            for(int x = 0; x < b2; x++)
            {
                for(int y = 0; y < k2; y++)
                {
                    System.out.print("Nilai matriks B [" + (x+1) + "] [" + (y+1) + "] = ");
                    matriks_b[x][y] = sc.nextInt();
                }
            }
            output_matriks(b2, k2, 2);
        }
    }
    
    public static void proses_matriks_jp(int b, int k, int opr)
    {
        System.out.println("");
        for(int x = 0; x < b; x++)
        {
            for(int y = 0; y < k; y++)
            {
                if(opr == 1)
                {
                    matriks_h[x][y] = matriks_a[x][y] + matriks_b[x][y];
                }
                else if(opr == 2)
                {
                    matriks_h[x][y] = matriks_a[x][y] - matriks_b[x][y];
                }
                else if(opr == 3)
                {
                    matriks_h[x][y] = 0;
                    for(int z = 0; z < b; z++)
                    {
                        matriks_h[x][y] += matriks_a[x][z] * matriks_b[z][y];
                    }
                }
            }
        }
    }
    
    public static void output_matriks(int b, int k, int mtrk)
    {
        System.out.print("\n==========\n");
        for(int x = 0; x < b; x++)
        {
            for(int y = 0; y < k; y++)
            {
                if(mtrk == 1)
                {
                    System.out.print(matriks_a[x][y] + " ");
                }
                else if(mtrk == 2)
                {
                    System.out.print(matriks_b[x][y] + " ");
                }
                else if(mtrk == 3)
                {
                    System.out.print(matriks_h[x][y] + " ");
                }
                else if(mtrk == 4)
                {
                    System.out.print(matriks_hid[x][y] + " ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void proses_invers(int ordo)
    {
        float in_det;
        if(ordo == 2)
        {
            in_det = proses_determinan(2);
            matriks_det[0][0] = matriks_a[1][1];
            matriks_det[1][1] = matriks_a[0][0];
            matriks_det[0][1] = matriks_a[0][1]*-1;
            matriks_det[1][0] = matriks_a[1][0]*-1;

            for(int x = 0; x < 2; x++)
            {
                for(int y = 0; y < 2; y++)
                {
                    matriks_hid[x][y] = matriks_det[x][y]/in_det;
                }
            }
        }
        else if(ordo == 3)
        {
            in_det = proses_determinan(3);
            matriks_det[0][0] = (matriks_a[1][1]*matriks_a[2][2] - matriks_a[2][1]*matriks_a[1][2]);  
            matriks_det[0][1] = -1 * (matriks_a[1][0]*matriks_a[2][2] - matriks_a[2][0]*matriks_a[1][2]);  
            matriks_det[0][2] = (matriks_a[1][0]*matriks_a[2][1] - matriks_a[2][0]*matriks_a[1][1]);  
            matriks_det[1][0] = -1 * (matriks_a[0][1]*matriks_a[2][2] - matriks_a[2][1]*matriks_a[0][2]);  
            matriks_det[1][1] = (matriks_a[0][0]*matriks_a[2][2]) - (matriks_a[2][0]*matriks_a[0][2]);  
            matriks_det[1][2] = -1 * (matriks_a[0][0]*matriks_a[2][1]) - (matriks_a[2][0]*matriks_a[0][1]);  
            matriks_det[2][0] = (matriks_a[0][1]*matriks_a[1][2] - matriks_a[0][2]*matriks_a[1][1]);  
            matriks_det[2][1] = -1 * (matriks_a[0][0]*matriks_a[1][2] - matriks_a[1][0]*matriks_a[0][2]);  
            matriks_det[2][2] = (matriks_a[0][0]*matriks_a[1][1] - matriks_a[1][0]*matriks_a[0][1]);

            for(int x = 0; x < 3; x++)
            {
                for(int y = 0; y < 3; y++)
                {
                    matriks_hid[x][y] = matriks_det[y][x]/in_det;
                }
            }
        }
    }
    
    public static float proses_determinan(int ordo)
    {
        float determinan = 0;
        if(ordo == 2)
        {
            determinan = matriks_a[0][0]*matriks_a[1][1]-matriks_a[1][0]*matriks_a[0][1];
        }
        else if(ordo == 3)
        {
            determinan = ((matriks_a[0][0]*matriks_a[1][1]*matriks_a[2][2])+(matriks_a[0][1]*
            matriks_a[1][2]*matriks_a[2][0])+(matriks_a[0][2]*matriks_a[1][0]*matriks_a[2][1]))-
            ((matriks_a[0][2]*matriks_a[1][1]*matriks_a[2][0])+(matriks_a[0][0]*matriks_a[1][2]
            *matriks_a[2][1])+(matriks_a[0][1]*matriks_a[1][0]*matriks_a[2][2]));
        }
        return determinan;
    }
}