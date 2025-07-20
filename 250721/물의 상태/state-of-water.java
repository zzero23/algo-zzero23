// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 조건문
        if (intN < 0) {
            System.out.println("ice");
        } else if (intN >= 100) {
            System.out.println("vapor");
        } else {
            System.out.println("water");
        }
    }
}