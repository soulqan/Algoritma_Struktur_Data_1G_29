package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc28 =new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Masukkan jumlah elmen yang dihitung: ");
        int elemen = sc28.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat();
            System.out.println("Masukkan nilai yang hendak di pangkatkan: ");
            png[i].nilai =sc28.nextInt();
            System.out.println("Masukkan nilai pangkat : ");
            png[i].pangkat = sc28.nextInt();
            
        }
        System.out.println("Hasil pangkat - Brute Force");
        for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari "
                + png[i].nilai+ " Pangkat "
                +png[i].pangkat +" adalah "
                +png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("Hasil pangkat - Brute Force");
        for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari "
                + png[i].nilai+ " Pangkat "
                +png[i].pangkat +" adalah "
                +png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
    }
}
