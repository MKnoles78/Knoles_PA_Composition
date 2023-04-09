/*
 * Name: Mike Knoles
 * Date: April 7, 2023
 * Assignment CIS319 Performance Assessment = Composition
 */
public class Engine {
    private int Cylinders;
    private String GasType;
    private boolean FuelInjected;

    public Engine(int cylinders, String gasType, boolean fuelInjected) {
        Cylinders = cylinders;
        GasType = gasType;
        FuelInjected = fuelInjected;
    }

    //getters and setters
    public int getCylinders() {
        return Cylinders;
    }
    public void setCylinders(int cylinders) {
        Cylinders = cylinders;
    }
    
    public String getGasType() {
        return GasType;
    }
    public void setGasType(String gasType) {
        GasType = gasType;
    }

    public boolean isFuelInjected() {
        return FuelInjected;
    }
    public void setFuelInjected(boolean fuelInjected) {
        FuelInjected = fuelInjected;
    }

}
