/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katakata;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Katakata {
    
    public static String kalimat;
    public static String kata = "";
    public static String hasil = "";
    public static int separator = 0;
    public static int huruf = 0;
    public static Map<String, Integer> map = new HashMap<>(); //Semacam array yang memiliki fungsi untuk menyimpan data, tetapi Key dan Value nya tidak harus berupa angka


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Kalimat : ");
        kalimat = sc.nextLine().replace(".", "").replace(",", "").replaceAll("\"", "").replaceAll("\'", "").replaceAll("\\s{2,}", " ").toLowerCase().trim(); //Inputan kalimat -> mengubah semua huruf menjadi huruf kecil/lowercase
        
        hitungKata(kalimat);
        outputKata();
        
    }
    
    public static void hitungKata(String kalimat)
    {
        for(int i=0;i<kalimat.length();i++)
        {
            if(Character.isWhitespace(kalimat.charAt(i))) //Jika karakter pada variable kalimat mengandung spasi, maka akan menjalankan kondisi ini
            {
                if(map.containsKey(kata)) //Jika pada array map berisi nilai kata yang sama
                {
                    map.put(kata, map.get(kata)+1); //Kata yang sama tersebut nilainya akan ditambah 1
                }
                else
                {
                    map.put(kata, 1); //kata tersebut akan dimasukkan ke dalam array dan diberi nilai 1
                }
                kata = ""; //Variabel kata nilainya akan dikosongkan kembali
                separator++; //Increment nilai variabel "separator" jika karakter tersebut adalah Spasi
            }
            else
            {
                kata += kalimat.charAt(i); //Variabel kata nilainya akan diisi oleh karakter dari kalimat sesui dengan "i"
                if(i == kalimat.length()-1){ //Jika "i" nilainya sama dengan panjang kata-1
                    if(map.containsKey(kata)) //Jika pada array map berisi nilai kata yang sama
                    {
                        map.put(kata, map.get(kata)+1); //Kata yang sama tersebut nilainya akan ditambah 1
                    }
                    else
                    {
                        map.put(kata, 1); //kata tersebut akan dimasukkan ke dalam array dan diberi nilai 1
                    }
                    kata = ""; //Variabel kata nilainya akan dikosongkan kembali
                }
                huruf++; //Increment nilai variabel "separator" jika karakter tersebut adalah Huruf
            }
        }
    }
    public static void outputKata()
    {
        System.out.println("\nJumlah Kata = " + (separator+1));
        System.out.println("Jumlah Huruf = " + huruf + "\n");
        System.out.println("(=Frekuensi Muncul Kata=)");
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            hasil += entry.getKey() + " = " + entry.getValue() + " kata\n";
        }
        System.out.println(hasil);
    }
}