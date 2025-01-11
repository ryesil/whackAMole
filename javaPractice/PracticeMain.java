package javaPractice;

import javaPractice.sn.CurrentAccountSn;
import javaPractice.sn.SavingAccountSn;

public class PracticeMain {


    public static void main(String[] args) {

//        System.out.println(barkingDog1(true, 1));
//        boolean result = shouldWakeUp(true, 23.40 );
//        System.out.println(result);
//        System.out.println(area(5.2));
//        System.out.println(area(2.4,4.7));
//        printEqual(1,3,2);
//        PracticeAnswers.calculate(0,5);
//        PracticeAnswers.isPalindrome2(1232323);
//        PracticeAnswers.checkPallindrome(15541);
//        PracticeAnswers.triangleMaker(6);
//        PracticeAnswers.createTriange(5);
//        System.out.println(PracticeAnswers.sumFirstAndLastDigit(456));
//        System.out.println(PracticeAnswers.sumFirstAndLastDigit(252));
//        PracticeAnswers.sumFirstAndLastDigit2(-18);
//        System.out.println(PracticeAnswers.findEvenDigitSum(-123));
//        System.out.println(PracticeAnswers.hasSharedDigit2(32,562));
//        System.out.println(PracticeAnswers.hasSameLastDigit(12,-45,55));
//        PracticeAnswers.displayFactors(-55);
//        System.out.println(PracticeAnswers.canPack(5,2,-11));
//        PracticeAnswers.numberToWord(2304);
//        System.out.println(PracticeAnswers.hasSharedDigit(35,55));

//        System.out.println(PracticeAnswers.sumFirstAndLastDigit(456));
//        System.out.println(PracticeAnswers.sumFirstAndLastDigit(252));
//        PracticeAnswers.sumFirstAndLastDigit2(-18);
//        System.out.println(PracticeAnswers.getEvenSum1(800));
//        System.out.println(PracticeAnswers.hasSharedDigit(12,82));
//        System.out.println(PracticeAnswers.hasSameLastDigit(12, 23, 53));
//        PracticeAnswers.printFactors(10);
//        PracticeAnswers.printSquareStar1(4);


//       SimpleCalculatorSn calculatorSn = new SimpleCalculatorSn();
//       calculatorSn.setFirstNumber(5.0);
//       calculatorSn.setSecondNumber(4);
//       System.out.println("add = " + calculatorSn.getAdditionResult());
//       System.out.println("subtract = " + calculatorSn.getSubtractionResult());
//
//       calculatorSn.setFirstNumber(5.25);
//       calculatorSn.setSecondNumber(0);
//       System.out.println("multiply = " + calculatorSn.getMultiplicationResult());
//       System.out.println("divide = " + calculatorSn.getDivisionResult());

        //PersonSn personSn = new PersonSn();
        //personSn.setFirstName("");
        //personSn.setSecondName("");
        //personSn.setAge(10);
        //System.out.println("fullName = " + personSn.getFullName());
        //System.out.println("teen = " + personSn.isTeen());
        //personSn.setFirstName("John");
        //personSn.setAge(18);
        //System.out.println("fullName = " + personSn.getFullName());
        //System.out.println("teen = " + personSn.isTeen());
        //personSn.setSecondName("Smith");
        //System.out.println("fullName = " + personSn.getFullName());

        //CircleSn circleAreaSn = new CircleSn(5);
        //System.out.println(circleAreaSn.getArea());

        //CylinderSn cylinder = new CylinderSn(2,2);
        // System.out.println(cylinder.getArea());
        //System.out.println(cylinder.getVolume());

        //RectangleSn rectangleSn = new RectangleSn(5, 10);
        //System.out.println("rectangle.width= " + rectangleSn.getWidth());
        //System.out.println("rectangle.length= " + rectangleSn.getLength());
        //System.out.println("rectangle.area= " + rectangleSn.getArea());
        //CuboidSn cuboidSn = new CuboidSn(5,10,5);
        //System.out.println("cuboid.width= " + cuboidSn.getWidth());
        //System.out.println("cuboid.length= " + cuboidSn.getLength());
        //System.out.println("cuboid.area= " + cuboidSn.getArea());
        //System.out.println("cuboid.height= " + cuboidSn.getHeight());
        //System.out.println("cuboid.volume= " + cuboidSn.getVolume());

//        EmployeeSn emp = new EmployeeSn("John", 3000);
//        System.out.println(emp.getName() + " Salary: " + emp.getBaseSalary());
//
//        ManagerSn mgr = new ManagerSn("Sarah", 4000, 2000);
//        System.out.println(mgr.getName() + " Salary: " + mgr.getBaseSalary());
//
//        DeveloperSn dev = new DeveloperSn("Alex", 3000, 3);
//        System.out.println(dev.getName() + " Salary: " + dev.getBaseSalary());
       //EmployeeSn emp = new EmployeeSn("John", 3000);
       //System.out.println(emp.getName() + " Salary: " + emp.getBaseSalary());

       //ManagerSn mgr = new ManagerSn("Sarah", 4000, 2000);
       //System.out.println(mgr.getName() + " Salary: " + mgr.getBaseSalary());

       //DeveloperSn dev = new DeveloperSn("Alex", 3000, 3);
       //System.out.println(dev.getName() + " Salary: " + dev.getBaseSalary());

        // Test SavingsAccount
        SavingAccountSn savings = new SavingAccountSn("12345", 1000, 0.05);
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Interest: " + savings.calculateInterest());

        // Test CurrentAccount
        CurrentAccountSn current = new CurrentAccountSn("67890", 500, 200);
        current.withdraw(600);
        System.out.println("Current Account Balance: " + current.getBalance());
        current.withdraw(200);
        System.out.println("Current Account Balance after overdraft attempt: " + current.getBalance());


//        AnimalRY lion = new LionRY("lion", 24);
//        AnimalRY elephant = new ElephantRY("Elephant", 29);
//        ZooRY zoo = new ZooRY();
//        zoo.addAnimal(lion);
//        zoo.addAnimal(elephant);
//        System.out.println(zoo.animalSounds());
//        UniversityRY universityRY = new UniversityRY();
//        universityRY.addEmployee(new UniversityEmployeeRY("Ramazan", 39, 85000));
//        universityRY.addEmployee(new UniversityProfRY("Ramazan", 29, 125000, "Math"));
//        System.out.println(universityRY.getTotalSalaries());

    }

}
