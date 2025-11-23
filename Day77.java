public class ManipulasiString {
    public static void main(String[] args) {

        String teks = "  Tor Monitor Ketua ";

        String Trim = teks.trim();
        System.out.println("Hasil trim   : [" + Trim + "]");

        String Substring = Trim.substring(5, 10); 
       
        System.out.println("Hasil substring: " + Substring);

 
        String Replace = Trim.replace("Ketua", "King");
        System.out.println("Hasil replace: " + Replace);
    }
}
