package P3.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Kerucut[] kerucutArray = new Kerucut[2];
        LimasSegiEmpatSamaSisi[] limasArray = new LimasSegiEmpatSamaSisi[2];
        Bola[] bolaArray = new Bola[2];

        System.out.println("Kerucut\n");
        for (int i = 0; i < kerucutArray.length; i++) {
            System.out.println("\nKerucut  ke-" + (i));
            System.out.print("Masukkan jari-jari: ");
            double jariJariKerucut = scanner.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            double sisiMiringKerucut = scanner.nextDouble();
            kerucutArray[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
        }
        
        System.out.println("\nLimas Segi Empat Sama Sisi\n");
        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("\nLimas ke-"+i);
            System.out.print("Masukkan panjang sisi alas: ");
            double panjangSisiAlasLimas = scanner.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();
            limasArray[i] = new LimasSegiEmpatSamaSisi(panjangSisiAlasLimas, tinggiLimas);
        }
        
        System.out.println("\nBola\n");
        for (int i = 0; i < bolaArray.length; i++) {
            System.out.println("\nBola ke-"+i);
            System.out.print("Masukkan jari-jari bola: \n");
            double jariJariBola = scanner.nextDouble();
            bolaArray[i] = new Bola(jariJariBola);
        }

        for (int i = 0; i < kerucutArray.length; i++) {
            System.out.println("Kerucut " + i + ":");
            System.out.printf("Luas Permukaan: %.2f\n", kerucutArray[i].hitungLuasPermukaan());
            System.out.printf("Volume: %.2f\n", kerucutArray[i].hitungVolume());
        }

        for (int i = 0; i < limasArray.length; i++) {
            System.out.println("Limas " + i + ":");
            System.out.printf("Luas Permukaan: %.2f\n", limasArray[i].hitungLuasPermukaan());
            System.out.printf("Volume: %.2f\n", limasArray[i].hitungVolume());
        }

        for (int i = 0; i < bolaArray.length; i++) {
            System.out.println("Bola " + i + ":");
            System.out.printf("Luas Permukaan: %.2f\n", bolaArray[i].hitungLuasPermukaan());
            System.out.printf("Volume: %.2f\n", bolaArray[i].hitungVolume());
        }
    }
}
