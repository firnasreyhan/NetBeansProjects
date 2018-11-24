/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class CustomerData {

    String nama, alamat, tanggal_lahir, pekerjaan;
    double gaji;

    CustomerData(
            String nama,
            String alamat,
            String tanggal_lahir,
            String pekerjaan,
            double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    void infoCust() {
        System.out.println(
                "Nama\t\t: " + nama + "\n"
                + "Alamat\t\t: " + alamat + "\n"
                + "Tanggal Lahir\t: " + tanggal_lahir + "\n"
                + "Pekerjaan\t: " + pekerjaan + "\n"
                + "Gaji\t\t: " + gaji + "\n");
    }

    public static void main(String[] args) {
        CustomerData cust1;
        cust1 = new CustomerData(
                "Reyhan",
                "Kepanjen",
                "3 Agustus 1998",
                "Manajer",
                9000000);
        cust1.infoCust();
    }
}
