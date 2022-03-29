/**
 * Models the beverage coffee. Is an extension of abstract class beverage
 * 
 * @author shreya_jaiswal
 *
 */
public class Coffee extends Beverage {
    /**
     * @return string representation of the beverage coffee
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

        return "Coffee" + addOns + size + " - " + getCalories() + " calories ";

    }

    /**
     * @return new Money object representing cost of the beverage coffee
     */
    public Money getCost() {

        Money cost = new Money(150);
        if (this.size == 2) {
            cost = new Money(250);
        }
        for (int i = 0; i < addOns.size(); i++) {
            cost = cost.add(addOns.get(i).getCost());
        }
        return cost;

    }

    /**
     * @return integer number of calories of beverage coffee
     */
    public int getCalories() {
        int calories = 5;
        if (this.size == 2) {
            calories = 15;
        }
        for (int i = 0; i < addOns.size(); i++) {
            calories = calories + (addOns.get(i).getCalories());
        }
        return calories;

    }

}
