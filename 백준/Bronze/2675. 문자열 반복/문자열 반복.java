import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        sc.nextLine(); 
        
        for (int i = 0; i < T; i++) {
            String[] input = sc.nextLine().split(" "); 
            int R = Integer.parseInt(input[0]);
            String S = input[1]; 
            
            StringBuilder result = new StringBuilder(); 
            for (char ch : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    result.append(ch);
                }
            }
            System.out.println(result.toString()); 
        }
        
        sc.close(); 
    }
}
