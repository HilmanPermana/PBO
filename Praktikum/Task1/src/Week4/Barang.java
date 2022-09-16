
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok = 0;
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if(this.stok == 0){
            this.stok = stok;
        }
    }
    
    public void tambahBarang(int tambah){
        this.stok += tambah;
    }
    
    public Barang(String kode_barang, String nama_barang){
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
    }
    
}