// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        // 대체
        String strNew = str1.charAt(0) + "a"
        + str1.substring(2, str1.length() - 2) + "a"
        + str1.charAt(str1.length() - 1);
        System.out.println(strNew);
    }
}