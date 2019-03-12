package labs_examples.objects_classes_methods.labs.objects.plane;

public class EngineType {

    String engineType;

    public EngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "engineType='" + engineType + '\'' +
                '}';
    }

}
