package singleton_pattern.singleton_with_cloneable;

public class SingletonCloneableMain {

    public static void main(String[] args) {
        SingletonCloneable singletonCloneable = SingletonCloneable.getSingletonInstance();
        System.out.println(singletonCloneable);

        try {
            SingletonCloneable singletonCloneable2 = (SingletonCloneable) SingletonCloneable.getSingletonInstance().clone();
            System.out.println(singletonCloneable2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
