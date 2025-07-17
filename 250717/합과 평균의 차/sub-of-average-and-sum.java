// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // 연산
        int sum1 = num1 + num2 + num3;
        int avg = sum1 / 3;
        int result = sum1 - avg;
        // 출력
        System.out.printf("%d\n%d\n%d", sum1, avg, result);
    }
}