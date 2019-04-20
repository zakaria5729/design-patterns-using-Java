package abstract_factory_pattern.abstract_factory;

public abstract class AbstractOsFactory {

    public abstract IFactoryOS getIFactoryOS(String osType);

    public static AbstractOsFactory createAbstractOsFactory(String factoryType) {
        switch (factoryType) {
            case "computer":
                return new ComputerOsFactory();

            case "mobile":
                return new MobileOsFactory();

                default:
                    return new UnknownOsFactory();
        }
    }
}
