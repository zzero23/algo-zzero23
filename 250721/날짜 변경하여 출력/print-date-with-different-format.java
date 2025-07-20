// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String[] arrDate = sc.next().split("\\.");

        // 출력
        System.out.printf("%s-%s-%s", arrDate[1], arrDate[2], arrDate[0]);
    }
}