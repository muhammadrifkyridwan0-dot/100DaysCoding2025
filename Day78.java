import java.util.Scanner;

public class MethodString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputan = input.nextLine();
        if(inputan.isEmpty()){
            System.out.println("Input tidak boleh kosong");
            return;
        }
        System.out.println("Panjang inputan: "+ inputan.length());
        if(inputan.contains("A")){
            System.out.println("Ada A nya");
        }
        if(inputan.equals("Rifky Ridwan")){
            System.out.println("Halo Rifky Ridwan");
        }
        if(inputan.length() >= 5){
            System.out.println(inputan.substring(0, 4));
        }
       
        
    }

}
