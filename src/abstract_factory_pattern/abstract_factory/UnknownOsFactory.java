package abstract_factory_pattern.abstract_factory;

public class UnknownOsFactory extends AbstractOsFactory {
    @Override
    public IFactoryOS getIFactoryOS(String osType) {
        return null;
    }
}
