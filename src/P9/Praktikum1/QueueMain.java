package P9.Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);

        System.out.print("masukkan kapasitas queue: ");
        int n = sc28.nextInt();

        Queue Q = new Queue(n);
        int pilih;

       do {
        menu();
        pilih = sc28.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Masukkan data baru: ");
                int dataMasuk = sc28.nextInt();
                Q.Enqueue(dataMasuk);
                break;
            case 2:
                int dataKeluar =Q.Dequeue();
                if (dataKeluar!=0) {
                    System.out.println("Data yang dikeluarkan: "+dataKeluar);
                    break;
                }
            case 3:
                Q.Print();
                break;
            case 4: 
                Q.peek();
                break;
            case 5: 
                Q.clear();
                break;
        }
        
       } while (pilih == 1||pilih == 2||pilih==3||pilih==4||pilih==5);
    }
}
