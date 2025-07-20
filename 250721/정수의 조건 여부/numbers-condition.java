// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        if (intA >= 113) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}