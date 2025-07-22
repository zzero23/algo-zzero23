// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intB = sc.nextInt();
        int intA = sc.nextInt();

        // 출력
        for (int i = intB; i > intA -1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}