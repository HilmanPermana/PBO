package task2;

import java.util.Scanner;

public class Penjualan {

	String produk_jual;
	int[] quantity = new int[10];
	double harga_total = 0;

	Produk pesan = new Produk();
	Scanner in = new Scanner(System.in);

	public void quantity(int pilih) {

		if (pilih > 0 && pilih <= 10) {
			System.out.print("Masukkan jumlah pesanan " + pesan.nama_produk[pilih - 1] + " : ");
			int q = in.nextInt();
			quantity[pilih - 1] += q;

		}
	}

	public void bill(int pilih)
	{
		System.out.println("===List menu yang dipesan===");
		for (int i = 0; i < 10; i++) {
			if (quantity[i] != 0) {
				harga_total += quantity[i] * pesan.harga[i];
				System.out.println(
					"- " + pesan.nama_produk[i] + "       " + quantity[i] + " = Rp" + quantity[i] * pesan.harga[i]);
			}
		}

		System.out.println("\n\nSub Total Pesanan = Rp" + harga_total);

		System.out.println("\nTerima Kasih");

	}
}
