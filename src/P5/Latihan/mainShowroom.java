package P5.Latihan;

public class mainShowroom {
    
    public static void main(String[] args) {
        rumus[] car = {
            new rumus("BMW", "M2 Coupe", 2016, 6816, 728),
            new rumus("Ford", "Fiesta ST", 2014, 3921, 575),
            new rumus("Nissan", "370Z", 2009, 4360, 657),
            new rumus("Subaru", "BRZ", 2014, 4058, 609),
            new rumus("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new rumus("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new rumus("Toyota", "86/GT86", 2014, 4180, 609),
            new rumus("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
      
        int maxAcceleration = car[0].maxAcceleration(car, 0, car.length - 1);
        int minAcceleration = car[0].minAcceleration(car, 0, car.length - 1);
        double averagePower = car[0].averagePower(car);
      
        System.out.println("a) Top acceleration tertinggi: " + maxAcceleration);
        System.out.println("b) Top acceleration terendah: " + minAcceleration);
        System.out.println("c) Rata-rata top_power dari seluruh mobil: " + averagePower);
    }
}