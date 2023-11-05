import java.util.Scanner;

public class coba4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa yang mengikuti seleksi: ");
        int jumlahSiswa = input.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Data Calon Mahasiswa ke-" + i);

            System.out.print("Masukkan nilai matematika: ");
            double nilaiMatematika = input.nextDouble();

            System.out.print("Masukkan nilai fisika: ");
            double nilaiFisika = input.nextDouble();

            System.out.print("Masukkan nilai bahasa Inggris: ");
            double nilaiInggris = input.nextDouble();

            System.out.print("Masukkan nilai bahasa Indonesia: ");
            double nilaiIndonesia = input.nextDouble();

            double rataRata = (nilaiMatematika + nilaiFisika + nilaiInggris + nilaiIndonesia) / 4;
            String jurusan = "Unknown";

            if (rataRata >= 80 && nilaiMatematika >= 80) {
                jurusan = "D4 TI";
            } else if (nilaiMatematika >= 70 && nilaiFisika >= 70) {
                jurusan = "D3 MI";
            } else if (rataRata > 80 &&
                    nilaiMatematika >= 70 &&
                    nilaiInggris >= 70 &&
                    nilaiIndonesia >= 70) {
                jurusan = "D3 MI (dari jurusan Bahasa)";
            } else {
                jurusan = "Tidak Lolos Seleksi";
            }

            System.out.println("Hasil seleksi: Anda diterima di prodi " + jurusan);
        }
    }
}