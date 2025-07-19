// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 변수
        int intSum = 0;

        // 반복 및 조건문
        for (int i = 1; i <= 101; i++) {
            intSum += i;
            if (intSum >= intN) {
                System.out.print(i);
                break;
            }
        }
    }
}