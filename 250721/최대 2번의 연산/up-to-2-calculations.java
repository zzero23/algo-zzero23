// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();

        // 조건문
        if (intA % 2 == 0) {
            intA /= 2;
        }
        if (intA % 2 != 0) {
            intA = (intA + 1) / 2;
        }

        //  출력
        System.out.println(intA);
    }
}