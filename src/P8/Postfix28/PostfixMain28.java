package P8.Postfix28;

import java.util.Scanner;

public class PostfixMain28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc28.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix28 post = new Postfix28(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+ P);
    }
}
