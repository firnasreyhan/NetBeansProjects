/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan1_Modul {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
        g = 7;
        h = 75;
        i = 25;
        j = 8;
        k = 9;
        l = 10;
        m = 11;
        n = 12;
        o = 13;
        p = 14;
        q = 15;
        
        a += b;
        c += b - c;
        d += (e * f);
        g -= (h / i) + g;
        h += i++;
        j = ++k;
        l -= --m  +  n--; 
        o += p++  +  ++q; 
        
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(l);
        System.out.println(o);
    }
}
