package P2;

public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1=new Buku29();
        bk1.judul= "Today Ends Tomorrow Comes";
        
        bk1.pengarang= "Denanda Pratiwi";
        bk1.pengarang ="John Irving";
        bk1.halaman=198;
        bk1.stok=13;
        bk1.harga=71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        

        Buku29 bk2 = new Buku29("Self Reward", "Maheera Ayesha", 160, 29, 59000,8);
        bk2.tampilInformasi();
        Buku29 bukuSoultan = new Buku29("Kimchi confession", "xaviera putri", 200, 80, 60000,8);
    }
}
