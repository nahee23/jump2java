package 연습_클래스;

class Miner {
    String name;
    int coins;

    public Miner(String name) {
        this.name = name;
        coins = 0;
    }

    public String toString() {
        return String.format("Miner { name: %s, coins: %d }", name, coins);
    }

    public void mine() {
        coins+=1;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");
        malon.mine();
        malon.mine();
        malon.mine();
        gloria.mine();
        gloria.mine();

        System.out.printf("Miner{name:%s, coins:%d}\n", malon.name, malon.coins);
        System.out.printf("Miner{name:%s, coins:%d}\n", gloria.name, gloria.coins);


    }
}
