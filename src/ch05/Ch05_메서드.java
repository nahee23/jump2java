package ch05;

class Sample {
    //메서드 입력 매개변수 a,b (parameter)
    int sum(int a, int b) {
        return a+b;
    }

    //리턴값이 없는 메서드
    void sum2(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
        System.out.printf("%d와 %d의 합은 %d 입니다.\n", a,b,a+b);
    } // %n 은 한칸 뛰움, \n은 줄바꿈

    //입력은 없고 문자열 "Hello"가 반환됨
    String say() {
        return "Hello";
    }

    //입력 리턴 없는 메서드
    void say2() {
        System.out.println("Hi");
    }

    //리턴으로 빠져나오기 (메서드에서 리텅을 만나면 종료됨)
    void sayNick (String nick) {
        if ("바보".equals(nick)||"등신".equals(nick)) {
            return; //종료 (아래의 코드는 실행 안됨)
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    //메서드 안에 선언 변수 효력범위 (메서드 안에서만 사용)
    int varTest(int a) {
        a++;
        return a;
    }


}

public class Ch05_메서드 {
    public static void main(String[] args) {

            Sample sample = new Sample();
            //객체.메소드명 => 메소드 호출 이때 전달하는 입력값을 인수(arguments)
            int c = sample.sum(3,4);

            System.out.println(c);

            String say = sample.say();
            System.out.println(say);

            sample.sum2(3,4);

            sample.say2();

            sample.sayNick("천재");
            sample.sayNick("바보"); //출력안됨

            int a = 1;
            a = sample.varTest(a);
            System.out.println(a);
    }
}
