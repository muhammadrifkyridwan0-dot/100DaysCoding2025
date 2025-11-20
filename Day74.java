import java.util.Scanner;

public class MenuBerulang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Menampilkan Nama");
            System.out.println("2. Menghitung Perkalian") ;
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");

            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Nama saya: Riduu");
                    break;

                case 2:
                    System.out.print("Masukkan angka 1: ");
                    int a = input.nextInt();
                    System.out.print("Masukkan angka 2: ");
                    int b = input.nextInt();
                    System.out.println("Hasil kali = " + (a * b));
                    break;
                
              case :3
                    System.out.println("Keluar.");
                    return; 

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        }
    }
}
