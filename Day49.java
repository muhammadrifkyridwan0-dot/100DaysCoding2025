package rifky;
import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = p.nextInt();
      
        String hasil = (nilai > 70) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + hasil);
   
    }
}
