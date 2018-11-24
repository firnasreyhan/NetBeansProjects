
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
public class LinkedList_QuickSort {

    static Mahasiswa terdepan;
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml_data, nrp;
        String nama;

        System.out.print("Masukkan jumlah data : ");
        jml_data = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < jml_data; i++) {
            System.out.print("Masukkan NRP\t: ");
            nrp = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Nama\t: ");
            nama = sc.nextLine();
            push(nrp, nama);
        }
        System.out.println("\n=== Data asli ===");
        show();
//        System.out.println("=== Setelah data paling depan dihapus ===");
//        removeFirst();
//        show();
//        System.out.println("=== Setelah data paling belakang dihapus ===");
//        removeLast();
//        show();
//        System.out.println("=== Setalah pengurutan data dengan bubble sort ===");
//        show();
    }

    public static void show() {
        Mahasiswa mahasiswaBaru = terdepan;
        while (mahasiswaBaru != null) {
            System.out.println(mahasiswaBaru.nrp + "\t" + mahasiswaBaru.name);
            mahasiswaBaru = mahasiswaBaru.next;
        }
        System.out.println();
    }

    public static void removeFirst() {
        if (terdepan != null) {
            if (terdepan.next == null) {
                terdepan = null;
            } else {
                terdepan = terdepan.next;
            }
        }
        size--;
    }

    public static void push(int nrp, String nama) {
        Mahasiswa mahasiswaBaru = new Mahasiswa();
        mahasiswaBaru.nrp = nrp;
        mahasiswaBaru.name = nama;
        if (terdepan != null) {
            Mahasiswa depan = terdepan;
            while (depan.next != null) {
                depan = depan.next;
            }
            depan.next = mahasiswaBaru;
        } else {
            terdepan = mahasiswaBaru;
        }
        size++;
    }

    public static void removeLast() {
        if (terdepan != null) {
            if (terdepan.next != null) {
                Mahasiswa belakang = terdepan;
                while (belakang.next.next != null) {
                    belakang = belakang.next;
                }
                belakang.next = null;
            } else {
                terdepan = null;
            }
        }
        size--;
    }

    public static Mahasiswa getTail(Mahasiswa node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
}
