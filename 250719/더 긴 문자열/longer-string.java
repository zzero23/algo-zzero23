// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String strVoca1 = sc.next();
        String strVoca2 = sc.next();

        // 길이 계산
        int intLenVoca1 = strVoca1.length();
        int intLenVoca2 = strVoca2.length();

        // 길이 비교
        if (intLenVoca1 > intLenVoca2) {
            System.out.printf("%s %d", strVoca1, intLenVoca1);
        } else if (intLenVoca2 > intLenVoca1) {
            System.out.printf("%s %d", strVoca2, intLenVoca2);
        } else {
            System.out.println("same");
        }
    }
}