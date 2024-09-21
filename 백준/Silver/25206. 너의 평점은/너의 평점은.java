import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double totalCredits = 0;

        for (int i = 0; i < 20; i++) {
            String courseName = scanner.next(); // 과목명
            double credits = scanner.nextDouble(); // 학점
            String grade = scanner.next(); // 성적

            if (grade.equals("P")) {
                continue;
            }

            totalCredits += credits; 

            if (grade.equals("A+")) {
                sum += credits * 4.5;
            } else if (grade.equals("A0")) {
                sum += credits * 4.0;
            } else if (grade.equals("B+")) {
                sum += credits * 3.5;
            } else if (grade.equals("B0")) {
                sum += credits * 3.0;
            } else if (grade.equals("C+")) {
                sum += credits * 2.5;
            } else if (grade.equals("C0")) {
                sum += credits * 2.0;
            } else if (grade.equals("D+")) {
                sum += credits * 1.5;
            } else if (grade.equals("D0")) {
                sum += credits * 1.0;
            } else if (grade.equals("F")) {
                sum += credits * 0;
            }
        }

        double average = sum / totalCredits;
        System.out.printf("%.6f%n", average); 
    }
}
