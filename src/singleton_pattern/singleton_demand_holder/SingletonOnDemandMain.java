package singleton_pattern.singleton_demand_holder;

public class SingletonOnDemandMain {

    public static void main(String[] args) {
        SingletonOnDemand singletonOnDemand = SingletonOnDemand.getInstance();
        System.out.println(singletonOnDemand);

        SingletonOnDemand singletonOnDemand2 = SingletonOnDemand.getInstance();
        System.out.println(singletonOnDemand2);
    }
}
