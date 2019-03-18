package labs_examples.static_nonstatic.labs;

public class TwoClasses {
    static class ClassOne {
        public static void callStatic() {
            shout();
        }

        public static void callNonStatic() {
            ClassOne statClass = new ClassOne();

            statClass.notStatic();
        }

        public static void shout() {
            System.out.println("Hey!");
        }

        public void notStatic() {
            System.out.println("I'm not static!");
        }

        public void anotherNotStatic() {
            notStatic();
        }
    }

    static class ClassTwo {
        public static void callingAnotherClassStatic() {
            ClassOne.callStatic();
        }

        public static void callingAnotherClassNonStatic() {
            ClassOne.callNonStatic();
        }

        public void nonStatic() {
            ClassOne classOne = new ClassOne();
            classOne.notStatic();
        }

        public void callingStaticInSameClass() {
            nonStatic();
        }

        public void nonStaticCallingAnotherClassStatic() {
            ClassOne.callStatic();
        }

    }

    public static void main(String[] args) {
        // 1) A static method calling another static method in the same class
        ClassOne.callStatic();

        // 2) A static method calling a non-static method in the same class
        ClassOne.callNonStatic();

        // 3) A static method calling a static method in another class
        ClassTwo.callingAnotherClassStatic();

        // 4) A static method calling a non-static method in another class
        ClassTwo.callingAnotherClassNonStatic();

        // 5) A non-static method calling a non-static method in the same class
        ClassOne statClass = new ClassOne();
        statClass.anotherNotStatic();

        // 6) A non-static method calling a non-static method in another class
        ClassTwo classTwo = new ClassTwo();
        classTwo.nonStatic();

        // 7) A non-static method calling a static method in the same class
        classTwo.callingStaticInSameClass();

        // 8) A non-static method calling a static method in another class
        ClassTwo.callingAnotherClassStatic();
        classTwo.nonStaticCallingAnotherClassStatic();
    }
}
