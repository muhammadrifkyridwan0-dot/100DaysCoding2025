import java.util.Scanner;

public class SegitigaTerbalik {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
      
        System.out.print("Masukkan jumlah baris: ");
        int n = p.nextInt();
      
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
