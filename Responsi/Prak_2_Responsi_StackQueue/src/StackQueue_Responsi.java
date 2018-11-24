
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class StackQueue_Responsi {

    String soal;
    int jawaban;

    StackQueue_Responsi(String a, int b) {
        soal = a;
        jawaban = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ls = new LinkedList();
        Hashtable<Integer, StackQueue_Responsi> bank = new Hashtable<>();
        int rand, jwb_soal, batas_bawah, batas_atas, benar, salah;
        String ulang;

        bank.put(1, new StackQueue_Responsi("Berapa harga buku?", 3000));
        bank.put(2, new StackQueue_Responsi("Berapa harga penghapus?", 1000));
        bank.put(3, new StackQueue_Responsi("Berapa harga pensil?", 2000));
        bank.put(4, new StackQueue_Responsi("Berapa harga bulpoin?", 3500));
        bank.put(5, new StackQueue_Responsi("Berapa harga rautan?", 6000));
        bank.put(6, new StackQueue_Responsi("Berapa harga stipo?", 5000));
        bank.put(7, new StackQueue_Responsi("Berapa harga penggaris?", 2500));
        bank.put(8, new StackQueue_Responsi("Berapa harga staples?", 8000));
        bank.put(9, new StackQueue_Responsi("Berapa harga spidol?", 4000));
        bank.put(10, new StackQueue_Responsi("Berapa harga binder?", 10000));
        do {
            benar = 0;
            salah = 0;
            System.out.println("----------------------------------------------------");
            System.out.println("                 TEBAK HARGA BARANG                 ");
            System.out.println("----------------------------------------------------");
            for (int i = 0; i < 5; i++) {
                do {
                    rand = new Random().nextInt(bank.size()) + 1;
                } while (ls.find_node_by_data(rand));
                ls.push(new LinkedListNode(rand, bank.get(rand).soal, bank.get(rand).jawaban));
            }

            LinkedListNode current = ls.head;
            while (current != null) {
                System.out.print(current.soal + " ");
                jwb_soal = sc.nextInt();
                batas_atas = current.jawaban + 3000;
                batas_bawah = current.jawaban - 3000;
                if (jwb_soal > batas_atas || jwb_soal < batas_bawah) {
                    salah++;
                } else {
                    benar++;
                }
                current = current.next;
                ls.qpop();
            }
            System.out.println("");
            System.out.println("Benar : " + benar);
            System.out.println("Salah : " + salah);
            do {
                System.out.print("Apakah anda ingin mengulang permainan?(Y/T) ");
                ulang = sc.next();
            } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
        } while (ulang.equalsIgnoreCase("y"));
    }
}
