package abstract_factory_pattern.os.mobile;

import abstract_factory_pattern.abstract_factory.IFactoryOS;

public class IOS implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Most secure mobile os");
    }
}