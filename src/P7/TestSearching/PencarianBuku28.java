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
    }

