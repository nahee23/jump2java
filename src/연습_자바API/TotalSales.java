package 연습_자바API;

import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        Menu kim = new Menu("김밥",2000,57);
        Menu don = new Menu("돈까스",6000,29);
        Menu neg = new Menu("냉면",5000,34);

        Store store = new Store();
        store.add(kim);
        store.add(don);
        store.add(neg);

        System.out.printf("총 매출: %d원",store.totalSales());
    }
}
class Store{
    private ArrayList<Menu>list;

    public Store(){
        this.list = new ArrayList<Menu>();
    }

    public void add(Menu menu){
        list.add(menu);
    }

    public int totalSales(){
        int p_sum = 0;
        int c_sum = 0;
        for (int i = 0; i < list.size() ; i++) {
            Menu a = list.get(i);
            p_sum += a.getPrice();
            c_sum += a.getCount();
        }
        return p_sum * c_sum ;
    }
}
class Menu{
    private String name;
    private int price;
    private int count;

    public Menu(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getPrice(){
        return this.price;
    }

    public int getCount(){
        return this.count;
    }
}