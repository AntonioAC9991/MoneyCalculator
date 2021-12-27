package Model;

import Model.Currency;

public class Money {
    
    private final double aumount;
    private final Currency currency;

    public Money(double aumount, Currency currency) {
        this.aumount = aumount;
        this.currency = currency;
    }

    public double getAumount() {
        return aumount;
    }

    public Currency getCurrency() {
        return currency;
    }
      
}
