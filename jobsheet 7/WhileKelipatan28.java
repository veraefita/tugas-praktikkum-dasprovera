import java.util.Scanner;
public class WhileKelipatan28 {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        int total=0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        int i = 1;
        while (i <=50){
            if (i % kelipatan == 0){
                total += i;
                counter++;
                System.out.printf("Banyak  %d dari 1 sampai 50 adalah %d\n",kelipatan, total);
            } else {
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n ",kelipatan,total);

            }
            i++;



        }
        
    }
    
}
