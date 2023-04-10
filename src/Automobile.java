import java.util.ArrayList;

/*
 * Name: Mike Knoles
 * Date: April 7, 2023
 * Assignment CIS319 Performance Assessment = Composition
 */
public class Automobile {
    private String Make;
    private String Model;
    private String Color;
    private String BodyStyle;
    private Engine EngineInfo;
    private ArrayList<Tire> Tires;

public Automobile(String make, String model, String color, String bodystyle, Engine engineInfo){
    Make = make;
    Model = model;
    Color = color; 
    BodyStyle = bodystyle;
    EngineInfo = engineInfo;
    Tires = new ArrayList<Tire>();
}

//getters and setters
public String getMake() {
    return Make;
}
public void setMake(String make) {
    Make = make;
}

public String getModel() {
    return Model;
}
public void setModel(String val) {
    Model = val;
}

public String getColor() {
    return Color;
}
public void setColor(String val) {
    Color = val;
}

public String getBodyStyle() {
    return BodyStyle;
}
public void setBodyStyle(String val){
    BodyStyle = val;
}

public Engine getEngineInfo() {
    return EngineInfo;
}
public void setEngineInfo(Engine val) {
    EngineInfo = val;
}

//get full list of tires
public ArrayList<Tire> getTires() {
    return Tires;
}
//Add a tire using Tire object
public void addTire(Tire val){
    Tires.add(val);
}
//Add a tire by creating one based on parameters
public void addTire(String manufacturer, String size, int max, int min, String type) {
    Tires.add(new Tire(manufacturer, size, max, min, type));
}

private String formatEngine() {
    return String.format("%s%s%n%s%s%n%s%s", 
    "Engine Cylinders: ", EngineInfo.getCylinders(),
    "Gas Type: ", EngineInfo.getGasType(),
    "Fuel Injected?: ", EngineInfo.isFuelInjected());
}

public String getInfo() {
    String rval;
    rval = String.format("%s%s%n%s%s%n%s%s%n%s%s%n%s",
        
        "Make: ", Make,
        "Model: ", Model,
        "Color: ", Color,
        "Body Style: ", BodyStyle,
        formatEngine());

    rval += "\nTire: \n";
    for (Tire tire : Tires) {
        rval += tire;
        rval += "\n";
    }

    return rval;
}

}
