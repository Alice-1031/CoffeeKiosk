/**
 * models the addOn Oat milk.
 * 
 * @author shreya_jaiswal
 *
 */
public class OatMilk extends Addition {

    /**
     * @return String representation of addOn if added
     */
    public String toString() {
        return "Oatmilk";

    }

    /**
     * @return Money object representing cost of addOn
     */
    public Money getCost() {
        return Money.ONE_DOLLAR;
    }

    /**
     * @return integer calories representing calories in addOn
     */
    public int getCalories() {
        return 30;
    }
}
