import java.util.Scanner;
/**
 *
 * @author Rey
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int pilih, data;

        OUTER:
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("\n===== Input Data =====");
                    System.out.print("Masukkan data : ");
                    data = sc.nextInt();
                    bt.push(new BinaryTreeNode(data));
                    break;
                case 2:
                    System.out.println("\n===== Tampilkan Data =====");
                    if (bt.root != null) {
                        bt.print();
                    } else {
                        System.out.println("Binary tree kosong!");
                    }
                    break;
                case 3:
                    System.out.println("\n===== Cari Data =====");
                    if (bt.root != null) {
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        if (bt.find(data)) {
                            System.out.println("Data \"" + data + "\" ada dalam binary tree");
                        } else {
                            System.out.println("Data \"" + data + "\" tidak ada dalam binary tree");
                        }
                    } else {
                        System.out.println("Binary tree kosong!");
                    }
                    break;
                default:
                    System.out.println("Keluar Program!");
                    break OUTER;
            }
            System.out.println("");
        } while (true);
    }
}
