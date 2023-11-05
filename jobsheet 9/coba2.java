import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nilai dari pengguna
        System.out.print("Masukkan nilai matematika: ");
        double nilaiMatematika = input.nextDouble();

        System.out.print("Masukkan nilai fisika: ");
        double nilaiFisika = input.nextDouble();

        System.out.print("Masukkan nilai bahasa Inggris: ");
        double nilaiInggris = input.nextDouble();

        System.out.print("Masukkan nilai bahasa Indonesia: ");
        double nilaiIndonesia = input.nextDouble();

        // Menghitung rata-rata
        double rataRata = (nilaiMatematika + nilaiFisika + nilaiInggris + nilaiIndonesia) / 4;

        // Menampilkan rata-rata nilai
        System.out.println("Rata-rata nilai calon mahasiswa adalah: " + rataRata);
    }
}
