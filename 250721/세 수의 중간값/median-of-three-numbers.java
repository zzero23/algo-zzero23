// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        int intC = sc.nextInt();

        // 조건문
        if (intB > intA && intB < intC) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}