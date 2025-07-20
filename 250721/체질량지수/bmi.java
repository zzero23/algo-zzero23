// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intHeight = sc.nextInt();
        int intWeight = sc.nextInt();

        // 연산
        int intBMI = (10000 * intWeight) / (intHeight * intHeight);

        // 출력
        System.out.println(intBMI);

        // 조건문
        if (intBMI >= 25) {
            System.out.println("Obesity");
        }
    }
}