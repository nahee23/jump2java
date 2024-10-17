package ch07_5;

import java.util.ArrayList;

class Sample2 extends Thread {

    int n;

    public Sample2(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.n+"스레드 i : "+ i);
            try {
                Thread.sleep(500); //0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ch07_멀티스레드 {
    public static void main(String[] args) {
        //스레드 객체 2개
        Thread t1 = new Sample2(1);
        Thread t2 = new Sample2(2);
        t1.start();
        t2.start();
        System.out.println("Main thread 종료");
    }
}
