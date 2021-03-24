package hometask09.task3;

public class Account {
    int id;
    String code;
    int balance;

    public Account(int id, String code, int balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                '}';
    }
}
