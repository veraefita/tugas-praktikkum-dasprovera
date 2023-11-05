import java.util.Scanner;
public class coba {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String bulan [] = {"jan", "feb", "mar"};
        
        System.out.print("Masukkan angka: ");
        int angka;
        angka = sc.nextInt();

        if (angka>=1 && angka<=12){
            angka -= 1;
            System.out.println("Bulan "+bulan[angka]);
        }
    }
}
