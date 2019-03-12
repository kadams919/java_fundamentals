package objects_classes_methods.labs.oop.A_inheritance.exercise01;

public class Husky extends Dog {

    private boolean highEnergy;

    public Husky() {
    }

    public Husky(String name, boolean walksOnFourLegs, String smallMediumOrLarge, String sound, String coatType, boolean highEnergy) {
        super(name, walksOnFourLegs, smallMediumOrLarge, sound, coatType);
        this.highEnergy = highEnergy;
    }

    public boolean isHighEnergy() {
        return highEnergy;
    }

    public void setHighEnergy(boolean highEnergy) {
        this.highEnergy = highEnergy;
    }

    @Override
    public void speak(String sound) {
        System.out.println(this.getName() + " jumps up and down");
        super.speak(sound);
    }

    @Override
    public void getBedSize(String size) {
        System.out.println(this.getName() + " may prefer to sleep outside in cooler climates.");
        super.getBedSize(size);
    }

    @Override
    public void walk(boolean walksOnFourLegs) {
        System.out.println(this.getName() + " loves long runs");
        super.walk(walksOnFourLegs);
    }
}
