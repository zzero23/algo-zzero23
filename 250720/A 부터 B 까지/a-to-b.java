// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        // 조건 및 반복문
        while (intA <= intB) {
            System.out.print(intA + " ");
            if (intA % 2 != 0) {
                intA *= 2;
            } else {
                intA += 3;
            }
        }
    }
}