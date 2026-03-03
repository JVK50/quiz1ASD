package smt2.quizPart1;
public class mataKuliah_13 {
    String kodeMK;
    String namaMK;
    int sks;

    public mataKuliah_13(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    
    public void ubahSKS(int sks) {
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2.");
        }
    }
    
    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
    }
}
