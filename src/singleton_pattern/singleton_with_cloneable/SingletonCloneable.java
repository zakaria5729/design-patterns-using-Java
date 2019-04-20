package singleton_pattern.singleton_with_cloneable;

public class SingletonCloneable implements Cloneable {
    private static SingletonCloneable singletonInstance;

    private SingletonCloneable() {}

    public static SingletonCloneable getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonCloneable.class) {//Thread safety synchronized block

                if (singletonInstance == null) { //double checked locking
                    singletonInstance = new SingletonCloneable();
                }
            }
        }

        return singletonInstance;
    }

    /*
    * prevent from cloneable interface:
    * 1. return singleton_manual instance instead of super.clone();
      2. or throw a CloneNotSupportedException exception
    * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();

        return getSingletonInstance();
        //throw new CloneNotSupportedException();
    }
}