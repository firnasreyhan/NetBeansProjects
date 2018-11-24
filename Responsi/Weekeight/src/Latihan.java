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
        int Array1[] = {1,2,3,4,5};
        
        tampil(Array1);
    }
    public static void tampil(int[] array)
    {
        for(int x = 0; x < array.length; x++)
        {
            System.out.println(array[x]);
        }
    }
}
