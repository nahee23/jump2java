package ch07_6;

interface Calculator{
    int sum(int a, int b);
}
class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

public class Ch07_함수형 {
    public static void main(String[] args) {
        //일반적인 클래스로 객체를 만들 경우
        Calculator calc = new MyCalculator();
        int result = calc.sum(3,4);
        System.out.println(result);

        //객체 대신 익명클래스로
        Calculator calc2 = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int result2 = calc2.sum(3,4);
        System.out.println(result2);

        //객체 대신 람다를 적용
        Calculator calc3 = (int a, int b)->a+b; //return 생략됨
        int result3 = calc3.sum(3,4);
        System.out.println(result3);
    }
}
