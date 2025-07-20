// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 연산
        int intShare = intA / intB;
        int intRemain = intA % intB;

        // 출력
        System.out.printf("%d...%d", intShare, intRemain);
    }
}