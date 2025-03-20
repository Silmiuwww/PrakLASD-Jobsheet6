import java.util.Scanner;
public class ModifNo2Prak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData Mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nPilih metode sorting:");
        System.out.println("1. Bubble Sort (Descending - IPK tertinggi ke terendah)");
        System.out.println("2. Selection Sort (Ascending - IPK terendah ke tertinggi)");
        System.out.println("3. Insertion Sort (Ascending -IPK terendah ke tertinggi)");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            list.bubbleSort();
            System.out.println("\nData setelah Bubble Sort (DESC):");
        } else if (pilihan == 2) {
            list.SelectionSort();
            System.out.println("\nData setelah Selection Sort (ASC):");
        
        } else if (pilihan == 2) {
            list.SelectionSort();
            System.out.println("\nData setelah INSERTION Sort (ASC):");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        list.tampil();
    }
}

