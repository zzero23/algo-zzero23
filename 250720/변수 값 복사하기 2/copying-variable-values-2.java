public class Main {
    public static void main(String[] args) {
        // 변수 정의 1
        int intA = 5, intB = 6, intC = 7;

        // 변수 정의 2
        intA = intB = intC;

        // 출력
        System.out.printf("%d %d %d", intA, intB, intC);
    }
}