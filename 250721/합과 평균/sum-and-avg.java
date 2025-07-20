// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 연산
        int intPlus = intA + intB;
        double dblAverage = (double)intPlus / 2;

        // 출력
        System.out.printf("%d %.1f", intPlus, dblAverage);
    }
}