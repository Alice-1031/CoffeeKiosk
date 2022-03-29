/**
 * models the addOn Sugar Syrup.
 * 
 * @author shreya_jaiswal
 *
 */
public class SugarSyrup extends Addition {

    /**
     * @return string representation of addOn if added
     */
    public String toString() {
        return "Sugar Syrup";
    }

    /**
     * @return Money object representing cost of addOn
     */
    public Money getCost() {
        return new Money(50);
    }

    /**
     * @return integer calories representing calories in addOn
     */
    public int getCalories() {
        return 60;
    }

}
