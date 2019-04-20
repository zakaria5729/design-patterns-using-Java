package factory_pattern.phone;

public class UnknownOS implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Unknown OS");
    }
}
