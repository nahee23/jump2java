package 연습_상속과인터페이스;

public class DrinkTest {
    public static void main(String[] args) {
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water();
        Tea t = new Tea();

        Drink[] drinks = { j, c, b, w, t };

        for (Drink d : drinks) {
            System.out.println(d.toString());
        }
    }
}
class Drink {
    String name;
    double price;

    @Override
    public String toString() {
        return "주문되었습니다.";
    }
}

class Juice extends Drink {
}
class Coffee extends Drink {
}
class Beer extends Drink {
}
class Water extends Drink {
}
class Tea extends Drink {
}