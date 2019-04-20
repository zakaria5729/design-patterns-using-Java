package abstract_factory_pattern.os.mobile;

import abstract_factory_pattern.abstract_factory.IFactoryOS;

public class AndroidOS implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Most famous mobile os");
    }
}
