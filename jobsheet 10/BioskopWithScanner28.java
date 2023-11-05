import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;

        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("== Menu ==");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu (1/2/3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                boolean kursiTerisi = true;

                while (kursiTerisi) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil ditambahkan.");
                            kursiTerisi = false;
                        } else {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom kursi tidak valid.");
                    }
                }
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
            } else if (menu == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String penontonName = penonton[i][j];
                        if (penontonName == null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penontonName);
                        }
                    }
                }
            } else if (menu == 3) {
                System.out.println("Terima Kasih");
                System.exit(0);
            } else {
                System.out.println("Menu tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}