// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intStart = sc.nextInt();
        int intEnd = sc.nextInt();

        int intCount3 = 0;

        // 반복문
        for (int i = intStart; i < intEnd + 1; i++) {
            // 약수 개수 변수
            int intCount = 0;
            
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    intCount += 1;
                } else {
                    continue;
                }
            }

            if (intCount == 3) {
                intCount3 += 1;
            } else {
                continue;
            }
        }

        System.out.println(intCount3);
    }
}