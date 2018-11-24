/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code0301;

import java.math.BigDecimal;

/**
 *
 * @author Rey
 */
public class Code0301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        float b = 12.5f;
        long c = 2103201801;
        double d = 2103201801.125;
        boolean e = true;
        char f = 'F';
        
        System.out.println("Integer\t\t: " + a);
        System.out.println("Float\t\t: " + b);
        System.out.println("Long Integer\t: " + c);
        System.out.println("Double\t\t: " + (new BigDecimal(d)));
        System.out.println("Boolean\t\t: " + e);
        System.out.println("Character\t: " + f);
    }
    
}
