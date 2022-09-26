package Task1;


public class Restaurant {
	public String[] nama_makanan;
	public double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;

	public Restaurant() 
	{
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}

	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}

	public void tampilMenuMakanan() {
		for (int i = 0; i <= id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(nama_makanan[id] + "[" + getStok()+ "]" + "\tRp. " + harga_makanan[i]);
			}

		}
	}
 
	public boolean isOutOfStock(int id) {
		if (getStok()[id] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void nextId() {
		id++;
	}

	public int[] getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.getStok()[id] = stok;
	}


}
