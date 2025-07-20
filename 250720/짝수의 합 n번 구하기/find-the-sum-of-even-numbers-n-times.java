// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 반복문
        for (int i = 1; i < intN + 1; i++) {
            sc.nextLine();
            int intA = sc.nextInt();
            int intB = sc.nextInt();

            // 변수 정의
            int intTotal = 0;

            for (int j = intA; j < intB + 1; j++) {
                if (j % 2 == 0) {
                    intTotal += j;
                } else {
                    continue;
                }
            }
            System.out.println(intTotal);
        }
    }
}