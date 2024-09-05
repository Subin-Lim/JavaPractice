import java.util.*;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int A  = scanner.nextInt();
            int B = scanner.nextInt();

            int one = A*(B%10);
            int two = A*((B/10)%10);
            int three = A*(B/100);
            int four = A*B;

            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
            System.out.println(four);

            scanner.close();

        }
    }



