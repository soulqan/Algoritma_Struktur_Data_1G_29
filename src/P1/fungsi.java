package P1;
import java.util.Scanner;

public class fungsi {

    
    static final double HARGA_AGLONEMA = 75000;
    static final double HARGA_KELADI = 50000;
    static final double HARGA_ALOCASIA = 60000;
    static final double HARGA_MAWAR = 10000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int[] stokAglonema = {10, 6, 2, 5};
        int[] stokKeladi = {5, 11, 10, 7};
        int[] stokAlocasia = {15, 9, 10, 12};
        int[] stokMawar = {7, 12, 5, 9};

        
        double[] pendapatanCabang = hitungPendapatanCabang(stokAglonema, stokKeladi, stokAlocasia, stokMawar);

        
        for (int i = 0; i < pendapatanCabang.length; i++) {
            System.out.printf("Cabang RoyalGarden %d: Rp %.2f\n", i + 1, pendapatanCabang[i]);
        }

        
        int[] stokCabang4 = {stokAglonema[3], stokKeladi[3], stokAlocasia[3], stokMawar[3]};

        
        stokCabang4 = kurangiStok(stokCabang4, 1, 2, 0, 5); // (aglonema mati, keladi mati, alocasia mati, mawar mati)

        
        System.out.println("\nStok Bunga di Cabang RoyalGarden 4:");
        for (int i = 0; i < stokCabang4.length; i++) {
            String namaBunga = getNamaBunga(i);
            System.out.printf("%s: %d\n", namaBunga, stokCabang4[i]);
        }
    }

    
    static double[] hitungPendapatanCabang(int[] stokAglonema, int[] stokKeladi, int[] stokAlocasia, int[] stokMawar) {
        double[] pendapatan = new double[stokAglonema.length];
        for (int i = 0; i < pendapatan.length; i++) {
            pendapatan[i] = stokAglonema[i] * HARGA_AGLONEMA +
                           stokKeladi[i] * HARGA_KELADI +
                           stokAlocasia[i] * HARGA_ALOCASIA +
                           stokMawar[i] * HARGA_MAWAR;
        }
        return pendapatan;
    }

    
    static int[] kurangiStok(int[] stok, int aglonemaMati, int keladiMati, int alocasiaMati, int mawarMati) {
        stok[0] -= aglonemaMati;
        stok[1] -= keladiMati;
        stok[2] -= alocasiaMati;
        stok[3] -= mawarMati;
        return stok;
    }

    
    static String getNamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "Bunga tidak dikenal";
        }
    }
}
