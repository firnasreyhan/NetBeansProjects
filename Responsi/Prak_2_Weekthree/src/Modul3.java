
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yohan
 */
public class Modul3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data, jml_data;
        LinkedList a = new LinkedList();

        System.out.print("Masukkan jumlah data : ");
        jml_data = sc.nextInt();

        for (int i = 0; i < jml_data; i++) {
            System.out.print("Masukkan data : ");
            data = sc.nextInt();
            a.push(new LinkedListNode(data));
        }
        System.out.println("");
        System.out.println("=== Data Awal ===");
        a.print();
        System.out.println("=== Bubble Sort ===");
        a.bubbleSortList();
        a.print();
        System.out.println("=== Quick Sort ===");
        a.quickSort(a.head);
        a.print();
    }

}
