package day11.java;
import java.util.Scanner; //package untuk scanner

public class ScannerInput {

    public static void main(String[] args) {
    /*Scanner digunakan untuk mendapatkan input pengguna
      dan ditemukan dalam package java.util*/
    
        Scanner input = new Scanner(System.in); 
      //Scanner Input untuk menjadi wadah atau ruang pengisian data 
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
      //Inputan untuk mengisi ruang Scanner input
        
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
      //Inputan untuk mengisi ruang Scanner input
      
        System.out.println("Nama Lengkap  = " + nama);
        System.out.println("Umur = " + umur + " Tahun");
      //Untuk menampilkan hasil Inputan

    }
    
}

