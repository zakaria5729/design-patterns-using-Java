package singleton_pattern.singleton_manual;

public class SingletonManualMain {

    public static void main(String[] args) {
        SingletonManual singletonManual1 = SingletonManual.getSingletonManualInstance();
        System.out.println(singletonManual1.hashCode());
        singletonManual1.setValue(2);
        System.out.println(singletonManual1.getValue());

        System.out.println();

        SingletonManual singletonManual2 = SingletonManual.getSingletonManualInstance();
        System.out.println(singletonManual2.hashCode());
        singletonManual2.setValue(3);
        System.out.println(singletonManual2.getValue());
    }
}