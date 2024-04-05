package P7.TestSearching;

public class Buku28 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku28(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int Stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = Stock;
    }

    public void tampilDataBuku(){
        System.out.println("=========================");
        System.out.println("Kode buku: "+kodeBuku);
        System.out.println("Judul Buku: "+judulBuku);
        System.out.println("Tahun Terbit: "+tahunTerbit);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Stok: "+stock);
    }
}
