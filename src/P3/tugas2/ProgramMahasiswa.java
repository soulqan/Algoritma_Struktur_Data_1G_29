package P3.tugas2;
import java.util.Scanner;

public class ProgramMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswas = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = scanner.nextLine().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); 

            mahasiswas[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        for (int i = 0; i < mahasiswas.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mahasiswas[i].getNama());
            System.out.println("NIM: " + mahasiswas[i].getNim());
            System.out.println("Jenis Kelamin: " + mahasiswas[i].getJenisKelamin());
            System.out.println("IPK: " + mahasiswas[i].getIpk());
        }
        System.out.println();

        double totalIpk = 0;
        for (Mahasiswa mahasiswa : mahasiswas) {
            totalIpk += mahasiswa.getIpk();
            
        }
        double rataIpk = totalIpk / mahasiswas.length;
        System.out.printf("Rata-rata IPK: %.2f" , rataIpk);

        Mahasiswa mahasiswaTertinggi = mahasiswas[0];
        for (int i = 1; i < mahasiswas.length; i++) {
            if (mahasiswas[i].getIpk() > mahasiswaTertinggi.getIpk()) {
                mahasiswaTertinggi = mahasiswas[i];
            }
        }

        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaTertinggi.getNama());
        System.out.println("NIM: " + mahasiswaTertinggi.getNim());
        System.out.println("Jenis Kelamin: " + mahasiswaTertinggi.getJenisKelamin());
        System.out.println("IPK: " + mahasiswaTertinggi.getIpk());
    }
}
