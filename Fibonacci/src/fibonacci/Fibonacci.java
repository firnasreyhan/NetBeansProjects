/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Rey
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c, i, hasil;
        a = 1;
        b = 1;
        hasil = 0;
        
        for(i = 1;i <= 30;i++)
        {
            c = a + b;
            if(c%2 == 0)
            {
                System.out.println(c);
                hasil = hasil + c;
            }
            a = b;
            b = c;
        }
        System.out.println("\nHasil : " + hasil);
    }
    
}