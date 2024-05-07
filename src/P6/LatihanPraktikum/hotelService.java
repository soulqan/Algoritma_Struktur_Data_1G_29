package P6.LatihanPraktikum;

public class hotelService {

    hotel[] rooms = new hotel[5];
    int idxHotel;

    void tambah(hotel h) {
        if (idxHotel < rooms.length) {
            rooms[idxHotel] = h;
            idxHotel++;
        } else {
            System.out.println("Tidak bisa menambahkan, Hotel penuh");
            System.out.println();
        }
    }
    void tampilAll(){
        for (hotel h : rooms) {
            h.tampilData();
            System.out.println("-----------------------");
        }
    }
    void bubbleSortharga(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga>rooms[j-1].harga) {
                    hotel temp = rooms[j];
                    rooms [j] = rooms[j-1] ;
                    rooms[j - 1]=temp;
                }
            }
            
        }
    }
    void selectionSortBintang(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[maxIdx].bintang) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                hotel temp = rooms[i];
                rooms[i] = rooms[maxIdx];
                rooms[maxIdx] = temp;
            }
        }
    }

}