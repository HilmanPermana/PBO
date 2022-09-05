/**
 * Program counted student value
 * and define to grade
 * @author Hilman Permana
 * @version 2022-09-05
 */


import java.util.Scanner;

public class GradeMhs {
	public static void main(String[] args) {

		int n = 0;
		int tugas, tengah, akhir, total;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Jumlah mahasiswa yang akan diinputkan nilainya : ");
		n = keyboard.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Input nilai tugas : ");
			tugas = keyboard.nextInt();

			System.out.print("Input nilai UTS : ");
			tengah = keyboard.nextInt();

			System.out.print("Input nilai UAS : ");
			akhir = keyboard.nextInt();

			total = (int) ((0.20 * tugas) + (0.35 * tengah) + (0.45 * akhir));
			System.out.println(total);

			if (total >= 85) {
				System.out.println("Mahasiswa " + i + " mendapatkan nilai A");

			} else if ((total >= 75) && (total <= 84)) {
				System.out.println("Mahasiswa " + i + " mendapatkan nilai B");

			} else if ((total >= 65) && (total <= 74)) {
				System.out.println("Mahasiswa " + i + " mendapatkan nilai C");

			} else if ((total > 49) && (total <= 64)) {
				System.out.println("Mahasiswa " + i + " mendapatkan nilai D");

			} else if (total < 50) {
				System.out.println("Mahasiswa " + i + " mendapatkan nilai E");

			} else {
				System.out.println("Mahasiswa " + i + " tidak mendapatkan nilai");
			}
			System.out.println("Nilai akhir mahasiswa : " + total);
			System.out.println();
		}
	}
}