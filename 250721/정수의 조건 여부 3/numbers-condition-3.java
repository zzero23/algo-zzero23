// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        if (intA % 13 == 0 || intA % 19 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}