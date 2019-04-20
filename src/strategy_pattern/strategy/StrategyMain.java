package strategy_pattern.strategy;

import strategy_pattern.discount.FullDiscountStrategy;
import strategy_pattern.discount.HighDiscountStrategy;
import strategy_pattern.discount.LowDiscountStrategy;
import strategy_pattern.discount.NoDiscountStrategy;

/*
 *The strategy pattern allows grouping related algorithms under an abstraction, which allows switching out one algorithm or policy for another without modifying the client. Instead of directly implementing a single algorithm, the code receives runtime instructions specifying which of the group of algorithms to run.
 * */

public class StrategyMain {

    public static void main(String[] args) {
        //50% discount
        ShoppingMallStrategy shoppingMallStrategy = new ShoppingMallStrategy(new HighDiscountStrategy());
        System.out.println("Final bill for high discount: " + shoppingMallStrategy.getFinalBillAmount(1000));

        //10% discount
        shoppingMallStrategy = new ShoppingMallStrategy(new LowDiscountStrategy());
        System.out.println("Final bill for low discount: " + shoppingMallStrategy.getFinalBillAmount(1000));

        //100% discount
        shoppingMallStrategy = new ShoppingMallStrategy(new FullDiscountStrategy());
        System.out.println("Final bill for full discount: " + shoppingMallStrategy.getFinalBillAmount(1000));

        //0% discount
        shoppingMallStrategy = new ShoppingMallStrategy(new NoDiscountStrategy());
        System.out.println("Final bill for no discount: " + shoppingMallStrategy.getFinalBillAmount(1000));
    }
}
