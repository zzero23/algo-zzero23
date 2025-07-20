// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String[] arrPhone = sc.next().split("-");

        // 출력
        System.out.printf("%s-%s-%s", arrPhone[0], arrPhone[2], arrPhone[1]);
    }
}