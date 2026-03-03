package smt2.quizPart1;

public class mahasiswa_13 {
    String NIM;
    String nama;
    int tahunMasuk;
    public mataKuliah_13[] mkDiambil;
    int jmlMatkulDiambil;
    

    public mahasiswa_13(String NIM, String nama, int tahunMasuk) {
        this.NIM = NIM;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mkDiambil = new mataKuliah_13[10];
        this.jmlMatkulDiambil = 0;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Total SKS: " + hitungTotalSks());
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        if (jmlMatkulDiambil == 0) {
            System.out.println("Belum ada mata kuliah");
        } else {
            for (int i = 0; i < jmlMatkulDiambil; i++) {
                mataKuliah_13 mk = mkDiambil[i];
                System.out.println("Mk kode: " + mk.kodeMK);
                System.out.println("Mk nama: " + mk.namaMK);
                System.out.println("Mk sks: " + mk.sks);
                }
            }
        }

        public void tambahMataKuliah(mataKuliah_13 emka) {
            if (jmlMatkulDiambil < mkDiambil.length) {
                mkDiambil[jmlMatkulDiambil] = emka;
                jmlMatkulDiambil++;
                System.out.println("Mata kuliah " + emka.namaMK + " berhasil ditambahkan.");
            } else {
                System.out.println("Jumlah mata kuliah sudah maksimal");
            }
        }

        public int hitungTotalSks() {
            int totalSks = 0;
            for (int i = 0; i < jmlMatkulDiambil; i++) {
                if (mkDiambil[i] != null) {
                    totalSks += mkDiambil[i].sks;
                }
            }
            return totalSks;
        }
}
