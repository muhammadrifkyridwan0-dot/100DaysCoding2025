package rifky;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
        int angka;
        
        do {
            System.out.print("Masukkan angka (ketik 0 untuk berhenti): ");
            angka = p.nextInt();
            
            if (angka != 0) {
                System.out.println("Memasukkan angka: " + angka);
            }
        } while (angka !=0);
 }
    
}
