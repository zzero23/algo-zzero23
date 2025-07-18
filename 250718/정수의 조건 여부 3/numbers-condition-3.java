// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();

        // 조건문
        if (numA % 13 == 0 || numA % 19 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}