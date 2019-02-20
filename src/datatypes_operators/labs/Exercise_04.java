package datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }
        if (!(a > b)) {
            System.out.println("a is not greater than b");
        }
        if (a <= b) {
            System.out.println("a is less than or equal to b");
        }
        if (!(a >= b)) {
            System.out.println("a is not greater than or equal to b");
        }
        if ((a != b)) {
            System.out.println("a does not equal b");
        }

    }

}

