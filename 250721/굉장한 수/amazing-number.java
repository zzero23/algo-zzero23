// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 조건문
        if ((intN % 2 != 0 && intN % 3 == 0) || (intN % 2 == 0 && intN % 5 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}