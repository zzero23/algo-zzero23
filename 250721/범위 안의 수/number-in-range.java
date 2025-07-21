// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        if (intA >= 10 && intA <= 20) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}