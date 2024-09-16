import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();
        String reversedA = new StringBuilder(A).reverse().toString();
        
        if(A.equals(reversedA)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        

    }
}
