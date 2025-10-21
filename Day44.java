package rifky;

import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int a = p.nextInt();
        
        if (a >= 90) {
            System.out.println("Nilai A");
        } else if (a >= 80 && a < 90) {
            System.out.println("Nilai B");
        } else if (a >= 70 && a < 80) {
            System.out.println("Nilai C");
        } else if (a >= 60 && a < 70) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
