package rifky;
import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        while(angka <= 10){
            System.out.print(angka + " ");
            angka++;
        }
        System.out.println();
    }

}
