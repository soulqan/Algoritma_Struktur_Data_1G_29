package P2;

public class Buku29 {
    String judul,pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang :"+ pengarang);
        System.out.println("Jumlah Halaman :"+halaman);
        System.out.println("Sisa Stok :"+stok);
        System.out.println("Harga : Rp."+harga);
       
    }
    void terjual(int jml){
        if (stok>0&&stok>=jml) {
            stok -= jml;
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

    public Buku29(){

    }
    public Buku29(String jud, String pg, int hal, int stok, int har, int jml){
        judul=jud;
        pengarang=pg;
        halaman=hal;
        this.stok=stok;
        harga=har;
        
    }
     
     int hitungHargaTotal(int jmlBeli) {
        return jmlBeli * harga;
    }

    
    int hitungDiskon(int hargaTotal) {
        double diskon = 0;
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12;
        } else if (hargaTotal > 75000) {
            diskon = hargaTotal * 0.05;
        }
        return (int)diskon;
    }

    
    int hitungHargaBayar(int hargaTotal, double diskon) {
        return hargaTotal - (int) diskon;
    }
}
