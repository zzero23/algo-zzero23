// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        int intC = sc.nextInt();

        // 연산
        int intPlus = intA + intB + intC;
        int intAverage = intPlus / 3;

        // 출력 
        System.out.printf("%d\n%d", intPlus, intAverage);
    }
}