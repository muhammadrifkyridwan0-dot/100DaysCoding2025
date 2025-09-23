package rifky;

import java.util.Scanner;

public class OperatorAritmatika {

    public static void main(String[] args) {

        Scanner p = new Scanner (System.in);
                
        //Operator Aritmatika Modulus/Sisa Bagi (%) 
        
        System.out.print("Masukkan Nilai a1 : ");
        int a1 = p.nextInt();
        
        System.out.print("Masukkan Nilai a2 : ");
        int a2 = p.nextInt();
        
        //mencetak modulus (sisa bagi)
        int Hasil = a1 % a2;
        System.out.println("Sisa Bagi: " + Hasil);
        



    }
    
}
