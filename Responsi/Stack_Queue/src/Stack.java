/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Stack {

    int size;
    int top;
    String[] data;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.data = new String[size];
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == (size - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            String a = data[top];
            top--;
            System.out.println("-------------------------------------");
            System.out.println("Data yang di Pop : " + a);
        } else {
            System.out.println("Isi stack kosong!");
        }
    }

    public void tampilkan() {
        System.out.println("Isi stack : ");
        for (int i = 0; i <= top; i++) {
            System.out.println((i + 1) + ". " + data[i]);
        }
    }

    public void clearStack() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack barhasil dikosongkan!");
        } else {
            System.out.println("Isi stack kosong!");
        }
    }

    public static void main(String[] args) {
        Stack tumpuk = new Stack(5);
        tumpuk.push("Reyhan");
        tumpuk.push("Firnas");
        tumpuk.push("Adani");
        tumpuk.push("Budi");
        tumpuk.push("Bambang");

        tumpuk.tampilkan();
        tumpuk.pop();
        tumpuk.tampilkan();
    }
}
