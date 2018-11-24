
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rey
 */
public class BukuAlamat {

    String nama;
    String kelurahan;
    String kecamatan;
    String kodepos;

    public BukuAlamat(String nama, String kelurahan, String kecamatan, String kodepos) {
        this.nama = nama;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.kodepos = kodepos;
    }

    public static void main(String[] args) {
        Hashtable<Integer, BukuAlamat> buku_alamat = new Hashtable<Integer, BukuAlamat>();
        ArrayList<Integer> v;
        int[] a;
        int h = 0;

        buku_alamat.put(1, new BukuAlamat("Reyhan", "Kesatrian", "Blimbing", "65121"));
        buku_alamat.put(2, new BukuAlamat("Firnas", "Purwantoro", "Blimbing", "65122"));
        buku_alamat.put(3, new BukuAlamat("Adani", "Arjowinangun", "Kedungkandang", "65132"));
        buku_alamat.put(4, new BukuAlamat("Yulis", "Tukis", "Kedungkandang", "65133"));
        buku_alamat.put(5, new BukuAlamat("Saiful", "Klojen", "Klojen", "65111"));
        buku_alamat.put(6, new BukuAlamat("Arif", "Samaan", "Klojen", "65112"));
        buku_alamat.put(7, new BukuAlamat("Achmad", "Jatimulyo", "Lowokwaru", "65141"));
        buku_alamat.put(8, new BukuAlamat("Luthfan", "Mojolangu", "Lowokwaru", "65142"));
        buku_alamat.put(9, new BukuAlamat("Aufar", "Bandulan", "Sukun", "65146"));
        buku_alamat.put(10, new BukuAlamat("Hindami", "Mulyorejo", "Sukun", "65147"));

        v = new ArrayList<Integer>(buku_alamat.keySet());
        Collections.sort(v);
        for (int key : v) {
            System.out.println((key) + ". \tNama      : " + buku_alamat.get(key).nama);
            System.out.println("\tKelurahan : " + buku_alamat.get(key).kelurahan);
            System.out.println("\tKecamatan : " + buku_alamat.get(key).kecamatan);
            System.out.println("\tKode Pos  : " + buku_alamat.get(key).kodepos);
        }

        for (int key : v) {
            if (h < 2) {
                if (key % 2 == 1) {
                    buku_alamat.remove(key);
                    h++;
                }
            } else {
                break;
            }
        }

        v = new ArrayList<Integer>(buku_alamat.keySet());
        Collections.sort(v);
        System.out.println("----------------------------------------");
        for (int key : v) {
            System.out.println((key) + ". \tNama      : " + buku_alamat.get(key).nama);
            System.out.println("\tKelurahan : " + buku_alamat.get(key).kelurahan);
            System.out.println("\tKecamatan : " + buku_alamat.get(key).kecamatan);
            System.out.println("\tKode Pos  : " + buku_alamat.get(key).kodepos);
        }
    }
}
