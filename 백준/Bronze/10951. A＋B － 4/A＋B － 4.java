import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt(); // A 입력 받기
            int B = sc.nextInt(); // B 입력 받기
            
            
            // A + B 출력
            System.out.println(A + B);
        }

    }
}
