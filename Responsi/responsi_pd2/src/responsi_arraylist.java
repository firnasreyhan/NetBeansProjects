/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hermawan
 */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
public class responsi_arraylist {
    String soal;
    int jawab;

    responsi_arraylist(String x, int y) {
        soal = x;
        jawab = y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Integer, responsi_arraylist> bank = new Hashtable<>();
        int jml_soal, jawaban_soal, benar, salah, bb, ba;
        boolean cek_jawaban;
        bank.put(1, new responsi_arraylist("Berapa harga rata-rata topi?", 50000));
        bank.put(2, new responsi_arraylist("Berapa harga rata-rata kemeja?", 250000));
        bank.put(3, new responsi_arraylist("Berapa harga rata-rata t-shirt?", 125000));
        bank.put(4, new responsi_arraylist("Berapa harga rata-rata long-shirt?", 135000));
        bank.put(5, new responsi_arraylist("Berapa harga rata-rata celana panjang?", 200000));
        bank.put(6, new responsi_arraylist("Berapa harga rata-rata celana pendek?", 150000));
        bank.put(7, new responsi_arraylist("Berapa harga rata-rata sepatu?", 250000));
        bank.put(8, new responsi_arraylist("Berapa harga rata-rata sandal?", 85000));
        bank.put(9, new responsi_arraylist("Berapa harga rata-rata kacamata?", 75000));
        bank.put(10, new responsi_arraylist("Berapa harga rata-rata kaos kaki?", 15000));
        bank.put(11, new responsi_arraylist("Berapa harga rata-rata jaket?",300000));
        bank.put(12, new responsi_arraylist("Berapa harga rata-rata tas ransel?",400000));
        bank.put(13, new responsi_arraylist("Berapa harga rata-rata tas laptop?",250000));
        bank.put(14, new responsi_arraylist("Berapa harga rata-rata dompet?",150000));
        bank.put(15, new responsi_arraylist("Berapa harga rata-rata jam tangan?",120000));
        
        jml_soal = 0;
        benar = 0;
        salah = 0;
        cek_jawaban = false;
        char ulang = 0;
        do {
            ArrayList<Integer> soal = new ArrayList<Integer>();
            System.out.println("|--------------------------------------------|");
            System.out.println("|                TEBAK HARGA                 |");
            System.out.println("|--------------------------------------------|");
            do {
                int acak = new Random().nextInt(bank.size())+1;
                if (!soal.isEmpty()) {
                    for (int i = 0; i < soal.size(); i++) {
                        if (soal.get(i) != acak) {
                            cek_jawaban = true;
                        } else {
                            cek_jawaban = false;
                            break;
                        }
                    }
                } else {
                    soal.add(acak);
                    jml_soal++;
                }
                if (cek_jawaban) {
                    soal.add(acak);
                    jml_soal++;
                }
            } while (jml_soal < 10);

            for (int key : soal) {
                System.out.println(bank.get(key).soal);
                System.out.print("Jawab : ");
                jawaban_soal = input.nextInt();
                ba = bank.get(key).jawab;
                bb = bank.get(key).jawab;
                if (jawaban_soal == bank.get(key).jawab || (jawaban_soal <= ba && jawaban_soal >= bb)) {
                    benar++;
                } else {
                    salah++;
                }
            }
            System.out.println();
            System.out.println("-----------------------");
            System.out.println("Jawaban yang benar : "+benar);
            System.out.println("Jawaban yang salah : "+salah);
            System.out.println("-----------------------");
            System.out.print("Apakah anda ingin mengulang pertanyaan? (Y/T)");
            ulang = input.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');
    }
}
