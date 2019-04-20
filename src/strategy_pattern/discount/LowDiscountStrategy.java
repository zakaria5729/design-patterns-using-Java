package strategy_pattern.discount;

public class LowDiscountStrategy implements IDiscountStrategy {

    @Override
    public double getFinalBill(double amount) {
        return (amount - (amount*0.1)); //10% discount
    }
}
