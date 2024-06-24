
public class BankAccount {
    double balance;
    String accountNumber;

    BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double deposit(double depositMoney) {
        balance = balance + depositMoney;
        return balance;
    }

    public double withdraw(double withdrawMoney) {
        balance = balance - withdrawMoney;
        return balance;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to HDFC Bank ATM");
        BankAccount obj1 = new BankAccount(35000, "10000");
        System.out.println(obj1.deposit(15000) + "rs is deposited in bank account");
        System.out.println(obj1.withdraw(1500) + "rs is withdrawn from your bank account");
        System.out.println("Thank you for using HDFC ATM");
    }


}

