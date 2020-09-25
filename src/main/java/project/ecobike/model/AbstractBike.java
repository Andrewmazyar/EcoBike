package project.ecobike.model;

import java.math.BigDecimal;

public abstract class AbstractBike implements Comparable<AbstractBike> {
    private String type;
    private String brand;
    private int weight;
    private boolean lights;
    private String color;
    private BigDecimal price;
    private int gearsCount;
    private int wheelSize;
    private int maxSpeed;
    private int batteryCapacity;

    public abstract String toDataFormat();

    public abstract String toProductLook();

    @Override
    public int compareTo(AbstractBike o) {
        int typeCmp = getType().compareTo(o.getType());
        if (typeCmp != 0) {
            return typeCmp;
        }
        int brandCmp = getBrand().compareTo(o.getBrand());
        if (brandCmp != 0) {
            return brandCmp;
        }
        if (getType().equals("FOLDING BIKE") && getType().equals(o.getType())) {
            int gearsQuantityCmp = Integer.compare(getGearsCount(), o.getGearsCount());
            if (gearsQuantityCmp != 0) {
                return gearsQuantityCmp;
            }
            int wheelSizeCmp = Integer.compare(getWheelSize(), o.getWheelSize());
            if (wheelSizeCmp != 0) {
                return wheelSizeCmp;
            }
        }
        if ((getType().equals("E-BIKE") || getType().equals("SPEEDELEC"))
                && getType().equals(o.getType())) {
            int batteryCapacityCmp = Integer.compare(getBatteryCapacity(), o.getBatteryCapacity());
            if (batteryCapacityCmp != 0) {
                return batteryCapacityCmp;
            }
            int maxSpeedCmp = Integer.compare(getMaxSpeed(), o.getMaxSpeed());
            if (maxSpeedCmp != 0) {
                return maxSpeedCmp;
            }
        }
        int priceCmp = getPrice().compareTo(o.getPrice());
        if (priceCmp != 0) {
            return priceCmp;
        }
        int weightCmp = Integer.compare(getWeight(), o.getWeight());
        if (weightCmp != 0) {
            return weightCmp;
        }
        int lightsCmp = Boolean.compare(isLights(), o.isLights());
        if (lightsCmp != 0) {
            return lightsCmp;
        }
        return getColor().compareTo(o.getColor());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getGearsCount() {
        return gearsCount;
    }

    public void setGearsCount(int gearsCount) {
        this.gearsCount = gearsCount;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
