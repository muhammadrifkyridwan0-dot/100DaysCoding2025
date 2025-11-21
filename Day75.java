package rifky;
import java.util.Scanner;
public class StringDasar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String kata = input.nextLine();
        
        System.out.println("Panjang string: " + kata.length());
        System.out.println("String Huruf besar: " + kata.toUpperCase());
        System.out.println("String Huruf kecil: " + kata.toLowerCase());
        
    }
}
