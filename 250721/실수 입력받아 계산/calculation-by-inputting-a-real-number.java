// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        double dblA = sc.nextDouble();
        double dblB = sc.nextDouble();

        // 연산
        double dblResult = dblA + dblB;

        // 출력
        System.out.printf("%.2f", dblResult);
    }
}