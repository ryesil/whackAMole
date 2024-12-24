package javaPractice;

public class PracticeQuestions {
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
//    Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number.
//    For example: 121, 12321, 1001 etc.

    /*Question 6
    Write a method in Java that generates the following pattern based on the number of rows provided as a parameter.
    The numbers should start from 1 and increment sequentially.
    For example, for 4 rows:
    1
    2 3
    4 5 6
    7 8 9 10
    */

    //Question 7
//    First And Last Digit Sum
//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//    The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
//    If the number is negative then the method needs to return -1 to indicate an invalid value.
//    Example input/output
//    sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//    sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//    sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
//    sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
//    sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.

    //Question 8
//    Even Digit Sum
//    Write a method named getEvenDigitSum with one parameter of type int called number.
//    The method should return the sum of the even digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.
//    EXAMPLE INPUT/OUTPUT:
//    getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//    getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//    getEvenDigitSum(-22); → should return -1 since the number is negative


    //Question 9
//    Shared Digit
//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//    EXAMPLE INPUT/OUTPUT:
//    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

   //Question 10
//   Last Digit Checker
//    Write a method named hasSameLastDigit with three parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
//    EXAMPLE INPUT/OUTPUT:
//    hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//    hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//    hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

//    Write another method named isValid with one parameter of type int.
//    The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
//    EXAMPLE INPUT/OUTPUT
//    isValid(10); → should return true since 10 is within the range of 10-1000
//    isValid(468); → should return true since 468 is within the range of 10-1000
//    isValid(1051); → should return false since 1051 is not within the range of 10-1000

  //Q11
//  All Factors
//    Write a method named printFactors with one parameter of type int named number.
//    If number is < 1, the method should print "Invalid Value".
//    The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
//    For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

//    EXAMPLE INPUT/OUTPUT:
//    printFactors(6); → should print 1 2 3 6
//    printFactors(32); → should print 1 2 4 8 16 32
//    printFactors(10); → should print 1 2 5 10
//    printFactors(-1); → should print "Invalid Value" since number is < 1

   //Q12
//   Diagonal Star
//    Write a method named printSquareStar with one parameter of type int named number.
//    If number is < 5, the method should print "Invalid Value".
//    The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

//    EXAMPLE INPUT/OUTPUT:
//    EXAMPLE 1
//    printSquareStar(5); should print the following:
//            → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
//        *****
//        ** **
//        * * *
//        ** **
//        *****

//    Explanation:
//
//*****   5 stars
//** **   2 stars space 2 stars
//* * *   1 star space 1 star space 1 star
//** **   2 stars space 2 stars
//*****   5 stars
//
//
//    EXAMPLE 2
//    printSquareStar(8); should print the following:
//            ********
//            **    **
//            * *  * *
//            *  **  *
//            *  **  *
//            * *  * *
//            **    **
//            ********
//    The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
//    In the first or last row
//    In the first or last column
//    When the row number equals the column number
//    When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

    //Q13
//    Flour Pack Problem
//    Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
//    The parameter bigCount represents the count of big flour bags (5 kilos each).
//    The parameter smallCount represents the count of small flour bags (1 kilo each).
//    The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
//    Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.
//    If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided.
//    However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
//    If any of the parameters are negative, return false.

//    EXAMPLE INPUT/OUTPUT:
//    canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//            canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//            canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
//    canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
//            canPack (-3, 2, 12); should return false since bigCount is negative.

    //Q14
//    Number To Words
//    Write a method called numberToWords with one int parameter named number.
//    The method should print out the passed number using words for the digits.
//    If the number is negative, print "Invalid Value".
//    EXAMPLE INPUT/OUTPUT:
//    numberToWords(123); should print "One Two Three".
//    numberToWords(1010); should print "One Zero One Zero".
//    numberToWords(1000); should print "One Zero Zero Zero".
//    numberToWords(-12); should print "Invalid Value" since the parameter is negative.

    //Q15
//    Shared Digit
//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//    EXAMPLE INPUT/OUTPUT:
//    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

//INHERITANCE
    //16
//    Sum Calculator
//    Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
//    Write the following methods (instance methods):
//    Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
//    Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
//    Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
//    Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
//    Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
//    Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
//    Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
//    Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
//    TEST EXAMPLE
//    TEST CODE:
//SimpleCalculator calculator = new SimpleCalculator();
//calculator.setFirstNumber(5.0);
//calculator.setSecondNumber(4);
//System.out.println("add= " + calculator.getAdditionResult());
//System.out.println("subtract= " + calculator.getSubtractionResult());
//calculator.setFirstNumber(5.25);
//calculator.setSecondNumber(0);
//System.out.println("multiply= " + calculator.getMultiplicationResult());
//System.out.println("divide= " + calculator.getDivisionResult());
//    OUTPUT
//
//    add= 9.0
//    subtract= 1.0
//    multiply= 0.0
//    divide= 0.0

    //Q17
//    Person
//    Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
//    Write the following methods (instance methods):
//    Method named getFirstName without any parameters, it needs to return the value of the firstName field.
//    Method named getLastName without any parameters, it needs to return the value of the lastName field.
//    Method named getAge without any parameters, it needs to return the value of the age field.
//    Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
//    Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
//    Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
//    Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
//    Method named getFullName without any parameters, it needs to return the full name of the person.
//    In case both firstName and lastName fields are empty, Strings return an empty String.
//            In case lastName is an empty String, return firstName.
//            In case firstName is an empty String, return lastName.
//    To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.
//            TEST EXAMPLE
//    TEST CODE:
//    Person person = new Person();
//person.setFirstName("");   // firstName is set to empty string
//person.setLastName("");    // lastName is set to empty string
//person.setAge(10);
//System.out.println("fullName= " + person.getFullName());
//System.out.println("teen= " + person.isTeen());
//person.setFirstName("John");    // firstName is set to John
//person.setAge(18);
//System.out.println("fullName= " + person.getFullName());
//System.out.println("teen= " + person.isTeen());
//person.setLastName("Smith");    // lastName is set to Smith
//System.out.println("fullName= " + person.getFullName());
//    OUTPUT
//            fullName=
//            teen= false
//    fullName= John
//            teen= true
//    fullName= John Smith

    //Q18
//    Cylinder
//1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
//    The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
//    In case the radius parameter is less than 0 it needs to set the radius field value to 0.
//    Write the following methods (instance methods):
//    Method named getRadius without any parameters, it needs to return the value of radius field.
//    Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.
//
//    2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
//    The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
//    In case the height parameter is less than 0 it needs to set the height field value to 0.
//    Write the following methods (instance methods):
//    Method named getHeight without any parameters, it needs to return the value of height field.
//    Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.

//Q19
//Pool Area
//    The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.
//            1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
//    The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
//    In case the width parameter is less than 0 it needs to set the width field value to 0.
//    In case the length parameter is less than 0 it needs to set the length field value to 0.
//    Write the following methods (instance methods):
//    Method named getWidth without any parameters, it needs to return the value of width field.
//    Method named getLength without any parameters, it needs to return the value of length field.
//    Method named getArea without any parameters, it needs to return the calculated area (width * length).
//    2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
//    The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
//            In case the height parameter is less than 0 it needs to set the height field value to 0.
//    Write the following methods (instance methods):
//    Method named getHeight without any parameters, it needs to return the value of height field.
//    Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
//    TEST EXAMPLE
//→ TEST CODE:
// Rectangle rectangle = new Rectangle(5, 10);
//System.out.println("rectangle.width= " + rectangle.getWidth());
//System.out.println("rectangle.length= " + rectangle.getLength());
//System.out.println("rectangle.area= " + rectangle.getArea());
// Cuboid cuboid = new Cuboid(5,10,5);
//System.out.println("cuboid.width= " + cuboid.getWidth());
//System.out.println("cuboid.length= " + cuboid.getLength());
//System.out.println("cuboid.area= " + cuboid.getArea());
//System.out.println("cuboid.height= " + cuboid.getHeight());
//System.out.println("cuboid.volume= " + cuboid.getVolume());
//→ OUTPUT
//
//    rectangle.width= 5.0
//    rectangle.length= 10.0
//    rectangle.area= 50.0
//    cuboid.width= 5.0
//    cuboid.length= 10.0
//    cuboid.area= 50.0
//    cuboid.height= 5.0
//    cuboid.volume= 250.0

    /*NEW QUESTIONS ADDED*/

    //Q20: Employee Management System

    //Create a class Employee with fields name (String) and baseSalary (double).
    //Add a constructor that initializes name and baseSalary.
    //Add a method getSalary that returns baseSalary.
    //Add a method getName that returns the name of the employee.
    //Create a subclass Manager that extends Employee.
    //Add a field bonus of type double.
    //Write a constructor that initializes name, baseSalary, and bonus.
    //Override the getSalary method to return the total salary (baseSalary + bonus).
    //Create a subclass Developer that extends Employee.
    //Add a field projectCount of type int.
    //Write a constructor that initializes name, baseSalary, and projectCount.
    //Override the getSalary method to return baseSalary + (1000 * projectCount).

    /*Test Codes
    Employee emp = new Employee("John", 3000);
    System.out.println(emp.getName() + " Salary: " + emp.getSalary());

    Manager mgr = new Manager("Sarah", 4000, 2000);
    System.out.println(mgr.getName() + " Salary: " + mgr.getSalary());

    Developer dev = new Developer("Alex", 3000, 3);
    System.out.println(dev.getName() + " Salary: " + dev.getSalary());

     */

    //Q21- Bank Account Hierarchy

    //Create a class BankAccount with fields accountNumber (String) and balance (double).
    //Add a constructor to initialize accountNumber and balance.
    //Add methods deposit(double amount) and withdraw(double amount) to update the balance.
    //Add a method getBalance to return the balance.
    //Create a subclass SavingsAccount that extends BankAccount.
    //Add a field interestRate (double).
    //Write a constructor to initialize accountNumber, balance, and interestRate.
    //Add a method calculateInterest to return the calculated interest (balance * interestRate).
    //Create a subclass CurrentAccount that extends BankAccount.
    //Add a field overdraftLimit (double).
    //Write a constructor to initialize accountNumber, balance, and overdraftLimit.
    //Override the withdraw method to allow withdrawals within the overdraft limit.

    /* Test Codes
    SavingsAccount savings = new SavingsAccount("12345", 1000, 0.05);
    System.out.println("Savings Account Balance: " + savings.getBalance());
    System.out.println("Interest: " + savings.calculateInterest());

    CurrentAccount current = new CurrentAccount("67890", 500, 200);
    current.withdraw(600);
    System.out.println("Current Account Balance: " + current.getBalance());
    current.withdraw(200);  // Should not allow withdrawal
    System.out.println("Current Account Balance after overdraft attempt: " + current.getBalance());

     */

    //Q22: Zoo Management System

    //Create an abstract class Animal with the following:
    //Fields: name (String), age (int).
    //Constructor to initialize name and age.
    //Abstract method makeSound() to be implemented by subclasses.
    //Concrete method getInfo() that returns "Name: [name], Age: [age]".
    //Create subclasses Lion and Elephant that extend Animal.
    //
    //Lion overrides makeSound() to return "Roar!".
    //Elephant overrides makeSound() to return "Trumpet!".
    //Create a class Zoo to manage animals:
    //
    //Field: List<Animal> animals.
    //Method addAnimal(Animal animal) to add animals to the zoo.
    //Method getAnimalSounds() to iterate through all animals and print their sounds.
    /*Test Codes
    Zoo zoo = new Zoo();
    zoo.addAnimal(new Lion("Leo", 5));
    zoo.addAnimal(new Elephant("Dumbo", 10));

    System.out.println("Animal Sounds in the Zoo:");
    zoo.getAnimalSounds();
     */

    //Q23: University Staff Hierarchy

    //Create a base class Person with the following:
    //Fields: name (String), age (int).
    //Constructor to initialize name and age.
    //Concrete method getInfo() that returns "Name: [name], Age: [age]".
    //Create a subclass Employee with:
    //
    //Field: salary (double).
    //Constructor to initialize name, age, and salary.
    //Method getSalary() to return the salary.
    //Create a subclass Professor that extends Employee with:
    //
    //Field: subject (String).
    //Constructor to initialize name, age, salary, and subject.
    //Override getInfo() to include the subject information.
    //Create a subclass AdminStaff that extends Employee with:
    //
    //Field: department (String).
    //Constructor to initialize name, age, salary, and department.
    //Override getInfo() to include the department information.
    //Create a University class to manage a list of employees:
    //
    //Field: List<Employee> employees.
    //Method addEmployee(Employee employee) to add an employee.
    //Method getTotalSalaries() to calculate and return the total salary of all employees.

    /*Test Codes
    University university = new University();
    university.addEmployee(new Professor("Dr. Smith", 45, 80000, "Computer Science"));
    university.addEmployee(new AdminStaff("Alice", 35, 50000, "Finance"));

    System.out.println("Total Salaries: $" + university.getTotalSalaries());
     */

    //Q24: Library System

    //Create an abstract class LibraryItem with:
    //Fields: title (String), id (int).
    //Constructor to initialize title and id.
    //Abstract method getDetails() to return information about the item.
    //Create subclasses Book and Magazine that extend LibraryItem:
    //
    //Book: Add fields author (String) and pages (int).
    //Magazine: Add fields issueNumber (int) and publisher (String).
    //Both classes implement getDetails() to include their specific fields.
    //Create a Library class:
    //
    //Field: List<LibraryItem> items.
    //Method addItem(LibraryItem item) to add items to the library.
    //Method listAllItems() to display details of all library items.
    //Method findItemById(int id) to return the details of an item by its ID.

    /*Test Codes
    Library library = new Library();
    library.addItem(new Book("Java Programming", 1, "John Doe", 500));
    library.addItem(new Magazine("Tech Monthly", 2, 45, "TechCorp"));

    library.listAllItems();
    System.out.println("Item with ID 2: " + library.findItemById(2));

     */

    //Q25: Vehicle Rental System

    //Create an abstract class Vehicle with:
    //Fields: make (String), model (String), rentalRate (double).
    //Constructor to initialize the fields.
    //Abstract method calculateRentalCost(int days) to calculate rental cost.
    //Create subclasses Car and Truck that extend Vehicle:
    //
    //Car: Add a field isLuxury (boolean).
    //Override calculateRentalCost to include an additional 20% cost for luxury cars.
    //Truck: Add a field loadCapacity (double).
    //Override calculateRentalCost to add an extra fee of $50 if the load capacity exceeds 1000kg.
    //Create a RentalService class:
    //
    //Field: List<Vehicle> vehicles.
    //Method addVehicle(Vehicle vehicle) to add a vehicle.
    //Method calculateTotalRevenue(int[] daysArray) to calculate the total revenue
    // if all vehicles are rented for corresponding days in daysArray.

    /*Test Codes
    RentalService service = new RentalService();
    service.addVehicle(new Car("BMW", "X5", 100, true));
    service.addVehicle(new Truck("Volvo", "FH16", 200, 1500));

    int[] daysArray = {3, 5};  // First vehicle rented for 3 days, second for 5 days.
    System.out.println("Total Revenue: $" + service.calculateTotalRevenue(daysArray));
     */

}
