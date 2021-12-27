package moneycalculator;

import Control.CalculateCommand;
import Model.Currency;
import Persistence.File.FileCurrencyLoader;
import Persistence.CurrencyLoader;
import Persistence.ExchangeRateLoader;
import Persistence.Rest.RestExchangeRateLoader;
import java.util.ArrayList;

public class MoneyCalculator {
    
    public static void main(String[] args) {
        CurrencyLoader fileCurrencyLoader = new FileCurrencyLoader("C:\\Users\\Antonio Aguado\\Documents\\NetBeansProjects\\MoneyCalculator\\src\\currency.txt");
        ExchangeRateLoader restExchangeRateLoader = new RestExchangeRateLoader();
        MainFrame mainFrame = new MainFrame(fileCurrencyLoader.loadAllCurrencies());
        ArrayList<Currency> loadAllCurrencies = fileCurrencyLoader.loadAllCurrencies();
        CalculateCommand calculateCommand = new CalculateCommand(mainFrame.getMoneyDialog(),mainFrame.getMoneyDisplay(),restExchangeRateLoader);
        mainFrame.add(calculateCommand);
    }
    
}
