package P15;

import java.util.Scanner;

public class GraphMain28 {
    public static void main(String[] args) throws Exception {
        Scanner scanner28 = new Scanner(System.in);
        Graph28 gedung = new Graph28(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

       
        while (true) {
            System.out.print("Masukkan gedung asal: ");
            int asal = scanner28.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = scanner28.nextInt();

            if (gedung.isAdjacent(asal, tujuan)) {
                System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " tidak bertetangga");
            }

            System.out.print("Apakah Anda ingin mengecek jalur lagi? (y/n): ");
            char response = scanner28.next().charAt(0);
            if (response == 'n' || response == 'N') {
                break;
            }
        }

        scanner28.close();
    }
}
