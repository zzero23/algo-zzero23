// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 변수
        int result1 = 0;
        int result2 = 0;

        // 조건문 1
        if (num1 < num2) {
            result1 = 1;
        } else {
            result1 = 0;
        }

        // 조건문 2
        if (num1 == num2) {
            result2 = 1;
        } else {
            result2 = 0;
        }

        // 출력
        System.out.printf("%d %d", result1, result2);
    }
}