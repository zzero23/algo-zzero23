// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int water = sc.nextInt();

        // 조건문
        if (water < 0) {
            System.out.println("ice");
        } else if (water >= 100) {
            System.out.println("vapor");
        } else if (water >= 0 && water < 100) {
            System.out.println("water");
        }
    }
}