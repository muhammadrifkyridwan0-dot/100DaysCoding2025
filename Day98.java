import java.util.Scanner;

public class Fibonacci1SampaiN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int a = 0, b = 1;

        System.out.print("Deret Fibonacci: ");
        while (b <= N) {
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
