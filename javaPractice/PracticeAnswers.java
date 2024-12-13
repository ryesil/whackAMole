package javaPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        } else {
            return x * y;
        }
    }

    public double area2(double radius) {
        return radius < 0 ? -1 : Math.pow(radius, 2);
    }

    public double area2(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

    //Q3
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (a == b && a == c && b == c) {
            System.out.println("All numbers are equal");

        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }


    public static void printEqual2(int a, int b, int c) {
        String printMessage = Stream.of(a, b, c).anyMatch(number -> number < 0) ? "Invalid Value" : a == b && a == c ? "All numbers are equal" : a != b && a != c && b != c ? "All numbers are different" : "Neither all are equal or different";
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
            result = "Zero is the absorbing element for multiplication.";
        }
        return result;
    }

    public static void calculate(int a, int b) {
        String result = (a > 0 && b > 0)
                ? "Sum: " + (a + b)
                : (a < 0 && b < 0)
                ? "Multiplication: " + (a * b)
                : (a < 0 || b < 0)
                ? "Cannot perform operations with numbers of different signs."
                : "Zero is the absorbing element for multiplication.";

        System.out.println(result);
    }

    //Q5
    public static boolean isPalindrome1(int number) {
        String numberStr = String.valueOf(number);
        return new StringBuilder(numberStr).equals(new StringBuilder(numberStr).reverse());
    }

    public static boolean isPalindrome2(int number) {
        List<Integer> numberArr = Arrays.stream(String.valueOf(number).split("")).map((digit) -> Integer.parseInt(digit)).collect(Collectors.toList());
        List<Integer> reversedNumberArr = new ArrayList<>();
        for (int i = numberArr.size() - 1; i >= 0; i--) {
            reversedNumberArr.add(numberArr.get(i));
        }
        System.out.println(numberArr);
        System.out.println(reversedNumberArr);
        return numberArr.equals(reversedNumberArr);
    }

    public static boolean checkPallindrome(int num) {
        if (num < 0) return false;

        String[] arr = String.valueOf(num).split("");
        StringBuilder reversed = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed.append(arr[i]);
        }
        System.out.println(reversed);
        System.out.println(reversed.toString().equals(String.valueOf(num)));
        return reversed.toString().equals(String.valueOf(num));
    }

    //Q6
    public static void createTriange(int num) {
        int numerator = 1;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(numerator + " ");
                numerator++;
            }
            System.out.println();
        }
    }

    //Q6
    public static void triangleMaker(int rowNum) {
        int increment = 0;
        for (int i = 1; i <= rowNum; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int finalIncrement = increment;
            IntStream.range(1, i + 1).forEach(num -> stringBuilder.append((num + finalIncrement)).append(" "));
            System.out.println(stringBuilder);
            String[] arr = stringBuilder.toString().split(" ");
            increment = Integer.parseInt(arr[arr.length - 1]);
        }
    }

    //Q7
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }
        int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit + lastDigit;
    }

    public static void sumFirstAndLastDigit2(int num) {
        if (num < 0) {
            System.out.println(-1);
            return;
        } else {
            String arr[] = String.valueOf(num).trim().split("");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[arr.length - 1]);
            int sum = a + b;
            System.out.println(sum);
        }
    }

    public static int sumFirstAndLastDigit1( int num){
        int sum = 0;
        if (num < 0) {
            return -1;
        } else if (num < 10) {
            return num;
        } else {

            String[] numString = String.valueOf(num).split("");
            for (int i = 0; i < numString.length; i += numString.length - 1) {
                sum += Integer.parseInt(numString[i]);
            }
        }
        return sum;
    }

    //Q8
    public static int findEvenDigitSum(int num) {
        if (num < 0){
            return -1;
        }
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            num/=10;
        }
        return sum;
    }

    //Q8
    public static int getEvenSum1(int number){
        return Arrays.stream(String.valueOf(number).split("")).map(numStr -> Integer.parseInt(numStr)).filter(x-> x%2 == 0).reduce(0, (a,b)->a+b);
    }

    public static int getEvenSum2(int number){
        return Arrays.stream(String.valueOf(number).split("")).mapToInt(numStr -> Integer.parseInt(numStr)).filter(x->x%2 == 0).sum();
    }


    //Q9
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 > 99 || num2 > 99 || num1 < 10 || num2 < 10){
            return false;
        } else {
           String num2Str = String.valueOf(num2);
           {
             int remainder = num1 % 10;
            if(num2Str.contains(""+remainder)){
                return true;
            }
           }while(num1 > 10);
        }
        return false;
    }


    //Q10
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(Stream.of(num1, num2, num3).anyMatch(num -> num < 10 || num > 1000)){
            return false;
        } else {
         return Stream.of(num1, num2, num3).map(num -> num%10).collect(Collectors.toSet()).size() != 3;
        }
    }

    //Q11
    public static void printFactors(int num){
        StringBuilder sb = new StringBuilder();
        if(num < 1){
            sb.append("Invalid Value");
        } else {
            int i = 1;
           do {
                if(num % i == 0){
                    sb.append(i+", ");
                }
                i++;
            } while (i <= (num/2));
           sb.append(num);
        }
        System.out.println(sb);
    }

    //Q12
public static void printSquareStar1(int num){
        if (num < 5){
            System.out.println("Invalid Value");
        } else {
            int row = num, column = num;
            String result = "";
            for (int i = 1; i <= row; i++) {
                result = "";
                for (int j = 1; j <= column; j++) {
                    if (i == 1 || j == 1 || i == row || j == row || i == j || j == num - i + 1) {
                        result += "*";
                    } else {
                        result += " ";
                    }

                }
                System.out.println(result);
            }
        }
}

//Q13
public static boolean canPack(int bigCount, int smallCount, int goal) {
    int bigSum = bigCount * 5;
    int smallSum = smallCount;
    int finalSum = bigSum + smallSum;
    if (Stream.of(bigCount, smallCount, goal).anyMatch(val -> val < 0) || finalSum < goal) {
        return false;
    } else if (bigSum == goal || smallSum >= goal) {
        return true;
    } else {
        for (int i = bigCount; i > 0; i--) {
            if (i * 5 < goal && ((goal - i * 5) <= smallSum)) {
                return true;
            }
        }
        return false;
    }
}
    //Q14
    public static String numberToWords(int number) {
        String finalStr = "";
        String[] strArr = String.valueOf(number).split("");
        for (String digit : strArr) {
            switch (digit) {
                case "0":
                    finalStr += "Zero ";
                    break;
                case "1":
                    finalStr += "One ";
                    break;
                case "2":
                    finalStr += "Two ";
                    break;
                case "3":
                    finalStr += "Three ";
                    break;
                case "4":
                    finalStr += "Four ";
                    break;
                case "5":
                    finalStr += "Five ";
                    break;
                case "6":
                    finalStr += "Six ";
                    break;
                case "7":
                    finalStr += "Seven ";
                    break;
                case "8":
                    finalStr += "Eight ";
                case "9":
                    finalStr += "Nine ";
            }
        }
        return finalStr.trim();
    }

    //Q15
    public static Boolean hasSharedDigit1(int num1, int num2) {
        Set<String> set = new HashSet<>();
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        } else {
            String[] str = (Integer.toString(num1) + Integer.toString(num2)).split("");
            for (String el : str) {
                set.add(el);
            }
        }
        return set.size() < 4;
    }

}
