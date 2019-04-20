package abstract_factory_pattern.os.computer;

import abstract_factory_pattern.abstract_factory.IFactoryOS;

public class WindowsPcOS implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Most used pc os");
    }
}