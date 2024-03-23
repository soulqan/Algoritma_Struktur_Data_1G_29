package P5.Sum;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc28 =new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. misal:5.9)");
        System.out.println("Masukkan jumlah bulan : ");
        int elm = sc28.nextInt();

        sum sm =new sum(elm);
        System.out.println("================================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("masukkan untung bulan ke - " +(i+1)+ " = ");
            sm.keuntungan[i]=sc28.nextDouble();
        } 
        System.out.println("==============================================");
        System.out.println("Algoritma Brute Force ");
        System.out.println("Total Keuntungan perusahaan selama "+sm.elemen +" bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("==============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total Keuntungan perusahaan selama "+sm.elemen +" bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
 