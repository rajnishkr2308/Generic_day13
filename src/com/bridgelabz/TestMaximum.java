package com.bridgelabz;

public class TestMaximum {

    /*
        Ensure the Generic Type extends Comparable
     */
    public static <T extends Comparable<T>> T maxOfThreeVariables(T x, T y, T z) {
/*
    CompareTo method to test the maximum of three variables
 */
        T maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        return maximum;
    }

    /*
        Three Integers to find the maximum
     */
    public static void maxOfThreeInteger(Integer x, Integer y, Integer z) {
/*
    CompareTo method to test the maximum number
 */
        Integer maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum + " is the maximum of Three Integers");
    }

    public static void maxOfThreeFloats(Float x, Float y, Float z) {
/*
    find the maximum of three Floats
    CompareTo method to test the maximum number
 */
        Float maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum + " is the maximum of Three Floats");
    }

    private static void maxOfThreeStrings(String x, String y, String z) {
 /*
    find the maximum of three Strings
    CompareTo method to test the maximum
 */
        String maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum + " is the maximum of Three Strings");
    }

    public static void main(String[] args) {

        System.out.println("Maximum Of 3 Variables");
        //TC1.1: Given MaximumNumber at first position
        maxOfThreeInteger(60, 30, 50);
        //TC1.2: Given MaximumNumber at second position
        maxOfThreeInteger(60, 80, 50);
        //TC1.3: Given MaximumNumber at third position
        maxOfThreeInteger(60, 30, 70);

          /*
            Find the maximum of three Floats
         */
        System.out.println("Maximum of Three Floats :-");
        //TC1.1: Given MaximumNumber at first position
        maxOfThreeFloats(5.87f, 1.55f, 3.28f);
        //TC1.2: Given MaximumNumber at second position
        maxOfThreeFloats(3.82f, 5.69f, 1.2f);
        //TC1.3: Given MaximumNumber at third position
        maxOfThreeFloats(2.53f, 3.25f, 7.6f);

        /*
            Find the maximum of three Strings
         */
        System.out.println("Maximum of Three Strings :-");
        //TC1.1: Given Maximum at first position
        maxOfThreeStrings("Peach", "Banana", "Apple");
        //TC1.2: Given Maximum at second position
        maxOfThreeStrings("Apple", "Peach", "Banana");
        //TC1.3: Given Maximum at third position
        maxOfThreeStrings("Banana", "Apple", "Peach");

            System.out.println(" *** Maximum Of 3 Variables *** ");
            //Printing the Call methods
            System.out.println("Maximum value of Three Integers is " + maxOfThreeVariables(30, 50, 70));
            ;
            System.out.println("Maximum value of Three Floats is " + maxOfThreeVariables(2.5f, 7.69f, 3.24f));
            System.out.println("Maximum value of Three Strings is " + maxOfThreeVariables("Apple", "Peach", "Banana"));
        }
    }
