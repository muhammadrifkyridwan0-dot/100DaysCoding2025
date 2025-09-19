package day12.java;

import java.util.Scanner;


public class Day12Java {


    public static void main(String[] args) {
    Scanner x = new Scanner (System.in);
        
        //Membuat Program Biodata Sederhana 
             
        //Scanner biodata
        String nama = "BIODATA";
                
        System.out.print("Masukkan Nama: ");
        String Nama = x.nextLine();
        
        System.out.print("Masukkan Umur: ");
        int Umur = x.nextInt();
        
        System.out.print("Masukkan Kelas: ");
        char Kelas = x.next().charAt(0);
        
        x.nextLine();
        
        
        System.out.print("Masukkan Alamat: ");
        String Alamat = x.nextLine();
        
        System.out.print("Masukkan Tinggi Badan: ");
        int Tinggi = x.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        int Berat = x.nextInt();
        
        System.out.println("\n========== BIODATA SEDERHANA ==========\n");
        
        //mencetak
        System.out.println(nama);
        System.out.println("Nama \t\t= "+ Nama);
        System.out.println("Umur \t\t= "+ Umur +" Tahun");
        System.out.println("Saya \t\t= "+ Kelas);
        System.out.println("Alamat \t\t= "+ Alamat);
        System.out.println("Tinggi badan \t= "+ Tinggi +" Cm");
        System.out.println("Berat badan \t= "+ Berat +" Kg");
       
        
   
        /*Penjelasan mengenai penggunaan scanner untuk membaca input dari tipe data 
          String,Int,Char,Double,Float,Long,Byte, dan Boolean*/
        /*String : nextLine() : Membaca seluruh baris input
                 : next() : Membaca input string hingga spasi pertama
         * nextInt() untuk membaca tipe data integer
         * next.charAt(0) untuk membaca tipe data char
         * nextFloat() untuk membaca tipe data float
         * nextDouble() untuk membaca tipe data double      
        */
        
        //Penjelasan
        /*Jika ada method "nextLine" setelah "next" untuk data primitif, itu akan menghasilkan "nextLine" 
        tidak membaca input karna dianggap input kosong,
        maka dengan menambahkan nextLine() setelah menggunakan metode next() untuk data primitif, 
        kita bisa memastikan bahwa nextLine berikutnya akan membaca input dengan benar.
       */    
        
        
    }
    
}
