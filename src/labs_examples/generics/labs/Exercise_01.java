package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */
public class Exercise_01 {

    public static void main(String[] args) {
        Generic_01 obj1 = new Generic_01("obj1");
        obj1.print();

        Generic_01 obj2 = new Generic_01(2);
        obj2.print();

        Generic_01 obj3 = new Generic_01(true);
        obj3.print();
    }

}

class Generic_01<T> {
    private T val;

    public Generic_01() {

    }

    public Generic_01(T val) {
        setVal(val);
    }


    public T getVal(){
        return val;
    }

    public void setVal(T val){
        this.val = val;
    }

    public void print() {
        System.out.println(val);
    }
}
