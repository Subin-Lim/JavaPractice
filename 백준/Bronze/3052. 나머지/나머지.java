import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int[] g = new int[10]; // 크기 10의 배열로 변경
        
        // 10개의 숫자를 입력받기
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            g[i] = num[i] % 42; // 나머지를 저장
        }

        int count = 0;

        // 서로 다른 나머지를 체크하기 위한 배열
        boolean[] isUnique = new boolean[42];

        // 나머지를 체크하여 고유한 개수 세기
        for (int i = 0; i < 10; i++) {
            if (!isUnique[g[i]]) {
                isUnique[g[i]] = true; // 해당 나머지를 체크
                count++; // 고유한 나머리 개수 증가
            }
        }

        System.out.println(count); // 결과 출력
        sc.close();
    }
}
