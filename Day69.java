import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String kategori;
        if (nilai >= 80 && nilai <= 100) {
            kategori = "A";
        } else if (nilai >= 70 && nilai < 80) {
            kategori = "B";
        } else if (nilai >= 60 && nilai < 70) {
            kategori = "C";
        } else {
            kategori = "D";
        }

        System.out.println("Kategori nilai: " + kategori);
    }
}
