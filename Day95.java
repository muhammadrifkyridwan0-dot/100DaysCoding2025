package rifky;

public class CetakDenganParameter {

    static void LatihanCetakVoid(String nama, int umur) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void main(String[] args) {

        LatihanCetakVoid("Riduu", 20);
        LatihanCetakVoid("Fuad", 23);
        LatihanCetakVoid("Amba", 25);
    }
}
