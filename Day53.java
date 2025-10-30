package rifky;
import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        while(angka <= 10){
            System.out.print(angka + " ");
            angka++;
            if(angka == 6){
                break;
            }
        }
        System.out.println();
    }

}
