import java.util.Scanner;

public class PemilihanPercobaan128 {

    public static void main(String[] args){
    
        Scanner input28 =new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input28.nextInt();

        String hasil ;

        if (angka % 2 == 0) {
         hasil="bilangan genap";
        }
        else {
         hasil="bilangan ganjil";
        }
        
          System.out.println( angka+ " adalah " + hasil);
          


   

    }
}
