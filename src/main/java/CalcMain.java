import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // додавання
            Addition addition = new AdditionClass();
            double sum = addition.calculate(num1, num2);
            System.out.println("Addition: " + sum);

            // віднімання
            Subtraction subtraction = new SubtractionClass();
            double difference = subtraction.calculate(num1, num2);
            System.out.println("Subtraction: " + difference);

            // множення
            Multiplication multiplication = new MultiplicationClass();
            double product = multiplication.calculate(num1, num2);
            System.out.println("Multiplication: " + product);

            // ділення
            Division division = new DivisionClass();
            double quotient = division.calculate(num1, num2);
            System.out.println("Division: " + quotient);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
