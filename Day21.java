package rifky;

import java.util.Scanner;

public class MenukarNilai {

    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        
        //inputan
        System.out.print("Masukkan angka o: ");
        int o = x.nextInt();
        
        
        System.out.print("Masukkan angka p: ");
        int p = x.nextInt();
        
        System.out.println("\nSebelum ditukar: o = " + o + ", p = " + p);
        
        //Menukar nilai tanpa variabel tambahan
        
        o = o + p; // o sekarang adalah jumlah o + p
        p = o - p; // p menjadi nilai o semula
        o = o - p; // o menjadi nilai p semula
        
        System.out.println("Setelah ditukar: o = " + o + ", p = " + p);
    }
}
