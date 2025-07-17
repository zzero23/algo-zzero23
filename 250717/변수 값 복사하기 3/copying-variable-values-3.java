public class Main {
    public static void main(String[] args) {
        // 변수 정의
        int a = 1;
        int b = 5;
        int c = 3;

        // c의 값 a에 복사
        a = c; // 3

        // 연산
        a += c; // 6
        b -= c; // 2

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}