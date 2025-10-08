package rifky;

import java.util.Scanner;

public class OperatorLogika{

    public static void main(String[] args) {
        
        // Deklarasi variabel
        Scanner p = new Scanner (System.in);
        System.out.print("Masukkan nilai ujian (0-100): ");
        int nilaiUjian = p.nextInt();
        
        System.out.print("Masukkan persentase kehadiran (0-100): ");
        int kehadiran = p.nextInt(); 
        
        // Seorang siswa dianggap lulus jika:
        // nilai ujian >= 70 ATAU kehadiran >= 80
        boolean lulus = (nilaiUjian >= 70) || (kehadiran >= 80);
        
        System.out.println("Nilai ujian: " + nilaiUjian);
        System.out.println("Kehadiran: " + kehadiran + "%");
        System.out.println("Apakah siswa lulus? " + lulus);
    }
}
