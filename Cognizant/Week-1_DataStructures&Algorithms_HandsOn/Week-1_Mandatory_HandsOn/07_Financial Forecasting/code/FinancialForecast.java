public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double initialValue, double rate, int years) {
        // Base case
        if (years == 0) {
            return initialValue;
        }
        // Recursive call
        return futureValue(initialValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initial = 1000;      // Starting value
        double rate = 0.05;         // 5% annual growth
        int years = 5;              // Forecast for 5 years

        double result = futureValue(initial, rate, years);
        System.out.printf("Future value after %d years: %.2f", years, result);
    }
}
