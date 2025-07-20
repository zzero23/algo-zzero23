// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 연산
        int intExtent = intN * intN;

        // 출력
        System.out.println(intExtent);

        // 조건문
        if (intN < 5) {
            System.out.println("tiny");
        }
    }
}