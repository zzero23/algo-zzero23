// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 반복문
        for (int i = 0; i < num2; i++) {
            num1 += num2;
            System.out.println(num1);
        }
    }
}