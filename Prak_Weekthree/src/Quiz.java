
import java.text.DecimalFormat;
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
public class Quiz {
    static int pilihan, jumlah;
    static double hasil, diskon, bayar;
    static DecimalFormat df = new DecimalFormat("#.##");
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("---------( Menu MekDi )---------");
        System.out.println("Nama\t\t| Harga\t| Diskon");
        System.out.println("--------------------------------");
        System.out.println("1. Triple Beef\t 30000\t (   15% )");
        System.out.println("2. Double Beef\t 20000\t ( 12,5% )");
        System.out.println("3. Single Beef\t 10000\t (   10% )");
        System.out.println("--------------------------------");
        System.out.print("Pilih\t\t: ");
        pilihan = input.nextInt();
        System.out.println("");
        
        switch(pilihan)
        {
            case 1:
                kasir(30000, 0.15);
                break;
            case 2:
                kasir(20000, 0.125);
                break;
            case 3:
                kasir(10000, 0.1);
                break;
            default:
                System.out.println("Inputan salah!");
        }
    }
    
    public static void kasir(int harga, double dskn)
    {
        System.out.print("Jumlah Beli\t: ");
        jumlah = input.nextInt();
        hasil = harga * jumlah;
        System.out.println("");
        System.out.println("Total\t\t: " + df.format(hasil));
        diskon = hasil * dskn;
        System.out.println("Diskon\t\t: " + df.format(diskon));
        bayar = hasil - diskon;
        System.out.println("Bayar\t\t: " + df.format(bayar));
    }
}
