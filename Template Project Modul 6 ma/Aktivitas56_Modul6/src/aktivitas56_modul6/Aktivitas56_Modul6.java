/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktivitas56_modul6;

import java.util.Scanner;

/**
 *
 * @author albert
 */
public class Aktivitas56_Modul6 {

    public static void main(String[] args) {
        /* Bagian ini TIDAK PERLU diubah. Bagian ini adalah mendeklarasikan
        dan menginstansiasi array A */
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            /* Masukkan source code untuk menginputkan angka ke dalam array di
            dalam perulangan ini, dengan tentunya mendeklarasikan class Scanner
            terlebih dahulu. */
            System.out.print("Masukkan angka : ");
            A[i] = input.nextInt();
        }
        for (int i = 0; i < A.length - 1; i++) {
            /* Lakukan pengurutan angka array A di sini. Anda dapat menggunakan
            algoritma pengurutan bubble sort, insertion sort, selection sort, 
            atau algoritma pengurutan lain yang menurut Anda paling mudah. */
            for(int j = 0; j<A.length - 1; j++)
            {
                if(A[j+1] < A[j])
                {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        /* Bagian ini adalah mencari nilai rata-rata, angka terkecil dan
        angka terbesar */
        float jumlah = 0; /* inisialisasi jumlah dengan 0 terlebih dahulu */
        int maks = A[0]; /* asumsikan nilai maksimum awalnya elemen pertama array A */
        int min = A[0]; /* asumsikan nilai minimum awalnya elemen pertama array A */
        for (int i = 1; i < A.length; i++) {
            /* Pencarian nilai maksimum dilakukan di sini dengan membandingkan 
            nilai maksimum dengan elemen berikutnya dalam array */
            if(A[i] > maks)
            {
                maks = A[i];
            }
        }
        for (int i = 1; i < A.length; i++) {
            /* Pencarian nilai minimum dilakukan di sini dengan membandingkan 
            nilai maksimum dengan elemen berikutnya dalam array */
            if(A[i] < min)
            {
                min = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            /* Lakukan penjumlahan elemen-elemen array A */
            jumlah = jumlah + A[i];
        }
        /* Tampilkan nilai maksimum, minimum, dan rata-rata data dari array */
        System.out.println("");
        System.out.println("Angka tertinggi : " + maks);
        System.out.println("Angka terendah : " + min);
        System.out.println("Rata-rata : " + (jumlah/A.length));
    }

}
