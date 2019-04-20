package singleton_pattern.singleton_manual;

/*
* The singleton pattern is used to limit creation of a class to only one object. This is beneficial when one (and only one) object is needed to coordinate actions across the system. There are several examples of where only a single instance of a class should exist, including caches, thread pools, and registries.

It’s trivial to initiate an object of a class — but how do we ensure that only one object ever gets created? The answer is to make the constructor ‘private’ to the class we intend to define as a singleton. That way, only the members of the class can access the private constructor and no one else.
* */

public class SingletonManual {
    private int value;
    private static SingletonManual singletonManualInstance;

    private SingletonManual() {}

    public static SingletonManual getSingletonManualInstance() {
        if (singletonManualInstance == null) {
            synchronized (SingletonManual.class) {//Thread safety synchronized block

                if (singletonManualInstance == null) { //double checked locking
                    singletonManualInstance = new SingletonManual();
                }
            }
        }

        return singletonManualInstance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
