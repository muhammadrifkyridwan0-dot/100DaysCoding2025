package latihanae;

import java.util.Scanner;
public class MaximalArray {

   public static void main(String[] args) {
       Scanner p = new Scanner(System.in);
          System.out.print("Masukkan Angka: ");

          int b p.nextInt();
          int a[] = new int[b];
  
          int max = 0;

          for (int i = 0; i < b; i++) {
          a[i] = p.nextInt();

          if (a[i] > max) {
              max = a[i];
          }
        
      }
      System.out.println("Nilai maksimal: + max);
    }
}
