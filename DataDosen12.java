import java. util. Scanner;
public class DataDosen12{
    Dosen12[] dataDosen = new Dosen12[10];
    int idx;

    void tambah(Dosen12 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilData(){
        for (Dosen12 dsn : dataDosen){
            dsn.tampil();
            System.out.println("-----------------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen.length-1;i++){
            for (int j = 1; j < dataDosen.length-i;j++){
                if (dataDosen[j].usia < dataDosen[j-1].usia){
                    Dosen12 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < dataDosen.length-1;i++){
            int idxMIN = i;
            for (int j = i+1;j<dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMIN].usia){
                    idxMIN=j;
                }
            }
            Dosen12 tmp = dataDosen[idxMIN];
            dataDosen[idxMIN] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void InsertionDSC(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen12 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < temp.usia){
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }


}
