
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class DataMahasiswa {
    String nrp;
    String nama;
    String alamat;
    
    DataMahasiswa(String nrp, String nama, String alamat){
        this.nrp = nrp;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public static void main(String[] args) {
        ArrayList<DataMahasiswa> mahasiswa = new ArrayList<DataMahasiswa>();
        mahasiswa.add(new DataMahasiswa("171111076", "Ival", "Malang"));
        mahasiswa.add(new DataMahasiswa("171111077", "Monica", "NTB"));
        mahasiswa.add(new DataMahasiswa("171111078", "Mahsa", "Cikarang"));
        mahasiswa.add(new DataMahasiswa("171111079", "Reyhan", "Kepanjen"));
        mahasiswa.add(new DataMahasiswa("171111080", "Rima", "Banjarmasin"));
        
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("NRP\t: " + mahasiswa.get(i).nrp);
            System.out.println("Nama\t: " + mahasiswa.get(i).nama);
            System.out.println("Alamat\t: " + mahasiswa.get(i).alamat);
            System.out.println("");
        }
        System.out.println("-----------------------------------------\n");
        mahasiswa.remove(4);
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("NRP\t: " + mahasiswa.get(i).nrp);
            System.out.println("Nama\t: " + mahasiswa.get(i).nama);
            System.out.println("Alamat\t: " + mahasiswa.get(i).alamat);
            System.out.println("");
        }
    }
}
