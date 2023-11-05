import java.util.Scanner; 
 public class LinearSearch28 {

    public static void main (String[]args) {
        Scanner input28 = new Scanner(System.in);

        int [] arrayInt = { 34,18,26,48,72,2};
        int key;
        int hasil = -1;

        System.out.print("Masukkan jumlah elemen array : ");
        int jumlahElemen = input28.nextInt();

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-" +i+ ":");
            arrayInt[i] = input28.nextInt();
        }
        System.out.print("Masukkan key yang ingin di cari : ");
        key = input28.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if ( arrayInt [i] == key){
                hasil = i;
                break;

            }
        }
        if (hasil == -1){
            System.out.println("key tidak ditemukan");

    }
}
}
