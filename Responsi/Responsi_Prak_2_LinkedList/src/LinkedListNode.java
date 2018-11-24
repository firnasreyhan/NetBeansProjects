/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class LinkedListNode {
    LinkedListNode next;
    LinkedListNode prev;
    int angka;
    
    LinkedListNode(int angka) {
        this.angka = angka;
        this.next = null;
        this.prev = null;
    }
}
