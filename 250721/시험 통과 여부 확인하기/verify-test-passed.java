// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 조건문
        if (intN >= 80) {
            System.out.println("pass");
        } else {
            int intResult = 80 - intN;
            System.out.printf("%d more score", intResult);
        }
    }
}