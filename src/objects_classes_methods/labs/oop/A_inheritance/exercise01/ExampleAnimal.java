package objects_classes_methods.labs.oop.A_inheritance.exercise01;

public class ExampleAnimal {


    public static void main(String[] args) {
        Animal animal = new Animal("Fish", false, "Small",
                "Blub blub");

        Dog dog = new Dog("Dog", true, "small, medium or large",
                "Woof!", "Fur");

        Husky husky = new Husky("Husky", true,
                "Large", "Aroo!", "Double Coated", true);


        animal.speak(animal.getName() + " " + animal.getSound());

        dog.getBedSize(dog.getSmallMediumOrLarge());

        husky.walk(husky.isWalksOnFourLegs());

    }
}
