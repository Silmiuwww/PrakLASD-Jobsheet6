import java. util. Scanner;
public class MahasiswaBerprestasi12 {
    Mahasiswa12 [] listMhs = new Mahasiswa12[5];
    int idx;

    void tambah (Mahasiswa12 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        for (Mahasiswa12 m:listMhs){
            m.tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            for (int j = 1; j < listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa12 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for ( int j = i + 1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa12 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
