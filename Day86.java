import java.util.Scanner;

public class MinimalArray {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int b = p.nextInt();
        int a[] = new int[b];

        for (int i = 0; i < b; i++) {
            System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
            a[i] = p.nextInt();
        }

        int min = a[0];

        for (int i = 1; i < b; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Nilai minimal: " + min);
    }
}
