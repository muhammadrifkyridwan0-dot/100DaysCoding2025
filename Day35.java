package rifky;

import java.util.Scanner;

public class OperatorPercabangan {
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int nilai = p.nextInt();
        
        if(nilai >= 75){
            System.out.println("Anda dinyatakan lulus");
        }
        else{
            System.out.println("Silahkan coba lagi");
        }
        
    }
    
}
