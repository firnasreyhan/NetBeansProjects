
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan {
    public static void main(String[] args) {
        double[][] angka = new double[4][6];
        
        for(int x = 0, rad = 45; x < 4; x++, rad+=90)
        {
            for(int y = 0; y < 6; y++)
            {
                if(y < 2)
                {
                    angka[x][y] = rad;
                }
                else
                {
                    if(y == 2)
                    {
                        angka[x][y] = (Math.sin(angka[x][0])) * (Math.cos(angka[x][1]));
                    }
                    else if(y == 3)
                    {
                        angka[x][y] = (Math.cos(angka[x][0])) * (Math.sin(angka[x][1]));
                    }
                    else if(y == 4)
                    {
                        angka[x][y] = (Math.sin(angka[x][0])) * (Math.sin(angka[x][0]));
                    }
                    else if(y == 5)
                    {
                        angka[x][y] = (Math.cos(angka[x][1])) * (Math.cos(angka[x][1]));
                    }
                }
            }
        }
        
        System.out.println("");
        
        for(int x = 0; x < 4; x++)
        {
            for(int y = 0; y < 6; y++)
            {
                System.out.print(angka[x][y] + "\t");
            }
            System.out.println("");
        }
    }
}
