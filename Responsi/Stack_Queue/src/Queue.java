
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Queue {

    int max, size, front, rear;
    int[] q;

    public Queue(int m) {
        this.max = m;
        create();
    }

    public void create() {
        q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == (max - 1)) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = data;
            size++;
        }
    }

    public int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            data = q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == (max - 1)) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = front;
            while(i != rear) {
                System.out.print(q[i] + "-");
                i = (i + 1) % max;
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah antrian : " + size);
        }
    }
	
    static void menu(){
        System.out.println("pilih menu yang diinginkan : ");
        System.out.println("1. enqueue");
        System.out.println("2. dequeue");
        System.out.println("3. print");
        System.out.println("4. keluar");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil = 0;
        System.out.print("masukkan maksimal data antrian : ");
        int m = input.nextInt();
        Queue qobj = new Queue(m);
        do {
            menu();
            pil = input.nextInt();
            switch(pil){
                case 1:
                    System.out.print("masukan data baru :");
                    int dataIn = input.nextInt();
                    qobj.enqueue(dataIn);
                    break;
                    
                case 2:
                    int dataOut = qobj.dequeue();
                    if(dataOut != 0){
                        System.out.println("data yang terambil : "+dataOut);
                    }
                    break;
                    
                case 3: 
                    qobj.print();
                    break;
            }
        } while(pil != 4);
    }
}