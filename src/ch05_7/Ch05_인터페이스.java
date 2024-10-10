package ch05_7;

interface Predator{
    //추상메서드 (구현이 되지 않은 메서드로 {몸통} 없음) //메서드에 기능이 없음
    String getFood();
}

class Animal {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Tiger extends Animal implements Predator{

    @Override
    public String getFood() {
        return "사과";
    }
}
class Lion extends Animal implements Predator {

    @Override
    public String getFood() {
        return "바나나";
    }
}

class ZooKeeper {
    public void feed(Predator predator) {
        System.out.println("먹이:"+predator.getFood());
    }
}

public class Ch05_인터페이스 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feed(tiger); //인터페이스 타입 객체 입력 (구현한 클래스 객체)
        zooKeeper.feed(lion);
    }
}
