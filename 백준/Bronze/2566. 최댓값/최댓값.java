import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[9][9];
        int max = 0;
        int maxRow = 1;
        int maxCol = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                A[i][j] = sc.nextInt();
                if(A[i][j]>max){
                    max = A[i][j];
                    maxRow = i + 1; 
                    maxCol = j + 1; 
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow+" "+maxCol);
      
    }
}
