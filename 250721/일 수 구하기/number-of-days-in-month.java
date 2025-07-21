// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 변수 정의
        int intResult;

        // 조건문
        if (intN == 4 || intN == 6 || intN == 9 || intN == 11) {
            intResult = 30;
        } else {
            if (intN == 2) {
                intResult = 28;
            } else {
                intResult = 31;
            }
        }

        // 출력
        System.out.println(intResult);
    }
}