package rifky;
import java.util.Scanner;

public class GanjilGenapN1 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = p.nextInt();
        
        System.out.println("Angka ganjil dari N ke 1:");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nAngka genap dari N ke 1:");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
