package abstract_factory_pattern.abstract_factory;

import abstract_factory_pattern.os.computer.LinuxBasedOS;
import abstract_factory_pattern.os.computer.MacOS;
import abstract_factory_pattern.os.computer.UnknownPcOS;
import abstract_factory_pattern.os.computer.WindowsPcOS;

public class ComputerOsFactory extends AbstractOsFactory{

    @Override
    public IFactoryOS getIFactoryOS(String osType) {
        switch (osType) {
            case "linux":
                return new LinuxBasedOS();

            case "mac":
                return new MacOS();

            case "windows":
                return new WindowsPcOS();

            default:
                return new UnknownPcOS();
        }
    }
}
