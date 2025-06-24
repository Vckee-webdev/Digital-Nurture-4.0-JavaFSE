
import java.util.Scanner;

public class FinancialForecast {

    public static double forecastRecursive(double value, double rate, int years) {
        if (years == 0) {
            return value;
        }
        return forecastRecursive(value * (1 + rate), rate, years - 1);
    }

    public static double forecastIterative(double value, double rate, int years) {
        for (int i = 0; i < years; i++) {
            value *= (1 + rate);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Present Value (₹): ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter Growth Rate (e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();

        double recursiveResult = forecastRecursive(presentValue, growthRate, years);
        double iterativeResult = forecastIterative(presentValue, growthRate, years);

        System.out.printf("\n📈 Recursive Forecast: ₹%.2f\n", recursiveResult);
        System.out.printf("📊 Iterative Forecast: ₹%.2f\n", iterativeResult);

        scanner.close();
    }
}
