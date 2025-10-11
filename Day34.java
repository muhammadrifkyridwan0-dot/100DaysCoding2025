package rifky;

import java.util.Scanner;

public class OperatorLogika {
    public static void main(String[] args) {
      
        Scanner p = new Scanner(System.in);        
        System.out.print("Masukkan nilai: ");
        int a = p.nextInt();
        System.out.print("Masukkan nilai: ");
        int b = p.nextInt();
        
        System.out.println("a > b " + (a > b));
        System.out.println("a < b " + (a < b));
        System.out.println("a >= b " + (a >= b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        
        System.out.println("(a > b) && (a < b): " + ((a < b) && (b > 0)));
        System.out.println("(a > b) && (a < b): " + ((a < b) || (b > 0)));
    }
}
