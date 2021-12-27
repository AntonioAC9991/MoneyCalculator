package Persistence;

import Model.Currency;
import java.util.ArrayList;
import java.util.List;

public interface CurrencyLoader {
    
    ArrayList<Currency> loadAllCurrencies();
    
}
