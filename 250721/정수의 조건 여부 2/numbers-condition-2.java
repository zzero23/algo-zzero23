// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        if (intA == 5) {
            System.out.println("A");
        }
        if (intA % 2 == 0) {
            System.out.println("B");
        }
    }
}