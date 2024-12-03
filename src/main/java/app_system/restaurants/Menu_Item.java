package app_system.restaurants;

public class Menu_Item {
    private String name;
    private String description;
    private float price;
    private String options;

    public  int[] reviews;
    public int counter_reviews=0;
    public  int review_count = 0;
    public Menu_Item(String name, String description, float price, String options) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.options = options;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
