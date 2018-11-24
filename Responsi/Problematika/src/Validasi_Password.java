
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rey
 */
public class Validasi_Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher;

        char ch;
        String pass;
        boolean jml_karakter, simbol, angka, huruf_uc;

        System.out.print("Masukkan password : ");
        pass = sc.nextLine();
        matcher = pattern.matcher(pass);

        jml_karakter = pass.length() >= 8;
        simbol = !(matcher.matches());
        angka = false;
        huruf_uc = false;

        for (int i = 0; i < pass.length(); i++) {
            ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                angka = true;
            } else if (Character.isUpperCase(ch)) {
                huruf_uc = true;
            }
        }
        
        if (jml_karakter && simbol && angka && huruf_uc) {
            System.out.println("Password berhasil dibuat!");
        } else {
            System.out.println("Password gagal dibuat!");
            if (!jml_karakter) {
                System.out.println("Jumlah karakter kurang dari 8!");
            }
            if (!simbol) {
                System.out.println("Password tidak memilik karakter spesial!");
            }
            if (!angka) {
                System.out.println("Password tidak mengandung angka!");
            }
            if (!huruf_uc) {
                System.out.println("Password tidak mengandung huruf kapital!");
            }
        }
    }

}
