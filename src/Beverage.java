import java.util.ArrayList;

/**
 * Abstract class extended by coffee and tea,models a beverage.
 * 
 * @author shreya_jaiswal
 *
 */
public abstract class Beverage implements Buyable {

    /** abstract class variable allows beverage customization with addOns */
    //Addition addition = new Addition();
    /** class constant indicating (L) beverage */
    public static int LARGE = 2;
    /** class constant indicating (S) beverage */
    public static int SMALL = 0;
    /** array list of type abstract class addition */
    protected ArrayList<Addition> addOns = new ArrayList<Addition>();
    /** stores size value of beverage */
    protected int size;

    /**
     * @return default Money object with value 0 dollars for beverage
     */
    public abstract Money getCost();

    /**
     * @return default integer calories 0 dollars for beverage
     */
    public abstract int getCalories(); 
    

    /**
     * sets beverage size as specified by user input
     * 
     * @param size(user input)
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * adds the addOns specified by user to array list
     * 
     * @param addition(user input)
     */
    public void addToDrink(Addition addition) {
        addOns.add(addition);
    }

}
