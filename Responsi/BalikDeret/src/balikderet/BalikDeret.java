/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balikderet;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class BalikDeret {

    /**
     * @param args the command line arguments
     */
    //A method for reverse
    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            //Method is calling itself: recursion
            reverseMethod(number / 10);
        }
    }

    public static void main(String args[]) {
        int num = 0;
        System.out.print("Masukan Beberapa Deret Angka  : ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.print("Deret Angka Setelah Pembalikan : ");
        reverseMethod(num);
        System.out.println();
    }

}
