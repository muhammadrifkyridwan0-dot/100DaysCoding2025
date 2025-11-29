package rifky;

public class MenjumlahArray {

    public static void main(String[] args) {

        int array[] = {50, 60, 55, 75, 10};

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Elemen Array{50,60,55,75,10}");
        System.out.println("Hasil Penjumlahan Semua Elemen: " + total);
    }

}
