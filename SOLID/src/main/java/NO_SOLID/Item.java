package NO_SOLID;
public class Item {
    private String id;
    private float price;

    public Item(String id, float price) {
        this.id = id;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
