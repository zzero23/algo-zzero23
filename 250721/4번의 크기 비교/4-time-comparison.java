// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        sc.nextLine();
        int intB = sc.nextInt();
        int intC = sc.nextInt();
        int intD = sc.nextInt();
        int intE = sc.nextInt();

        // 변수 정의
        int intResult;

        // 조건문
        intResult = intA > intB? 1 : 0;
        System.out.println(intResult);

        intResult = intA > intC? 1 : 0;
        System.out.println(intResult);

        intResult = intA > intD? 1 : 0;
        System.out.println(intResult);

        intResult = intA > intE? 1 : 0;
        System.out.println(intResult);
    }
}