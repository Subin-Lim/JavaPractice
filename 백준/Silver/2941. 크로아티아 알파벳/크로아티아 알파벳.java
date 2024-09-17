import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String alphabet : croatianAlphabets) {
            word = word.replace(alphabet, "*");
        }
        
        System.out.println(word.length());
        
        sc.close();
    }
}
