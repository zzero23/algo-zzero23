// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intN = sc.nextInt();

        // 출력
        for (int i = 0; i < intN; i++) {
            intA += intN;
            System.out.println(intA);
        }
    }
}