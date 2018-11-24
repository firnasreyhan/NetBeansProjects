
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
public class Aktivitas6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password, pass;
        int x;
        
        x = 0;
        password = "muraf212";
        
        do
        {
            System.out.print("Masukkan password : ");
            pass = sc.next();
            
            if(pass.equals(password))
            {
                x = 10;
            }
            else
            {
                x++;
            }
            
        }while(x < 3);
        
        if(x != 10)
        {
            System.out.println("Password Salah. Anda Tidak Berhak Mengakses Sistem.");
        }
    }
}
