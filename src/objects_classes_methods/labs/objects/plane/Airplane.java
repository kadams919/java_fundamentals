package objects_classes_methods.labs.objects.plane;


//Following the example in CarExample.java, please use Object Composition to model an
// Airplane class.
// The Airplane class must be composed of at least 4 other classes (as well as any
// primitive types you'd like)
//The Airplane class itself should have a fuel capacity (double) variable, as well as a
// currentFuelLevel variable. We'll use these a bit later.

class Airplane {

    EngineType engineType;
    Model model;
    Capacity capacity;
    AirplaneType airplaneType;

    double fuelCapacity;

    public Airplane() {

    }

    public Airplane(double fuelCapacity, EngineType engineType, Model model,
                    Capacity capacity, AirplaneType airplaneType) {
        this.fuelCapacity = fuelCapacity;
        this.airplaneType = airplaneType;
        this.capacity = capacity;
        this.engineType = engineType;
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engineType=" + engineType +
                ", model=" + model +
                ", capacity=" + capacity +
                ", airplaneType=" + airplaneType +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
