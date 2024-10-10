package 연습_상속과인터페이스;

public class CurrencyTest {
    public static void main(String[] args) {
        KRW krw = new KRW(1500,"원");
        USD usd = new USD(100.50,"달러");
        EUR eur = new EUR( 260.87,"유로");
        JPY jpy = new JPY(1400,"엔");

        Currency[] list = {krw, usd, eur, jpy};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }
    }
}
class Currency {
    String name;
    double price;
    String won;

    public Currency(double price, String won) {
        this.price = price;
        this.won = won;
    }

    @Override
    public String toString() {
        return String.format(" %.2f %s" ,price, won);
    }
}

class KRW extends Currency {
    public KRW(double price, String won) {
        super(price, won);
    }
    @Override
    public String toString() {
        return String.format("KRW: %.2f %s" ,price, won);
    }
}
class USD extends Currency {
    public USD(double price, String won) {
        super(price, won);
    }
    @Override
    public String toString() {
        return String.format("USD: %.2f %s",price, won);
    }
}
class EUR extends Currency {
    public EUR(double price, String won) {
        super(price, won);
    }
    @Override
    public String toString() {
        return String.format("EUR: %.2f %s" ,price, won);
    }
}
class JPY extends Currency {
    public JPY(double price, String won) {
        super(price, won);
    }
    @Override
    public String toString() {
        return String.format("JPY: %.2f %s",price, won);
    }
}
