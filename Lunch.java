/*
* The "Lunch" program, just proves you can show print to terminal.
*
* @author  Haokai
*
* @version 1.0
*
* @since   2021-11-22
*
*/

import java.util.Scanner;

/**
* This is the standard "Lunch" program.
*/
final class Lunch {

    /**
    * Time of sub variable.
    */
    public static final double SUB = 60;

    /**
    * Time of pizza variable.
    */
    public static final double PIZZA = 45;

    /**
    * Time of soup variable.
    */
    public static final double SOUP = 105;

    /**
    * Time variable.
    */
    public static final int TIMEA = 1;

    /**
    * Time variable.
    */
    public static final int TIMEB = 2;

    /**
    * Time variable.
    */
    public static final int TIMEC = 3;

    /**
    * Time variable.
    */
    public static final double TIMED = 0;

    /**
    * Time variable.
    */
    public static final double TIMEE = 30;

    /**
    * Time variable.
    */
    public static final double TIMEF = 45;

    /**
    * Time variable.
    */
    public static final double TIMEG = 7.5;

    /**
    * Time variable.
    */
    public static final double TIMEH = 37.5;

    /**
    * SUB.
    */
    public static final String SUBSTRING = "sub";

    /**
    * PIZZA.
    */
    public static final String PIZZASSTRING = "pizza";

    /**
    * SOUP.
    */
    public static final String SOUPSTRING = "soup";

    /**
    * F variable.
    */
    public static final String OUTPUTA = "The total cook time is ";

    /**
    * F variable.
    */
    public static final String OUTPUTB = " minutes and ";

    /**
    * F variable.
    */
    public static final String OUTPUTC = " seconds.";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Lunch() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // set
        double minute = 0;
        double second = 0;
        final String foodString;
        final int time;

        try {
            // input
            final Scanner food = new Scanner(System.in);
            System.out.print("Are you heating sub, pizza, or soup?: ");
            foodString = food.nextLine();

            System.out.print("How many sub(s) are you cooking?(max:3): ");
            time = food.nextInt();

            switch (time) {
                case TIMEA:
                    if (SUBSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMED;
                    } else if (PIZZASSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMED;
                        second = TIMEF;
                    } else if (SOUPSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEF;
                    }

                    // output
                    System.out.println(OUTPUTA + minute
                        + OUTPUTB + second + OUTPUTC);
                    break;
                case TIMEB:
                    if (SUBSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEE;
                    } else if (PIZZASSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEG;
                    } else if (SOUPSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEB;
                        second = TIMEH;
                    }

                    // output
                    System.out.println(OUTPUTA + minute
                        + OUTPUTB + second + OUTPUTC);
                    break;
                case TIMEC:
                    if (SUBSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEB;
                        second = TIMED;
                    } else if (PIZZASSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEE;
                    } else if (SOUPSTRING.equals(foodString)) {
                        // calculate
                        minute = TIMEC;
                        second = TIMEE;
                    }

                    // output
                    System.out.println(OUTPUTA + minute
                        + OUTPUTB + second + OUTPUTC);
                    break;
                default:
                    System.out.println("The maximum quantity of food is 3.");
            }
        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something went wrong.");
        }

        System.out.println("\nDone.");
    }
}
