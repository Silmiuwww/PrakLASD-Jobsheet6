import java. util. Scanner;
public class DosenDemo12{
    public static void main(String[] args) {
        DataDosen12 list = new DataDosen12();
        Dosen12 d1 = new Dosen12("234","salma",true, 27);
        Dosen12 d2 = new Dosen12("102", "Rafi", false, 35);
        Dosen12 d3 = new Dosen12("103", "Dina", true, 40);
        Dosen12 d4 = new Dosen12("104", "Budi", false, 45);
        Dosen12 d5 = new Dosen12("105", "Tari", true, 32);
        Dosen12 d6 = new Dosen12("106", "Andi", false, 29);
        Dosen12 d7 = new Dosen12("107", "Mira", true, 38);
        Dosen12 d8 = new Dosen12("108", "Joko", false, 50);
        Dosen12 d9 = new Dosen12("109", "Lina", true, 36);
        Dosen12 d10 = new Dosen12("110", "Fajar", false, 41);
        
        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);  

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampilData();

        System.out.println("Data yang sudah terurut dari kecil ke besar berdasarkan usia");
        list.SortingASC();
        list.tampilData(); 
    }
}
