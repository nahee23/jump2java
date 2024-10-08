package 연습_클래스;

public class Ex07 {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("456-78",10000);

        boolean result = true;
        while (result) {
            result = a.transfer(b,3000);
        }

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
class Account {
    String num;
    int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String toString() {
        return String.format("Account { num: %s, balance: %d }", num, balance);
    }

    public boolean transfer(Account target, int amount) {
        if (balance < amount) {
            return false;
        }

        balance -= amount;
        target.balance += amount;
        return true;
    }
}
