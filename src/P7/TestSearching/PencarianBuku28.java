package P7.TestSearching;

public class PencarianBuku28 {
    Buku28 listBk28[]= new Buku28[5];
    int idx;

    void tambah(Buku28 m){
        if  (idx<listBk28.length) {
            listBk28[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!");
        }
    }
    void tampil(){
        for (Buku28 m : listBk28) {
            m.tampilDataBuku();
            
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk28.length; j++) {
            if (listBk28[j].kodeBuku == cari) {
                
            
            posisi = j;
            break;
        }
    }
    return posisi;
        }

    

        public void TampilPosisi(int x,int pos){
            if (pos!=-1) {
                System.out.println("Data : "+x+" Ditemukan pada indeks "+pos);
            }else{
                System.out.println("Data "+x+ " tidak ditemukan");
            }
        }
        public void tampilData(int x, int pos){
            if(pos!=-1){
                System.out.println("Kode Buku\t : "+x);
                System.out.println("Judul\t : "+listBk28[pos].judulBuku);
                System.out.println("Tahun Terbit\t : "+listBk28[pos].tahunTerbit);
                System.out.println("Pengarang\t : "+listBk28[pos].pengarang);
                System.out.println("Stock\t : "+listBk28[pos].stock);

            }else{
                System.out.println("Data "+x+" Tidak Ditemukan");
            }
        }

        public Buku28 FindBuku(int cari) {
            Buku28 buku = null;
            for (int j = 0; j < listBk28.length; j++) {
                if (listBk28[j].kodeBuku == cari) {
                    buku = listBk28[j];
                    break;
                }
            }
            return buku;
        }
        public int FindBinarySearch(int cari, int left, int right){
            if (right >= left) {
                int mid = left + (right - left) / 2;
                if (listBk28[mid].kodeBuku == cari) {
                    return mid;
                } else if (listBk28[mid].kodeBuku > cari) {
                    return FindBinarySearch(cari, left, mid - 1);
                } else {
                    return FindBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }
    }
    

