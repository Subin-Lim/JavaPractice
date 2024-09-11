import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int N = sc.nextInt();
        
        int[] A = new int[9];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int maxx = A[0];
        int maxIndex = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i]>maxx){
                maxx = A[i];
                maxIndex=i;
            }
        }
        
        System.out.println(maxx);
        System.out.println(maxIndex+1);
        
        sc.close(); // Scanner 닫기
    }
}
