package objects_classes_methods.labs.oop.A_inheritance.exercise01;

public class Dog extends Animal {

    private String coatType;

    public Dog() {
    }

    public Dog(String name, boolean walksOnFourLegs, String smallMediumOrLarge, String sound, String coatType) {
        super(name, walksOnFourLegs, smallMediumOrLarge, sound);
        this.coatType = coatType;
    }

    public Dog(String name, boolean walksOnFourLegs, String smallMediumOrLarge, String sound) {
        super(name, walksOnFourLegs, smallMediumOrLarge, sound);
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    public void speak(String sound) {
        System.out.println(this.getName() + " tail wags");
        super.speak(sound);
    }

    @Override
    public void getBedSize(String size) {
        System.out.println(this.getName() + " some may like to be crated at night.");
        super.getBedSize(size);
    }

    @Override
    public void walk(boolean walksOnFourLegs) {
        System.out.println(this.getName() + " prefers daily walks");
        super.walk(walksOnFourLegs);
    }
}
