package 연습_상속과인터페이스;

public class ElvesTest {
    public static void main(String[] args) {
        Elf elf = new Elf("티란데", 100);
        HighElf high = new HighElf("말퓨리온",160,100);
        ElfLord lord = new ElfLord("마이에브",230,140,100);
        // 객체 배열에 넣기
        Elf[] elves = {elf,high,lord};
        //모든 객체 정보 출력
        for (int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString());
        }
        //forEach 단축어 iter
        for (Elf e : elves) {
            System.out.println(e.toString());
        }
    }
}

class Elf{
    String name;
    int hp;
    public Elf(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override //toString 메소드는 객체의 정보를 보여줌, 메서드 생략 (우클릭>생성>toString)
    public String toString() {
        return "Elf{" + "name='" + name + '\'' +", hp=" + hp + '}';
    }
}
class HighElf extends Elf{
    int mp; // mp 추가

    @Override
    public String toString() {
        return String.format("HighElf{name='%s', hp=%d, mp=%d}", name,hp, mp);
    }

    //생성자 상속 시 부모객체를 먼저 만듬.
    public HighElf(String name, int hp, int mp) {
        super(name, hp); //super 는 부모클래스의 생성자
        this.mp = mp;

    }
}
class ElfLord extends HighElf{
    int shield;
    public ElfLord(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "ElfLord{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", shield=" + shield +
                '}';
    }
}