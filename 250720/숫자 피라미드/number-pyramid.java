// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();

        // 반복문
        for (int i = 1; i < intN + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}