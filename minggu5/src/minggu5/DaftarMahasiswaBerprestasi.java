/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Rey
 */
public class DaftarMahasiswaBerprestasi {
    
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    //method tambah()
    void tambah(Mahasiswa m)
    {
        if(idx < listMhs.length)
        {
            listMhs[idx] = m;
            idx++;
        }
        else
        {
            System.out.println("Data sudah penuh!");
        }
    }
    
    //method tampil()
    void tampil()
    {
        for(Mahasiswa m : listMhs)
        {
            m.tampil();
            System.out.println("--------------------");
        }
    }
    
    //method BubbleSort()
    void bubbleSort()
    {
        for(int i = 0; i < (listMhs.length - 1); i++)
        {
            for(int j = 1; j < (listMhs.length - 1); j++)
            {
                if(listMhs[j].ipk > listMhs[j-1].ipk)
                {
                    //proses penukaran data
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    
    //metod SelectionSort()
    void selectionSort()
    {
        for(int i = 0; i < (listMhs.length - 1); i++)
        {
            int idxMin = i;
            for(int j = i+1; j < listMhs.length; j++)
            {
                if(listMhs[j].ipk < listMhs[idxMin].ipk)
                {
                    idxMin = j;
                }
            }
            //proses penukaran data
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
