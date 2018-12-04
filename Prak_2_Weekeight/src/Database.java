
import java.sql.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rey
 */
public class Database {

    static String sql;

    public static void main(String Args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/praktikum", "root", "");
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            boolean cek = true;
            do {
                int nilai = 0, pilih = 0;
                String nama = "";
                String lagi = "";
                String id = "";
                sql = "SELECT id, name, score FROM person order by id";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    int idd = rs.getInt("id");
                    String name = rs.getString("name");
                    int score = rs.getInt("score");
                    System.out.println(idd + "\t" + name + "\t"
                            + score);
                }
                System.out.println("===========================================");
                System.out.println("1. Create");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Keluar");
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan nama : ");
                        sc.nextLine();
                        nama = sc.nextLine();
                        System.out.print("Masukkan score : ");
                        nilai = sc.nextInt();
                        sql = "INSERT INTO person(name, score) VALUES('" + nama + "','" + nilai + "')";
                        stmt.executeUpdate(sql);
                        break;
                    case 2:
                        System.out.print("Masukkan id : ");
                        sc.nextLine();
                        id = sc.nextLine();
                        System.out.print("Masukkan nama : ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan score : ");
                        nilai = sc.nextInt();
                        sql = "UPDATE person SET score='" + nilai + "', name='" + nama + "' WHERE id='" + id + "'";
                        stmt.executeUpdate(sql);
                        break;
                    case 3:
                        System.out.print("Masukkan id : ");
                        sc.nextLine();
                        id = sc.nextLine();
                        sql = "DELETE FROM person WHERE id = '" + id + "'";
                        stmt.executeUpdate(sql);
                        break;
                    case 4:
                        cek = false;
                        break;
                }
                System.out.println("");
            } while (cek);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
