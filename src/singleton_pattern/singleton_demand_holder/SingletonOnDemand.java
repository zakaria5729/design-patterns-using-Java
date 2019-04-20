package singleton_pattern.singleton_demand_holder;

/*
 * It is thread safe and the object create only one time in on demand that means when first time the getInstance method call then the object will be created Since the JVM does not load the SingletonSampleHolder at startup
 * */

public class SingletonOnDemand {

    private SingletonOnDemand() {}

    private static class SingletonDemandHolder {
        private static final SingletonOnDemand SINGLETON_INSTANCE = new SingletonOnDemand();
    }

    public static SingletonOnDemand getInstance() {
        return SingletonDemandHolder.SINGLETON_INSTANCE;
    }
}
