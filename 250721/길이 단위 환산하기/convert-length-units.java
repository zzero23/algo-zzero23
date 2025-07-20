// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        double dblFt = sc.nextDouble();

        // 연산
        double dblFtcm = dblFt * 30.48;

        // 출력
        System.out.printf("%.1f", dblFtcm);
    }
}