public class Main {

    public static void main(String[] args) {
        double initialAmount = 10000;     // Starting value
        double annualGrowthRate = 0.08;   // 8% growth
        int years = 5;                    // Forecast for 5 years

        double futureValue = FinancialForecast.calculateFutureValue(initialAmount, annualGrowthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, futureValue);
    }
}

// Separate class for financial logic
class FinancialForecast {

    // Recursive method to compute future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) return principal; // Base case
        return (1 + rate) * calculateFutureValue(principal, rate, years - 1);
    }
}
