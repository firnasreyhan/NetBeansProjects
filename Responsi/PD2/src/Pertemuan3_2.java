/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
class Kucing {

    String nama;
    Kucing ibu;
}

public class Pertemuan3_2 {

    public static void traverse(Kucing kucing) {
        while (kucing != null) {
            System.out.println(kucing.nama);
            kucing = kucing.ibu;
        }
    }

    public static void addAncestor(Kucing kucing, String ancestorName) {
        while (kucing.ibu != null) {
            kucing = kucing.ibu;
        }
        kucing.ibu = new Kucing();
        kucing.ibu.nama = ancestorName;
    }

    public static void main(String[] args) {
        Kucing shadowCat = new Kucing();
        shadowCat.nama = "Amanda";
        addAncestor(shadowCat, "Betty"); //shadowcat.ibu.nama
        addAncestor(shadowCat, "Cindy"); //shadowcat.ibu.ibu.nama
        traverse(shadowCat);
    }
}
