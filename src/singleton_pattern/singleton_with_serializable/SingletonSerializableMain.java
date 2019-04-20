package singleton_pattern.singleton_with_serializable;

import java.io.*;

public class SingletonSerializableMain {

    public static void main(String[] args) {
        SingletonSerializable singletonSerializable = SingletonSerializable.getSingletonInstance();
        System.out.println(singletonSerializable);

        try {
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("object.ser"));
            objectOutput.writeObject(singletonSerializable);
            objectOutput.close();

            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("object.ser"));
            SingletonSerializable singletonSerializable2 = (SingletonSerializable) objectInput.readObject();
            objectInput.close();

            System.out.println(singletonSerializable2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
