package rifky;
import java.util.Scanner;

public class JumlahAngka {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = p.nextInt();
        
        int total = 0;
     
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        
        System.out.println("Jumlah dari 1 sampai " + N + " adalah: " + total);
    }
}
