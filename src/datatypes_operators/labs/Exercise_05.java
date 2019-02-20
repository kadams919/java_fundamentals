package datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        if (a || b) {
            System.out.println("a or b is true");
        }
        if (a && !b) {
            System.out.println("a is true and b is not true");
        }
        if (a || b) {
            System.out.println("either a or b is true");
        }
        if (a ^ b) {
            System.out.println("a or b is true but not both");
        }

    }

}

