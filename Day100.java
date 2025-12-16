import java.util.Scanner;

public class StringCantikISC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toUpperCase();

        int indexI = -1;
        int indexS = -1;
        int indexC = -1;

    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                indexI = i;
                break;
            }
        }
      
        if (indexI != -1) {
            for (int i = indexI + 1; i < s.length(); i++) {
                if (s.charAt(i) == 'S') {
                    indexS = i;
                    break;
                }
            }
        }

        if (indexS != -1) {
            for (int i = indexS + 1; i < s.length(); i++) {
                if (s.charAt(i) == 'C') {
                    indexC = i;
                    break;
                }
            }
        }

        if (indexI != -1 && indexS != -1 && indexC != -1) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }

        input.close();
    }
}
