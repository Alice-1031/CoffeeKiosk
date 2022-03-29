import java.util.ArrayList;

/**
 * Models a shopping cart.
 * 
 * @author shreya_jaiswal
 *
 */
public class ShoppingCart {

    /** array list of type Buyable stores items to be bought */
    private ArrayList<Buyable> items = new ArrayList<Buyable>();

    /**
     * constructor for items
     * 
     * @param somethingToBuy(user input)
     */
    public void addItem(Buyable somethingToBuy) {
        items.add(somethingToBuy);
    }

    /**
     * @return new Money object representing total of cart
     */
    public Money getTotal() {
        Money totalBeforeTax = Money.ZERO;
        for (int i = 0; i < items.size(); i++) {
            totalBeforeTax = totalBeforeTax.add(items.get(i).getCost());
        }
        return Money.computeMNSalesTax(totalBeforeTax);
    }

    /**
     * @return string representation of cart
     */
    public String toString() {
        if (items.size() == 0) {
            return "Cart is empty";
        }
        String cart = "";
        for (int i = 0; i < items.size(); i++) {
            cart = cart + (i + 1) + ".) " + items.get(i).toString() + ": " + items.get(i).getCost() + "\n";
        }
        cart = cart + "Total: " + getTotal();
        return cart;
    }
}
