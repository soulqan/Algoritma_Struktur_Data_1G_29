package P5.Sum;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc28 =new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. misal:5.9)");

        System.out.println("Masukkan Jumlah Perusahaan: ");
        int jmlPerusahaan = sc28.nextInt();
        sum []perusahaan = new sum[jmlPerusahaan];

        for (int i = 0; i < jmlPerusahaan; i++) {
        System.out.println("================================");
        System.out.println("Data perusahaan ke - " +(i+1));
        System.out.println("Masukkan jumlah bulan : ");
        int elm = sc28.nextInt();
        perusahaan[i] = new sum(elm);
        System.out.println("================================================================");
        for (int j = 0; j < elm; j++) {
            System.out.print("masukkan untung bulan ke - " +(j+1)+ " = ");
            perusahaan[i].keuntungan[j]=sc28.nextDouble();
        }
    }
        for (int i = 0; i < jmlPerusahaan; i++) {
        System.out.println("Data Perusahaan ke- "+(i+1)+(" : "));
        System.out.println("==============================================");
        System.out.println("Algoritma Brute Force ");
        System.out.println("Total Keuntungan perusahaan selama "+perusahaan[i].elemen +" bulan adalah = "+perusahaan[i].totalBF(perusahaan[i].keuntungan));
        System.out.println("==============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total Keuntungan perusahaan selama "+perusahaan[i].elemen +" bulan adalah = "+perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen-1));
        System.out.println();
    }
}
}
 