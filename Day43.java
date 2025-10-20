package rifky;

import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int a = p.nextInt();
        
        if (a % 3 == 0 && a % 5 == 0){
            System.out.println("Kelipatan 3 dan 5");
        } else if (a % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (a % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan 3 ataupun 5");
        }
    }
}
