/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
class kucing {

    String nama;
    kucing ibu;
}

public class Pertemuan3_1 {

    public static void main(String[] args) {
        kucing a;
        a = new kucing();
        a.nama = "Amanda";

        a.ibu = new kucing();
        a.ibu.nama = "Betty";

        a.ibu.ibu = new kucing();
        a.ibu.ibu.nama = "Cindy";

        System.out.println(a.nama);
        System.out.println(a.ibu.nama);
        System.out.println(a.ibu.ibu.nama);
        System.out.println("");

        kucing x = a;
        while (x != null) {
            System.out.println(x.nama);
            x = x.ibu;
        }
    }
}
