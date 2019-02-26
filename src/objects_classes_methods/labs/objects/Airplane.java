package objects_classes_methods.labs.objects;


//Following the example in CarExample.java, please use Object Composition to model an
// Airplane class.
// The Airplane class must be composed of at least 4 other classes (as well as any
// primitive types you'd like)

class Airplane {

    EngineType engineType;
    Model model;
    Capacity capacity;
    AirplaneType airplaneType;

    public Airplane(EngineType engineType, Model model, Capacity capacity, AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
        this.capacity = capacity;
        this.engineType = engineType;
        this.model = model;
    }

    public static void main(String[] args) {

        EngineType engineType = new EngineType("Aero 5000");

        Model model = new Model("747");

        Capacity capacity = new Capacity(300);

        AirplaneType airplaneType = new AirplaneType("Rocket");

        System.out.println("The airplane " + airplaneType.airplaneType + " " + model.modelType
                + " has a " + engineType.engineType + " engine and carries " + capacity.capacity
                + " passengers.");
    }

}

class EngineType {
    String engineType;

    public EngineType(String engineType) {
        this.engineType = engineType;
    }
}

class Model {
    String modelType;

    public Model(String modelType) {
        this.modelType = modelType;
    }

}

class Capacity {
    int capacity;

    public Capacity(int capacity) {
        this.capacity = capacity;
    }

}

class AirplaneType {
    String airplaneType;

    public AirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

}
