// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        // 반복문
        for (int i = 1; i < 6; i++) {
            int result = num1 * i;
            System.out.print(result + " ");
        }
    }
}