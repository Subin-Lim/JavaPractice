import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N과 X 입력
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        // 수열 A 입력
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // X보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
        
        sc.close(); // Scanner 닫기
    }
}
