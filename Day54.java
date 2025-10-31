package rifky;
import java.util.Scanner;

public class KeywordContinue {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int jumlah = p.nextInt();

        System.out.println("\nMenampilkan angka dari 1 sampai " + jumlah + ", kecuali angka genap:");

        for (int i = 1; i <= jumlah; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println("Angka: " + i);
        }
    }
}
