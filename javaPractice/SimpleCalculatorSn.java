package javaPractice;

public class SimpleCalculatorSn {
    private double firstNumber;
    private double secondNumber;

    //getter

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    //setter
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //getAdditionResult
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    //getSubtractionResult()
    public double getSubtractionResult() {
        return secondNumber - firstNumber;
    }

    //getMultiplicationResult
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    //getDivisionResult
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}

