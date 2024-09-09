import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt(); // A 입력 받기
            int B = sc.nextInt(); // B 입력 받기
            
            // 종료 조건
            if (A == 0 && B == 0) {
                break; // 0 0 입력 시 종료
            }
            
            // A + B 출력
            System.out.println(A + B);
        }

        sc.close(); // Scanner 닫기
    }
}
