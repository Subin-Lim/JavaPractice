import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        
        String numbers = sc.nextLine();
        
        int sum = 0;

        for(int i=0; i<num; i++){
            sum += Character.getNumericValue(numbers.charAt(i));
        }
            
        System.out.println(sum);

        sc.close(); 
    }
}
