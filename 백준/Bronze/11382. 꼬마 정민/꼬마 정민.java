import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong(); // 1 ≤ A ≤ 10^12
        long B = scanner.nextLong(); // 1 ≤ B ≤ 10^12
        long C = scanner.nextLong(); // 1 ≤ C ≤ 10^12

        long sum = A + B + C;

        System.out.println(sum);

        scanner.close();
    }
}
