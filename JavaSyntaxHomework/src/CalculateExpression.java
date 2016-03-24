import sun.plugin2.message.Message;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by deniz on 21.3.2016 г..
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double firstFormula = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / (Math.sqrt(c)));
        double secondFormula = Math.pow((a * a + b * b - Math.pow(c, 3)), a - b);
        double numbersAverage = (a + b + c) / 3;
        double formulasAverage = (firstFormula + secondFormula) / 2;
        double difference = Math.abs(numbersAverage - formulasAverage);

        System.out.printf("F1 result: %.2f; ", firstFormula);
        System.out.printf("F2 result: %.2f; ", secondFormula);
        System.out.printf("Diff: %.2f", difference);
    }
}
