package id.ac.unpas.kakas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1 , n2 , hasil, menu ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pilih Menu");
		System.out.println("1. Tambah");
		System.out.println("2. Kurang");
		System.out.println("3. Kali");
		System.out.println("4. Bagi");
		menu = sc.nextInt();
		System.out.println("Masukan n1");
		n1 = sc.nextInt();
		System.out.println("Masukan n1");
		n2 = sc.nextInt();
		Hitung hitung = new Hitung();
		switch (menu) {
		case 1:
			hasil = hitung.tambah(n1, n2);
			System.out.println(hasil);
			break;
		default:
			break;
		}
	}
}
