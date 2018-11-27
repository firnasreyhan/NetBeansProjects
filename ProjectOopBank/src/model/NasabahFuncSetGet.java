package model;

public class NasabahFuncSetGet extends Nasabah{
    
    NasabahFuncSetGet(String namaNasabah, String pinNasabah,double saldoNasabah, String jenisAkunNasabah){
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
    
    public double setSaldoNasabahPlus(double saldoNasabah){
        return super.saldoNasabah = super.saldoNasabah + saldoNasabah;
    }
    
    public double setSaldoNasabahMinus(double saldoNasabah){
        return super.saldoNasabah = super.saldoNasabah - saldoNasabah;
    }
    
    public String getJenisAkunNasabah(){
        return this.jenisAkunNasabah;
    }
    
}