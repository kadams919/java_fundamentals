package objects_classes_methods.labs.oop.A_inheritance.exercise01;

public class Animal {
    private String name;
    private boolean walksOnTwoOrFourLegs;
    private String smallMediumOrLarge;
    private String sound;

    public Animal() {
    }

    public Animal(String name, boolean walksOnFourLegs, String smallMediumOrLarge, String sound) {
        this.name = name;
        this.walksOnTwoOrFourLegs = walksOnFourLegs;
        this.smallMediumOrLarge = smallMediumOrLarge;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWalksOnFourLegs() {
        return walksOnTwoOrFourLegs;
    }

    public void setWalksOnFourLegs(boolean walksOnFourLegs) {
        this.walksOnTwoOrFourLegs = walksOnFourLegs;
    }

    public String getSmallMediumOrLarge() {
        return smallMediumOrLarge;
    }

    public void setSmallMediumOrLarge(String smallMediumOrLarge) {
        this.smallMediumOrLarge = smallMediumOrLarge;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void speak(String sound) {
        System.out.println(this.getName() + " " + sound);
    }

    public void getBedSize(String size) {
        System.out.println(this.getName() + " needs a " + this.smallMediumOrLarge + " bed");
    }

    public void walk(boolean walksOnFourLegs) {
        if(walksOnFourLegs) {
            System.out.println(this.getName() + " trotting");
        } else {
            System.out.println(this.getName() + " swimming");
        }
    }

}
