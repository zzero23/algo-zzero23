// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 변수 정의
        int intResult;

        // 조건문
        intResult = intA >= intB ? 1 : 0;
        System.out.println(intResult);

        intResult = intA > intB ? 1 : 0;
        System.out.println(intResult);

        intResult = intB >= intA ? 1 : 0;
        System.out.println(intResult);

        intResult = intB > intA ? 1 : 0;
        System.out.println(intResult);
    }
}