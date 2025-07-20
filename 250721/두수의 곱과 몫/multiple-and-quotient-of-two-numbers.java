// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 연산
        int intMulti = intA * intB;
        int intShare = intA / intB;

        // 출력
        System.out.printf("%d * %d = %d\n", intA, intB, intMulti);
        System.out.printf("%d / %d = %d", intA, intB, intShare);
    }
}