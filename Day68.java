package rifky;
import java.util.Scanner;

public class PolaPersegi {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = p.nextInt();

        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= n; j++) {   
                System.out.print("* ");
            }
        }
    }
}
