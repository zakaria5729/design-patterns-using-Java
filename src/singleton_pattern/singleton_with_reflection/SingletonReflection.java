package singleton_pattern.singleton_with_reflection;

public class SingletonReflection {
    private static SingletonReflection singletonInstance;

    /*
     * prevent from reflection:
     * 1. throw an IllegalArgumentException in private constructor
     * 2. set system error and exit using system
     * */
    private SingletonReflection() {
        throw new IllegalArgumentException("Multiple instance creation is not possible in singleton_manual pattern");

        //System.err.println("Multiple instance creation is not possible in singleton_manual pattern");
        //System.exit(0);
    }

    public static SingletonReflection getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonReflection.class) {//Thread safety synchronized block

                if (singletonInstance == null) { //double checked locking
                    singletonInstance = new SingletonReflection();
                }
            }
        }

        return singletonInstance;
    }
}
