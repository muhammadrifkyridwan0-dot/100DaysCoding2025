package rifky;

public class Konversi {

    public static void main(String[] args) {

        //konversi tipe data besar ke tipe data kecil
        double a = 1900000.99;
        System.out.println("Double : " +a);
        long b = (long) a;
        System.out.println("Long : " +b);
        int c = (int) b;
        System.out.println("Integer : " +c);
        
        /*Mengonversi dari tipe data besar ke tipe data kecil akan 
          mengubah nilai dari tipe datanya, namun tidak akan memengaruhi
          apabila nilai bit nya masih memenuhi*/
        
        byte d = (byte) c;
        System.out.println("Byte : " +d);

        


    }
    
}
