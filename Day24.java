package rifky;

import java.util.Scanner;

public class MenghitungLuasLingkaran {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        // Meminta jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = p.nextDouble();
        
        // Rumus luas lingkaran π * r * r
        double luas = Math.PI*r*r;
        
        // Tampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari: " + r + "\nadalah: " + luas);
    }
    
}
