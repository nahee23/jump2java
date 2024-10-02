package 연습_자바시작하기;

public class Ex07 {
    public static void main(String[] args) {
        int a = 24;
        int b = 6;

        int c = a * b;
        int d = a / b;
        int e = a % b;

        System.out.printf("곱하기: %d x %d = %d\n", a, b, c);
        System.out.printf("나누기 몫: %d / %d = %d\n", a, b, d);
        System.out.printf("나누기 나머지: %d / %d = %d\n", a, b, e); // \n = 줄바꿈(엔터)

    }
}
