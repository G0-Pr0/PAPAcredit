package pl.jkan.creditcard;

class CreditCard {
<<<<<<< HEAD
    private boolean blocked = false;
=======
    private double balance = 0;
    private double cardlimit = 0;
>>>>>>> feature_withdraw
    public void assignLimit(double limit) {
        balance = limit;
        cardlimit = limit;
    }   
    
    public boolean isBlocked() {
        return this.blocked;
    }
    public void block() {
        this.blocked = true;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    
    public double getCountBalance() {
        return balance;
    }
    
    public void repay(double money){
        this.balance = balance + money;
    }
    
    public void withdraw(double money) {
        if (money > cardLimit)
            System.out.println("Illegal action. Rejection");
        if (blocked = true)
            System.out.println("Illegal action. Rejection");

        balance = balance - money;
    }
}
