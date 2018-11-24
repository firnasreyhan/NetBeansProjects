
import java.util.Random;
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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;
        int rand;
        do {
            LinkedList ls = new LinkedList();
            for (int i = 0; i < 20; i++) {
                do {
                    rand = new Random().nextInt(100) + 1;
                } while (ls.find_node_by_data(rand));
                ls.insert(new LinkedListNode(rand));
            }
            System.out.println("===== PROGRAM PENGACAKAN ANGKA =====");
            System.out.println("Data acak sebelum diurutkan : ");
            ls.print();
            System.out.println("Data acak setelah diurutkan : ");
            ls.bubbleSortList();
            ls.print();
            do {
                System.out.print("Acak data lagi?(Y/T) ");
                ulang = sc.next();
            } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
            System.out.println("");
        } while (ulang.equalsIgnoreCase("y"));
    }
}
