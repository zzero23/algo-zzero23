// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        // 변환
        double num1 = sc1.nextDouble();
        double num2 = sc1.nextDouble();
        double num3 = sc1.nextDouble();
        // 출력
        System.out.printf("%.3f\n%.3f\n%.3f",num1,num2,num3);
    }
}