package labs_examples.packages.labs.labs_example02;

import labs_examples.packages.labs.labs_example01.PackageClass01;

public class PackageClass02 {

    void defaultMethod() {
        System.out.println("This method is default and cannot be used in other packages!");
    }

    protected void protectedMethod() {
        System.out.println("This protected method cannot be used anywhere but here!");
    }
    public static void main(String[] args) {
        PackageClass02 packageClass02 = new PackageClass02();
        packageClass02.defaultMethod();
        packageClass02.protectedMethod();

        PackageClass01 packageClass01 = new PackageClass01();
        packageClass01.publicMethod();
    }
}
