package model;
public abstract class Nasabah{
    String namaNasabah;
    String pinNasabah;
    double saldoNasabah;
    String jenisAkunNasabah;
    
    // Konstruktor abstrak sering digunakan untuk memaksakan batasan kelas atau 
    // invariants seperti bidang minimum yang diperlukan untuk menyiapkan kelas.
    
    Nasabah(String namaNasabah, String pinNasabah,double saldoNasabah, String jenisAkunNasabah){
        this.namaNasabah = namaNasabah;
        this.pinNasabah = pinNasabah;
        this.saldoNasabah = saldoNasabah;
        this.jenisAkunNasabah = jenisAkunNasabah;
    }
    
    String getNamaNasabah(){
        return this.namaNasabah;
    }
    
    String getPinNasabah(){
        return this.pinNasabah;
    }
    
    double getSaldoNasabah(){
        return this.saldoNasabah;
    }
    
    String getJenisAkunNasabah(){
        return this.jenisAkunNasabah;
    }
}