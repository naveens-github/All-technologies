public class BankAccount {
    private double balance;
    private double minimumBalance;

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance =  minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double withdraw(double amount){
        if(balance - amount > minimumBalance){
            balance = balance-amount;
            return amount;
        }
        else {
            throw new RuntimeException();
        }
    }

    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
}
