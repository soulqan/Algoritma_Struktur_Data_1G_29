package P8;

import java.util.Scanner;

public class Utama28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang yang diinginkan: ");
        int kapasitas = sc28.nextInt();
        sc28.nextLine();
        Gudang28 gudang = new Gudang28(kapasitas);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. keluar");
            System.out.println("Pilih operasi: ");
            int pilihan = sc28.nextInt();
            sc28.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc28.nextInt();
                    sc28.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc28.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc28.nextLine();
                    Barang28 barangBaru = new Barang28(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
