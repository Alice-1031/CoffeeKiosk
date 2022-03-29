/**
 * Abstract class extended by addOn classes Oatmilk and Sugar Syrup
 * 
 * @author Shreya_Jaiswal
 */
public abstract class Addition {

    /**
     * @return default Money object ZERO
     */
    public Money getCost() {
        return Money.ZERO;
    }

    /**
     * @return default integer representing calories 0
     */
    public int getCalories() {
        return 0;
    }
}
