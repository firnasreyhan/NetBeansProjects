/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Latihan1 {
    public static void main(String[] args) {
        byte[] abc = new byte[6];
        
        for(byte x = 0; x<6; x++)
        {
            abc[x] = x;
        }
        
        for(int x = 0; x<6; x++)
        {
            System.out.println(abc[x]);
        }
    }
}
