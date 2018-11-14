package pl.jkan.creditcard;

class CreditCard {

    private boolean blocked = false;
    private double balance = 0;
    private double cardlimit = 0;
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
    
    public void withdraw (double szekle) {
        if (szekle > cardLimit)
            System.out.println("Mój Panie! Do obsługi tego urządzenia potrzeba wiecej złotych monet!");
        if (blocked = true)
            System.out.println("Mój Panie! Do odblokowania tej karty potrzeba kilku wyszkolonych inżynierów!");

        balance = balance - szekle;
    }
}
