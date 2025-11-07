package rifky;
import java.util.Scanner;

public class KelipatanM {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

   
        System.out.print("Masukkan nilai M: ");
        int M = p.nextInt();
        
        System.out.print("Masukkan nilai N: ");
        int N = p.nextInt();

        System.out.println("\nKelipatan " + M + " dari 1 sampai " + N + " adalah:");

       
        for (int i = 1; i <= N; i++) {
         
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
