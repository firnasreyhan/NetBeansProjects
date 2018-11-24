
/**
 *
 * @author Rey
 */
public class LinkedListNode {

    LinkedListNode next;
    LinkedListNode prev;
    String name;

    LinkedListNode(String new_data) {
        this.name = new_data;
        this.prev = null;
        this.next = null;
    }

    void set_prev(LinkedListNode other) {
        this.prev = other;
        if (other != null) {
            other.next = this;
        }
    }

    void set_next(LinkedListNode other) {
        this.next = other;
        if (other != null) {
            other.next = this;
        }
    }
}
