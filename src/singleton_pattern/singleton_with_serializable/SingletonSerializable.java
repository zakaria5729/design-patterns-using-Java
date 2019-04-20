package singleton_pattern.singleton_with_serializable;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    private static SingletonSerializable singletonInstance;

    private SingletonSerializable() {}

    public static SingletonSerializable getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonSerializable.class) {//Thread safety synchronized block

                if (singletonInstance == null) { //double checked locking
                    singletonInstance = new SingletonSerializable();
                }
            }
        }

        return singletonInstance;
    }

    //prevent from serializable interface to create multiple instance
    private Object readResolve() {
        return getSingletonInstance();
    }
}
