// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 변수
        int intCount = 0;

        // 반복 및 조건문
        for (int i = 1; i < intN + 1; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                intCount += 1;
            }
        }

        // 출력
        System.out.println(intCount);
    }
}