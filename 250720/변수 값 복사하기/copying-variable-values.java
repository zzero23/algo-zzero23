public class Main {
    public static void main(String[] args) {
        // 변수 정의 1
        int intA = 1, intB = 2, intC = 3;

        // 변수 정의 2
        intA = intB = intC;

        // 출력
        System.out.printf("%d %d %d", intA, intB, intC);
    }
}