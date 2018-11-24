
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Modul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList a = new LinkedList();
        int pilih;
        String data, ulang_antrian, ulang;
        do {
            ulang = "t";
            ulang_antrian = "y";
            System.out.println("=========== Menu ===========");
            System.out.println("1. Masukkan antrian");
            System.out.println("2. Tampilkan antrian");
            System.out.println("3. Keluarkan antrian (Stack)");
            System.out.println("4. Keluarkan antrian (Queue)");
            System.out.println("============================");
            do {
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
            } while (pilih < 1 || pilih > 4);
            switch (pilih) {
                case 1:
                    do {
                        System.out.println("============================");
                        System.out.print("Masukkan data : ");
                        data = sc.next();
                        a.push(new LinkedListNode(data));
                        do {
                            System.out.print("Tambah antrian lagi? (Y/T) ");
                            ulang_antrian = sc.next();
                        } while (!ulang_antrian.equalsIgnoreCase("y") && !ulang_antrian.equalsIgnoreCase("t"));
                    } while (ulang_antrian.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("============================");
                    a.print();
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 3:
                    if (a.head != null && a.tail != null) {
                        System.out.println("Antrian yang dihapus adalah : " + a.spop().name);
                    } else {
                        System.out.println("Antrian sedang kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
                case 4:
                    if (a.head != null && a.tail != null) {
                        System.out.println("Antrian yang dihapus adalah : " + a.qpop().name);
                    } else {
                        System.out.println("Antrian sedang kosong!");
                    }
                    do {
                        System.out.print("Kembali ke menu awal? (Y/T) ");
                        ulang = sc.next();
                    } while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t"));
                    break;
            }
        } while (ulang.equalsIgnoreCase("y") || ulang_antrian.equalsIgnoreCase("t"));
    }

}
