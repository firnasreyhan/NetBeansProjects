/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimatAsli, kalimatBalik;
        
        kalimatBalik = "";
        
        System.out.print("Masukkan kalimat : ");
        kalimatAsli = sc.nextLine();
        
        for(int x = kalimatAsli.length()-1; x>=0; x--)
        {
            kalimatBalik = kalimatBalik + kalimatAsli.charAt(x);
        }
        
        if(kalimatAsli.equalsIgnoreCase(kalimatBalik))
        {
            System.out.println("Kalimat Palindrom");
        }
        else
        {
            System.out.println("Bukan Kalimat Palindrom");
        }
    }
}
