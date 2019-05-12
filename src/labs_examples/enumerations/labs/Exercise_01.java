package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        for(Months m : Months.values()) {
            System.out.println("The number of days in month " + m.getMonthNumber() + " is "
                    + m.getDaysInMonth());        }
    }
}

enum Months {
    JANUARY(1, 31),
    FEBRUARY(2, 28),
    MARCH(3, 31),
    APRIL(4, 31),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 30),
    SEPTEMBER(9, 30),
    OCTOBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12, 31);

    private int monthNumber;
    private int daysInMonth;

    private Months(int monthNumber, int daysInMonth) {
        this.monthNumber = monthNumber;
        this.daysInMonth = daysInMonth;
    }

    public int getMonthNumber() {
        return this.monthNumber;
    }

    public int getDaysInMonth() {
        return this.daysInMonth;
    }

}