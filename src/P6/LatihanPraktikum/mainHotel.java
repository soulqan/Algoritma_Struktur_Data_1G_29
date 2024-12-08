package P6.LatihanPraktikum;

public class mainHotel {
    public static void main(String[] args) {
    hotelService list = new hotelService();
    hotel h1 = new hotel("Serenity", "bogor", 1000000, (byte)5);
    hotel h2 = new hotel("Del Luna", "Jakarta", 350000, (byte)3);
    hotel h3 = new hotel("Aries", "Bandung", 500000, (byte)4);
    hotel h4 = new hotel("Red Ring", "Malang", 400000, (byte)4);
    hotel h5 = new hotel("Aquarius", "Palangkaraya", 450000, (byte)3);

    list.tambah(h1);
    list.tambah(h2);
    list.tambah(h3);
    list.tambah(h4);
    list.tambah(h5);

    System.out.println("Daftar Penginapan setelah sorting harga:");
        list.bubbleSortharga();
        list.tampilAll();

        
        System.out.println("\nDaftar Penginapan setelah sorting rating bintang:");
        list.selectionSortBintang();
        list.tampilAll();
    }

}

