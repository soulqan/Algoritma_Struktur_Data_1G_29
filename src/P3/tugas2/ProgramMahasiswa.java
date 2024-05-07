package P3.tugas2;
import java.util.Scanner;

public class ProgramMahasiswa {
    public static void main(String[] args) {
       
        Mahasiswa[] mahasiswas = new Mahasiswa[2];

       Mahasiswa.input(mahasiswas);
        Mahasiswa.printData(mahasiswas);
        
        System.out.println();
        double totalIpk = Mahasiswa.getTotalIpk(mahasiswas);
        double rataIpk = Mahasiswa.getRataIpk(mahasiswas);
        

        
        System.out.printf("Rata-rata IPK: %.2f\n", rataIpk);

       Mahasiswa.printMahasiswaTertinggi(mahasiswas);
}
}

