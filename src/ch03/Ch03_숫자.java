package ch03;

public class Ch03_숫자 {
    public static void main(String[] args) {
        // 정수 타입(자료형)
        int age =10;
        long count = 2183821823238L;
        // 실수 (더블이 기본)
        float pi = 3.14f; //특별한 경우 아님 사용안함
        double pi2 = 3.141592653589793238;
        // 8진수(0)와 16진수(0x)
        int oxtal = 023;
        int hex = 0xC3;
        System.out.println(oxtal);
        System.out.println(hex);
        // 숫자 연산 ( + - * / ) : 사칙연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3); // 나머지
        System.out.println(3%7);

        // 증감연산 (++ , --) 1씩 증가 또는 감소
        int i = 0;
        int j = 10;
        i++; // i = i + 1
        j--; // j = j - 1

        System.out.println(i);
        System.out.println(j);
        // 증감연산자가 앞에 있을때 먼저 증감 뒤에는 뒤에 증감
        System.out.println(++i); //2
        System.out.println(j--); //9 ==> 뒤에 8이됨
        System.out.println(j); // 8
        int x = i++; // x = 2 , i = 3
        int y = i + --j; // y = 10, i = 3, j=7
        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
        System.out.println(j);

    }
}
