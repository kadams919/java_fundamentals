package objects_classes_methods.labs.objects;


// For this exercise please create two classes. The first class is the controller and it
// will contain the main() method. The second class is a POJO. Just a simple object type
// class that defines an object. In this POJO, demonstrate at least three overloaded
// constructors. In the main() method, create at least 3 objects of your POJO class,
// each using a different constructor.

import javax.swing.*;

public class OverloadedConstructors {

    public static void main(String[] args) {

        Person person1 = new Person("Katie");
        Person person2 = new Person("Mira", 4);
        Person person3 = new Person("Finn", 1, "Male");

        System.out.println("The first person is " + person1.name);
        System.out.println("The second person is " + person2.name + " and is " + person2.age
            + " years old");
        System.out.println("The third person is " + person3.name + " and is " + person3.age
                + " years old and is a " + person3.gender);
    }

}

class Person {
    String name;
    int age;
    String gender;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

