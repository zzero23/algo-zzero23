// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayNum[i] = sc.nextInt();
        }

        // 변수 정의
        int intCount3 = 0;
        int intCount5 = 0;

        // 반복 및 조건문
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 3 == 0) {
                intCount3 += 1;
            }
            if (arrayNum[i] % 5 == 0) {
                intCount5 += 1;
            } else {
                continue;
            }
        }

        // 출력 
        System.out.printf("%d %d", intCount3, intCount5);
    }
}