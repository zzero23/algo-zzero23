// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int numY = sc.nextInt();

        // 조건문
        if (numY % 4 == 0) {
            if (numY % 100 != 0 && numY % 400 != 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}