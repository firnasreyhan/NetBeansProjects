/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Buku {

    //Atribut
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    //Constructor
    Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }

    //Method
    void informasiBuku() {
        System.out.println(
                "Pengarang : " + namaPengarang + "\n"
                + "Judul : " + judulBuku + "\n"
                + "Tahun Terbit : " + tahunTerbit + "\n"
                + "Cetakan Ke : Rp." + cetakanKe + "\n"
                + "Harga : " + hargaJual + "\n");
    }

    public static void main(String[] args) {
        //Object
        Buku buku1, buku2, buku3, buku4, buku5, buku6, buku7, buku8, buku9, buku10;
        //Instansi
        buku1 = new Buku("Buku 1", "Reyhan", 2001, 1, 10000);
        buku2 = new Buku("Buku 2", "Firnas", 2002, 2, 20000);
        buku3 = new Buku("Buku 3", "Adani", 2003, 3, 30000);
        buku4 = new Buku("Buku 4", "Achmad", 2004, 4, 40000);
        buku5 = new Buku("Buku 5", "Luthfan", 2005, 5, 50000);
        buku6 = new Buku("Buku 6", "Aufar", 2006, 6, 60000);
        buku7 = new Buku("Buku 7", "Hidami", 2007, 7, 70000);
        buku8 = new Buku("Buku 8", "Yulis", 2008, 8, 80000);
        buku9 = new Buku("Buku 9", "Saiful", 2009, 9, 90000);
        buku10 = new Buku("Buku 10", "Arif", 2010, 10, 100000);

        buku1.informasiBuku();
        buku2.informasiBuku();
        buku3.informasiBuku();
        buku4.informasiBuku();
        buku5.informasiBuku();
        buku6.informasiBuku();
        buku7.informasiBuku();
        buku8.informasiBuku();
        buku9.informasiBuku();
        buku10.informasiBuku();
    }
}
