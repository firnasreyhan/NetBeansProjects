
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
public class Contoh_HashTable {

    public static void main(String[] args) {
        Hashtable<String, String> urutan = new Hashtable<String, String>();
        urutan.put("A1", "Nasi Goreng");
        urutan.put("A2", "Mie Ayam");
        urutan.put("A3", "Es Teler");
        urutan.put("A4", "Es Teh");
        urutan.put("A5", "Es Campur");
        urutan.put("A6", "Lalapan");
        urutan.put("A7", "Tahu Campur");
        urutan.put("A8", "Nasi Pecel");

        System.out.println(urutan);
        System.out.println(urutan.get("A4"));
        urutan.remove("A1");
        System.out.println(urutan.isEmpty());
        System.out.println(urutan.size());
    }
}
