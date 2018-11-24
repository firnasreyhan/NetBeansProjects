/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
import java.util.Scanner;

public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }


    /* First set a Node named current into head
    * while current is not null, print current.data, set current = current.next
    * print end of line
     */
    void print() {
        LinkedListNode current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    /* if LinkedList is empty, set new_node as head and tail
    * if LinkedList is not empty, set tail.next into new_node, set
      new_node.prev into tail, and make new_node a new tail
     */
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

    /* if linked list is empty, set new_node as head and tail
    * if new_node < head, make it a new head
    * if new_node > tail, make it a new tail
    * otherwise traverse to the current position, and put new_node there
     */
    void insert(LinkedListNode new_node) {
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else if (new_node.data <= this.head.data) {
            this.head.set_prev(new_node);
            this.head = new_node;

        } else if (new_node.data >= this.tail.data) {
            this.tail.set_next(new_node);
            this.tail = new_node;

        } else {
            LinkedListNode position = head;
            while (position.data < new_node.data) {
                position = position.next;

            }
            LinkedListNode previous_position = position.prev;
            new_node.set_prev(previous_position);
            new_node.set_next(position);

        }
    }

    LinkedListNode find_node_by_data(int data) {
        LinkedListNode current = this.head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    LinkedListNode lastNode(LinkedListNode node) {
        while (node.next != null) {
            node = node.next;
        }
//        System.out.println("last : " + node.data);
        return node;
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

    //queue
    /* declare a node named taken
    * if LinkedList is empty, set taken into null
    * if linkedList consists only one node, set taken = head, set both head 
    and tail into null
    * if linkedList consists of two or more nodes, set taken = head, 
    set head.next into new head, cut off all the link between taken and head
    * return taken
     */
    //queue first in first out
    LinkedListNode qpop() {
        LinkedListNode taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = head;
            this.head = null;
            this.tail = null;
        } else {
            taken = head;
            head = head.next;

        }
        return taken;
    }

    /* declare a node named taken
    * if LinkedList is empty, set taken into null
    * if linkedList consists only one node, set taken = tail, set both head 
    and tail into null
    * if linkedList consists of two or more nodes, set taken = tail, 
    set tail.prev into new tail, cut off all the link between taken and tail
    * return taken
     */
    // stack = last in first out
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
            this.tail.prev.set_next(null);
            //tail.prev.next = null;
            this.tail = tail.prev;
        }
        return taken;
    }

    //quick sort
    //mengecek nilai pertama dan terakhir
    public void quickSort(LinkedListNode node) {
        LinkedListNode last = lastNode(node);

        _quickSort(node, last);
    }

    void _quickSort(LinkedListNode l, LinkedListNode h) {
        if (h != null && l != h && l != h.next) {
            LinkedListNode temp = partition(l, h);
            _quickSort(l, temp.prev);
            _quickSort(temp.next, h);
        }
    }

    LinkedListNode partition(LinkedListNode l, LinkedListNode h) {
        int x = h.data;
        LinkedListNode i = l.prev;

        for (LinkedListNode j = l; j != h; j = j.next) {
            if (j.data <= x) {
                i = (i == null) ? l : i.next;
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
        i = (i == null) ? l : i.next;
        int temp = i.data;
        i.data = h.data;
        h.data = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList a = new LinkedList();
        int data = 0, bdata = 0, pilih;
        char ulang, ulangpr;
        ulang = 'y';
        ulangpr = 'y';

        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Masukkan Antrian ");
            System.out.println("2. Tampilkan Antrian ");
            System.out.println("3. Keluarkan Antrian dengan Stack ");
            System.out.println("4. Keluarkan Antrian dengan Queue");
            System.out.println("============================================");
            do {
                System.out.print("Pilih proses\t: ");
                pilih = sc.nextInt();
            } while (pilih < 1 || pilih > 4);
            switch (pilih) {
                case 1:
                    do {
                        System.out.print("Masukkan banyak data\t: ");
                        bdata = sc.nextInt();
                        sc.nextLine();
                        System.out.println("-------------------------------");
                        for (int i = 1; i <= bdata; i++) {
                            System.out.print("Masukkan Data ke " + i + "\t: ");
                            data = sc.nextInt();
                            a.push(new LinkedListNode(data));
                        }
                        do {
                            System.out.print("Tambah antrian lagi? (Y / T)\t");
                            ulangpr = sc.next().charAt(0);
                        } while (ulangpr != 't' && ulangpr != 'y');
                    } while (ulangpr == 'y');
                    do {
                        System.out.print("Kembali ke menu awal ? (Y / T)\t");
                        ulang = sc.next().charAt(0);
                    } while (ulang != 'y' && ulang != 't');

                    break;

                case 2:
                    System.out.println("========= Data Antrian =========");
                    a.print();
                    do {
                        System.out.print("Kembali ke menu awal ? (Y / T)");
                        ulang = sc.next().charAt(0);
                    } while (ulang != 'y' && ulang != 't');

                    break;

                case 3:
                    if (a.head != null && a.tail != null) {
                        System.out.println("Antrian yang dihapus adalah : " + a.spop().data);
                    } else {
                        System.out.println("Tidak dapat menghapus data. Antrian Kosong !!");
                    }
                    a.print();
                    do {
                        System.out.print("Kembali ke menu awal ? (Y / T)");
                        ulang = sc.next().charAt(0);
                    } while (ulang != 'y' && ulang != 't');

                    break;

                case 4:
                    if (a.head != null && a.tail != null) {
                        System.out.println("Antrian yang dihapus adalah : " + a.qpop().data);
                    } else {
                        System.out.println("Tidak dapat menghapus data. Antrian Kosong !!");
                    }
                    a.print();
                    do {
                        System.out.print("Kembali ke menu awal ? (Y / T)");
                        ulang = sc.next().charAt(0);
                    } while (ulang != 'y' && ulang != 't');
                    break;
            }
        } while (ulang == 'y' || ulang == 'Y');
//            if (pilih == 1) {
//                System.out.println("================ Data ================ ");
//                a.print();
//                System.out.println("--------------- Stack ----------------");
//                //tambahin kondisi!!!!
//                if (data == 1) {
//                    System.out.println("Data yang di pop : " + a.spop());
//                } else {
//                    System.out.println("data yang di pop : " + a.spop().data);
//                }
//                a.print();
//                do {
//                    System.out.print("Ulangi proses ? (Y / T)");
//                    ulang = sc.next().charAt(0);
//                } while (ulang != 'y' && ulang != 't');
//            } else if (pilih == 2) {
//                System.out.println("================ Data ================ ");
//                a.print();
//                System.out.println("-------------- Queue ----------------");
//                if (bdata == 1) {
//                    System.out.println("data yang di pop : " + a.qpop());
//                } else {
//                    System.out.println("data yang di pop : " + a.qpop().data);
//                    a.print();
//                }
//                System.out.print("Ulangi proses ? (Y / T)");
//                ulang = sc.next().charAt(0);
//
//            } else {
//                break;
//            }

//        System.out.println("======== After Quick Sorting ========");
//        a.quickSort(a.head);
//        a.print();
//        LinkedList a = new LinkedList();
//        a.print(); // should show nothing
//        System.out.println(a.qpop()); // should show null
//        System.out.println(a.spop()); // should show null
//        a.push(new LinkedListNode(5));
//        a.push(new LinkedListNode(4));
//        a.print(); // should show "5 4"
//        System.out.println(a.spop().data); // should show "4"
//        a.push(new LinkedListNode(4));
//        System.out.println(a.qpop().data); // should show "5"
//        a.print(); // should show "4"
    }
}
