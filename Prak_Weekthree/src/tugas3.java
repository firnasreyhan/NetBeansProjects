/**
 *
 * @author USER
 */
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int HargaBarang, JumlahBeli, Diskon, HargaDiskon, TotalUang, Sisa, Total;
        
        System.out.print("Harga Barang\t = Rp ");
        HargaBarang=input.nextInt();
        System.out.print("Jumlah Beli\t = ");
        JumlahBeli=input.nextInt();
        System.out.print("Diskon(%)\t = ");
        Diskon=input.nextInt();
        HargaDiskon = (Diskon*HargaBarang*JumlahBeli)/100;
        System.out.println("Diskon(Rp)\t = Rp "+ HargaDiskon);
        Total = (HargaBarang*JumlahBeli) - HargaDiskon;
        System.out.println("");
        System.out.println("Total\t\t = Rp " + Total);
        System.out.println("");
        System.out.print("Bayar\t\t = Rp ");
        TotalUang=input.nextInt();
        Sisa= TotalUang-Total;
        System.out.println("Kembalian\t = Rp "+Sisa);
    }
   
}