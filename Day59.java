package rifky;
import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = p.nextInt();

        System.out.println("Angka Ganjil:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Angka Genap:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

       
    }
}
