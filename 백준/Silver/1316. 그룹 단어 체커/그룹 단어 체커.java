import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 단어 개수 입력
        int N = scanner.nextInt();
        scanner.nextLine(); // 개수 입력 후 다음 줄로 이동
        
        int groupWordCount = 0; // 그룹 단어 개수 초기화

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        // 그룹 단어 개수 출력
        System.out.println(groupWordCount);
    }

    // 그룹 단어인지 확인하는 메서드
    private static boolean isGroupWord(String word) {
        HashSet<Character> seenCharacters = new HashSet<>(); // 이미 본 문자 저장
        char lastChar = '\0'; // 마지막 문자 초기화
        
        for (char c : word.toCharArray()) {
            // 현재 문자가 마지막 문자와 다르고, 이미 본 문자라면 그룹 단어 아님
            if (c != lastChar) {
                if (seenCharacters.contains(c)) {
                    return false; // 그룹 단어가 아님
                }
                seenCharacters.add(c); // 현재 문자 추가
                lastChar = c; // 마지막 문자 갱신
            }
        }

        return true; // 그룹 단어임
    }
}
