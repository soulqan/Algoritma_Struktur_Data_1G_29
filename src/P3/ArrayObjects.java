package P3;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc29=new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int PersegiPanjang=sc29.nextInt();
        PersegiPanjang[] ppArray= new PersegiPanjang[PersegiPanjang];
        
       
       
        for (int i = 0; i < PersegiPanjang; i++) 
        {
            ppArray[i]=new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang =sc29.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar =sc29.nextInt();
        }

        for (int i = 0; i < PersegiPanjang; i++) {
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang+", Lebar: "+ppArray[i].lebar);
            
        }
    }
}
