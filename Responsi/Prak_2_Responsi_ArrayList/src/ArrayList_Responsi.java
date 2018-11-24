/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_Responsi {

    String soal;
    int jawaban;

    ArrayList_Responsi(String a, int b) {
        soal = a;
        jawaban = b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, ArrayList_Responsi> bank = new Hashtable<>();
        int jml_soal, jwb_soal, benar, salah, batas_bawah, batas_atas;
        boolean cek;

        jml_soal = 0;
        benar = 0;
        salah = 0;
        cek = false;
        char ulang = 0;
        bank.put(1, new ArrayList_Responsi("Berapa harga buku?", 3000));
        bank.put(2, new ArrayList_Responsi("Berapa harga penghapus?", 1000));
        bank.put(3, new ArrayList_Responsi("Berapa harga pensil?", 2000));
        bank.put(4, new ArrayList_Responsi("Berapa harga bulpoin?", 3500));
        bank.put(5, new ArrayList_Responsi("Berapa harga rautan?", 6000));
        bank.put(6, new ArrayList_Responsi("Berapa harga stipo?", 5000));
        bank.put(7, new ArrayList_Responsi("Berapa harga penggaris?", 2500));
        bank.put(8, new ArrayList_Responsi("Berapa harga staples?", 8000));
        bank.put(9, new ArrayList_Responsi("Berapa harga spidol?", 4000));
        bank.put(10, new ArrayList_Responsi("Berapa harga binder?", 10000));
        do {
            ArrayList<Integer> soal = new ArrayList<Integer>();
            System.out.println("----------------------------------------------------");
            System.out.println("                 TEBAK HARGA BARANG                 ");
            System.out.println("----------------------------------------------------");
            do {
                int rand = new Random().nextInt(bank.size()) + 1;
                if (!soal.isEmpty()) {
                    for (int i = 0; i < soal.size(); i++) {
                        if (soal.get(i) != rand) {
                            cek = true;
                        } else {
                            cek = false;
                            break;
                        }
                    }
                } else {
                    soal.add(rand);
                    jml_soal++;
                }
                if (cek) {
                    soal.add(rand);
                    jml_soal++;
                }
            } while (jml_soal < 5);

            for (int key : soal) {
                System.out.println(bank.get(key).soal);
                System.out.print("Jawab : ");
                jwb_soal = sc.nextInt();
                batas_atas = bank.get(key).jawaban + 3000;
                batas_bawah = bank.get(key).jawaban - 3000;

                if (jwb_soal == bank.get(key).jawaban || (jwb_soal >= batas_bawah && jwb_soal <= batas_atas)) {
                    benar++;
                } else {
                    salah++;
                }
            }
            System.out.println("");
            System.out.println("Benar : " + benar);
            System.out.println("Salah : " + salah);
            System.out.println("Apakah anda ingin mengulang permainan?Y/T");
            ulang = sc.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
    }
}
