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

}
