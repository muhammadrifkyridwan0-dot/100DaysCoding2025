package Rifky;

public class Escape Squence {

    public static void main(String[] args) {
        
        /*Escape Squence adalah karakter yang digunakan untuk mewakili karakter khusus 
          atau untuk mengubah perilaku interpreter atau compiler*/
        
        String nama = "Rifky";
        int umur = 20;
        double beratBadan = 55.8;
        
        /*
        \t -> digunakan untuk tab
        \n -> digunakan untuk enter
        \b -> digunakan untuk menghapus satu karakter sebelumnya
        */
        
      //contoh penggunaan \t :
      
        System.out.println("Nama \t\t= " + nama);
        System.out.println("Umur \t\t= " + umur + " tahun"); //otomatis akan memberi tab
        System.out.println("Berat Badan \t= " + beratBadan + " kg");
        
      //contoh penggunaan \n :
        
        System.out.println("Nama = " + nama + "\nUmur = " + umur + " tahun"); 
        System.out.println("Berat Badan = " + beratBadan + " kg");  /*otomatis akan membuat baris baru 
                                                                      untuk umur*/
     
      //contoh penggunaan \b :
      
        String name = "R\bifky"; //otomatis akan menghapus huruf R dikata "Rifky"
        int age = 20;
        double weight = 55.8;
        System.out.println("Name = " + name + "\nAge = " + age + " years");
        System.out.println("Weight = " + weight + " kg");       
    } 
    
}
