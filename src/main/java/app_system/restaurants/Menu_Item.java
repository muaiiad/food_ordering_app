package app_system.restaurants;

public class Menu_Item {
    private String name;
    private String description;
    private float price;
    private String options;
    private float rating;

    public Menu_Item() {
    }

    public  int[] reviews;
    public int counter_reviews=0;
    public  int review_index = 0;


    public Menu_Item(String name, String description, float price, String options) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.options = options;
    }

    public String getName() {
        return name;//
    }

    public void setName(String name) {
        this.name = name;//
    }

    public String getDescription() {
        return description;//
    }

    public void setDescription(String description) {
        this.description = description;//
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int[] getReviews() {
        return reviews;
    }

    public void setReviews(int[] reviews) {
        this.reviews = reviews;
    }

    public int getCounter_reviews() {
        return counter_reviews;
    }

    public void setCounter_reviews(int counter_reviews) {
        this.counter_reviews = counter_reviews;
    }

    public int getReview_index() {
        return review_index;
    }

    public void setReview_index(int review_count) {
        this.review_index = review_count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
