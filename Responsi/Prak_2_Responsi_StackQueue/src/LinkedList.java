
import java.util.HashSet;

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

    void print() {
        LinkedListNode current = this.head;
        while (current != null) {
            System.out.print(current.soal + " ");
            current = current.next;
        }
        System.out.println("");
    }

    void push(LinkedListNode new_node) {
        if (this.head == null && this.tail == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    LinkedListNode qpop() {
        LinkedListNode taken = null;
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

    LinkedListNode spop() {
        LinkedListNode taken = null;
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
}
