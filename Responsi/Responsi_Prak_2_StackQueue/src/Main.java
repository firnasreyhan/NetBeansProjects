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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList a = new LinkedList();
        int pilih, urutan;
        String nama, ulang_antrian, ulang;
        urutan = 0;
        do {
            ulang = "t";
            ulang_antrian = "y";
            System.out.println("=========== Menu ===========");
            System.out.println("1. Masukkan antrian");
            System.out.println("2. Tampilkan antrian");
            System.out.println("3. Keluarkan antrian (Stack)");
            System.out.println("4. Keluarkan antrian (Queue)");
            System.out.println("============================");
            do {
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
            } while (pilih < 1 || pilih > 4);
            switch (pilih) {
                case 1:
                    do {
                        urutan++;
                        System.out.println("============================");
                        System.out.println("Antrian ke : " + urutan);
                        System.out.print("Masukkan nama : ");
                        nama = sc.next();
                        a.push(new LinkedListNode(urutan, nama));
                        do {
                            System.out.print("Tambah antrian lagi? (Y/T) ");
                            ulang_antrian = sc.next();
                        } while (!ulang_antrian.equalsIgnoreCase("y") && !ulang_antrian.equalsIgnoreCase("t"));
                    } while (ulang_antrian.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("============================");
                    a.print();
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 3:
                    System.out.println("============================");
                    if (a.head != null && a.tail != null) {
                        System.out.println("Nomor antrian yang dikeluarkan : " + a.tail.number);
                        System.out.println("Atas nama : " + a.tail.name);
                        a.spop();
                    } else {
                        System.out.println("Antrian sedang kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 4:
                    System.out.println("============================");
                    if (a.head != null && a.tail != null) {
                        System.out.println("Nomor antrian yang dikeluarkan : " + a.head.number);
                        System.out.println("Atas nama : " + a.head.name);
                        a.qpop();
                    } else {
                        System.out.println("Antrian sedang kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
            }
        } while (ulang.equalsIgnoreCase("y") || ulang_antrian.equalsIgnoreCase("t"));
    }
}
