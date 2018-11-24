/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;

    LinkedList() {
        this.head = null;
        this.tail = null;

    }

    public void print() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.angka + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(LinkedListNode new_node) {
        if (this.head == null && this.tail == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    public void bubbleSortList() {
        int tukar, temp;
        LinkedListNode awal = head;
        if (awal == null) {
            System.out.println("Data Kosong");
        }
        do {
            tukar = 0;
            awal = head;

            while (awal.next != null) {
                if (awal.angka > awal.next.angka) {
                    temp = awal.angka;
                    awal.angka = awal.next.angka;
                    awal.next.angka = temp;
                    tukar = 1;

                }
                awal = awal.next;
            }
        } while (tukar == 1);
    }

    boolean find_node_by_data(int angka) {
        LinkedListNode current = this.head;
        while (current != null) {
            if (current.angka == angka) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
