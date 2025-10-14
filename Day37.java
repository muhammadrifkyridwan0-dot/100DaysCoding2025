package rifky;

import java.util.Scanner;

public class MenentukanBilanganGanjilGenap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 1) {
            System.out.println("Angka ganjil");
            
        }else{
            System.out.println("Angka genap");
        }
    }
    
}
