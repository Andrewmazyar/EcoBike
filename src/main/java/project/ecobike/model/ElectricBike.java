package project.ecobike.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class ElectricBike extends AbstractBike {
    private String type = "E-BIKE";

    @Override
    public String toDataFormat() {
        return getType() + " " + getBrand() + "; "
                + getMaxSpeed() + "; "
                + getWeight() + "; "
                + isLights() + "; "
                + getBatteryCapacity() + "; "
                + getColor() + "; "
                + getPrice();
    }

    @Override
    public String toProductLook() {
        return getType() + " " + getBrand()
                + " with " + getBatteryCapacity()
                + " mAh battery and" + (isLights() ? " " : " no ") + "head/tail light." + "\n"
                + "Price: " + getPrice() + " euros.";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
