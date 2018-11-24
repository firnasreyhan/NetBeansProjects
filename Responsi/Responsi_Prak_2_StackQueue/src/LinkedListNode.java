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
    int number;
    String name;

    LinkedListNode(int number, String name) {
        this.number = number;
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
