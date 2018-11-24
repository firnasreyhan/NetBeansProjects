/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi;

/**
 *
 * @author Rey
 */
public class Remidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil = 0;
        for(int x = 1; x<1000; x++)
        {
            if(x%2 == 0 || x%3 == 0)
            {
                hasil = hasil + x;
            }
        }
        System.out.println(hasil);
    }
    
}
