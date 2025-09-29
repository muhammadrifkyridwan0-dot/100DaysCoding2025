package rifky;

import java.util.Scanner;

public class HitungLuas {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        // Meminta memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = p.nextDouble();
        
        // Hitung luas
        double luas = sisi*sisi;
        
        // Tampilkan hasil
        System.out.println("Luas persegi panjang dengan sisi: " + sisi + "\nadalah: " + luas);
    }
    
}
