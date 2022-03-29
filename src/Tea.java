/**
 * Models the beverage Hot Tea. Is an extension of abstract class beverage
 * 
 * @author shreya_jaiswal
 *
 */
public class Tea extends Beverage {
    /**
     * @return string representation of the beverage Hot Tea
     */
    public String toString() {
        String size = "(S)";
        if (this.size == 2) {
            size = "(L)";
        }
        String addOns = "";
        if (this.addOns.size() >= 1) {
            for (int i = 0; i < this.addOns.size(); i++) {
                addOns = addOns + "+" + this.addOns.get(i).toString();
            }
        }

        return "Tea" + addOns + size + " - " + getCalories() + " calories ";
    }

    /**
     * @return cost of the beverage Hot Tea
     */
    public Money getCost() {
        Money cost = new Money(150);

        for (int i = 0; i < addOns.size(); i++) {
            cost = cost.add(addOns.get(i).getCost());
        }
        return cost;
    }

    /**
     * @return integer calories of the beverage Hot Tea
     */
    public int getCalories() {
        int calories = 5;
        for (int i = 0; i < addOns.size(); i++) {
            calories = calories + (addOns.get(i).getCalories());
        }
        return calories;

    }
}
