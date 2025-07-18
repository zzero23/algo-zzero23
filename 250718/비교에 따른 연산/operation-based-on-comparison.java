// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 조건문
        if (a > b) {
            System.out.println(a*b);
        } else {
            int result = b / a;
            System.out.println(result);
        }
    }
}