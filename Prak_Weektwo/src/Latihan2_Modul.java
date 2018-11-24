/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan2_Modul {
    public static void main(String[] args) {
        int b, c, e, f, g, i, j, k, l, n, o, q, r, s, u, v, w, x;
        int a, d, h, m, p, t;
        
        b = 2;
        c = 3;
        e = 5;
        f = 6;
        g = 7;
        i = 9;
        j = 10;
        k = 11;
        l = 12;
        n = 14;
        o = 15;
        q = 17;
        r = 18;
        s = 19;
        u = 21;
        v = 22;
        w = 23;
        x = 24;
        
        a = b & c;
        d = e & (f & g);
        h = (i & j) & (k & l);
        m = n | o;
        p = q & (r & s);
        t = (u & v) & (w & x);
        
        System.out.println(a);
        System.out.println(d);
        System.out.println(h);
        System.out.println(m);
        System.out.println(p);
        System.out.println(t);
    }
}
