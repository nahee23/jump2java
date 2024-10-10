package 연습_자바API;


import java.util.ArrayList;

public class TotalPrice {
    public static void main(String[] args) {
        Goods a = new Goods("스트라이프 셔츠",49900);
        Goods b = new Goods("슬림 면바지",58900);
        Goods c = new Goods("스니커즈",46900);

        Cart myCart = new Cart();
        myCart.add(a);
        myCart.add(b);
        myCart.add(c);

        System.out.printf("총합: %d원",myCart.totalPrice());
    }
}
class Cart {
    private ArrayList<Goods>list;

    public Cart() {
        this.list = new ArrayList<Goods>();
    }

    public void add(Goods goods) {
        list.add(goods);
    }

    public int totalPrice() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            sum += goods.getPrice();
        }
        return sum;
    }
}

class Goods {
    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}