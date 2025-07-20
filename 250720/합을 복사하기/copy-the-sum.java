public class Main {
    public static void main(String[] args) {
        // 변수 정의 1
        int intA = 1, intB = 2, intC = 3;

        // 연산
        int intResult = intA + intB + intC;

        // 변수 정의 2
        intA = intB = intC = intResult;

        // 출력
        System.out.printf("%d %d %d", intA, intB, intC);
    }
}