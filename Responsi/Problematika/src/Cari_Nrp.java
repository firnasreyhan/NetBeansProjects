
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
public class Cari_Nrp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nrp, angkatan, prodi;
        int urutan;
        do {
            System.out.print("Masukkan NRP : ");
            nrp = sc.nextLine();
        } while (nrp.length() != 9);

        angkatan = nrp.substring(0, 2);
        prodi = nrp.substring(3, 6);
        urutan = Integer.parseInt(nrp.substring(6, 9));
        System.out.println("-------------------------------------------------");
        if (prodi.equals("111") || prodi.equals("211") || prodi.equals("113") || prodi.equals("122")) {
            System.out.println("Angkatan\t: 20" + angkatan);
            if (prodi.equals("111")) {
                System.out.println("Jenjang\t\t: S1");
                System.out.println("Prodi\t\t: TI");
            } else if (prodi.equals("211")) {
                System.out.println("Jenjang\t\t: S1");
                System.out.println("Prodi\t\t: DKV");
            } else if (prodi.equals("113")) {
                System.out.println("Jenjang\t\t: S1");
                System.out.println("Prodi\t\t: SI");
            } else if (prodi.equals("122")) {
                System.out.println("Jenjang\t\t: D3");
                System.out.println("Prodi\t\t: MI");
            }
            System.out.println("No. Urut\t: " + urutan);
        } else {
            System.out.println("NRP Salah!");
        }
    }
}
