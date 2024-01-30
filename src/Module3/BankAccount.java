package Module3;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private static int totalAccounts = 0;

    public BankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = totalAccounts++;

    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("The amount of deposit: " + amount + " into account " + accountNumber);

    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("The amount of withdraw: " + amount + " from account " + accountNumber);

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
