/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
class Orang {

    public String name;
    public Orang next;
}

public class Pertemuan4_1 {

    static Orang terdepan;

    public static void main(String[] args) {
        addFirst("Betty"); // Betty
        addFirst("Amanda");  // Amanda Betty
        addLast("Cindy"); // Amanda Betty Cindy
        addLast("Donna"); // Amanda Betty Cindy Donna
        removeLast(); // Amanda Betty Cindy
        removeFirst(); // Betty Cindy
        addLast("Edelyn");
        show(); // Betty Cindy Edelyn
        addAfter("Betty", "Chika");
        show(); // Betty Chika Cindy Edelyn
        removeAfter("Chika");
        show(); // Betty Chika Edelyn
    }

    public static void show() {
        Orang orang = terdepan;
        while (orang != null) {
            System.out.print(orang.name + " ");
            orang = orang.next;
        }
        System.out.println();
    }

    public static void addFirst(String nama) {
        Orang orang = new Orang();
        orang.name = nama;
        orang.next = terdepan;
        terdepan = orang;
    }

    public static void removeFirst() {
        if (terdepan != null) {
            if (terdepan.next == null) {
                terdepan = null;
            } else {
                terdepan = terdepan.next;
            }
        }
    }

    public static void addLast(String nama) {
        Orang orang = new Orang();
        orang.name = nama;
        if (terdepan != null) {
            Orang depan = terdepan;
            while (depan.next != null) {
                depan = depan.next;
            }
            depan.next = orang;
        } else {
            terdepan = orang;
        }
    }

    public static void removeLast() {
        if (terdepan != null) {
            if (terdepan.next != null) {
                Orang belakang = terdepan;
                while (belakang.next.next != null) {
                    belakang = belakang.next;
                }
                belakang.next = null;
            } else {
                terdepan = null;
            }
        }
    }

    public static void addAfter(String nama, String namaBaru) {
        if (terdepan != null) {
            Orang baru = new Orang();
            baru.name = namaBaru;

            Orang geser, depan = terdepan;
            while (depan.name != nama && depan.next != null) {
                depan = depan.next;
            }

            if (depan.name.equalsIgnoreCase(nama)) {
                geser = depan.next;
                depan.next = baru;
                baru.next = geser;
            } else {
                System.out.println("Orang bernama " + nama + " tidak ada!");
            }
        }
    }

    public static void removeAfter(String nama) {
        if (terdepan != null) {
            Orang geser, depan = terdepan;
            while (depan.name != nama && depan.next != null) {
                depan = depan.next;
            }

            if (depan.next != null) {
                geser = depan.next.next;
                depan.next = geser;
            } else {
                System.out.println("Orang bernama " + nama + " adalah orang terakhir!");
            }
        }
    }
}
