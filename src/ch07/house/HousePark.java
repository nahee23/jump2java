package ch07.house;

public class HousePark {
    /* protected 는 같은 패키지 or 해당 클래스를 상속받은 클래스*/
    protected String lastname = "park";
    public static void main(String[] args) {
        //같은 패키지 안에 있는 것은 import 할 필요 없음 (자동)
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
    }
}
