package P6.LatihanPraktikum;

public class hotel {
    String nama, kota;
    int harga;
    byte bintang;

    hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga=h;
        bintang = b;
    }
    void tampilData() {
        System.out.println("Nama: "+nama);
        System.out.println("Kota: "+kota);
        System.out.println("Harga: Rp."+harga);
        System.out.println("Bintang: "+bintang+" Bintang");
}
}
