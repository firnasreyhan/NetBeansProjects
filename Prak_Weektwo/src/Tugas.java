/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Tugas {
    public static void main(String[] args) {
        int buku1, buku2, spidol1, spidol2, harga1, harga2;
        int b, s;
        
        buku1 = 5;
        spidol1 = 2;
        harga1 = 26000;
        
        buku2 = 3;
        spidol2 = 4;
        harga2 = 38000;
        
        b = ((harga1*spidol2)-(harga2*spidol1)) / ((buku1*spidol2)-(buku2*spidol1));
        s = ((harga1*buku2)-(harga2*buku1)) / ((spidol1*buku2)-(spidol2*buku1));
        
        System.out.println(buku1 + "b + " + spidol1 + "s = " + harga1);
        System.out.println(buku2 + "b + " + spidol2 + "s = " + harga2);
        System.out.println("\nHasil :");
        System.out.println("b = " + b);
        System.out.println("s = " + s);
    }
}
