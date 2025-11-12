package rifky;
import java.util.Scanner;

public class PolaVertikal {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int r = p.nextInt();
      
        for (int i = 1; i <= r; i++) {
            System.out.println("¥");
        }
    }
}
