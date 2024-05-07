package P3.tugas;

public class LimasSegiEmpatSamaSisi {
    public double panjangSisiAlas;
     public double tinggi;
 
     public LimasSegiEmpatSamaSisi(double panjangSisiAlas, double tinggi) {
         this.panjangSisiAlas = panjangSisiAlas;
         this.tinggi = tinggi;
     }
 
     public double hitungLuasPermukaan() {
         return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * Math.sqrt((tinggi * tinggi) + ((panjangSisiAlas * panjangSisiAlas) / 4)));
     }
 
     
     public double hitungVolume() {
         return (1.0/3.0) * panjangSisiAlas * panjangSisiAlas * tinggi;
     }
 }
 