
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
class Antrian {

    int NoAntrian;
    Antrian next;
    Antrian prev;

    public Antrian(int NoAntrian) {
        this.NoAntrian = NoAntrian;
        this.next = null;
        this.prev = null;
    }
}

public class StackQueue {

    Antrian head;
    Antrian tail;

    void push(Antrian new_node) {
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
        Antrian current = this.head;
        while (current != null) {
            System.out.println(current.NoAntrian + " ");
            current = current.next;
        }
        System.out.println("");
    }

    Antrian queue_pop() {
        Antrian taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = head;
            head = null;
            tail = null;
        } else {
            taken = head;
            head = head.next;
        }
        return taken;
    }

    Antrian stack_pop() {
        Antrian taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = tail;
            this.head = null;
            this.tail = null;
        } else {
            taken = tail;
            tail.prev.next = null;
            tail = tail.prev;
        }
        return taken;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackQueue antrian = new StackQueue();
        int pilih, nomor;
        String ulang;
        nomor = 0;
        do {
            ulang = "t";
            System.out.println("===== Menu =====");
            System.out.println("1. Ambil nomor antrian");
            System.out.println("2. Panggil nomor antrian");
            System.out.println("3. Lihat nomor antrian");
            System.out.println("================");
            do {
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
            } while (pilih < 1 || pilih > 3);

            switch (pilih) {
                case 1:
                    System.out.println("================");
                    nomor++;
                    System.out.println("Anda mendapat antrian nomor : " + nomor);
                    antrian.push(new Antrian(nomor));
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 2:
                    if (antrian.head != null && antrian.tail != null) {
                        System.out.println("================");
                        System.out.println("1. Panggil dari depan (Queue)");
                        System.out.println("2. Panggil dari belakang (Stack)");
                        System.out.println("================");
                        do {
                            System.out.print("Pilih : ");
                            pilih = sc.nextInt();
                        } while (pilih < 1 || pilih > 2);
                        if (pilih == 1) {
                            System.out.println("Nomor antrian yang dipanggil : " + antrian.queue_pop().NoAntrian);
                        } else {
                            System.out.println("Nomor antrian yang dipanggil : " + antrian.stack_pop().NoAntrian);
                        }
                    } else {
                        System.out.println("================");
                        System.out.println("Antrian kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 3:
                    if (antrian.head != null && antrian.tail != null) {
                        System.out.println("================");
                        antrian.print();
                    } else {
                        System.out.println("================");
                        System.out.println("Antrian kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
            }
        } while (ulang.equalsIgnoreCase("y"));
    }
}
