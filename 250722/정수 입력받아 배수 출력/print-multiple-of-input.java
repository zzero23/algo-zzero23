// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 출력
        for (int i = 1; i < 6; i++) {
            int intResult = intN * i;
            System.out.print(intResult + " ");
        }
    }
}