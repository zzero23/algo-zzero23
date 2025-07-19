// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        // 변수 정의
        int intTotal = 0;

        // 반복 및 조건문
        for (int i = numA; i < numB + 1; i++) {
            if (i % 2 == 0) {
                intTotal += i;
            } else {
                continue;
            }
        }

        // 출력
        System.out.println(intTotal);
    }
}