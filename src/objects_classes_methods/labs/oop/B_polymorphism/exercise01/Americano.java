package objects_classes_methods.labs.oop.B_polymorphism.exercise01;

public class Americano extends Coffee implements CoffeeInterface {

    public Americano() {
    }

    @Override
    public void makeDrink() {
        System.out.println("Here is your americano! Black coffee with hot water");
    }
}
