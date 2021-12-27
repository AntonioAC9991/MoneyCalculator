package Persistence.Rest;

import Model.Currency;
import Model.ExchangeRate;
import Persistence.ExchangeRateLoader;

public class RestExchangeRateLoader implements ExchangeRateLoader{

    @Override
    public ExchangeRate get(Currency from, Currency to) {
        double rate = 0.0;
        from.getCode();
        to.getCode();
        return new ExchangeRate(rate, from, to);

    }
    
}
