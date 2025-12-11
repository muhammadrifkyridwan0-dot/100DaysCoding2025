package rifky;

public class CetakDenganParameter {

    static void LatihanCetakVoid(String nama, int umur) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void main(String[] args) {

        cetakPesan("Riduu", 20);
        cetakPesan("Fuad", 23);
        cetakPesan("Amba", 25);
    }
}
