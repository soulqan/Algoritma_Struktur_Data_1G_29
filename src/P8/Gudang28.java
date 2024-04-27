package P8;

public class Gudang28 {
    Barang28[] tumpukan;
    int size,top;

public Gudang28(int kapasitas){
    size = kapasitas;
    tumpukan = new Barang28[size];
    top = -1;
}
public boolean cekKosong(){
    if (top == -1) {
        return true;
    }else{
        return false;
    }
}
public boolean cekPenuh(){
    if (top == size -1){
        return true;
    }else{
        return false;
    }
}

public void tambahBarang(Barang28 brg){
    if (!cekPenuh()) {
        top++;
        tumpukan [top]=brg;
        System.out.println("Barang "+brg.nama + " berhasil ditambahkan ke gudang");
    }else{
        System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
    }
}
public Barang28 ambilBarang(){
    if (!cekKosong()) {
        Barang28 delete = tumpukan[top];
        top--;
        System.out.println("Barang "+ delete.nama+" diambil dari Gudang");
        return delete;
    }else{
        System.out.println("Tumpukan barang kosong ");
        return null;
    }
}

public Barang28 lihatBarangTeratas(){
    if (!cekKosong()) {
        Barang28 barangTeratas = tumpukan[top];
        System.out.println("Barang teratas: "+barangTeratas.nama);
        return barangTeratas;
    }else{
        System.out.println("Tumpukan barang kososng");
        return null;
    }
}
public void tampilkanBarang(){
    if (!cekKosong()) {
        System.out.println("Rincian tumpukan barang di Gudang: ");
        for (int i = 0; i <= top; i++) {
            System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,tumpukan[i].kategori);
        } 
    }else{
        System.out.println("Tumpukan barang kosong.");
    }
}
}