package labs_examples.objects_classes_methods.labs.objects.plane;

public class ExampleAirplane {

    public static void main(String[] args) {

        EngineType engineType = new EngineType("Aero 3000");

        Model model = new Model("747");

        Capacity capacity = new Capacity(300);

        AirplaneType airplaneType = new AirplaneType("Rocket");

        Airplane airplane = new Airplane(300, engineType, model, capacity, airplaneType);

        System.out.println(airplane.toString());

    }

}
