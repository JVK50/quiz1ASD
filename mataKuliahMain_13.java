package smt2.quizPart1;

// import java.util.Scanner;

public class mataKuliahMain_13 {
    public static void main(String[] args) {
        // Scanner jvk = new Scanner(System.in);
        // System.out.println("Masukkan jumlah mata kuliah: ");
        // int jmlMk = Integer.parseInt(jvk.nextLine());
        System.out.println("--------------------------------------");
    
        // mataKuliah_13[] arrayOfMK = new mataKuliah_13[jmlMk];
        // String kodeMK, namaMK;
        // int sks;

        mataKuliah_13 matkul1 = new mataKuliah_13("MK001", "Matematika", 3);
        matkul1.tampilkanInfo();
        System.out.println("\n--------------------------------------");

        String hasilUbahNama = matkul1.ubahNamaMK("Matematika Lanjutan");
        System.out.println(hasilUbahNama);

        int hasilUbahSKS = matkul1.ubahSKS(4);
        System.out.println("Hasil ubah SKS: "+hasilUbahSKS);

        System.out.println("\n--------------------------------------");
        System.out.println("Informasi Mata Kuliah setelah diubah:");
        matkul1.tampilkanInfo();


    }
}
