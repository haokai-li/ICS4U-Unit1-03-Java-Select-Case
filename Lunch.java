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
    public static final double TIMEA = 1;

    /**
    * Time variable.
    */
    public static final double TIMEB = 2;

    /**
    * Time variable.
    */
    public static final double TIMEC = 3;

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
        final double minute = 0;
        final double second = 0;
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
                    if ("sub".equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMED;
                    } else if ("pizza".equals(foodString)) {
                        // calculate
                        minute = TIMED;
                        second = TIMEF;
                    } else if ("soup".equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEF;
                    }

                    // output
                    System.out.println("The total cook time is " + minute
                        + " minutes and " + second + " seconds.");
                    break;
                case TIMEB:
                    if ("sub".equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEE;
                    } else if ("pizza".equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEG;
                    } else if ("soup".equals(foodString)) {
                        // calculate
                        minute = TIMEB;
                        second = TIMEH;
                    }

                    // output
                    System.out.println("The total cook time is " + minute
                        + " minutes and " + second + " seconds.");
                    break;
                case TIMEC:
                    if ("sub".equals(foodString)) {
                        // calculate
                        minute = TIMEB;
                        second = TIMED;
                    } else if ("pizza".equals(foodString)) {
                        // calculate
                        minute = TIMEA;
                        second = TIMEE;
                    } else if ("soup".equals(foodString)) {
                        // calculate
                        minute = TIMEC;
                        second = TIMEE;
                    }

                    // output
                    System.out.println("The total cook time is " + minute
                        + " minutes and " + second + " seconds.");
                    break;
                default:
                    System.out.println("The maximum quantity of food is 3.");
            }
        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Done.");
    }
}
