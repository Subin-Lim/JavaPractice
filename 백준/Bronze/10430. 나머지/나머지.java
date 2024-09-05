import java.util.*;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
        
            int sumMod = (A + B) % C;
            int sumModAlternative = ((A % C) + (B % C)) % C;
            int productMod = (A * B) % C;
            int productModAlternative = ((A % C) * (B % C)) % C;
        
            System.out.println(sumMod);
            System.out.println(sumModAlternative);
            System.out.println(productMod);
            System.out.println(productModAlternative);
            
            scanner.close();
        

        }
    }



