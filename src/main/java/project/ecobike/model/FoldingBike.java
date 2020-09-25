package project.ecobike.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class FoldingBike extends AbstractBike {
    private String type = "FOLDING BIKE";

    @Override
    public String toDataFormat() {
        return getType() + " " + getBrand() + "; "
                + getWheelSize() + "; "
                + getGearsCount() + "; "
                + getWeight() + "; "
                + isLights() + "; "
                + getColor() + "; "
                + getPrice();
    }

    @Override
    public String toProductLook() {
        return getType() + " " + getBrand()
                + " with " + getGearsCount()
                + " gear(s) and" + (isLights() ? " " : " no ") + "head/tail light." + "\n"
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
