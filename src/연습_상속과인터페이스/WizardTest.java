package 연습_상속과인터페이스;

public class WizardTest {
    public static void main(String[] args) {
        GreatWizard gandalf = new GreatWizard("간달프",100,100,100);
        System.out.println(gandalf.toString());
        gandalf.energeVolt();
    }
}
class Novice {
    String name;
    int hp;

    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "[Novice]" + name + '(' +
                "hp:" + hp +
                ')';
    }
}

class Wizard extends Novice {
    int mp;
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    public void energeVolt() {
        System.out.printf("%s의 에너지볼트! (대마법사 버프로 데미지 +30추가)\n", name);
    }
}

class GreatWizard extends Wizard {
    int SHIELD;

    public GreatWizard(String name, int HP, int MP, int SHIELD) {
        super(name, HP, MP);
        this.SHIELD = SHIELD;
    }

    @Override
    public String toString() {
        return "[대마법사]" + name + '(' +
                "HP:" + hp +
                ", MP:" + mp +
                ", SHIELD:" + SHIELD +
                ')';
    }
}

