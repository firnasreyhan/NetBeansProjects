
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
            int nilai = 0;
            String nama = "";
            String lagi = "";
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Masukkan nama: ");
                nama = scan.nextLine();
                System.out.println("Masukkan score: ");
                nilai = scan.nextInt();
                System.out.print("lagi?(y/t): ");
                scan.nextLine();
                lagi = scan.nextLine();
                sql = "INSERT INTO person(name, score) VALUES('" + nama + "','" + nilai + "')";
                stmt.executeUpdate(sql);
//                sql = "UPDATE person SET score=60, name=\"Tono Martono \" WHERE id=1";
//                stmt.executeUpdate(sql);
//                sql = "DELETE FROM person WHERE id=2";
//                stmt.executeUpdate(sql);
                sql = "SELECT id, name, score FROM person order by id";

            } while (lagi.equalsIgnoreCase("y"));
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int score = rs.getInt("score");
                System.out.println(id + "\t" + name + "\t"
                        + score);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
