package 연습_상속과인터페이스;

public class DrinkTest {
    public static void main(String[] args) {
        Juice j = new Juice("juice",6000);
        Coffee c = new Coffee("coffee",4500);
        Beer b = new Beer("beer",5000);
        Water w = new Water("water",500);
        Tea t = new Tea("tea",1000);

        Drink[] drinks = { j, c, b, w, t };

        for (Drink d : drinks) {
            System.out.println(d.toString());
        }
    }
}
class Drink {
    String name;
    double price;
    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" 주문되었습니다. 가격은 "+ price;
    }
}

class Juice extends Drink {
    public Juice(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return name+" 주문되었습니다. 가격은 "+ price;
    }
}

class Coffee extends Drink {
    public Coffee(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return name+" 주문되었습니다. 가격은 "+ price;
    }
}
class Beer extends Drink {
    public Beer(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return name+" 주문되었습니다. 가격은 "+ price;
    }
}
class Water extends Drink {
    public Water(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return name+" 주문되었습니다. 가격은 "+ price;
    }
}
class Tea extends Drink {
    public Tea(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return name+" 주문되었습니다. 가격은 "+ price;
    }
}