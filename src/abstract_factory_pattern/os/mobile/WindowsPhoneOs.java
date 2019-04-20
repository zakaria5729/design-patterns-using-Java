package abstract_factory_pattern.os.mobile;

import abstract_factory_pattern.abstract_factory.IFactoryOS;

public class WindowsPhoneOs implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Less used mobile os");
    }
}
