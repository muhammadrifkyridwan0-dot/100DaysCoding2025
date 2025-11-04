package rifky;
import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
       
        System.out.print("Masukkan nilai N: ");
        int N = p.nextInt();
        
        System.out.println("Angka dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("Angka dari " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
