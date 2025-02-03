package javaPractice.ry;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
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

public static int  readInteger(int numberOfTimes){
    System.out.println("Enter an integer: "+ numberOfTimes);
    Scanner in = new Scanner(System.in);
    int nextInt;
    try{
        nextInt = in.nextInt();
        return nextInt;
    } catch (Exception e) {
        System.out.println(e + ": You need to enter an integer.");
        System.out.println("Let's try again");
       return readInteger(numberOfTimes);
    }
}

public static int[] integerStart() {
    System.out.println("How many integer do you want to enter?");
    Scanner in = new Scanner(System.in);
        int arrSize;
    int[] arr ;
    try{
        arrSize = in.nextInt();
       arr = new int[arrSize];
        for(int i = 0 ; i < arrSize; i++) {
            arr[i] = readInteger(i+1);
        }
        return arr;
    } catch (Exception e) {
        System.out.println("You need to enter an integer");
        return integerStart();
    }
  }

  public static int findMin() {
   int[] intArr = integerStart();
      System.out.println("Here is the array you have selected: "+ Arrays.toString(intArr));
      int smallestSelectedInt = Arrays.stream(intArr).sorted().toArray()[0];
      System.out.println("Here is the selected smallest int: " + smallestSelectedInt);
  return smallestSelectedInt;
  }

  /*
Q28
Reverse Array
Write a method called reverse() with an int array as a parameter.
The method should not return any value. In other words, the method is allowed to modify the array parameter.
To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
 */

 public int[] reversedArr1(int[] arr) {
     return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
 }

public int[] reversedArr2(int[] arr) {
     for(int i = 0 ; i <= (Integer) arr.length/2; i++) {
         if(i != arr.length/2) {
             int store = arr[i];
                 arr[i] = arr[arr.length -1 - i];
                 arr[arr.length - 1 - i] = store;
         } else break;
     }
     return arr;
}
 }
