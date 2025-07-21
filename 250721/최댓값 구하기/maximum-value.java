// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        int intC = sc.nextInt();

        // 변수 정의
        int intResult;

        // 조건문
        if (intA > intB) {
            if (intA > intC) {
                intResult = intA;
            } else {
                intResult = intC;
            }
        } else {
            if (intB > intC) {
                intResult = intB;
            } else {
                intResult = intC;
            }
        }

        // 출력
        System.out.println(intResult);
    }
}