package javaPractice;

import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

        //System.out.println(barkingDog1(true, 1));

        //boolean result = shouldWakeUp(true, 23.40 );
        //System.out.println(result);

        //System.out.println(area(5.2));
        //System.out.println(area(2.4,4.7));

        printEqual(1,3,2);


    }

    // Question 1
//        Barking Dog
//        We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
//
//                Write a method shouldWakeUp that has 2 parameters.
//
//        1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
//        2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
//
//        We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//
//                In all other cases return false.
//
//                If the hourOfDay parameter is less than 0 or greater than 23 return false.
//
//                Examples of input/output:
//
//        shouldWakeUp (true, 1); → should return true
//
//        shouldWakeUp (false, 2); → should return false since the dog is not barking.
//
//        shouldWakeUp (true, 8); → should return false, since it's not before 8.
//
//        shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.

    public static boolean barkingDog1(boolean barking, int hrOfDay) {

        if ((hrOfDay <= 23 && hrOfDay >= 0) && ((hrOfDay < 8 && barking) || (hrOfDay > 22 && barking))) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean shouldWakeUp(boolean isBark, double hourOfDay) {

        if (hourOfDay < 0.0 && hourOfDay > 23.00) {
            return false;
        }
        if (isBark == true && (hourOfDay < 8.00 && hourOfDay > 22.00)) {
            return true;
        } else {
            return false;
        }

    }

    /* Q2 - Area Calculator
    Write a method named area with one double parameter named radius.
    The method needs to return a double value that represents the area of a circle.
    If the parameter radius is negative then return -1.0 to represent an invalid value.
    Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    The method needs to return an area of a rectangle.
    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
    For formulas and PI value please check the tips below.
    Examples of input/output:
    area(5.0); should return 78.53981633974483 or 78.53981
    area(-1);  should return -1 since the parameter is negative
    area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
    area(-1.0, 4.0);  should return -1 since first the parameter is negative

    */
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            double constant = 3.14;
            return constant * Math.pow(radius, 2);
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }else{
            return x*y;
        }
    }

//RY
  public double area2(double radius){
        return radius < 0 ? -1 : Math.pow(radius, 2);
  }

  public double area2(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        } else {
            return x*y;
        }
  }
//    Question 3
//    Equality Printer
//    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//    If one of the parameters is less than 0, print text "Invalid Value".
//    If all numbers are equal print text "All numbers are equal"
//    If all numbers are different print text "All numbers are different".
//    Otherwise, print "Neither all are equal or different".
//
//    EXAMPLES OF INPUT/OUTPUT:
//    printEqual(1, 1, 1); should print text All numbers are equal
//    printEqual(1, 1, 2); should print text Neither all are equal nor different
//    printEqual(-1, -1, -1); should print text Invalid Value
//    printEqual(1, 2, 3); should print text All numbers are different


    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
            return;
        }else if (a==b && a==c && b==c) {
            System.out.println("All numbers are equal");

        }else if (a!=b && a!=c && b!=c){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }


public static void printEqual2(int a, int b, int c){
       String printMessage = Stream.of(a,b,c).anyMatch(number -> number <0) ? "Invalid Value" : a == b && a == c ? "All numbers are equal" : a != b && a != c && b != c ? "All numbers are different" : "Neither all are equal or different";
    System.out.println(printMessage);
}

    /* Question-4
    Write a method that takes two integers as input and performs the following operations based on their values:
    1- If both numbers are positive, print the sum of the two numbers.
    2- If both numbers are negative, print the multiplication of the two numbers.
    3- If the numbers have different signs (one is positive and the other is negative),
       print: "Cannot perform operations with numbers of different signs."
    4- If either number is zero, print: "Zero is the absorbing element for multiplication."
     */


//Question 5
//Number Palindrome
//    Write a method called isPalindrome with one int parameter called number.
//    The method needs to return a boolean.
//    It should return true if the number is a palindrome number otherwise it should return false.
//    Check the tips below for more info about palindromes.
//    Example Input/Output
//    isPalindrome(-1221); → should return true
//    isPalindrome(707); → should return true
//    isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//    Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
}
