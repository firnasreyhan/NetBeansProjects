/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Tugas {

    public static void main(String[] args) {
        boolean[][] logika = new boolean[4][6];

        logika[0][0] = false;
        logika[0][1] = false;
        logika[1][0] = false;
        logika[1][1] = true;
        logika[2][0] = true;
        logika[2][1] = false;
        logika[3][0] = true;
        logika[3][1] = true;
        for (int x = 0; x < logika.length; x++) {
            logika[x][2] = !logika[x][0];
            logika[x][3] = logika[x][0] || logika[x][1];
            logika[x][4] = logika[x][0] && logika[x][1];
            logika[x][5] = logika[x][2] && logika[x][3];
        }
        for (int x = 0; x < logika.length; x++) {
            for (int y = 0; y < logika[0].length; y++) {
                if (logika[x][y] == true) {
                    System.out.print("1\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println("");
        }
    }
}
