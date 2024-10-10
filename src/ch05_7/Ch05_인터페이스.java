package ch05_7;

interface Predator{
    //추상메서드 (구현이 되지 않은 메서드로 {몸통} 없음) //메서드에 기능이 없음
    String getFood();
    //디폴트 메서드 (실제 구현된 메서드 앞에 default 표시)
    default void printFood(){
        System.out.printf("내 사료는 %s 이다.\n", getFood());
    }
}

interface Barkable {
    void bark();
}

class Animal {
    String name;

    void setName(String name){
        this.name = name;
    }

    //다형성 하나의 객체가 여러 자료형 타입 Tiger 와 Lion 은 Animal 타입 선언
    //Tiger 와 Lion 타입의 메소드를 따로 만들 필요가 없다.
    /*void barkAnimal(Animal animal){
        //instanceof 는 실제 객체가 클래스타입과 같으면 참 아니면 거짓
        if(animal instanceof Tiger){
            System.out.println("어흥");
        } else if(animal instanceof Lion){
            System.out.println("으르렁");
        }
    }*/

    void BarkAnimal(Barkable animal) {
        animal.bark();
    }
}

//인터페이스는 상속(1개만 가능)과 달리 여러개 구현 가능(,)
class Tiger extends Animal implements Predator,Barkable{

    @Override
    public String getFood() {
        return "사과";
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}
class Lion extends Animal implements Predator,Barkable {

    @Override
    public String getFood() {
        return "바나나";
    }

    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
                 //인터페이스 Predator 를 구현한 객체를 입력가능
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
        // Predator predator = new Predator(); 인터페이스를 바로 객체 안됨
        Predator p1 = new Tiger();
        Predator p2 = new Lion();
        p1.printFood(); //디폴트 메서드
        p2.printFood();

        Animal animal = new Animal();
        animal.BarkAnimal(tiger);
        animal.BarkAnimal(lion);


    }
}
