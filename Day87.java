import java.util.Scanner;

public class CariElemenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = new int[n];

        
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

       
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int cari = input.nextInt();

        int posisi = -1;
        for (int i = 0; i < n; i++) {
            if (data[i] == cari) {
                posisi = i;
                break;
            }
        }

        
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Nilai " + cari + " TIDAK ditemukan di dalam array.");
        }

       
    }
}
