// import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 배열
        String[] arrFruit = {"apple", "banana", "grape", "blueberry", "orange"};

        // 변수
        int intCount = 0;

        // 입력
        Scanner sc = new Scanner(System.in);
        String stringA = sc.next();
        char charA = stringA.charAt(0);


        // 반복 및 조건문
        for (int i = 0; i < arrFruit.length; i++) {
            if (arrFruit[i].charAt(2) == charA || arrFruit[i].charAt(3) == charA) {
                System.out.println(arrFruit[i]);
                intCount += 1;
            } else {
                continue;
            }
        }

        // 출력
        System.out.println(intCount);
    }
}