package rifky;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Pilih antara 1 sampai 3: ");
        int a = p.nextInt();
        
        switch (a){
            case 1:
                System.out.println("Memilih angka 1");
                break;
            case 2:
                System.out.println("Memilih angka 2");
                break;
            case 3:
                System.out.println("Memilih angka 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
