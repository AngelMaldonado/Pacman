package uaslp.engineering.labs;

/**
 * Superclass Item (it can has SmallPoint, PowerPoint or Fruit)
 */
public class Item {
    // Representative image of item
    private String image;
    // Constant for each object of Item
    private final int points; // ASK THIS

    public Item(String image) {
        this.image = image;
        points = 50;
    }
}
