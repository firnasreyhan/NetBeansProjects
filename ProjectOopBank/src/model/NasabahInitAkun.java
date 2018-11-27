package model;

import java.util.ArrayList;
import java.util.HashMap;

public class NasabahInitAkun{

    
    HashMap<String,Nasabah> dataNasabah ;
    
    public NasabahInitAkun() {
        this.dataNasabah = new HashMap();
        dataNasabah.put("19011999", new NasabahFuncSetGet("Fatkul","123456",500000,"gold"));
        dataNasabah.put("19012000", new NasabahFuncSetGet("Nur","123456",500000,"silver"));
        dataNasabah.put("19012001", new NasabahFuncSetGet("Koi","123456",500000,"platinum"));
        dataNasabah.put("19012002", new NasabahFuncSetGet("Koi","123456",500000,"gold"));
        
    }
    
    public Nasabah getAkun(String key) {
        NasabahFuncSetGet a = (NasabahFuncSetGet) dataNasabah.get(key);
        return a;
    }
    
    public boolean isNoRekening(String key) {
        return dataNasabah.containsKey(key);
    }
    
    public boolean terdapatNoRekening(String key) {
        return dataNasabah.containsKey(key);
    }

}