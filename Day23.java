package rifky;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang {

    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        
        
        // Menginput panjang dan lebar
        System.out.print("Masukkan Panjang: ");
        int panjang = x.nextInt();
        
        System.out.print("Lebar: ");
        int lebar = x.nextInt();
       
        // Menghitung luas
        int luas = panjang*lebar; //mengalikan panjang dan lebar
        
        System.out.println("Panjang  \t\t= " + panjang + " Cm"); //menampilkan nilai panjang
        System.out.println("Lebar \t\t\t= " + lebar + " Cm"); //menampilkan nilai lebar
        System.out.println("Luas Persegi Panjang \t= " + luas + " Cm^2"); //hasil kali panjang*lebar
    }
}
