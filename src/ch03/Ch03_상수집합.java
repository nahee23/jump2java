package ch03;

public class Ch03_상수집합 {
    enum CoffeeType{
        아메리카노,
        아이스_아메리카노,
        카페라떼
    };
    public static void main(String[] args) {
        System.out.println(CoffeeType.아메리카노);
        System.out.println(CoffeeType.아이스_아메리카노);
        System.out.println(CoffeeType.카페라떼);

        //반복문
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);
        }
    }
}
