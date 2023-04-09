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

public addTire(String manufacturer, String size, int max, int min, String type) {
    Tires.add(new Tire(manufacturer, size, max, min, type));
}

}
