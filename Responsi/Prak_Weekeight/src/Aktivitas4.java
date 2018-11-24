
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
public class Aktivitas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nrp, kelas;
        
        System.out.print("Nama\t: ");
        nama = sc.nextLine();
        System.out.print("NRP\t: ");
        nrp = sc.next();
        System.out.print("Kelas\t: ");
        kelas = sc.next();
        System.out.println("");
        
        tampil(nama, nrp, kelas);
    }
    
    public static void tampil(String nama_p, String nrp_p, String kelas_p)
    {
        System.out.println("Nama\t: " + nama_p);
        System.out.println("NRP\t: " + nrp_p);
        System.out.println("Kelas\t: " + kelas_p);
    }
}
