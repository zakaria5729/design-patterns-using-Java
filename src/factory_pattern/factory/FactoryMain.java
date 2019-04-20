package factory_pattern.factory;

/*
* A normal factory produces goods; a software factory produces objects. And not just that — it does so without specifying the exact class of the object to be created. To accomplish this, objects are created by calling a factory method instead of calling a constructor.
*
* Usually, object creation in Java takes place like so: SomeClass someClassObject = new SomeClass();
The problem with the above approach is that the code using the SomeClass’s object, suddenly now becomes dependent on the concrete implementation of SomeClass. There’s nothing wrong with using new to create objects but it comes with the baggage of tightly coupling our code to the concrete implementation class, which can occasionally be problematic.
* */

import factory_pattern.phone.IFactoryOS;

public class FactoryMain {

    public static void main(String[] args) {
        OperatingSystemFactory factory = new OperatingSystemFactory();

        IFactoryOS iFactoryOS = factory.getOsInstance("powerful");
        iFactoryOS.specification();

        iFactoryOS = factory.getOsInstance("secure");
        iFactoryOS.specification();

        iFactoryOS = factory.getOsInstance("most used");
        iFactoryOS.specification();

        iFactoryOS = factory.getOsInstance("nothing");
        iFactoryOS.specification();
    }
}