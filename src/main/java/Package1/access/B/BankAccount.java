package Package1.access.B;

public class BankAccount {
    private int balance; //잔고

    public BankAccount() {
        balance = 0;
    }

    //외부에서도 쓸수있게 public으로 설정
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다. ");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 금액이 작습니다");
        }
    }
    //검증 로직
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
