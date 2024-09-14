import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();
        String B = scanner.next();
        
        String reversedA = new StringBuilder(A).reverse().toString();
        String reversedB = new StringBuilder(B).reverse().toString();
        
        int numA = Integer.parseInt(reversedA);
        int numB = Integer.parseInt(reversedB);
        
        int result = Math.max(numA, numB);
        
        System.out.println(result);
        
        scanner.close();
    }
}
