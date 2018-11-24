/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumbasisdata;

/**
 *
 * @author Rey
 */
public class PraktikumBasisData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        for(int x = 1; x <= 4; x++)
        {
            if(x%2 == 1)
            {
                for(int y = 1; y <= 5; y++)
                {
                    a = a + 10;
                    System.out.print(a + " ");
                }
                a = a + 50;
            }
            else
            {
                for(int y = 1; y <= 5; y++)
                {
                   System.out.print(a + " ");
                   a = a - 10;
                }
                a = a + 50;
            }
            System.out.println("");
        }
    }
    
}
