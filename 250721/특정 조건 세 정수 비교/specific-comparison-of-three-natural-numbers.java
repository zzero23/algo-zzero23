// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        int intC = sc.nextInt();

        // 최솟값 찾기
        int intMin;

        if (intA > intB) {
            if (intB > intC) {
                intMin = intC;
            } else {
                intMin = intB;
            }
        } else {
            if (intA > intC) {
                intMin = intC;
            } else {{
                intMin = intA;
            }}
        }

        // 조건문 1
        int intResult = intMin == intA? 1 : 0;
        System.out.print(intResult + " ");

        // 조건문 2
        intResult = intA == intB && intB == intC? 1 : 0;
        System.out.print(intResult);
    }
}