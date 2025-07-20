// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();
        String[] arrDate = strInput.split("-");

        // 출력
        System.out.printf("%s.%s.%s", arrDate[2], arrDate[0], arrDate[1]);
    }
}