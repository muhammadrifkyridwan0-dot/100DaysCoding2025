package rifky;

public class TipeDataToString {

    public static void main(String[] args) {
        
        //Mengubah tipe data ke String
        
        /*Cara umum =
        ~ menggunakan String.valueOf()-> paling sering digunakan
        ~ menggunakan + "" (concatenation dengan string kosong).
        ~ menggunakan Integer.toString (), Double.toString,-> khusus 
          untuk tipe tertentu*/
        
        //Untuk type data byte
        byte b = 20;
        String bByte = String.valueOf(b);
        
        //untuk tipe data short
        short s = 40;
        String sShort = String.valueOf(s);
        
        //untuk tipe data integer
        int i = 60;
        String iInt = String.valueOf(i);
        
        //untuk tipe data long
        long l = 80;
        String lLong = String.valueOf(l);
        
        //untuk tipe data float
        float f = 3.14f;
        String sFloat = String.valueOf(f);
        //untuk tipe data double
        double d = 55.55;
        String dDouble = String.valueOf(d);
        
        //untuk tipe data char
        char c = 'R';
        String sChar = String.valueOf(c);
        
        //untuk tipe data booelan
        boolean benar = true;
        String sBoolean = String.valueOf(benar);
        
        //mencetak hasil
        System.out.println("byte -> String: " + bByte);
        System.out.println("short -> String: " + sShort);
        System.out.println("int -> String: " + iInt);
        System.out.println("long -> String: " + lLong);
        System.out.println("float -> String: " + sFloat);
        System.out.println("double -> String: " + dDouble);
        System.out.println("char -> String: " + sChar);
        System.out.println("boolean -> String: " + sBoolean);
        
        

    }
    
}
