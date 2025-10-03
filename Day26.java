package rifky;

public class OperatorPenugasan {

    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 10; // operator '=' untuk memberi nilai awal
        System.out.println("Nilai awal a = " + a);

        // Operator += (penjumlahan dan penugasan)
        a += 5; // sama dengan a = a + 5
        System.out.println("Setelah a += 5, nilai a = " + a);

        // Operator -= (pengurangan dan penugasan)
        a -= 3; // sama dengan a = a - 3
        System.out.println("Setelah a -= 3, nilai a = " + a);

        // Operator *= (perkalian dan penugasan)
        a *= 2; // sama dengan a = a * 2
        System.out.println("Setelah a *= 2, nilai a = " + a);

        // Operator /= (pembagian dan penugasan)
        a /= 4; // sama dengan a = a / 4
        System.out.println("Setelah a /= 4, nilai a = " + a);

        // Operator %= (sisa bagi dan penugasan)
        a %= 3; // sama dengan a = a % 3
        System.out.println("Setelah a %= 3, nilai a = " + a);
    }
}
