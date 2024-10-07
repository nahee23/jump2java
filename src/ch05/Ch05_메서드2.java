package ch05;

class Sample2{
    int a; //객체변수
    void varTest(Sample2 s){
        s.a++;
    }
}

class  Updater {
    void update(Counter c){
        c.count++;
    }
}

class Counter {
    int count = 0;
}

public class Ch05_메서드2 {
    public static void main(String[] args) {
        Sample2 s1 = new Sample2();
        Sample2 s2 = new Sample2();
        s1.a = 1;
        s2.a = 2;
        s1.varTest(s2); //s2.a=3
        s1.varTest(s1); //s1.a=2
        System.out.println(s1.a);
        System.out.println(s2.a);

        Counter c = new Counter();
        System.out.println("업데이트 전 : " +c.count);
        Updater u = new Updater();
        u.update(c);
        System.out.println("업데이트 후 : " +c.count);
    }
}
