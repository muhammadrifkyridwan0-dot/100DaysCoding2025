package rifky;

import java.util.Scanner;

public class OperatorLogika {

    public static void main(String[] args) {
        
        // Deklarasi variabel
        Scanner p = new Scanner (System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = p.nextInt();
        System.out.print("Masukkan kehadiran: ");
        int kehadiran = p.nextInt();
        
        //Syarat lulus: nilai harus diatas 70 & kehadiran diatas 80%
        boolean lulus = (nilai >= 70) && (kehadiran >= 80);
        
        System.out.println("Nilai siswa: " + nilai);
        System.out.println("Kehadiran: " + kehadiran + "%");
        System.out.println("Apakah lulus? " + lulus);
    }
}
