import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; 
        }
        
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            while(start<end){
                int temp = baskets[start - 1];
                baskets[start - 1] = baskets[end - 1];
                baskets[end - 1] = temp;
                start++;
                end--;
            }
            
        }

        for(int i = 0; i<N; i++){
                System.out.print(baskets[i]+" ");
        }
        
        sc.close();
    }
}
