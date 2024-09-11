import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[28];
        for (int i = 0; i < 28; i++) {
            num[i] = sc.nextInt();
        }
        
        boolean[] submitted = new boolean[31]; 
        
        for (int i = 0; i < 28; i++) {
            submitted[num[i]] = true;
        }
        
        int[] notSubmitted = new int[2];
        int index = 0;

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                notSubmitted[index++] = i;
            }
        }

        System.out.println(notSubmitted[0]);
        System.out.println(notSubmitted[1]);

    }
}
