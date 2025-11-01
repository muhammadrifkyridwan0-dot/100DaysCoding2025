package rifky;
import java.util.Scanner;

public class NilaiUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        
       
        if (nilai > 70) {
            System.out.println("Ujian Kroco Ji Pale");
        } else {
            System.out.println("Sa Jappo'ki Aih");
        }
      
    }
}
