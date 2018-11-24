
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
class Mahasiswa {

    int NoRegistrasi;
    String nama;
    double N_Akhir;
    Mahasiswa next;
    Mahasiswa prev;

    public Mahasiswa(int NoRegistrasi, String nama, double N_Akhir) {
        this.NoRegistrasi = NoRegistrasi;
        this.nama = nama;
        this.N_Akhir = N_Akhir;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedList {

    Mahasiswa head;
    Mahasiswa tail;

    void push(Mahasiswa new_node) {
        if (this.head == null && this.tail == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    void print() {
        Mahasiswa current = this.head;
        while (current != null) {
            System.out.println(current.NoRegistrasi + " | " + current.nama + " | " + current.N_Akhir);
            current = current.next;
        }
        System.out.println("");
    }

    boolean find_node_by_data(int NoRegistrasi) {
        Mahasiswa current = this.head;
        while (current != null) {
            if (current.NoRegistrasi == NoRegistrasi) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void delete(int NoRegistrasi) {
        Mahasiswa deleted = head;
        while (deleted.NoRegistrasi != NoRegistrasi) {
            deleted = deleted.next;
        }
        if (deleted != null && this.head != null) {
            if (this.head == this.tail && deleted == this.head) {
                this.head = null;
                this.tail = null;
            } else if (deleted == this.head) {
                Mahasiswa new_head = this.head.next;
                this.head.next = null;
                new_head.prev = null;
                this.head = new_head;
            } else if (deleted == this.tail) {
                Mahasiswa new_tail = this.tail.prev;
                this.tail.prev = null;
                new_tail.next = null;
                this.tail = new_tail;
            } else {
                Mahasiswa deleted_prev = deleted.prev;
                Mahasiswa deleted_next = deleted.next;
                deleted.prev = null;
                deleted.next = null;
                deleted_prev.next = deleted_next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ls = new LinkedList();
        int NoRegistrasi, pilih;
        String nama, ulang_antrian, ulang;
        double N_Akhir;
        do {
            ulang = "t";
            ulang_antrian = "y";
            System.out.println("===== Menu =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
            System.out.println("================");
            do {
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
            } while (pilih < 1 || pilih > 3);

            switch (pilih) {
                case 1:
                    do {
                        System.out.println("================");
                        do {
                            System.out.print("No. Registrasi\t: ");
                            NoRegistrasi = sc.nextInt();
                            if (ls.find_node_by_data(NoRegistrasi)) {
                                System.out.println("No. Registrasi sudah ada!");
                            }
                        } while (ls.find_node_by_data(NoRegistrasi));
                        System.out.print("Nama\t\t: ");
                        nama = sc.next();
                        System.out.print("Nilai Akhir\t: ");
                        N_Akhir = sc.nextDouble();
                        ls.push(new Mahasiswa(NoRegistrasi, nama, N_Akhir));
                        do {
                            System.out.print("Tambah data lagi? (Y/T) ");
                            ulang_antrian = sc.next();
                        } while (!ulang_antrian.equalsIgnoreCase("y") && !ulang_antrian.equalsIgnoreCase("t"));
                    } while (ulang_antrian.equalsIgnoreCase("y"));
                    break;
                case 2:
                    if (ls.head != null && ls.tail != null) {
                        System.out.println("================");
                        ls.print();
                    } else {
                        System.out.println("================");
                        System.out.println("Data kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 3:
                    do {
                        ulang_antrian = "t";
                        if (ls.head != null && ls.tail != null) {
                            System.out.println("================");
                            System.out.print("No. Registrasi\t: ");
                            NoRegistrasi = sc.nextInt();
                            if (ls.find_node_by_data(NoRegistrasi)) {
                                ls.delete(NoRegistrasi);
                                System.out.println("Data berhasil dihapus!");
                            } else {
                                System.out.println("Data tidak ada!");
                            }
                            do {
                                System.out.print("Hapus data lagi? (Y/T) ");
                                ulang_antrian = sc.next();
                            } while (!ulang_antrian.equalsIgnoreCase("y") && !ulang_antrian.equalsIgnoreCase("t"));
                        } else {
                            System.out.println("================");
                            System.out.println("Data kosong!");
                        }
                    } while (ulang_antrian.equalsIgnoreCase("y"));
                    break;
            }
        } while (ulang.equalsIgnoreCase("y") || ulang_antrian.equalsIgnoreCase("t"));
    }
}
