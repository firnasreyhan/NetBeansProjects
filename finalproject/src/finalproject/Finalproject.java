/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Rey
 */
import java.util.Scanner;

public class Finalproject
{
	public static Scanner sc = new Scanner(System.in);
	public static int [][] matriks1 = new int [3][3];
	public static int [][] matriks2 = new int [3][3];
	public static int [][] matrikshasil = new int [3][3];  

	public static int baris1, kolom1, baris2, kolom2;

	public static void main(String[] args)
	{
		int pilihan;
		int baris1, kolom1, baris2, kolom2;

		System.out.println("================");
		System.out.println("Kalkulator Matriks");
		System.out.println("================");
		System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian");
		System.out.println("================");
		System.out.print("Masukkan Pilihan Anda : ");

		pilihan = sc.nextInt();

		switch(pilihan)
		{
			// penjumlahan
			case 1 :
				System.out.println();
				System.out.print("Masukkan panjang baris matriks 1: ");
				baris1 = sc.nextInt();
				System.out.print("Masukkan panjang kolom matriks 1: ");
				kolom1 = sc.nextInt();
				System.out.println();
				System.out.print("Masukkan panjang baris matriks 2: ");
				baris2 = sc.nextInt();
				System.out.print("Masukkan panjang kolom matriks 2: ");
				kolom2 = sc.nextInt();

				if(cek_matriks(baris1, kolom1) && cek_matriks(baris2, kolom2) && cek_matriks_minplus(baris1, baris2, kolom1, kolom2))
				{
					inputmatriks(baris1, kolom1, baris2, kolom2);

					output_matriks(baris1, kolom1, baris2, kolom2, 1);

					proses_matriks(baris1, kolom2, 1);

					output_matriks(baris1, kolom1, baris2, kolom2, 2);
				}

				else
				{
					System.out.println();
					System.out.print("Matriks tidak bisa dioperasikan !");
				}


			break;

			// pengurangan
			case 2 :
				System.out.println();
				System.out.print("Masukkan panjang baris matriks 1: ");
				baris1 = sc.nextInt();
				System.out.print("Masukkan panjang kolom matriks 1: ");
				kolom1 = sc.nextInt();
				System.out.println();
				System.out.print("Masukkan panjang baris matriks 2: ");
				baris2 = sc.nextInt();
				System.out.print("Masukkan panjang kolom matriks 2: ");
				kolom2 = sc.nextInt();

				if(cek_matriks(baris1, kolom1) && cek_matriks(baris2, kolom2) && cek_matriks_minplus(baris1, baris2, kolom1, kolom2))
				{
					inputmatriks(baris1, kolom1, baris2, kolom2);

					output_matriks(baris1, kolom1, baris2, kolom2, 1);

					proses_matriks(baris1, kolom2, 2);

					output_matriks(baris1, kolom1, baris2, kolom2, 2);
				}

				else
				{
					System.out.println();
					System.out.print("Matriks tidak bisa dioperasikan !");
				}
			break;

				// pengurangan
			case 3 :
				System.out.println();
				System.out.print("Masukkan panjang baris matriks 1: ");
				baris1 = sc.nextInt();
				System.out.print("Masukkan panjang kolom matriks 1: ");
				kolom1 = sc.nextInt();
				System.out.println();
				System.out.print("Masukkan panjang baris matriks 2: ");
				baris2 = sc.nextInt();
				System.out.print("Masukkan panjang kolom matriks 2: ");
				kolom2 = sc.nextInt();

				if(cek_matriks(baris1, kolom1) && cek_matriks(baris2, kolom2) && cek_perkalian(kolom1, baris2))
				{
					inputmatriks(baris1, kolom1, baris2, kolom2);

					output_matriks(baris1, kolom1, baris2, kolom2, 1);

                   	proses_matriks(baris1, kolom2, 3);
					
					output_matriks(baris1, kolom1, baris2, kolom2, 2);
				}
				
				else
				{
					System.out.println();
					System.out.print("Matriks tidak bisa dioperasikan !");
				}

			break;

			default :
			System.out.print("Pilihan Salah !");

		}

	}

	//cek ordo matriks
	public static boolean cek_matriks(int baris, int kolom)
	{
		boolean parameter;

		if(baris <= 1 && kolom <=1)
		{
			parameter = false;
		}

		else
		{
			parameter = true;
		}

		return parameter;
	}

	//cek penjumlahan dan pengurangan
	public static boolean cek_matriks_minplus(int baris1, int baris2, int kolom1, int kolom2)
	{
		boolean parameter;

		if(baris1 == baris2 && kolom1 == kolom2)
		{
			parameter = true;
		}

		else
		{
		 	parameter = false;
		}

		return parameter;
	}

	//cek perkalian
	public static boolean cek_perkalian(int kolom1, int baris2)
	{
		boolean parameter;

		if(kolom1 == baris2)
		{
			parameter = true;
		}

		else
		{
			parameter = false;
		}

		return parameter;
	}

	//menginput
	public static void inputmatriks(int baris1, int kolom1, int baris2, int kolom2)
	{
		matriks1 = new int [baris1][kolom1];
		matriks2 = new int [baris2][kolom2];

		System.out.println();
		for(int x = 0; x < baris1; x++)
		{
			for(int y = 0; y < kolom1; y++)
			{
				System.out.print("Nilai Matriks 1 [" + (x + 1) + "] [" + (y + 1) + "] = ");
				matriks1[x][y] = sc.nextInt();
			}
		}

		System.out.println();
		for(int x = 0; x < baris2; x++)
		{
			for(int y = 0; y < kolom2; y++)
			{
				System.out.print("Nilai Matriks 2 [" + (x + 1) + "] [" + (y + 1) + "] = ");
				matriks2[x][y] = sc.nextInt();
			}
		}

	}

	//input baris kolom
	public static void inputbariskolom()
	{
		System.out.println();
		System.out.print("Masukkan panjang baris matriks 1: ");
		baris1 = sc.nextInt();
	    System.out.print("Masukkan panjang kolom matriks 1: ");
		kolom1 = sc.nextInt();
		System.out.println();
		System.out.print("Masukkan panjang baris matriks 2: ");
		baris2 = sc.nextInt();
		System.out.print("Masukkan panjang kolom matriks 2: ");
		kolom2 = sc.nextInt();
	}



	//output matriks
	public static void output_matriks(int baris1, int kolom1, int baris2, int kolom2, int operator)
	{
		System.out.println();
		switch(operator)
		{
			case 1 :
			System.out.println("Matrik 1");
			for(int x = 0; x < baris1; x++)
			{
				for(int y = 0; y < kolom1; y++)
				{
					System.out.print(matriks1[x][y] + " ");
				}

				System.out.println();
			}
			System.out.println("Matrik 2");
			System.out.println();
			for(int x = 0; x < baris2; x++)
			{
				for(int y = 0; y < kolom2; y++)
				{
					System.out.print(matriks2[x][y] + " ");
				}

				System.out.println();
			}
			break;

			case 2 :
			
			System.out.println("Hasilnya adalah : ");
			for(int x = 0; x < baris1; x++)
			{
				for(int y = 0; y < kolom2; y++)
				{
					System.out.print(matrikshasil[x][y] + " ");
				}

				System.out.println();
			}
			break;

			default :
			System.out.print("Operator salah !");
		}
	}

	//proses matriks
	public static void proses_matriks(int baris1, int kolom2, int operator)
	{
		System.out.println();
		for(int x = 0; x < baris1; x++)
		{
			for(int y = 0; y < kolom2; y++)
			{
				switch(operator)
				{
					case 1 : 
					
					matrikshasil[x][y] = matriks1[x][y] + matriks2[x][y];
					
					break;

					case 2 :
					matrikshasil[x][y] = matriks1[x][y] - matriks2[x][y];
					break;

					case 3 :
					matrikshasil[x][y] = 0;
					for(int z = 0; z < baris1; z++)
                   	{
                       	 matrikshasil[x][y] += matriks1[x][z] * matriks2[z][y];
                    }
					break;

					default :
					System.out.print("Operator salah !");
				}
				
			}	
		}
	}
}