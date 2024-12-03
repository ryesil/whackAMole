package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeAnswers {

    //Q1
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

    //Q2
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

    //Q3
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

    //Q4
    public static String calculator(int a, int b) {
        String result = "";
        if (a > 0 && b > 0) {
            result = String.valueOf(a + b);
        } else if (a < 0 && b < 0) {
            result = String.valueOf(a * b);
        } else if (a * b < 0) {
            result = "Cannot perform operations with numbers of different signs.";
        } else if (a * b == 0) {
            result = "Zero is the absorbing element for multiplication."
        }
        return result;
    }











}