package ua.com.goit.gojava1.lslayer.hackit2.gear.software;

import ua.com.goit.gojava1.lslayer.hackit2.gear.AbstractUtility;

public class AbstractSoftware extends AbstractUtility implements Software {
    public AbstractSoftware() {
        super();
        this.version = 1;
    }

    private int version;

    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public String getStringForOutput() {
        return this.getName() + " v. " + this.getVersion();
    }
}
