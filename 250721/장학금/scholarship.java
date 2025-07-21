// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intMid = sc.nextInt();
        int intFin = sc.nextInt();

        // 변수 정의
        int intMoney = 0;

        // 조건문
        if (intMid >= 90) {
            if (intFin >= 95) {
                intMoney = 100000;
            } else if (intFin >= 90) {
                intMoney = 50000;
            }
        }

        // 출력
        System.out.println(intMoney);
    }
}