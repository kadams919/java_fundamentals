package labs_examples.objects_classes_methods.labs.objects.plane;

public class Model {

    String modelType;

    public Model(String modelType) {
        this.modelType = modelType;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelType='" + modelType + '\'' +
                '}';
    }
}
