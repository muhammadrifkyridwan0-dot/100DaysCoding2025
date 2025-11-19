package rifky;
import java.util.Scanner;

public class HitungPenjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
          
            if (angka < 0) {
                System.out.println("Angka negatif terdeteksi.");
                break;
            }

            total += angka;
        }

        System.out.println("Total penjumlahan: " + total);
    }
}
