package Control;

import Model.ExchangeRate;
import Model.Money;
import Persistence.ExchangeRateLoader;
import View.MoneyDialog;
import View.MoneyDisplay;

public class CalculateCommand implements Command {
    
    private final MoneyDialog moneyDialog;
    private final MoneyDisplay moneyDisplay;
    private final ExchangeRateLoader exchangeRateLoader;

    public CalculateCommand(MoneyDialog moneyDialog, MoneyDisplay moneyDisplay, ExchangeRateLoader exchangeRateLoader) {
        this.moneyDialog = moneyDialog;
        this.moneyDisplay = moneyDisplay;
        this.exchangeRateLoader = exchangeRateLoader;
    }
    
    @Override
    public String getName() {
        return "Calculate";
    }

    @Override
    public void execute() {
        Money moneyFrom = moneyDialog.getMoneyFrom();
        ExchangeRate exchangeRate = exchangeRateLoader.get(moneyFrom.getCurrency(), moneyDialog.getCurrencyTo());
        double amountTo = moneyFrom.getAumount()*exchangeRate.getRate();
        moneyDisplay.display(new Money(amountTo,moneyDialog.getCurrencyTo()));
        
        
    }
    
}