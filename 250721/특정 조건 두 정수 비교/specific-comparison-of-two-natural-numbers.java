// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 조건문
        if (intA < intB) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

        if (intA == intB) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }
}