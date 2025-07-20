// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        char charC = sc.next().charAt(0);
        double dblA = sc.nextDouble();
        double dblB = sc.nextDouble();

        // 출력
        System.out.printf("%s\n%.2f\n%.2f", charC, dblA, dblB);
    }
}