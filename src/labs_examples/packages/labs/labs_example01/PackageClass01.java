package labs_examples.packages.labs.labs_example01;

import labs_examples.packages.labs.labs_example02.*;

public class PackageClass01 {

    public void publicMethod() {
        System.out.println("This method is public and can be used in any imported classes, " +
                "even in other packages!");

    }

    private void privateMethod() {
        System.out.println("This method is private and can only be used in the same class!");
    }

    public static void main(String[] args) {
        PackageClass01 packageClass01 = new PackageClass01();
        packageClass01.privateMethod();
    }
}
