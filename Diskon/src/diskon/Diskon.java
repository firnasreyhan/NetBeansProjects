/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskon;

/**
 *
 * @author Rey
 */
public class Diskon {
    String nama;
    int hargaSatuan, jumlah;
    
    public int hitungHargaTotal()
    {
        int hargaTotal = hargaSatuan * jumlah;
        return hargaTotal;
    }
    
    public int hitungDiskon(int harga_diskon)
    {
        if(harga_diskon > 100000)
        {
            harga_diskon = harga_diskon*10/100;
        }
        else if(harga_diskon >= 50000 && harga_diskon <= 100000)
        {
            harga_diskon = harga_diskon*5/100;
        }
        return harga_diskon;
    }
    
    public int hitungHargaBayar(int harga_bayar)
    {
        harga_bayar = hitungHargaTotal() - hitungDiskon(harga_bayar);
        return harga_bayar;
    }
}
