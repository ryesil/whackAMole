package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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


    //Q7
    public static int sumFirstAndLastDigit1(int num) {
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
        if (num < 0) return -1;
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

}
