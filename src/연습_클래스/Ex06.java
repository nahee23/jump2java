package 연습_클래스;

public class Ex06 {
    public static void main(String[] args) {
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕",5900);
        Menu tangsook = new Menu("탕수육",13900);

        Menu[] menu = { jjajang, jjambbong, tangsook };
        Order order = new Order(123,menu);

        System.out.printf("주문 합계: %d원\n",order.totalPrice());

    }
}
class Menu {
    String name;
    int price;

    public Menu(String name, int i) {
        this.name = name;
        this.price = i;
    }

}
class Order {
    int orderNum;
    Menu[] menus;

    public Order(int i, Menu[] arr) {
        this.orderNum = i;
        this.menus = arr;
    }

    public int totalPrice() {
        int gap = 0;
        for (int i = 0; i < menus.length; i++) {
            gap += menus[i].price;
        }
        return gap ;
    }
}