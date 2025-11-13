package rifky;
impor java.util.scanner;
public class PolaHorizontal{
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in); 

      System.out.println("Masukkan Jumlah Pola: ");
      int h = p.nextInt();
       
      for (int i = 0; i < h; i++) {
            System.out.print("¥");
        }
    }
}
