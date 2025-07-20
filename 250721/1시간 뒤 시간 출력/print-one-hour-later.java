// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();
        String[] strTime = strInput.split(":");

        // 연산
        int intH = Integer.parseInt(strTime[0]) + 1;

        // 출력
        System.out.printf("%d:%s", intH, strTime[1]);
    }
}