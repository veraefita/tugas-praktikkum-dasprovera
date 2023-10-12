import java.util.Scanner;

public class PemilihanPercobaan228 {

    public static void main(String[] args){
       Scanner input28 =new Scanner(System.in);
       
       System.out.println("Nilai uas  :");
       float uas = input28.nextFloat();
       System.out.println("Nilai uts  :");
       float uts = input28.nextFloat();
       System.out.println("Nilai kuis  :");
       float kuis = input28.nextFloat ();
       System.out.println("Nilai tugas  :");
       float tugas = input28.nextFloat();
 
       float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas *0.2F);
       String message = total < 65 ? "Remidi" : " Tidak Remidi";

       System.out.println("Nilai akhir =  "+ total + " Sehingga" + message );

       System.out.print("Masukan nilai : ");
        int nilai = input28.nextInt();
        String nilaiHuruf = "";
        double nilaiSetara = 0;
        String kualifikasi = "";

        if (nilai >=80) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat baik";

        } else if (nilai >= 73) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";

        } else if (nilai >= 65) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";

        } else if (nilai >= 60) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";

        } else if (nilai >= 50) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";

        } else if (nilai >= 39) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";

        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }
        System.out.printf("Nilai huruf = %s\nNilai setara = %s\nNilai kualifikasi = %s\n", nilaiHuruf, nilaiSetara, kualifikasi);
    
    }
}
