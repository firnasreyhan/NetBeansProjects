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
    
    LinkedList(){
        this.head = null;
        this.tail = null;
        
    }
    
    /* First set a Node named current into head
    * while current is not null, print current.data, set current = current.next
    * print end of line
     */
    
    void print(){ //set head baru
        LinkedListNode current = head;
        while(current != null){
            System.out.print(current.data + " ");
        current = current.next; //current yang baru = current yang di depannya
        
        }
        System.out.println();
    }
    
    void push(LinkedListNode new_node){ //menaruh data yang di paling belakang
        if(head == null){ //mengecek apakah head == null
            head = new_node; //jika head == null mak head di isi oleh new_node
            tail = new_node;
        }
        else{
            /*tail.next = new_node; //cara pertama //tail.next = new_node
            new_node.prev = tail; //membuat new_node diisi tail
            tail = new_node;*/ //tail di isi node baru
            
            tail.set_next(new_node); //hemat baris
            tail = new_node;
            
        }
    }
    
    /* if linked list is empty, set new_node as head and tail
    * if new_node < head, make it a new head
    * if new_node > tail, make it a new tail
    * otherwise traverse to the current position, and put new_node there
     */
    
    void insert(LinkedListNode new_node){
        if(head == null){
            head = new_node;
            tail = new_node;
        }
        else if(new_node.data <= this.head.data){
            head.set_prev(new_node);
            head = new_node;
        }
        else if(new_node.data >= this.tail.data){
            tail.set_next(new_node);
            tail = new_node;
        }
        
        else{
            LinkedListNode position = head;
            while(position.data < new_node.data){
                position = position.next;
            }
            LinkedListNode previous_position = position.prev;
            new_node.set_prev(previous_position);
            new_node.set_next(position);
            
        }
    }
    
    boolean find_node_by_data(int data){
        LinkedListNode current = this.head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    LinkedListNode lastNode(LinkedListNode node)
    {
        while (node.next != null ) {            
            node = node.next;
        }
        return node;
    }
    
    void delete(LinkedListNode deleted){
        if(deleted != null && this.head != null){
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
    
    public void bubbleSortList()
    {
        int swapped;
        LinkedListNode start = head;
        int temp;
        if(start == null) System.out.println("Data Kosong");
        
        do {            
            swapped = 0;
            start = head;
            
            while(start.next != null)
            {
                if (start.data > start.next.data) {
                    temp = start.data;
                    start.data = start.next.data;
                    start.next.data = temp;
                    swapped = 1;
                    
                }
                start = start.next;
            }
            
        } while (swapped == 1);
        
    }
    
    public void quickSort(LinkedListNode node)
    {
        LinkedListNode last = lastNode(node);
        
        _quickSort(node, last);
    }
    
    void _quickSort(LinkedListNode l, LinkedListNode h)
    {
        if(h != null && l != h && l != h.next)
        {
            LinkedListNode temp = partition(l, h);
            _quickSort(l, temp.prev);
            _quickSort(temp.next, h);
        }
    }
    
    LinkedListNode partition(LinkedListNode l, LinkedListNode h)
    {
        int x = h.data;
        LinkedListNode i = l.prev;
        
        for (LinkedListNode j=l; j != h; j=j.next) {
            if (j.data <= x) {
                i = (i == null) ? l : i.next;
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
        i = (i==null) ? l : i.next;
        int temp = i.data;
        i.data = h.data;
        h.data = temp;
        return i;
    }
}
