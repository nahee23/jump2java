package ch07_3;

class Counter {
    /* 스테틱 변수는 공유됨 */
    static int count = 0;

    public Counter() {
        count++; //카운트 값 1증가
        System.out.println(count); //카운트 값 출력
    }
    /* 메서드 앞에 static 붙고 객체 상관없이 사용가능*/
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        getCount();
    }
}

public class Ch07_스테틱변수 {
    public static void main(String[] args) {
        // 스테틱변수(클래스변수)는 객체 만들기 전에 이미 있음 (객체 안만들어도 사용가능)
        Counter.count = 10;
        double pi = Math.PI;
        Counter c1 = new Counter(); //11
        Counter c2 = new Counter(); //12
        Counter c3 = new Counter(); //13
        System.out.println(Counter.getCount());

    }
}
