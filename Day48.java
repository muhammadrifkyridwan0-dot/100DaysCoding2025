package rifky;
import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
      
        System.out.print("Masukkan angka pertama: ");
        double angka1 = p.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = p.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = p.nextDouble();

        double hasil;
    
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                }
                break;
            default:
                System.out.println("Operator tidak dikenal!");
        }

       
    }
}
