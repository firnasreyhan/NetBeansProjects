/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yohan
 */
public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;

    LinkedList() {
        this.head = null;
        this.tail = null;

    }

    void print() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.soal + " ");
            current = current.next;
        }
        System.out.println();
    }

    void push(LinkedListNode new_node) {
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.set_next(new_node);
            tail = new_node;

        }
    }

    void insert(LinkedListNode new_node) {
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else if (new_node.key <= this.head.key) {
            head.set_prev(new_node);
            head = new_node;
        } else if (new_node.key >= this.tail.key) {
            tail.set_next(new_node);
            tail = new_node;
        } else {
            LinkedListNode position = head;
            while (position.key < new_node.key) {
                position = position.next;
            }
            LinkedListNode previous_position = position.prev;
            new_node.set_prev(previous_position);
            new_node.set_next(position);

        }
    }

    boolean find_node_by_data(int key) {
        LinkedListNode current = this.head;
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void delete(LinkedListNode deleted) {
        if (deleted != null && this.head != null) {
            if (this.head == this.tail && deleted == this.head) {
                this.head = null;
                this.tail = null;
            } else if (deleted == this.head) {
                LinkedListNode new_head = this.head.next;
                this.head.set_next(null);
                new_head.set_prev(null);
                this.head = new_head;
            } else if (deleted == this.tail) {
                LinkedListNode new_tail = this.tail.prev;
                this.tail.set_prev(null);
                new_tail.set_next(null);
                this.tail = new_tail;
            } else {
                LinkedListNode deleted_prev = deleted.prev;
                LinkedListNode deleted_next = deleted.next;
                deleted.set_prev(null);
                deleted.set_next(null);
                deleted_prev.set_next(deleted_next);
            }
        }
    }
}
