// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        double dbl1 = sc.nextDouble();
        double dbl2 = sc.nextDouble();
        double dbl3 = sc.nextDouble();

        // 출력
        System.out.printf("%.3f\n%.3f\n%.3f", dbl1, dbl2, dbl3);
    }
}