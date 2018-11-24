
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
public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_barang, diskon, jumlah_beli, jumlah_pembayaran, kembalian, total;
        
        System.out.print("Harga barang\t\t: ");
        harga_barang = input.nextInt();
        System.out.print("Jumlah\t\t\t: ");
        jumlah_beli = input.nextInt();
        System.out.print("Diskon\t\t\t: ");
        diskon = input.nextInt();
        
        System.out.println("=================================");
        total = (harga_barang * jumlah_beli) - diskon;
        System.out.println("Total\t\t\t: " + total);
        System.out.println("=================================");
        
        System.out.print("Jumlah pembayaran\t: ");
        jumlah_pembayaran = input.nextInt();
        
        kembalian = jumlah_pembayaran - total;
        System.out.println("Kembalian\t\t: " + kembalian);
    }
}
