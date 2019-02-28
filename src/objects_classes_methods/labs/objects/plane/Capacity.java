package objects_classes_methods.labs.objects.plane;

public class Capacity {

    int capacity;

    public Capacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "capacity=" + capacity +
                '}';
    }
}
