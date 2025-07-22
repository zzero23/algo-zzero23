// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 출력
        for (int i = intB; i > intA-1; i--) {
            System.out.print(i + " ");
        }
    }
}