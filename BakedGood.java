
/**
 * Represents a single baked good for our bakery's inventory.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        //init
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }

    
}
