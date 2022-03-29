import java.text.DecimalFormat;

/**
 * Models the currency dollar.
 * 
 * @author shreya_jaiswal
 *
 */
public class Money {

    /** Constant with value 0 dollar */
    public static Money ZERO = new Money(0);
    /** Constant with value 1 dollar */
    public static Money ONE_DOLLAR = new Money(100);
    /** Constant with value 2 dollars */
    public static Money TWO_DOLLAR = new Money(200);
    private int amountInCents;

    /**
     * constructor for money object takes input integer value of dollar in cents
     * 
     * @param numberOfCents
     */
    public Money(int numberOfCents) {
        amountInCents = numberOfCents;
    }

    /**
     * computes Minnesota sales tax
     * 
     * @param totalBeforeTax value in cents before tax
     * @return new money object with added tax
     */
    public static Money computeMNSalesTax(Money totalBeforeTax) {
        double tax = (totalBeforeTax.amountInCents / 100.00) * 0.06875;
        int taxInCents = (int) Math.round(tax * 100);
        return new Money(totalBeforeTax.amountInCents + taxInCents);

    }

    /**
     * adds two money objects
     * 
     * @param money to be added
     * @return new money object with added value
     */
    public Money add(Money money) {
        return new Money(this.amountInCents + money.amountInCents);

    }

    /**
     * subtracts two money objects
     * 
     * @param money to be subtracted
     * @return new money object with subtracted value
     */
    public Money subtract(Money money) {
        return new Money(this.amountInCents - money.amountInCents);
    }

    /**
     * @return string representation of money object
     */
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");
        double inDollars = (this.amountInCents) / 100.00;
        return "$" + df.format(inDollars);
    }

}
