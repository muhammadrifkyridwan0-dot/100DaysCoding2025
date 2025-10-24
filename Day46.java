package rifky;

import java.util.Scanner;

public class MembuatMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU TOKO HELLO WORLD ===");
        System.out.println("1. Roti -- Rp5.000");
        System.out.println("2. Matcha -- Rp25.000");
        System.out.println("3. Kopi -- Rp15.000");
        System.out.println("4. Teh -- Rp12.000");
        
        System.out.print("Masukkan pilihan anda disini^^: ");
        int menu = sc.nextInt();
        int harga = 0;
        
        switch (menu){
            case 1 :
                harga = 5000;
                System.out.println("Anda membeli Roti seharga Rp" + harga);
                System.out.println("Terimakasih sudah berbelanja:)");
                break;
            case 2 :
                harga = 25000;
                System.out.println("Anda membeli Matcha seharga Rp" + harga);
                System.out.println("Terimakasih sudah berbelanja:)");
                break;
                
            case 3 :
                harga = 15000;
                System.out.println("Anda membeli Kopi seharga Rp" + harga);
                System.out.println("Terimakasih sudah berbelanja:)");
                break;
            
            case 4 :
                harga = 12000;
                System.out.println("Anda membeli Teh seharga Rp" + harga);
                System.out.println("Terimakasih sudah berbelanja:)");
                break;
                
            default :
                 System.out.println("Maaf, plihan anda tidak tersedia pada menu:(");
                 break;
            
        }
    }
    
    }
