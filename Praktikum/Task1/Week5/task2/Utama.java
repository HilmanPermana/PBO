package task2;
import java.io.*;
import java.util.*;

public class Utama {

	public static void main(String[] args) {
		
		
		Produk pesan = new Produk();
		Penjualan beli = new Penjualan();
		Scanner input = new Scanner(System.in);
		BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
		int i = 0;
		int pilih = 0;
		int keputusan = 0;
		
		System.out.println("       [Daftar Menu Makanan]     ");
		System.out.println("----------------------------------");
		System.out.println("1. Batagor               = Rp 5000");
		System.out.println("2. Roti Bakar            = Rp 12000");
		System.out.println("3. Indomie+Telor         = Rp 10000");
		System.out.println("4. Kwetiaw               = Rp 12000");
		System.out.println("5. Nasi Goreng           = Rp 12000");
		System.out.println("6. Air Mineral           = Rp 3000");
		System.out.println("7. Teh Manis             = Rp 4000");
		System.out.println("8. Jus Alpukat           = Rp 8000");
		System.out.println("9. Teh Botol             = Rp 5000");
		System.out.println("10.Kopi                  = Rp 3000\n\n");
		
		do {
			
			System.out.print("Pesan makanan nomor : ");
			pilih = input.nextInt();	
			beli.quantity(pilih);
			System.out.println();
			
			System.out.print("Pesan makanan lain ? (1/0) : ");
			keputusan = input.nextInt();
			System.out.println();
			
			
			
		}while(keputusan == 1);
		
		beli.bill(pilih);
		
		
	}

}
