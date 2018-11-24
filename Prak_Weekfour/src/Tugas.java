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
        int temp;
        
        for(int x = 10; x <= 50; x++)
        {
            temp = 0;
            for(int y = 1; y <= x; y++)
            {
                if(x%y == 0)
                {
                    temp++;
                }
            }
            if(temp == 2)
            {
                System.out.println(x);
            }
        }
    }
}
