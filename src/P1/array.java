package P1;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

      
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("======================");

       
        double[] nilai = new double[8];
        double[] bobotNilai = {0, 1, 2, 2.5, 3, 3.5, 4};
        String[] matKul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        String[] nilaiHuruf = {"E", "D", "C", "C+", "B", "B+", "A"};
        double[] bobotNilaiAkhir = new double[8];
        String[] nilaiHurufAkhir = new String[8];

      
        for (int i = 0; i < matKul.length; i++) {
            System.out.printf("Masukkan nilai angka untuk MK %s : ", matKul[i]);
            nilai[i] = sc29.nextDouble();
        }

       
        for (int i = 0; i < matKul.length; i++) {
            if (nilai[i] > 80) {
                nilaiHurufAkhir[i] = nilaiHuruf[6];
                bobotNilaiAkhir[i] = bobotNilai[6];
            } else if (nilai[i] > 73) {
                nilaiHurufAkhir[i] = nilaiHuruf[5];
                bobotNilaiAkhir[i] = bobotNilai[5];
            } else if (nilai[i] > 65) {
                nilaiHurufAkhir[i] = nilaiHuruf[4];
                bobotNilaiAkhir[i] = bobotNilai[4];
            } else if (nilai[i] > 60) {
                nilaiHurufAkhir[i] = nilaiHuruf[3];
                bobotNilaiAkhir[i] = bobotNilai[3];
            } else if (nilai[i] > 50) {
                nilaiHurufAkhir[i] = nilaiHuruf[2];
                bobotNilaiAkhir[i] = bobotNilai[2];
            } else if (nilai[i] > 39) {
                nilaiHurufAkhir[i] = nilaiHuruf[1];
                bobotNilaiAkhir[i] = bobotNilai[1];
            } else {
                nilaiHurufAkhir[i] = nilaiHuruf[0];
                bobotNilaiAkhir[i] = bobotNilai[0];
            }
        }

      
        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-50s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matKul.length; i++) {
            System.out.printf("%-50s %-15s %-15s %-15s\n", matKul[i], nilai[i], nilaiHurufAkhir[i], bobotNilaiAkhir[i]);
        }
        System.out.println("=======================");

        
        double hasil = 0;
        for (int i = 0; i < matKul.length; i++) {
            if (i==3||i==6) {
            hasil+= bobotNilaiAkhir[i]*3;   
            }else{
            hasil += bobotNilaiAkhir[i]*2;
            }
        }
        double IP = hasil / 18;

       
        System.out.printf("IP: %.2f\n", IP);
    }
}
