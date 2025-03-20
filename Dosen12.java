import java. util. Scanner;
public class Dosen12 {
    String kode;
    String nama;
    boolean jeniskelamin;
    int usia;

    Dosen12(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jeniskelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        if (jeniskelamin==true){
            System.out.println("Jenis Kelamin: Wanita");
        } else {
            System.out.println("Jenis Kelamin: Pria");
        }
        System.out.println("Usia: " + usia);
        
    }
}
