import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        
        int[] positions = new int[26];
        
        Arrays.fill(positions, -1);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (positions[c - 'a'] == -1) {
                positions[c - 'a'] = i;
            }
        }
        for (int pos : positions) {
            System.out.print(pos + " ");
        }

        sc.close(); 
    }
}
