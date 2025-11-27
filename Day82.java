package rifky;

import java.util.Scanner;

public class Arrayyyyy {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = p.nextInt();

        int nilai[] = new int[jumlah];
        int totalNol = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            int data = p.nextInt();

            if (data < 0) {
                nilai[i] = 0;
            } else {
                nilai[i] = data;
            }

            if (nilai[i] == 0) {
                totalNol++;
            }
        }
        int total = 0;
        for (int i : nilai) {
            total += i;

        }
        double rata = total / nilai.length;

        System.out.println("===ISI ARRAY===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + ": " + nilai[i]);

        }
        System.out.println("Total nilai array : " + total);
        System.out.println("Rata-rata nilai   : " + rata);
        System.out.println("Jumlah Niali Nol  : " + totalNol);
    }
}
