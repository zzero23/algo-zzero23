// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String engChar = sc.next();

        // 반복문
        for (int i = 0; i < 8; i++) {
            System.out.print(engChar);
        }
    }
}