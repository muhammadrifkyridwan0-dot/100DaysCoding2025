package rifky;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = p.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
    }
}
