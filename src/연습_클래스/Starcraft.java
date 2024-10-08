package 연습_클래스;

public class Starcraft {
    public static void main(String[] args) {
        Marine marine = new Marine("마린",80);
        Medic medic = new Medic("메딕",60);
        marine.stimpack();
        medic.heal(marine);

    }
}

class Marine {
   // 필드
    String name;
    int hp;

    // 생성자
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void stimpack(){
        System.out.printf("[%s]의 스팀팩! Hp: %d -> ", name, hp);
        hp -= 10;
        System.out.printf("%d\n", hp);
    }
}
class Medic {
    String name;
    int hp;

    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void heal(Marine target){
        System.out.printf("[%s]의 치유! %s HP(%d ->", name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d)\n", target.hp);
    }
}