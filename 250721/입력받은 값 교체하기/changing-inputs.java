// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 위치 교환
        int intTemp = intA;
        intA = intB;
        intB = intTemp;

        // 출력
        System.out.printf("%d %d", intA, intB);
    }
}