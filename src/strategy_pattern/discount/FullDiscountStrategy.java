package strategy_pattern.discount;

public class FullDiscountStrategy implements IDiscountStrategy {

    @Override
    public double getFinalBill(double amount) {
        return 0;
    }
}