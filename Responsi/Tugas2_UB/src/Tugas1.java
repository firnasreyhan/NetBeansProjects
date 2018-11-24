
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
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil;
        double h_kel, h_luas, a, b, r;

        System.out.println("Menu :");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda : ");
        pil = sc.nextInt();

        switch (pil) {
            case 1:
                System.out.print("Masukkan a : ");
                a = sc.nextDouble();
                System.out.print("Masukkan b : ");
                b = sc.nextDouble();
                h_kel = 2 * (a + b);
                h_luas = a * b;
                System.out.println("\nKeliling persegi panjang : " + h_kel);
                System.out.println("Luas persegi panjang : " + h_luas);
                break;
            case 2:
                System.out.print("Masukkan r : ");
                r = sc.nextDouble();
                h_kel = (2 * r) * 3.14;
                h_luas = 3.14 * Math.pow(r, 2);
                System.out.println("\nKeliling lingkaran : " + h_kel);
                System.out.println("Luas lingkaran : " + h_luas);
                break;
            case 3:
                System.out.print("Masukkan a : ");
                a = sc.nextDouble();
                System.out.print("Masukkan b : ");
                b = sc.nextDouble();
                System.out.print("Masukkan r : ");
                r = sc.nextDouble();
                h_kel = a + b + r;
                h_luas = (a * b)/2;
                System.out.println("\nKeliling segitiga : " + h_kel);
                System.out.println("Luas segitiga : " + h_luas);
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
        }
    }
}
