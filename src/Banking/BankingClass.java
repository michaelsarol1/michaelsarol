package Banking;

public class BankingClass {

    private int accNo;
    private float balance;
    private int pin;


   
    public float getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public int getAccNo() {
        return accNo;
    }

  
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }


   
    public boolean verifyAccount(int accn, int pin) {
        return (this.accNo == accn && this.pin == pin);
    }

 
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}