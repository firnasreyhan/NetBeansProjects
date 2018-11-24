
import java.util.Hashtable;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class MataKuliah {
    public static void main(String[] args) {
        Hashtable<String, String> mata_kuliah = new Hashtable<String, String>();
        mata_kuliah.put("MK001", "PRAKTIKUM SISTEM OPERASI");
        mata_kuliah.put("MK002", "SISTEM OPERASI");
        mata_kuliah.put("MK003", "PRAKTIKUM PEMROGRAMAN DASAR II");
        mata_kuliah.put("MK004", "PEMROGRAMAN DASAR II");
        mata_kuliah.put("MK005", "ANALISA DAN PERANCANGAN SISTEM INFORMASI");
        
        System.out.println(mata_kuliah);
        System.out.println("");
        mata_kuliah.remove("MK003");
        System.out.println(mata_kuliah);
    }
}
