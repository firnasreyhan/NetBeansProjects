/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_prak_prodas_1;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class TA_PRAK_PRODAS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] film = new String[5];
        String[] jadwal = {"10.30", "13.00", "15.30", "18.00", "20.30"};
        int[][] jumlah_kursi = new int[50][3]; //2dimensi

        film[0] = "JURASSIC WORLD : FALLEN KINGDOM";
        film[1] = "INCREDIBLES 2";
        film[2] = "KUNTILANAK";
        film[3] = "TARGET";

        int pilih_menu, pilih_sub_menu, pilih_film, pilih_jadwal, tiket, total, n, bayar, kembalian;
        char ulang;

        n = 0;
        
        do {
            ulang = 't';
            tiket = 0;
            total = 0;
            pilih_sub_menu = 0;
            System.out.println("===========================================");
            System.out.println("         Selamat Datang Di Cinema 31       ");
            System.out.println("===========================================");
            System.out.println("1. List Film");
            System.out.println("2. Jadwal");
            System.out.println("3. Transaksi");
            System.out.println("4. Kelola bioskop");
            System.out.println("===========================================");

            System.out.print("Pilih : ");
            pilih_menu = sc.nextInt();

            System.out.println("");
            switch (pilih_menu) {
                case 1:
                    System.out.println("================ List Film ================");
                    tampil(film, "Film");
                    System.out.print("Kembali ke menu awal?(Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("================= Jadwal ==================");
                    tampil(jadwal, "Jadwal");
                    System.out.print("Kembali ke menu awal?(Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 3:
                    System.out.println("=============== Transaksi =================");
                    tampil(film, "Film");
                    System.out.print("Pilih : ");
                    pilih_film = sc.nextInt();

                    System.out.println("");
                    tampil(jadwal, "Jadwal");
                    System.out.print("Pilih : ");
                    pilih_jadwal = sc.nextInt();

                    for (int i = 0; i < jumlah_kursi.length; i++) {
                        if (jumlah_kursi[i][0] == pilih_film && jumlah_kursi[i][1] == pilih_jadwal) {
                            n = i;
                            break;
                        } else {
                            n = i;
                            jumlah_kursi[i][0] = pilih_film;
                            jumlah_kursi[i][1] = pilih_jadwal;
                            jumlah_kursi[i][2] = 30;
                            break;
                        }
                    }
                    System.out.println("-------------------------------------------");
                    System.out.println("Sisa kursi : " + jumlah_kursi[n][2]);
                    System.out.println("-------------------------------------------");
                    if (jumlah_kursi[n][2] != 0) {
                        do {
                            do {
                                System.out.print("Pesan tiket : ");
                                tiket = sc.nextInt();
                                if (tiket > 8) {
                                    System.out.println("Pemesanan anda melebihi batas!");
                                }
                                else if(tiket < 1)
                                {
                                    System.out.println("Pemesanan tiket minimal 1!");
                                }
                            } while (tiket > 8 || tiket < 1);
                            if (tiket > jumlah_kursi[n][2]) {
                                System.out.println("Mohon maaf, saat ini hanya tersedia " + jumlah_kursi[n][2] + " kursi");
                            }
                        } while (tiket > jumlah_kursi[n][2]);

                        jumlah_kursi[n][2] = jumlah_kursi[n][2] - tiket;
                        total = tiket * 30000;

                        System.out.println("-------------------------------------------");
                        System.out.println("Studio\t: " + pilih_film);
                        System.out.println("Film\t: " + film[pilih_film - 1]);
                        System.out.println("Jadwal\t: " + jadwal[pilih_jadwal - 1]);
                        System.out.println("Tiket\t: " + tiket);
                        System.out.println("Total\t: " + total);
                        System.out.println("-------------------------------------------");
                        
                        do {
                            System.out.print("Bayar : ");
                            bayar = sc.nextInt();
                            if (bayar < total) {
                                System.out.println("Uang anda kurang, silahkan cek dompet anda");
                            }
                        } while (bayar < total);
                        
                        System.out.println("-------------------------------------------");
                        kembalian = bayar - total;
                        System.out.println("Kembalian : " + kembalian);
                    } else {
                        System.out.println("Mohon maaf, tiket telah habis terjual");
                    }
                    System.out.println("-------------------------------------------");
                    System.out.print("Kembali ke menu awal?(Y/T) ");
                    ulang = sc.next().charAt(0);
                    break;
                case 4:
                    System.out.println("============= Kelola Bioskop ==============");
                    System.out.println("1. Tambah Film");
                    System.out.println("2. Update Film");
                    System.out.println("3. Hapus Film");
                    System.out.println("4. Kembali");
                    System.out.println("===========================================");
                    System.out.print("Pilih : ");
                    pilih_sub_menu = sc.nextInt();
                    switch (pilih_sub_menu) {
                        case 1:
                            if (n != (film.length - 1)) {
                                for (int i = 0; i < film.length; i++) {
                                    if (film[i] == null) {
                                        System.out.print("Masukkan judul film : ");
                                        sc.nextLine();
                                        film[i] = sc.nextLine();
                                        System.out.println("Film berhasil ditambahkan!");
                                        n = i;
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Data sudah penuh!");
                            }
                            System.out.println("-------------------------------------------");
                            System.out.print("Kembali ke menu awal?(Y/T) ");
                            ulang = sc.next().charAt(0);
                            break;
                        case 2:
                            tampil(film, "Film");
                            System.out.print("Pilih : ");
                            pilih_film = sc.nextInt();

                            System.out.println("Anda memilih : " + film[pilih_film - 1]);
                            System.out.println("-------------------------------------------");
                            System.out.print("Masukkan judul film : ");
                            sc.nextLine();
                            film[pilih_film - 1] = sc.nextLine();
                            System.out.println("Film berhasil dirubah!");
                            System.out.println("-------------------------------------------");
                            System.out.print("Kembali ke menu awal?(Y/T) ");
                            ulang = sc.next().charAt(0);
                            break;
                        case 3:
                            tampil(film, "Film");
                            System.out.print("Pilih : ");
                            pilih_film = sc.nextInt();

                            System.out.println("Anda memilih : " + film[pilih_film - 1]);
                            film[pilih_film - 1] = null;
                            for (int i = 0; i < jumlah_kursi.length; i++) {
                                if (jumlah_kursi[i][0] == pilih_film) {
                                    for (int j = 0; j < jumlah_kursi[0].length; j++) {
                                        jumlah_kursi[i][j] = 0;
                                    }
                                }
                            }

                            for (int i = pilih_film - 1; i < film.length - 1; i++) {
                                film[i] = film[(i + 1)];
                            }

                            System.out.println("Film berhasil dihapus!");
                            System.out.println("-------------------------------------------");
                            System.out.print("Kembali ke menu awal?(Y/T) ");
                            ulang = sc.next().charAt(0);
                            break;
                    }
                    break;
            }
            System.out.println("");
        } while (ulang == 'y' || ulang == 'Y' || pilih_sub_menu == 4);
    }

    public static void tampil(String[] array, String teks) {
        System.out.println(teks);
        System.out.println("-------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println((i + 1) + ". " + array[i]);
            }
        }
        System.out.println("-------------------------------------------");
    }
}
