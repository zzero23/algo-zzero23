// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // 조건문
        if (score >= 80) {
            System.out.println("pass");
        } else {
            int result = 80 - score;
            System.out.printf("%d more score", result);
        }
    }
}