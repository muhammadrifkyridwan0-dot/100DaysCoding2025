package rifky;
import java.util.Scanner;

public class PangkatMN {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
      
        System.out.print("Masukkan nilai M: ");
        int M = p.nextInt();
        
        System.out.print("Masukkan nilai N: ");
        int N = p.nextInt();
        

        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }
        
      
        System.out.println(M + " pangkat " + N + " = " + hasil);
        
 
    }
}
