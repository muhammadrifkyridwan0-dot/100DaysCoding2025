package tugasevaluasimentor;

public class TugasEvaluasiMentor {

    public static void main(String[] args) {

        //Tugass
        
        char x = ('&');
        char y = ('$');
        char z = ('@');
        char a;
        
        System.out.printf("Urutan sebelum ditukar %c, %c, %c,", x, y, z);
        
        a = x;
        x = y;
        y = a;
        //Nilai z tetap sama jadi tidak ditukar
        System.out.printf("Urutan sesudah ditukar %c, %c, %c", x, y, z);
       
         
    }
    
}
