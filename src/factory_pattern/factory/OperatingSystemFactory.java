package factory_pattern.factory;

import factory_pattern.phone.*;

public class OperatingSystemFactory {

    public IFactoryOS getOsInstance(String osType) {
        switch (osType) {
            case "powerful":
                return new Android();
            case "secure":
                return new IOS();
            case "most used":
                return new Windows();
            default:
                return new UnknownOS();
        }
    }
}
