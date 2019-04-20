package strategy_pattern.discount;

public interface IDiscountStrategy {
    double getFinalBill(double amount);
}
