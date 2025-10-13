package rifky;

import java.util.Scanner;

public class PercabanganNestedIf {
    public static void main(String[] args) {
      
        Scanner p = new Scanner(System.in);        
        System.out.print("Masukkan nilai: ");
        int a = p.nextInt();
        System.out.print("Apakah Kehadiran Baik: ");
        int b = p.nextInt();
        
        if (a > 80){
            System.out.println("Lulus dengan Baik");
        }else if (a > 60 && a <= 80){
            System.out.println("Lulus");
        }else{
            System.out.println("");
            if(b >= 75)
            System.out.println("Siswa masih diberi kesempatan remedi");    
            else{
            System.out.println("Siswa gagal");
}    
}
}
}
