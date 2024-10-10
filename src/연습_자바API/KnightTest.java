package 연습_자바API;

public class KnightTest {
    public static void main(String[] args) {
        Knight knight = new Knight("돈키호테", 30);

        System.out.println("[객체 생성]");
        System.out.printf("\t%s\n", knight.toString());
        //체력 증가: 기존 체력 +30
        knight.setHp(knight.getHp()+30);
        //결과 출력
        System.out.println("[체력 증가 +30]");
        System.out.printf("\t%s\n", knight.toString());
    }
}
class Knight {
    //필드는 private 사용 (외부 접근금지)
    private String name;
    private int hp;

    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //게터 : private 필드를 우회적으로 가져옴
    //get 메소드는 값을 가져옴 (리턴)
    public int getHp() {
        return this.hp;
    }

    //세터 : private 필드를 우회적으로 변경
    //set 메소드는 값을 입력함
    public void setHp(int hp) {
        this.hp = hp;
    }

    public String toString() {
        return String.format("Knight { name: %s, hp: %d }", name, hp);
    }
}