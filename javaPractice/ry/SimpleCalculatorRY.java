package javaPractice.ry;

public class SimpleCalculatorRY {
    private double firstNumber;
    private double secondNumber;

    public SimpleCalculatorRY() {
    }

    public SimpleCalculatorRY(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResult() {
        return (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult() {
        return (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return (this.firstNumber / this.secondNumber);
    }
}
