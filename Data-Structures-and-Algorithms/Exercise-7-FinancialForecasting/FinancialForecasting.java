public class FinancialForecasting {

    // RECURSIVE METHOD
    // principal = starting amount, growthRate = 0.10, years = how many years
    static double calculateFutureValue(double principal, double growthRate, int years) {

        // Base case — year 0 means no growth yet, return starting amount
        if (years == 0) {
            return principal;
        }

        // Recursive case — get previous year's value, then multiply growth
        // years-1 goes one step back each time until it hits 0
        return calculateFutureValue(principal, growthRate, years - 1) * (1 + growthRate);
    }

    // OPTIMIZED METHOD — Memoization
    // memo[] is a notebook that saves already calculated values
    static double calculateFutureValueMemo(double principal, double growthRate, int years, double[] memo) {

        // Base case — same as before
        if (years == 0) {
            return principal;
        }

        // If this year's value is already saved in memo, reuse it directly!
        // != 0 means this slot is not empty
        if (memo[years] != 0) {
            return memo[years];
        }

        // Calculate, save in memo, then return
        memo[years] = calculateFutureValueMemo(principal, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {

        double principal = 10000;  // starting ₹10,000
        double growthRate = 0.10;  // 10% per year
        int years = 5;             // predict 5 years

        // RECURSIVE SOLUTION
        System.out.println("=== Recursive Solution ===");
        for (int i = 1; i <= years; i++) {
            double value = calculateFutureValue(principal, growthRate, i);
            // %d = integer, %.2f = 2 decimal places, %n = new line
            System.out.printf("Year %d: %.2f%n", i, value);
        }

        // OPTIMIZED SOLUTION
        System.out.println("\n=== Optimized Solution (Memoization) ===");
        // Create memo array with years+1 slots (0 to 5)
        // All slots start as 0 (empty)
        double[] memo = new double[years + 1];
        for (int i = 1; i <= years; i++) {
            double value = calculateFutureValueMemo(principal, growthRate, i, memo);
            System.out.printf("Year %d: %.2f%n", i, value);
        }

        // ANALYSIS
        System.out.println("\n=== Time Complexity Analysis ===");
        System.out.println("Recursive Solution   -> O(n) per call");
        System.out.println("Memoized Solution    -> O(1) after first calculation");
        System.out.println("Memoization avoids repeated calculations, making it faster!");
    }
}
