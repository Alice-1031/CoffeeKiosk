/**
 * Models the beverage Decaf coffee. Is an extension of abstract class beverage
 * 
 * @author shreya_jaiswal
 *
 */
public class DecafCoffee extends Coffee {

    /**
     * @return string representation of the beverage Decaf coffee
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

        return "Decaf Coffee" + addOns + size + " - " + getCalories() + " calories ";
    }
}
