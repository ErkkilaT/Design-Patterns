package remotes;

import devices.Device;

public class SmartRemote extends AdvancedRemote{
    public SmartRemote(Device device) {
        super(device);
    }
    public void toggleNetflix(){
        System.out.println("Remote: toggling netflix");
        device.toggleNetflix();
    }
}
