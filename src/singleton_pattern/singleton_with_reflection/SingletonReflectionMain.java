package singleton_pattern.singleton_with_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionMain {

    public static void main(String[] args) {
        SingletonReflection singletonReflection = SingletonReflection.getSingletonInstance();
        System.out.println(singletonReflection);

        SingletonReflection singletonReflection2 = null;
        Constructor<?> [] constructors = SingletonReflection.class.getDeclaredConstructors();
        for (Constructor<?> constructor: constructors) {
            try {
                constructor.setAccessible(true);
                singletonReflection2 = (SingletonReflection) constructor.newInstance();
                break;

            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println(singletonReflection2);
    }
}
