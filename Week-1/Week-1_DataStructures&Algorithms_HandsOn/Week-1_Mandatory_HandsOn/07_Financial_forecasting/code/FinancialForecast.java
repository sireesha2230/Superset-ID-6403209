//  I'm trying to calculate future value based on how money grows each year.
// I'll use recursion to keep it simple .

public class FinancialForecast {
    // This method tells me how much the money grows after 'n' years.
    public static double predictFuture(double startingAmount, double growthRate, int yearsAhead) {
        // suppose when I'm at year 0, just return the  money
        if (yearsAhead == 0) {
            return startingAmount;
        }
 // Recursive  – last year , get the value, and grow it by rate
        double previousYearValue = predictFuture(startingAmount, growthRate, yearsAhead - 1);
        return previousYearValue * (1 + growthRate); // add the growth to last year’s value
    }
    public static void main(String[] args) {
        // Trying my own values for the problem.
        double principalAmount = 1500; // starting with 1500 
        double ratePerYear = 0.06;     // 6% growth per year
        int totalYears = 4;            // 4 years from now.
        // recursive method/function calling.
        double projectedAmount = predictFuture(principalAmount, ratePerYear, totalYears);
        // Finally, printing the result.
        System.out.printf("After %d years, the expected amount is:%.2f%n", totalYears, projectedAmount);
    }
}
