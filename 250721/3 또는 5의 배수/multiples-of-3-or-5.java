// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        if (intA % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if (intA % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}