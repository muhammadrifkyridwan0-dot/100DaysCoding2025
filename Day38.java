package rifky;

import java.util.Scanner;

public class BianganBulat {
    public static void main(String[] args) {
      
        Scanner p = new Scanner(System.in);        
        System.out.print("Masukkan angka: ");
        int a = p.nextInt();
       
        
        if (a > 0){
            System.out.println("Bilangan Positif");
        }else if (a == 0){
            System.out.println("Angka 0");
        }else{
            System.out.println("Bilangan Negatif");
        }
}
}
