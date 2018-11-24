/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekthree;

/**
 *
 * @author Rey
 */
public class FormulaTwo {
    public static void main(String[] args) {
       float L, panjang, lebar, a, t;
        
        panjang = 78f;
        lebar = 17.5f;
        
        L = 2 * (panjang + lebar);
        
        System.out.println("Keliling persegi panjang\t= "+L);
        
        System.out.println("");
        
        a = 53f;
        t = 20.5f;
        
        L = 0.5f * a * t;
        
        System.out.println("Luas segitiga\t\t\t= "+L);
    }
}
