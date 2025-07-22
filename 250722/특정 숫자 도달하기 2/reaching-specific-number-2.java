// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 출력
        for (int i = intN; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}