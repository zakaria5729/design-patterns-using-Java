package strategy_pattern.discount;

public class HighDiscountStrategy implements IDiscountStrategy {

    @Override
    public double getFinalBill(double amount) {
        return (amount - (amount*.50)); //50% discount
    }
}

