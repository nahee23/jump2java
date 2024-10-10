package 연습_자바API;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<Chicken> order = new ArrayList<Chicken>();

        order.add(new Chicken("로스트 치킨",9900));
        order.add(new Chicken("파닭",12900));
        order.add(new Chicken("마늘아",13900));

        int sum = 0;
        for (int i = 0; i < order.size(); i++) {
            Chicken chicken = order.get(i);
            sum += chicken.getPrice();
        }

        System.out.printf("총합: %d원\n", sum);
    }
}
class Chicken{
    String name;
    int price;
    public Chicken(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}