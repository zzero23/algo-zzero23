// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intNum = sc.nextInt();

        // 조건문
        if (intNum == 1) {
            System.out.println("John");
        } else if (intNum == 2) {
            System.out.println("Tom");
        } else if (intNum == 3) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }
    }
}