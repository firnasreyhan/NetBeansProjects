
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
public class Max_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("1. Menu");
            System.out.println("2. Menu");
            System.out.println("3. Menu");
            System.out.println("4. Menu");
            System.out.println("5. Menu");
            System.out.println("6. Menu");
            System.out.println("7. Menu");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
        } while (pilih < 1 || pilih > 7);
    }
}
