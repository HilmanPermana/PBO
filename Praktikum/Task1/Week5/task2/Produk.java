package task2;

public class Produk 
{
	public String[] nama_produk;
	double[] harga;
	int[] stok;
	
	public Produk()
	{
		nama_produk = new String[] {"Batagor" ,"Roti Bakar", "Indomie+Telor", "Kwetiaw",
				"Nasi Goreng", "Air Mineral", "Teh Manis", "Jus Alpukat", "Teh Botol",
				"Kopi"};
		harga = new double [] {5_000,12_000,10_000,12_000,12_000,3_000,4_000,8_000,
				5_000,3_000};
		
		stok = new int[] {20, 15, 10, 5, 17, 40, 10, 3, 7, 19};
		
	}

}



