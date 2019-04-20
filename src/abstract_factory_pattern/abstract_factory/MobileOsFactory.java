package abstract_factory_pattern.abstract_factory;

import abstract_factory_pattern.os.mobile.AndroidOS;
import abstract_factory_pattern.os.mobile.IOS;
import abstract_factory_pattern.os.mobile.UnknownMobileOs;
import abstract_factory_pattern.os.mobile.WindowsPhoneOs;

public class MobileOsFactory extends AbstractOsFactory {

    @Override
    public IFactoryOS getIFactoryOS(String osType) {
        switch (osType) {
            case "android":
                return new AndroidOS();

            case "iOS":
                return new IOS();

            case "windows phone":
                return new WindowsPhoneOs();

            default:
                return new UnknownMobileOs();
        }
    }
}
