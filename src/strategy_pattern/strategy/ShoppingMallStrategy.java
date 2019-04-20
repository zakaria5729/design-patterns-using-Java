package strategy_pattern.strategy;

import strategy_pattern.discount.IDiscountStrategy;

public class ShoppingMallStrategy {
    private IDiscountStrategy iDiscountStrategy;

    ShoppingMallStrategy(IDiscountStrategy iDiscountStrategy) {
        this.iDiscountStrategy = iDiscountStrategy;
    }

    double getFinalBillAmount(double billAmount) {
        return iDiscountStrategy.getFinalBill(billAmount);
    }
}
