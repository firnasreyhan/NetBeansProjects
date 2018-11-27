package model;
public class NasabahFunction extends Nasabah{
    NasabahFunction(String namaNasabah, String pinNasabah,double saldoNasabah, String jenisAkunNasabah){
        super(namaNasabah,pinNasabah,saldoNasabah,jenisAkunNasabah);
    }
    
    public String getNamaNasabah(){
        return namaNasabah;
    }
    
    public String getPinNasabah(){
        return pinNasabah;
    }
    
    public double getSaldoNasabah(){
        return this.saldoNasabah;
    }
    
    public String getJenisAkunNasabah(){
        return this.jenisAkunNasabah;
    }
}