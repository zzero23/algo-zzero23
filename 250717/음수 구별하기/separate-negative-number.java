// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        // 출력
        System.out.println(num1);
        // 조건문
        if (num1 < 0) {
            System.out.println("minus");
        }
    }
}