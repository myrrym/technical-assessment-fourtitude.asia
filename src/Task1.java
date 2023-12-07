import java.text.DecimalFormat;

public class Task1 {

    double c; // repayment amount
    double P; // principal amount borrowed
    double r; // percentage rate per period divided by 100
    double N; // number of repayments

    // to round doubles to 2 decimal places
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double calculate(double P, double r, double N) {
        // full formula: c = P * ( r / (1 - (1 + r) ^ (-N) ) );
        // strategy: 
        // (1) break full formula into 2 parts: numerator, denominator
        // (2) break denominator into 2 parts: A, B

        double numerator = P * r;

        double denominatorA = 1;
        double denominatorB = Math.pow( (1 + r), -N ); // (1 + r) ^ -N

        double denominator = denominatorA - denominatorB;

        c = numerator / denominator;
        
        return c;
    }

    public void test() {
        // given
        P = 500000;
        r = 4.45 / 100.0 / 12.0;
        N = 30 * 12;

        c = calculate(P, r, N);
        
        System.out.println("Test\t|\tRepayment amount is: " + df.format(c));
    }

    public void basic() {
        // given
        P = 400000;
        r = 4.0 / 100.0 / 12.0;
        N = 30 * 12;

        c = calculate(P, r, N);

        // System.out.println("c " + c + ", P " + P + ", r " + r + ", N " + N);

        System.out.println("Basic\t|\tRepayment amount is: " + df.format(c));
    }

    public void advance() {
        // solve for #r# to get #interest rate#
        // (a) remember r = interestRate / 100.0 / 12.0 => interestRate = (r * 12) * 100
        // new formula => r = (c * (1 - (1 + r) ^ -N) ) / P
        // strategy: 
        // (1) break full formula into 2 parts: numerator, denominator
        // (2) break numerator into 2 parts: A, B
        // (3) find r based on formula in (a) above

        // given
        c = 1500;
        P = 400000;
        N = 30 * 12;

        double numeratorB = Math.pow( (1 + r), -N );
        double numerator = c * (1 - numeratorB);

        double denominator = P;

        r = numerator / denominator;

        double interestRate = (r * 12.0) * 100.0;

        System.out.println("Advance\t|\tInterest rate is: " + df.format(interestRate) + "%");
    }
}
