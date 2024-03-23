package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc28.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak di pangkatkan: ");
            int nilai = sc28.nextInt();
            System.out.println("Masukkan nilai pangkat : ");
            int pangkat = sc28.nextInt();
            png[i] = new pangkat(nilai, pangkat);
        }

        System.out.println("Pilih metode yang ingin digunakan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("Masukkan pilihan Anda: ");
        int choice = sc28.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hasil pangkat - Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil pangkat - Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
