import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 바구니 i에는 공 i+1이 들어있음
        }
        
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
        
            int temp = baskets[start - 1];
            baskets[start - 1] = baskets[end - 1];
            baskets[end - 1] = temp;
        }

        for(int i = 0; i<N; i++){
                System.out.print(baskets[i]+" ");
        }
        
        
        sc.close();
    }
}
