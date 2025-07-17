// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // 연산
        int sum1 = num1 + num2;
        double avg = (double)sum1 / 2;
        // 출력
        System.out.printf("%d %.1f", sum1, avg);
    }
}