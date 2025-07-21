// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intAmath = sc.nextInt();
        int intAeng = sc.nextInt();
        int intBmath = sc.nextInt();
        int intBeng = sc.nextInt();

        // 조건문
        if ((intAmath > intBmath) && (intAeng > intBeng)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}