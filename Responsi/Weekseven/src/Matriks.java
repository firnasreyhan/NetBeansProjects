/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */

import java.util.Scanner;

public class Matriks {
    
    static Scanner sc = new Scanner(System.in);
    static int[][] matrik_a = new int[3][3];
    static int[][] matrik_b = new int[3][3];
    static int[][] matrik_hasil = new int[3][3];
    static int pilih;
    
    public static void main(String[] args) {
        
        System.out.println("=== Menu Matriks 3x3 ===\n1. Penjumlahan\n2. Perkalian");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        
        switch(pilih)
        {
            case 1:
                input_matriks();
                for(int x = 0; x<matrik_hasil.length; x++)
                {
                    for(int y = 0; y<matrik_hasil.length; y++)
                    {
                        matrik_hasil[x][y] = matrik_a[x][y] + matrik_b[x][y];
                    }
                }
                break;
            case 2:
                input_matriks();
                for(int x = 0; x<matrik_hasil.length; x++)
                {
                    for(int y = 0; y<matrik_hasil.length; y++)
                    {
                        matrik_hasil[x][y] = 0;
                        for(int z = 0; z < matrik_hasil.length; z++)
                        {
                            matrik_hasil[x][y] += matrik_a[x][z] * matrik_b[z][y];
                        }
                    }
                }
                break;
            default:
                System.out.println("Inputan salah!");
        }
        System.out.println("\nHasil : ");
        for(int x = 0; x<matrik_hasil.length; x++)
        {
            for(int y = 0; y<matrik_hasil.length; y++)
            {
                System.out.print(matrik_hasil[x][y] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void input_matriks()
    {
        System.out.println("\nMatriks A");
        for(int x = 0; x<matrik_a.length; x++)
        {
            for(int y = 0; y<matrik_a.length; y++)
            {
                System.out.print("Matrik A [" + (x+1) + "][" + (y+1) + "] = ");
                matrik_a[x][y] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matriks B");
        for(int x = 0; x<matrik_b.length; x++)
        {
            for(int y = 0; y<matrik_b.length; y++)
            {
                System.out.print("Matrik B [" + (x+1) + "][" + (y+1) + "] = ");
                matrik_b[x][y] = sc.nextInt();
            }
        }
    }
}
