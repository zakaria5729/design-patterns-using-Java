package singleton_pattern.singleton_with_enum;

public class SingletonEnumMain {

    public static void main(String[] args) {
        SingletonEnum singletonEnum1 = SingletonEnum.SINGLETON_INSTANCE;
        System.out.println(singletonEnum1.hashCode());
        singletonEnum1.setValue(4);
        System.out.println(singletonEnum1.getValue());

        SingletonEnum singletonEnum2 = SingletonEnum.SINGLETON_INSTANCE;
        System.out.println(singletonEnum2.hashCode());
        singletonEnum2.setValue(5);
        System.out.println(singletonEnum2.getValue());
    }
}
