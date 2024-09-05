import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 이미 존재하는 아이디 입력 받기
        String existingId = scanner.nextLine();
        
        // 놀람 표현
        String surprise = existingId + "??!";
        
        // 결과 출력
        System.out.println(surprise);
        
        // 스캐너 종료
        scanner.close();
    }
}
