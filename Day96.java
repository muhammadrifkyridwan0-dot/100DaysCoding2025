public class Kalkulator {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        System.out.println("Penjumlahan: " + tambah(x, y));
        System.out.println("Pengurangan: " + kurang(x, y));
        System.out.println("Perkalian: " + kali(x, y));
        System.out.println("Pembagian: " + bagi(x, y));
    }
}
