/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskon;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class DiskonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diskon dskn = new Diskon();
        int hrg_awal, hrg_diskon, hrg_bayar;
        
        System.out.println("=== Program Toko ===");
        System.out.print("Masukkan nama : ");
        dskn.nama = sc.nextLine();
        System.out.print("Masukkan harga barang : ");
        dskn.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan jumlah : ");
        dskn.jumlah = sc.nextInt();
        
        hrg_awal = dskn.hitungHargaTotal();
        hrg_diskon = dskn.hitungDiskon(hrg_awal);
        hrg_bayar = dskn.hitungHargaBayar(hrg_awal);
        
        System.out.println("====================");
        System.out.println("Harga awal : " + hrg_awal);
        System.out.println("Harga diskon : " + hrg_diskon);
        System.out.println("Harga bayar : " + hrg_bayar);
    }
    
}
