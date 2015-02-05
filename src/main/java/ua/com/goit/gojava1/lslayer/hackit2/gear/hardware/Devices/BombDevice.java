package ua.com.goit.gojava1.lslayer.hackit2.gear.hardware.Devices;

import ua.com.goit.gojava1.lslayer.hackit2.gear.hardware.AbstractHardware;
import ua.com.goit.gojava1.lslayer.hackit2.gear.hardware.Hardware;

public class BombDevice extends AbstractHardware implements Hardware {

    public BombDevice(String name) {
        super(name);
        super.addPurpose("explode", 1);
    }

}
