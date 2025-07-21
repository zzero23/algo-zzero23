// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intAmath = sc.nextInt();
        int intAeng = sc.nextInt();
        sc.nextLine();
        int intBmath = sc.nextInt();
        int intBeng = sc.nextInt();

        // 변수 정의
        char charName;

        // 조건문
        if (intAmath > intBmath) {
            charName = 'A';
        } else if (intAmath == intBmath) {
            if (intAeng > intBeng) {
                charName = 'A';
            } else {
                charName = 'B';
            }
        } else {
            charName = 'B';
        }

        // 출력
        System.out.println(charName);
    }
}