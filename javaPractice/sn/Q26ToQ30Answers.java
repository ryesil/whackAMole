package javaPractice.sn;

import java.util.*;

public class Q26ToQ30Answers {
     /*
    Q26
    Sorted Array
    Create a program using arrays that sorts a list of integers in descending order.
    Descending order is highest value to lowest.
    In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
    Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
    Implement the following methods:
    getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
    printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
    Element 0 contents 106
    Element 1 contents 81
    Element 2 contents 26
    Element 3 contents 15
    Element 4 contents 5
    sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
    The scenario is:
    1. getIntegers() is called.
    2. The returned array from getIntegers() is then used to call sortIntegers().
    3. The returned array from sortIntegers() is then printed to the console.
     */


    //get integers
    public static int[] getIntegersSn(int size) {
        int[] array = new int[size];
        //kullanıcıdan dataları al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integers : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //print
    public static void printArraySn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    //sort - 1. yol
    public static int[] sortIntegersSn(int[] array) {
        return Arrays.stream(array)
                .boxed()  // Convert int[] to Integer[]
                .sorted(Collections.reverseOrder()) // Sort in descending order
                .mapToInt(Integer::intValue) // Convert back to int[]
                .toArray();
    }

    //sort - 2.yol
    public static int[] sortedIntegersWithoutStreamSn(int[] arr) {
        Integer[] box = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            box[i] = arr[i];
        }
        Arrays.sort(box, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = box[i];

        }
        return arr;
    }

    //sort - 3.yol
    public static int[] sortIntegersWithoutLambdaSn(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }





   /*
    Q27
    Minimum Element
    Write a method called readInteger() that has no parameters and returns an int.
    It needs to read in an integer from the user - this represents how many elements the user needs to enter.
    Write another method called readElements() that has one parameter of type int
    The method needs to read from the console until all the elements are entered,
    and then return an array containing the elements entered.
    And finally, write a method called findMin() with one parameter of type int[].
    The method needs to return the minimum value in the array.
    The scenario is:
    1. readInteger() is called.
    2. The number returned by readInteger() is then used to call readElements().
    3. The array returned from readElements() is used to call findMin().
    4. findMin() returns the minimum number.
     */

    public static int readIntegerSn() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Please enter the number of elements: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }
        return number;
    }

    public static int[] readElementsSn(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[num];

        System.out.println("Please enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    scanner.next();
                }
            }
        }
        return arr;
    }

    public static int findMinSn(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { // i=1'den başlamalı
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
