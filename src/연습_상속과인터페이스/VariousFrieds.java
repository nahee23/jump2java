package 연습_상속과인터페이스;

public class VariousFrieds {
    public static void main(String[] args) {
        Artist kim = new Artist("뮤지션 김씨");
        Architect lee = new Architect("건축가 이씨");
        Developer park = new Developer("개발자 박씨");
        Lawyer choi = new Lawyer("변호사 최씨");

        Fried[] frieds = {kim, lee, park, choi};

        for (Fried f : frieds) {
            f.dearFriend();
        }
    }
}
interface Fried {
    void dearFriend();
}

class Artist implements Fried {
    String name;
    public Artist(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", name);
    }
}

class Architect implements Fried {
    String name;
    public Architect(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", name);
    }
}

class Developer implements Fried {
    String name;
    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", name);
    }
}

class Lawyer implements Fried {
    String name;
    public Lawyer(String name) {
        this.name = name;
    }

    @Override
    public void dearFriend() {
        System.out.printf("%s -> 칭구 아이가!\n", name);
    }
}