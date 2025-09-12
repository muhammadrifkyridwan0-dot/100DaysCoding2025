package Rifky;

public class BilanganBulat; {

public static main void (String [] args) {

  /* Type data Numerik Bilangan Bulat 
     byte, short, int, long*/
  
/*Byte: Tipe data yang digunakan untuk data dalam skala kecil,
  biasanya dalam operasi file atau jaringan.
  Jangkauan nilainya umumnya dari -128 hingga 127. */ 
 
  byte a = 127;

/*Short: Tipe data dengan jangkauan yang lebih besar dari Byte.
  Jangkauannya bisa sekitar -32.768 hingga 32.767.*/

  short b = 32.767;

/*Int: Tipe data bilangan bulat yang paling umum. 
  Jangkauan nilai Int umumnya sekitar -2.147.483.648 
  hingga 2.147.483.647. */

  int c = 2.147.483.647;

/*Long: Tipe data untuk nilai yang melebihi kapasitas jangkauan tipe data Int, 
  sehingga memiliki rentang yang jauh lebih tinggi. 
  Jangkauannya bisa hingga -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807. */

  long d = 9.223.372.036.854.775.807; 

 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
 System.out.println(d);

}

}
