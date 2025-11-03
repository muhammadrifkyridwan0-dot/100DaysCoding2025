package rifky;
import java.util.Scanner;

public class NestedLoopScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        System.out.println("\n--- Pola Bintang ---");

        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
