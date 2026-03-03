package smt2.quizPart1;

// import java.util.Scanner;

public class mahasiswaMain_13 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // objek mata kuliah
        mataKuliah_13 mk1 = new mataKuliah_13("MK001", "Matematika", 3); 
        mataKuliah_13 mk2 = new mataKuliah_13("MK002", "Algoritma", 4);
        mataKuliah_13 mk3 = new mataKuliah_13("MK003", "Basis Data", 3);

        // objek mahasiswa
        mahasiswa_13 mhs1 = new mahasiswa_13("254107060095", "Jack", 2025);
        
        // menambahkan mata kuliah ke mahasiswa
        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);
        
        // menampilkan informasi mahasiswa
        System.out.println("--------------------------------------");
        System.out.println("Informasi Mahasiswa: ");
        mhs1.tampilkanInfo();
        System.out.println("\n--------------------------------------");

        // Menampilkan sks
        System.out.println("Total SKS yang diambil: " + mhs1.hitungTotalSks());



    } 
}
