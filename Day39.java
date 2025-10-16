package rifky;

import java.util.Scanner;

public class DaftarMenuu {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        int pilihan;
        
        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Ayam Geprek");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Mie Ayam");
        System.out.println("5. Mie Goreng");
        System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = p.nextInt();
        
        
        if(pilihan == 1){
            System.out.println("Anda memilih Nasi Goreng. Harga: Rp.15.000");
        }else if (pilihan == 2){
            System.out.println("Anda memilih Ayam Geprek. Harga: Rp.13.000");
        }else if(pilihan == 3){
            System.out.println("Anda memilih Soto Ayam. Harga: Rp.15.000");
        }else if(pilihan == 4){
            System.out.println("Anda memilih Mie Ayam. Harga: Rp.15.000")
        }else if(pilihan == 5){
            System.out.println("Anda memilih Mie Goreng. Harga: Rp.15.000");
        }else{
            System.out.println("Pilihan tidak valid! Silahkan coba lagi. ");
        }
        
        
    }
    
}
