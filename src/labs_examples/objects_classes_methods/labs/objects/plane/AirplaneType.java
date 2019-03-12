package labs_examples.objects_classes_methods.labs.objects.plane;

public class AirplaneType {

    String airplaneType;

    public AirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    @Override
    public String toString() {
        return "AirplaneType{" +
                "airplaneType='" + airplaneType + '\'' +
                '}';
    }
}
