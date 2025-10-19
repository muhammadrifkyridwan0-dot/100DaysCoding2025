package rifky;

import java.util.Scanner;

public class MenentukanSlipGaji{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Karyawan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        double gp = sc.nextDouble();
        System.out.print("Masukkan tunjangan: ");
        double t = sc.nextDouble();
        
        double pj;
        
        
        if (gp >= 7000000 ) {
            pj = 0.10 * gp;
             
        }else if (gp >= 3000000){
            pj = 0.5 * gp;
            
        }else{
            pj = 0;
    }
       double gb = gp + t - pj;
        System.out.println("==================================");
        System.out.println("            SLIP GAJI ");
        System.out.println("==================================");
        System.out.printf("Nama karyawan: %s ", nama);
        System.out.printf("\nGaji pokok   : Rp%f", gp);
        System.out.printf("\nTunjangan    : Rp%f ", t);
        System.out.printf("\nPajak        : Rp%f ", pj);
        
        System.out.print("\n----------------------------------");
        System.out.printf("\nTotal gaji bersih: Rp%f", gb);
        System.out.println("\n===================================");
        
} 
}
