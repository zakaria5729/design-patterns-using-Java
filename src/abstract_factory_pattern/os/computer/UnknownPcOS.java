package abstract_factory_pattern.os.computer;

import abstract_factory_pattern.abstract_factory.IFactoryOS;

public class UnknownPcOS implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Unknown pc os");
    }
}
