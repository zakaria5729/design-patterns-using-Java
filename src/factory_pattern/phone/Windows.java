package factory_pattern.phone;

public class Windows implements IFactoryOS {

    @Override
    public void specification() {
        System.out.println("Most used OS");
    }
}