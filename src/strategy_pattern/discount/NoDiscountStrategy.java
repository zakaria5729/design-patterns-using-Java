package strategy_pattern.discount;

public class NoDiscountStrategy implements IDiscountStrategy {

    @Override
    public double getFinalBill(double amount) {
        return amount;
    }
}
