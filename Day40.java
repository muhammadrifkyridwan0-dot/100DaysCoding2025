package rifky;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
      
        Scanner p = new Scanner(System.in);        
        int angka1, angka2, hasil;
        char operator;

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = p.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = p.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = p.nextInt();

        // Menggunakan percabangan if
        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Error: Pembagian dengan nol tidak bisa!");
            }
        } else {
            System.out.println("Operator tidak dikenal!");
        }

}
}
