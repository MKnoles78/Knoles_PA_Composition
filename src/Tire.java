/*
 * Name: Mike Knoles
 * Date: April 7, 2023
 * Assignment CIS319 Performance Assessment = Composition
 */
public class Tire {
    private String Manufacturer;
    private String Size;
    private int MaxPressure;
    private int MinPressure;
    private String Type;

    public Tire(String manufacturer, String size, int max, int min, String type) {
        Manufacturer = manufacturer;
        Size = size;
        MaxPressure = max;
        MinPressure = min;
        Type = type;
    }

    //getters and setters
    public String getManufacturer() {
        return Manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getSize() {
        return Size;
    }
    public void setSize(String size) {
        Size = size;
    }

    public int getMaxPressure() {
        return MaxPressure;
    }
    public void setMaxPressure(int max) {
        MaxPressure = max;
    }

    public int getMinPressure() {
        return MinPressure;
    }
    public void setMinPressure(int min) {
        MinPressure = min;
    }

    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%s%n%s%d%n%s%d%n%s%s",
        "Mfg: ", Manufacturer,
        "Size: ", Size,
        "Max Pressure: ", MaxPressure,
        "Min Pressure: ", MinPressure,
        "Type: ", Type);
    }


}
