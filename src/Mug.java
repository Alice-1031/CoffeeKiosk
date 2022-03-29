/**
 * models a mug.
 * 
 * @author shreyajaiswal
 *
 */
public class Mug implements Buyable {
    /**
     * @return Money representing cost of mug.
     */
    public Money getCost() {
        return new Money(1000);
    }

    /**
     * @return String representation of mug
     */
    public String toString() {
        return "Classy mug";
    }
}
