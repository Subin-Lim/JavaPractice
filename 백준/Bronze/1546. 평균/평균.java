import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = sc.nextInt();
        }
        int M = baskets[0];
        for (int i = 1; i < N; i++) {
            if(baskets[i]>M){
                M = baskets[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (baskets[i] / (double) M) * 100; 
        }
        System.out.println(sum / N);
        
        sc.close();
    }   
}
