package rifky;

public class StringToPrimitif {

    public static void main(String[] args) {

        //Mengubah String ke tipe data primitif
        
        //String ke tipe data byte

        String a = "100";
        byte angk = Byte.parseByte(a);        
        System.out.println(angk);
        
        
        //String ke tipe data short

        String b = "456";
        short angka = Short.parseShort(b);        
        System.out.println(angka);



        //String ke tipe data integer

        String c = "456";
        int angkaa = Integer.parseInt(c);        
        System.out.println(angkaa);
        
        //String ke tipe data long
        
        String d = "456";
        long angkaaa = Long.parseLong(d);        
        System.out.println(angkaaa);

        //String ke tipe data float

        String e = "3.14";
        float flo = Float.parseFloat(e);        
        System.out.println(flo);
        
        //String ke tipe data double

        String f = "2.000";
        double dobel = Double.parseDouble(f);        
        System.out.println(dobel);
        
        //String ke tipe data boolean

        String benar = "true";
        String salah = "false";
        
        
        boolean betul = Boolean.parseBoolean(benar);        
        System.out.println(betul);
        boolean tidakBetul = Boolean.parseBoolean(salah);
        System.out.println(tidakBetul);
        
        /*Note: parse adalah proses penerjemahan teks menjadi angka*/


    }
    
}
