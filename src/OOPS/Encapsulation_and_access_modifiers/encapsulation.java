package OOPS.Encapsulation_and_access_modifiers;

public class encapsulation {
    
}

class BankAccount{
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
