package singleton_pattern.singleton_with_enum;

/*
* this is same as:
* public final static MySingleton INSTANCE = new MySingleton();
private MySingleton(){}
*
* and it is the best approach to create single instance
* */

public enum SingletonEnum {
    SINGLETON_INSTANCE;

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
