/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_array;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class CRUD_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = new String[5];
        int pilih_menu, index;
        char ulang;

        nama[0] = "Muhammad";
        nama[1] = "Reyhan";
        nama[2] = "Firnas";
        nama[3] = "Adani";

        index = 0;

        do {
            ulang = 't';

            for (int i = 0; i < nama.length; i++) {
                if (nama[i] != null) {
                    System.out.println((i + 1) + ". " + nama[i]);
                }
            }
            System.out.println("");

            System.out.println("===== Menu =====");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("================");
            System.out.print("Pilih : ");
            pilih_menu = sc.nextInt();

            System.out.println("");
            switch (pilih_menu) {
                case 1:
                    if (index - 1 < nama.length) {
                        for (int i = 0; i < nama.length; i++) {
                            if (nama[i] == null) {
                                index = i;
                                break;
                            }
                        }
                        sc.nextLine();
                        System.out.print("Masukkan nama : ");
                        nama[index] = sc.nextLine();
                        System.out.println("================");
                    } else {
                        System.out.println("Array sudah penuh!");
                    }
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 2:
                    do {
                        System.out.print("Pilih data : ");
                        index = sc.nextInt();
                        System.out.println("================");
                        sc.nextLine();
                        if ((index - 1) < nama.length) {
                            System.out.print("Masukkan nama : ");
                            nama[(index - 1)] = sc.nextLine();
                            System.out.println("Data berhasil dirubah");
                        } else {
                            System.out.println("Inputan melebihi array!");
                        }
                    } while ((index - 1) >= nama.length);
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 3:
                    do {
                        System.out.print("Pilih data : ");
                        index = sc.nextInt();
                        System.out.println("================");
                        sc.nextLine();
                        if ((index - 1) < nama.length) {
                            nama[(index - 1)] = null;
                            System.out.println("Data berhasil dihapus");
                            for (int i = (index - 1); i < nama.length - 1; i++) {
                                nama[i] = nama[i + 1];
                            }
                        } else {
                            System.out.println("Inputan melebihi array!");
                        }
                    } while ((index - 1) >= nama.length);
                    System.out.print("Kembali ke menu awal? (Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
            }
        } while (ulang == 'y' || ulang == 'Y');
    }

}
