import java.util.Scanner;
public class ArrayRataNilai28 {
    public static void main (String[]args) {
      Scanner input28 = new Scanner(System.in);

      System.out.print("Masukkan jumlah mahasiswa :");
      int jumlahMahasiswa = input28.nextInt();

      int [] nilaiMhs = new int [jumlahMahasiswa]; 
      double totalLulus = 0;
      double totalTidakLulus=0;
      int lulus=0;
      int tidakLulus = 0;

      for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1 )+":");
        nilaiMhs[i] = input28.nextInt ();
           
            if (nilaiMhs[i]> 70){
              totalLulus += nilaiMhs[i];
                lulus++;

            }else {
              totalTidakLulus += nilaiMhs[i];
              tidakLulus++;
            }
        }
        double rata2Lulus= lulus > 0 ? totalLulus / lulus : 0;
        double rata2TidakLulus = tidakLulus > 0 ? totalTidakLulus / tidakLulus : 0;

        System.out.println("Rata-rata nilai lulus =" +rata2Lulus);
        System.out.println("Rta-rata nilai tidak lulus =" +rata2TidakLulus);

        


      
    }
    
}
