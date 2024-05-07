package P1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc29= new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        String nim = sc29.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        System.out.println("NIM: "+n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    }

