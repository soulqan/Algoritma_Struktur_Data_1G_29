package P7.TestSearching;

import java.util.Scanner;

public class BukuMain28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku28 data = new PencarianBuku28();
        int jumBuku = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s. nextInt();
            System.out.print("Judul Nuku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t: ");
            int stock = s.nextInt();

            Buku28 m = new Buku28(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Mengggunakan Sequential Search");
        int posisi= data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);

        data.tampilData(cari, posisi);
    }
    
}
