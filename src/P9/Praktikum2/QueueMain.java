package P9.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("l. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc28.nextInt();
        Queue antri28 = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc28.nextInt();
            sc28.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc28.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc28.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc28.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc28.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc28.nextDouble();
                    Nasabah28 nb = new Nasabah28(norek, nama, alamat, umur, saldo);
                    sc28.nextLine();
                    antri28.Enqueue(nb);
                    break;
                case 2:
                    Nasabah28 data = antri28.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) & !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                                + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri28.peek();
                    break;
                case 4:
                    antri28.Print();
                    break;

            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
