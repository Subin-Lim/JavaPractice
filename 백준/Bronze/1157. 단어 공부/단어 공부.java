import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // 알파벳 수를 저장할 배열 (대문자와 소문자를 구분하지 않기 때문에 26개)
        int[] frequency = new int[26];

        // 입력 문자열을 대문자로 변환하고 빈도 수 카운트
        for (char ch : input.toCharArray()) {
            char upperCh = Character.toUpperCase(ch);
            frequency[upperCh - 'A']++; // 'A'의 ASCII 값으로 인덱스 계산
        }

        char mostFrequentChar = '?';
        int maxCount = 0;
        boolean isDuplicate = false;

        // 가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequentChar = (char) (i + 'A'); // 인덱스를 문자로 변환
                isDuplicate = false; // 새로운 최대값이 나오면 중복 플래그 초기화
            } else if (frequency[i] == maxCount) {
                isDuplicate = true; // 중복 발견
            }
        }

        // 결과 출력
        if (isDuplicate) {
            System.out.println('?');
        } else {
            System.out.println(mostFrequentChar);
        }
        
        scanner.close();
    }
}
