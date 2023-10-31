

public class MultiplicationClass implements Multiplication {
    @Override
    public double calculate(double num1, double num2) {
        if (num1 == 0) {
            return 0;
        } else {
            return num1 * num2;
        }
    }
}