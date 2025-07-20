public class Main {
    public static void main(String[] args) {
        // 변수 정의 1
        int intA = 3, intB = 4;

        // 변수 정의 2
        intB = intA;

        // 연산
        int intResult = intA * intB;

        // 출력
        System.out.printf("%d %d\n%d", intA, intB, intResult);
    }
}