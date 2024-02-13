package P1;

import java.util.Scanner;

public class pemilihan {

    static Scanner sc29=new Scanner(System.in);
    public static void main(String[] args) {
        double hasil =0;
        System.out.println("Program menghitung nilai akhir ");
        System.out.println("================================");
        System.out.print("Masukkan nilai Tugas: ");
        double tugas=sc29.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        double kuis=sc29.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts=sc29.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas=sc29.nextDouble();
        System.out.println("================================");
        System.out.println("================================");
        boolean  cek = true;
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            cek = false;
            System.out.println("nilai Tidak Valid");
        }
        if (cek) {
        hasil=(((20*tugas)+(20*kuis)+(30*uts)+(30*uas))/100);
        System.out.println("Nilai Akhir: "+hasil);
        System.out.print("Nilai Huruf: ");
        if (hasil > 80) {
            System.out.println("A");
        } else if (hasil > 73) {
            System.out.println("B+");
        } else if (hasil > 65) {
            System.out.println("B");
        } else if (hasil > 60) {
            System.out.println("C+");
        } else if (hasil > 50) {
            System.out.println("C");
        } else  if (hasil > 39) {
            System.out.println("D");
        }else{
            System.out.println("E");
        }
        System.out.println("================================");
        System.out.println("================================");
        if  (hasil <= 50){
            System.out.println("Tidak Lulus");
        }else{
            System.out.println("Lulus");
        }

    }
}
    }

   