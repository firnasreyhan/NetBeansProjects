
/**
 *
 * @author Rey
 */
public class LinkedListNode {
    LinkedListNode next;
    LinkedListNode prev;
    int key;
    String soal;
    int jawaban;
    
    LinkedListNode(int key, String soal, int jawaban) {
        this.key = key;
        this.soal = soal;
        this.jawaban = jawaban;
        this.next = null;
        this.prev = null;
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
            other.prev = this;
        }
    }
}
