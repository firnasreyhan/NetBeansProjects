/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Masalah_anak_ub {

    public static void main(String[] args) {
        int h = 3;
        int a = ++h * 2;

        int s = h >= 3 ? -1 * (h++ * h + 90) : h-- * --a;
        System.out.println(s);

        double b;
        b = 3.0 / 2.0;
        System.out.println(b);
    }
}
