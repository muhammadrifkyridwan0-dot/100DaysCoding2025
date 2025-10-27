package rifky;
import java.util.Scanner;

public class GanjilGenapTernary{
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = p.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil + ".");
        
     
    }
}
