// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 출력
        for (int i = intA; i < intB + 1; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}