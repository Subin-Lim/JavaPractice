import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String S = sc.nextLine(); 
            char firstChar = S.charAt(0); 
            char lastChar = S.charAt(S.length() - 1); 
            
            System.out.println("" + firstChar + lastChar);
        }

        sc.close(); 
    }
}
