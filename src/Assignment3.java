class BankAccount {
    private double balance;

    public BankAccount(double initBalance) {
        if(initBalance >= 0) {
            this.balance = initBalance;
        } else {
            System.out.println("Initial balance cannot be less than 0.\nSetting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs."+amount+" successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs."+amount+" successful.");
        } else {
            System.out.println("Withdrawal Failed. Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(6000);

        acc.deposit(4000);
        acc.withdraw(2000);
        acc.withdraw(9000);
        acc.withdraw(-100);

        System.out.println("Final Balance : Rs."+acc.getBalance());
    }
}
