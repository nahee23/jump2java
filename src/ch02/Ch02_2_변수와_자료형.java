package ch02;

/*
이 프로그램의 저작권은
나에게 있습니다.
Copyright 2024.
*/

public class Ch02_2_변수와_자료형 {
    public static void main(String[] args) {
        //변수의 선언
        int a; //변수의 선언: 정수형 변수 a를 만듬
        String b; //문자열 변수 b를 만듬 (String S는 대문자로!!)

        //변수의 값을 초기화
        a = 1; // = 은 대입 연산자: 값을 입력
        b = "Hello"; //문자열 쌍따옴표를 사용 문자1개는 '' 한따옴표 사용
        char c = 'A'; //문자타입 c 변수를 선언과 동시에 초기화

        //변수값을 확인
        System.out.println(a); //a의 값
        System.out.println(b); //b의 값
        System.out.println(c);

        //변수는 값을 바꿀수 있다.
        a = 777777777;
        b = "헬로우";
        c = '규';

        System.out.println(a); //a의 값
        System.out.println(b); //b의 값
        System.out.println(c);
    }
}
