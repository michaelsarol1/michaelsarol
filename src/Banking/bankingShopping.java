package Banking;

public class bankingShopping {
    private int accNo;
    private float balance;
    private int pin;

    public bankingShopping() {
    }

    public bankingShopping(int accNo, int pin, float balance) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
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

    public int getAccNo() {
        return accNo;
    }

    public boolean verifyAccount(int accn, int pn) {
        return this.accNo == accn && this.pin == pn;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance is: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance is: " + this.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}