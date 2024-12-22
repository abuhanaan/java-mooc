
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        int newCents = this.cents + addition.cents();
        int newEuros = this.euros + addition.euros();
        if(this.cents + addition.cents() >= 100){
            newCents = (this.cents + addition.cents()) - 100;
            newEuros += 1;
        }
        Money newMoney = new Money(newEuros, newCents);   
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if (this.euros > compared.euros() || (this.euros == compared.euros() && this.cents > compared.cents())){
            return false;
        }
        return true;
    }
    
    public Money minus(Money decreaser){
        if (this.lessThan(decreaser)){
            return new Money(0, 0);
        }
        int balance = (this.euros * 100 + this.cents) - (decreaser.euros() * 100 + decreaser.cents());
     
        int hundreds = balance / 100;
        int units = balance % 100;
        
        return new Money(hundreds, units);
    }
}
