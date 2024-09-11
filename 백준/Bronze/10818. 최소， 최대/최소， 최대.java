import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N과 X 입력
        int N = sc.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int minx = A[0];
        int maxx = A[0];
        for(int i = 0; i<N; i++){
            if(A[i]<minx){
                minx = A[i];
            }
            if(A[i]>maxx){
                maxx = A[i];
            }
        }
        
        System.out.println(minx+" "+maxx);
        
        sc.close(); // Scanner 닫기
    }
}
