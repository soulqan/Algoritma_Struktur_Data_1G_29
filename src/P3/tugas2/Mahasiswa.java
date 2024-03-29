package P3.tugas2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;
    public static Scanner scanner = new Scanner(System.in);

    // Constructor
    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }
    public static double getTotalIpk(Mahasiswa[] mahasiswas) {
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : mahasiswas) {
            totalIpk += mahasiswa.getIpk();
        }
        return totalIpk;
    }

    public static double getRataIpk(Mahasiswa[] mahasiswas) {
        double totalIpk = getTotalIpk(mahasiswas);
        return totalIpk / mahasiswas.length;
    }

    public static Mahasiswa getMahasiswaTertinggi(Mahasiswa[] mahasiswas) {
        Mahasiswa mahasiswaTertinggi = mahasiswas[0];
        for (int i = 1; i < mahasiswas.length; i++) {
            if (mahasiswas[i].getIpk() > mahasiswaTertinggi.getIpk()) {
                mahasiswaTertinggi = mahasiswas[i];
            }
        }
        return mahasiswaTertinggi;
    }
    public static void printMahasiswaTertinggi(Mahasiswa[]mahasiswas){
        Mahasiswa mahasiswaTertinggi = Mahasiswa.getMahasiswaTertinggi(mahasiswas);
        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaTertinggi.getNama());
        System.out.println("NIM: " + mahasiswaTertinggi.getNim());
        System.out.println("Jenis Kelamin: " + mahasiswaTertinggi.getJenisKelamin());
        System.out.println("IPK: " + mahasiswaTertinggi.getIpk());
    }

    public static void printData(Mahasiswa[]mahasiswas){
        for (int i = 0; i < mahasiswas.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mahasiswas[i].getNama());
            System.out.println("NIM: " + mahasiswas[i].getNim());
            System.out.println("Jenis Kelamin: " + mahasiswas[i].getJenisKelamin());
            System.out.println("IPK: " + mahasiswas[i].getIpk());
    }
}
    public static void input(Mahasiswa[]mahasiswas){
        for (int i = 0; i < mahasiswas.length; i++) {
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
    }
}


