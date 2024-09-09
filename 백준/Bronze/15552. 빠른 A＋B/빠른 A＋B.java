import java.io.*;
import java.util.StringTokenizer; // StringTokenizer 클래스 import

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 첫 번째 줄에서 테스트 케이스 수 입력

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄씩 입력
            int a = Integer.parseInt(st.nextToken()); // 첫 번째 정수
            int b = Integer.parseInt(st.nextToken()); // 두 번째 정수
            int sum = a + b; // 합계 계산
            bw.write(sum + "\n"); // 결과를 BufferedWriter에 기록
        }

        bw.flush(); // 출력 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}
