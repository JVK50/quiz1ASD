package smt2.quizPart1;

import java.util.Scanner;

public class mataKuliahMain_13 {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        System.out.println("Masukkan jumlah mata kuliah: ");
        int jmlMk = Integer.parseInt(jvk.nextLine());
        System.out.println("--------------------------------------");
    
        mataKuliah_13[] arrayOfMK = new mataKuliah_13[jmlMk];
        String kodeMK, namaMK;
        int sks;

        for (int i = 0; i < jmlMk; i++) {
            System.out.print("Masukkan kode mata kuliah ke-" + (i + 1) + ": ");
            kodeMK = jvk.nextLine();
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMK = jvk.nextLine();
            System.out.print("Masukkan jumlah SKS mata kuliah ke-" + (i + 1) + ": ");
            sks = Integer.parseInt(jvk.nextLine());
            arrayOfMK[i] = new mataKuliah_13(kodeMK, namaMK, sks);
            System.out.println("--------------------------------------");
        }

        jvk.close();
    }
}
