package 연습_클래스;

public class Ex04 {
    public static void main(String[] args) {
        Cube a = new Cube(3);
        Cube b = new Cube(5);

        System.out.printf("정육면체a의 부피:%d, 겉넓이:%d\n",a.Volume(),a.surfaceArea());
        System.out.printf("정육면체b의 부피:%d, 겉넓이:%d\n",b.Volume(),b.surfaceArea());
    }
}
class Cube {
    int length;

    public Cube(int i) {
        this.length = i;
    }

    public int Volume() {
        return length * length * length;
    }

    public int surfaceArea() {
        return 6 * length * length;
    }
}