package 연습_상속과인터페이스;

public class CarTest {
    public static void main(String[] args) {
        Car a = new Car("티코");
        Truck b = new Truck("봉고",1.5);

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[자동차]{" +
                "name:'" + name + '\'' +
                '}';
    }
}
class Truck extends Car {
    double ton;
    public Truck(String name, double ton) {
        super(name);
        this.ton = ton;
    }

    @Override
    public String toString() {
        return "[트럭]{" +
                "name:'" + name + '\'' +
                ", ton:" + ton +
                '}';
    }
}