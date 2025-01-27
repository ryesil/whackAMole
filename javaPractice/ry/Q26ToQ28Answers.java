package javaPractice.ry;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q26ToQ28Answers {



    public static int[] orderIntegers1(int[] arr) {
//        return Arrays.stream(arr).sorted().toArray();
        return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(a->a).toArray();
//      return new int[] {1,2,3};
//      return  Stream.of(1,2,4).mapToInt(x->x).toArray();
    }

    public static int[] orderIntegers2(int[] arr) {
        int[] storeArr = new int[arr.length];
        int smallestInt = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int pass = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pass;
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
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
The scenario is:
1. readInteger() is called.
2. The number returned by readInteger() is then used to call readElements().
3. The array returned from readElements() is used to call findMin().
4. findMin() returns the minimum number.
     */



 }
